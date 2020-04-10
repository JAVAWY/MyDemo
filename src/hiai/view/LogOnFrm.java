package hiai.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import hiai.dao.UserDao;
import hiai.model.User;
import hiai.util.DbUtil;
import hiai.util.StringUtil;

public class LogOnFrm extends JFrame {

	private JPanel contentPane;
	private JTextField userName;
	private JPasswordField passWord;
	private DbUtil dbUtil=new DbUtil();
	private UserDao userDao=new UserDao();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogOnFrm frame = new LogOnFrm();
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
	public LogOnFrm() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(LogOnFrm.class.getResource("/images/Teacher.png")));
		setTitle("\u6BCF\u65E5\u75AB\u60C5\u4E0A\u62A5\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u6BCF\u65E5\u75AB\u60C5\u4E0A\u62A5\u7CFB\u7EDF");
		lblNewLabel.setFont(new Font("Arial Unicode MS", Font.BOLD, 20));
		lblNewLabel.setIcon(new ImageIcon(LogOnFrm.class.getResource("/images/student.png")));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(LogOnFrm.class.getResource("/images/Teacher.png")));
		
		JLabel lblNewLabel_2 = new JLabel("\u7528\u6237\u540D\uFF08\u59D3\u540D\uFF09");
		lblNewLabel_2.setIcon(new ImageIcon(LogOnFrm.class.getResource("/images/user.png")));
		lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 14));
		
		JLabel lblNewLabel_3 = new JLabel("\u5BC6\u7801\uFF08\u5B66\u53F7/\u5DE5\u53F7\uFF09");
		lblNewLabel_3.setFont(new Font("宋体", Font.BOLD, 14));
		lblNewLabel_3.setIcon(new ImageIcon(LogOnFrm.class.getResource("/images/password.png")));
		
		userName = new JTextField();
		userName.setColumns(10);
		
		passWord = new JPasswordField();
		
		JButton logBut = new JButton("\u767B\u5F55");
		logBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginActionPerformed(e);//设置会出现方法
			}
		});
		logBut.setFont(new Font("宋体", Font.BOLD, 14));
		logBut.setIcon(new ImageIcon(LogOnFrm.class.getResource("/images/login.png")));
		
		JButton resetBut = new JButton("\u91CD\u7F6E");
		resetBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetActionPerformed(e);
			}
		});
		resetBut.setFont(new Font("宋体", Font.BOLD, 14));
		resetBut.setIcon(new ImageIcon(LogOnFrm.class.getResource("/images/reset.gif")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(131, Short.MAX_VALUE)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(41)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(logBut)
									.addComponent(lblNewLabel_2)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(17)
										.addComponent(resetBut)
										.addGap(15))
									.addComponent(userName, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
								.addComponent(passWord, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))))
					.addGap(18)
					.addComponent(lblNewLabel_1)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(52)
							.addComponent(lblNewLabel)))
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(userName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(passWord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(logBut)
						.addComponent(resetBut))
					.addGap(49))
		);
		contentPane.setLayout(gl_contentPane);
		//设置窗口居中
		this.setLocationRelativeTo(null);
	}
	/*
	 * 用户登录操作
	 */
	private void loginActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String userName=this.userName.getText();
		String passWord=new String(this.passWord.getPassword());
		if(StringUtil.isEmpty(userName)){
			JOptionPane.showMessageDialog(null, "用户名不能为空");
			return;
		}
		if(StringUtil.isEmpty(passWord)){
			JOptionPane.showMessageDialog(null,"密码不能为空");
			return;
		}
		User user=new User(userName,passWord);
		
		Connection con=null;
		
		try {
			con=dbUtil.getCon();
			User currenUser=userDao.login(con, user);
			if(currenUser!=null){
				//JOptionPane.showMessageDialog(null, "登录成功");
				dispose();//销毁当前登录窗口
				new MainFrm().setVisible(true);
		
			}else{
				JOptionPane.showMessageDialog(null, "用户名或者密码错误");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			try {
				dbUtil.closeCon(con);//关闭数据库
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}


	/*
	 * 重置操作
	 */

	private void resetActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.userName.setText("");//置空
		this.passWord.setText("");
		
	}
}
