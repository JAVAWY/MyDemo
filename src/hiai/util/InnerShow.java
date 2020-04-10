package hiai.util;
import java.awt.BorderLayout;  
import java.awt.Container;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.awt.event.WindowAdapter;  
import java.awt.event.WindowEvent;  
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.ResultSetMetaData;  
import java.sql.SQLException;  
import java.sql.Statement;  
import java.util.Vector;  
  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JOptionPane;  
import javax.swing.JPanel;  
import javax.swing.JScrollPane;  
import javax.swing.JTable;  
import javax.swing.JTextArea;  
  
public class InnerShow extends JFrame {  
      
    private Connection conn;   
    private Statement statement;   
    private ResultSet resultSet;  
      
    //GUI��������  
    private JTable table;   
    private JTextArea inputQuery;   
    private JButton submitQuery;   
  
    @SuppressWarnings("deprecation")  
    public InnerShow() {  
          
        //Form�ı���  
        super( "����SQL��䣬����ѯ��ť�鿴�����" );   
                    
        String url = "jdbc:mysql://localhost:3306/my demo";  
        String username = "root";  
        String password = "123456";   
          
        //���������������������ݿ�  
        try {  
            Class.forName( "com.mysql.jdbc.Driver" );  
            conn = DriverManager.getConnection(url, username, password);  
        }catch ( ClassNotFoundException cnfex ) { //����������������쳣  
            System.err.println("װ�� JDBC/ODBC ��������ʧ�ܡ�" );  
            cnfex.printStackTrace();   
            System.exit( 1 ); // terminate program   
        }catch ( SQLException sqlex ) { //�����������ݿ��쳣  
            System.err.println( "�޷��������ݿ�" );   
            sqlex.printStackTrace();   
            System.exit( 1 ); // terminate program   
        }   
          
        //������ݿ����ӳɹ�������GUI  
        //SQL���  
        String test = "SELECT * FROM department";   
        inputQuery  = new JTextArea( test, 4, 30 );   
        submitQuery = new JButton( "��ѯ" );   
          
        //Button�¼�  
        submitQuery.addActionListener( new ActionListener() {  
            public void actionPerformed( ActionEvent e ){   
                getTable();  
            }  
        });   
          
        JPanel topPanel = new JPanel();   
        topPanel.setLayout( new BorderLayout() );   
          
        //��"�����ѯ"�༭���õ� "CENTER"  
        topPanel.add( new JScrollPane( inputQuery), BorderLayout.CENTER );   
          
        //��"�ύ��ѯ"��ť���õ� "SOUTH"  
        topPanel.add( submitQuery, BorderLayout.SOUTH );   
        table = new JTable();   
        Container c = getContentPane();   
        c.setLayout( new BorderLayout() );   
          
        //��"topPanel"�༭���õ� "NORTH"  
        c.add( topPanel, BorderLayout.NORTH );   
          
        //��"table"�༭���õ� "CENTER"  
        c.add( table, BorderLayout.CENTER );   
        getTable();   
        setSize( 500, 300 );   
          
        //��ʾForm  
        show();   
    }   
  
    private void getTable(){  
          
        try {   
            //ִ��SQL���  
            String query = inputQuery.getText();   
            statement = conn.createStatement();   
            resultSet = statement.executeQuery( query );   
              
            //�ڱ������ʾ��ѯ���  
            displayResultSet( resultSet );   
        }catch ( SQLException sqlex ) {   
            sqlex.printStackTrace();   
        }   
    }   
      
    @SuppressWarnings({ "rawtypes", "unchecked" })  
    private void displayResultSet( ResultSet rs ) throws SQLException {   
          
        //��λ�����һ����¼  
        boolean moreRecords = rs.next();   
          
        //���û�м�¼������ʾһ����Ϣ  
        if ( ! moreRecords ) {   
            JOptionPane.showMessageDialog( this, "��������޼�¼" );   
            setTitle( "�޼�¼��ʾ" );   
            return;   
        }   
          
        Vector columnHeads = new Vector();   
        Vector rows = new Vector();   
          
        try {   
            //��ȡ�ֶε�����  
            ResultSetMetaData rsmd = rs.getMetaData();            
              
            for ( int i = 1; i <= rsmd.getColumnCount(); ++i )   
                columnHeads.addElement( rsmd.getColumnName( i ) );  
              
            //��ȡ��¼��  
            do {  
                rows.addElement( getNextRow( rs, rsmd ) );   
            } while ( rs.next() );   
              
            //�ڱ������ʾ��ѯ���  
            table = new JTable( rows, columnHeads );   
            JScrollPane scroller = new JScrollPane( table );   
            Container c = getContentPane();   
            c.remove(1);   
            c.add( scroller, BorderLayout.CENTER );   
              
            //ˢ��Table  
            c.validate();  
        }catch ( SQLException sqlex ) {   
            sqlex.printStackTrace();   
        }   
    }  
      
    @SuppressWarnings({ "rawtypes", "unchecked" })  
    private Vector getNextRow( ResultSet rs, ResultSetMetaData rsmd )throws SQLException{  
        Vector currentRow = new Vector();   
          
        for ( int i = 1; i <= rsmd.getColumnCount(); ++i )  
            currentRow.addElement( rs.getString( i ) );   
          
        //����һ����¼   
        return currentRow;   
    }   
  
    public void shutDown() {  
          
        try {  
            //�Ͽ����ݿ�����  
            conn.close();   
        }catch ( SQLException sqlex ) {  
            System.err.println( "Unable to disconnect" );  
            sqlex.printStackTrace();  
        }  
    }   
  
    public static void main( String args[] ){  
          
        final InnerShow app = new InnerShow();   
          
        app.addWindowListener( new WindowAdapter() {  
            public void windowClosing( WindowEvent e ){  
                app.shutDown();  
                System.exit( 0 );   
            }  
        });  
    }  
}   