package hiai.view;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;


import hiai.dao.TeacherDao;
import hiai.model.Teacher;
import hiai.util.DbUtil;
import hiai.util.StringUtil;

public class TeacherAddFrm extends JInternalFrame {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private JTextField oneTxt;
	private JTextField twoTxt;
	private JTextField threeTxt;
	private JTextField fourTxt;
	private JTextField fiveTxt;
	private JTextField sixTxt;
	private JRadioButton yes1Jcb;
	private JRadioButton no1Jcb;
	private JRadioButton yes2Jcb;
	private JRadioButton no2Jcb;
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private DbUtil dbUtil=new DbUtil();
	private TeacherDao teacherDao=new TeacherDao();
	//private String 是否接触患者;
	//private Object dbUtil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					TeacherAddFrm frame = new TeacherAddFrm();
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
	public TeacherAddFrm() {
		getContentPane().setEnabled(false);
		setEnabled(false);
		setIconifiable(true);
		setTitle("\u6559\u5E08\u586B\u62A5");
		setBounds(100, 100, 454, 451);
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D");
		lblNewLabel.setEnabled(false);
		
		JLabel label = new JLabel("\u5DE5\u53F7");
		
		JLabel lblNewLabel_1 = new JLabel("\u8054\u7CFB\u65B9\u5F0F");
		
		JLabel lblNewLabel_2 = new JLabel("\u6240\u5728\u5B66\u9662");
		
		JLabel lblNewLabel_3 = new JLabel("\u662F\u5426\u63A5\u89E6\u8FC7\u60A3\u8005");
		
		JLabel lblNewLabel_4 = new JLabel("\u662F\u5426\u6709\u7591\u4F3C\u72B6\u51B5");
		
		JLabel lblNewLabel_5 = new JLabel("\u76EE\u524D\u5C45\u4F4F\u5730\u5740");
		
		JLabel label_1 = new JLabel("\u4ECA\u65E5\u586B\u62A5\u65F6\u95F4");
		
		 yes2Jcb = new JRadioButton("\u662F");//JRadioButton yes2Jcb 
		buttonGroup_1.add(yes2Jcb);
		yes2Jcb.setSelected(true);
		
		 no2Jcb = new JRadioButton("\u5426");
		buttonGroup_1.add(no2Jcb);
		
		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacherResetActionPerformed(e);//加的
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(TeacherAddFrm.class.getResource("/images/reset.gif")));
		
		oneTxt = new JTextField();
		oneTxt.setColumns(10);
		
		twoTxt = new JTextField();
		twoTxt.setColumns(10);
		
		threeTxt = new JTextField();
		threeTxt.setColumns(10);
		
		fourTxt = new JTextField();
		fourTxt.setColumns(10);
		
		fiveTxt = new JTextField();
		fiveTxt.setColumns(10);
		
		sixTxt = new JTextField();
		sixTxt.setColumns(10);
		
		JRadioButton no1Jcb = new JRadioButton("\u5426");
		buttonGroup_5.add(no1Jcb);
		
		JRadioButton yes1Jcb = new JRadioButton("\u662F");
		buttonGroup_5.add(yes1Jcb);
		yes1Jcb.setSelected(true);
		
		JLabel label_2 = new JLabel("");
		
		JButton btnNewButton = new JButton("\u63D0\u4EA4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				teacherAddActionPerfromed();
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(TeacherAddFrm.class.getResource("/images/login.png")));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_1)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(label)
									.addComponent(lblNewLabel))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(oneTxt, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
									.addComponent(twoTxt, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_1)
									.addComponent(lblNewLabel_2))
								.addGap(29)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(fourTxt)
									.addComponent(threeTxt, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
								.addGap(37))
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_3)
									.addComponent(lblNewLabel_4)
									.addComponent(lblNewLabel_5))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(23)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(yes2Jcb)
											.addComponent(yes1Jcb))
										.addGap(53)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(no1Jcb)
											.addComponent(no2Jcb)))
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(18)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
											.addComponent(sixTxt)
											.addComponent(fiveTxt, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))))
								.addGap(17)))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(49)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_2)
							.addGap(85))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(44)
					.addComponent(btnNewButton_1)
					.addContainerGap(171, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(oneTxt, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label)
								.addComponent(lblNewLabel_2)
								.addComponent(twoTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(threeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(fourTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(no1Jcb)
						.addComponent(yes1Jcb))
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(yes2Jcb)
						.addComponent(no2Jcb))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(fiveTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(sixTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton)
							.addComponent(btnNewButton_1))
						.addComponent(label_2))
					.addContainerGap(70, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}

	/*
	 * 班级添加事件
	 */
private void teacherAddActionPerfromed() {
		// TODO Auto-generated method stub
	String 姓名=this.oneTxt.getText();//得到用户输入的数据
	String 工号=this.twoTxt.getText();
	String 联系方式=this.threeTxt.getText();
	String 所在学院=this.fourTxt.getText();
	String 目前居住地址=this.fiveTxt.getText();
	String 今日填报时间=this.sixTxt.getText();
	//判断不为空
			if(StringUtil.isEmpty(姓名)){
				JOptionPane.showMessageDialog(null, "姓名不能为空");
				return;//如果出现错误终止执行下面
			}
			if(StringUtil.isEmpty(工号)){
				JOptionPane.showMessageDialog(null, "工号不能为空");
				return;//如果出现错误终止执行下面
			}
			if(StringUtil.isEmpty(联系方式)){
				JOptionPane.showMessageDialog(null, "联系方式不能为空");
				return;//如果出现错误终止执行下面
			}
			if(StringUtil.isEmpty(所在学院)){
				JOptionPane.showMessageDialog(null, "所在学院不能为空");
				return;//如果出现错误终止执行下面
			}
			if(StringUtil.isEmpty(目前居住地址)){
				JOptionPane.showMessageDialog(null, "目前居住地址不能为空");
				return;//如果出现错误终止执行下面
			}
			if(StringUtil.isEmpty(今日填报时间)){
				JOptionPane.showMessageDialog(null, "今日填报时间不能为空");
				return;//如果出现错误终止执行下面
			}
			
			//判断1
			String 是否接触过患者=null;
			if(yes1Jcb.isSelected()){
				是否接触过患者="是";
			}else if(no1Jcb.isSelected()){
				是否接触过患者="否";
			}
			//判断2
			String 是否有疑似状况=null;
			if(yes2Jcb.isSelected()){
				是否有疑似状况="是";
			}else if(no2Jcb.isSelected()){
				是否有疑似状况="否";
			}
			Teacher teacher=new Teacher( 姓名,  工号,  联系方式, 所在学院,  是否接触过患者,  是否有疑似状况,  目前居住地址,
			 今日填报时间);
			Connection con=null;
			try {
				con=dbUtil.getCon();
				int n=teacherDao.add(con, teacher);
				if(n==1){
					JOptionPane.showMessageDialog(null,"提交成功");
					resetValue();
				}else{
					JOptionPane.showMessageDialog(null, "提交失败");
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					dbUtil.closeCon(con);//关闭数据库
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
	}

/*
 * 重置事件操作
 */
	private void teacherResetActionPerformed(ActionEvent evt) {//protected e evt
		// TODO Auto-generated method stub
		this.resetValue();
	}
	public void resetValue(){
		this.oneTxt.setText("");
		this.twoTxt.setText("");
		this.threeTxt.setText("");
		this.fourTxt.setText("");
		this.fiveTxt.setText("");
		this.sixTxt.setText("");
	  }
 }
	
		
  