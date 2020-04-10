package hiai.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrm extends JFrame {

	private JPanel contentPane;
	private JDesktopPane table=null;//加的

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrm frame = new MainFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrm.class.getResource("/images/Teacher.png")));
		setTitle("\u6BCF\u65E5\u75AB\u60C5\u4E0A\u62A5\u7CFB\u7EDF\u4E3B\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu_3 = new JMenu("\u7CFB\u7EDF\u8BBE\u7F6E");
		menu_3.setIcon(new ImageIcon(MainFrm.class.getResource("/images/student01.png")));
		menuBar.add(menu_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("\u9000\u51FA\u7A0B\u5E8F");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result =JOptionPane.showConfirmDialog(null, "是否退出程序？");
				//System.out.println(result);
				if(result==0){
					dispose();//销毁程序
				}
			}
		});
		menu_3.add(mntmNewMenuItem_4);
		
		JMenu menu = new JMenu("\u6559\u5E08");
		menu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/classrepair.png")));
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u6559\u5E08\u586B\u62A5");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//
				TeacherAddFrm  teacherAddFrm=new TeacherAddFrm();//晚上加的
				teacherAddFrm.setVisible(true);//加的  0：32
				table.add(teacherAddFrm);
			}
		});
		menu.add(menuItem);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u6559\u5E08\u7EF4\u62A4");
		menu.add(mntmNewMenuItem);
		
		JMenu menu_1 = new JMenu("\u5B66\u751F");
		menu_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/classmanage.png")));
		menuBar.add(menu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u5B66\u751F\u586B\u62A5");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StuTypeAddFrm stuTypeAddFrm=new StuTypeAddFrm();//加的
				stuTypeAddFrm.setVisible(true);
				table.add(stuTypeAddFrm);
				
			}
		});
		menu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u5B66\u751F\u7EF4\u62A4");
		menu_1.add(mntmNewMenuItem_2);
		
		JMenu menu_2 = new JMenu("\u75AB\u60C5\u9632\u63A7\u6307\u5357");
		menu_2.setIcon(new ImageIcon(MainFrm.class.getResource("/images/exit.png")));
		menuBar.add(menu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u6234\u53E3\u7F69\u52E4\u6D17\u624B");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TeacherAddFrm  teacherAddFrm=new TeacherAddFrm();//晚上加的
				//teacherAddFrm.setVisible(true);//加的  0：32
				hiaiInterFrm hiai=new hiaiInterFrm();
				hiai.setVisible(true);
				table.add(hiai);//加的
			}
			
		});
		menu_2.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		table = new JDesktopPane();//JDesktopPane table
		table.setBackground(Color.PINK);
		contentPane.add(table, BorderLayout.CENTER);
		//设置默认最大化窗口
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);

	}
}
