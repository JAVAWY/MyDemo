package hiai.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JDesktopPane;

public class hiaiInterFrm extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hiaiInterFrm frame = new hiaiInterFrm();
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
	public hiaiInterFrm() {
		setIconifiable(true);
		setClosable(true);
		setTitle("\u6234\u53E3\u7F69\u52E4\u6D17\u624B");
		setBounds(100, 100, 450, 300);
		
		JLabel label = new JLabel("\u75AB\u60C5\u5C31\u662F\u547D\u4EE4\uFF0C\u9632\u63A7\u5C31\u662F\u8D23\u4EFB");
		label.setFont(new Font("宋体", Font.BOLD, 28));
		
		JLabel lblNewLabel = new JLabel("\u4E07\u4F17\u4E00\u5FC3  \u4F17\u5FD7\u6210\u57CE  \u9632\u63A7\u75AB\u60C5");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 20));
		lblNewLabel.setToolTipText("");
		
		JLabel lblNewLabel_1 = new JLabel("\u5C11\u51FA\u95E8");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 25));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setToolTipText("");
		
		JLabel label_1 = new JLabel("\u6234\u53E3\u7F69");
		label_1.setFont(new Font("宋体", Font.BOLD, 25));
		
		JLabel lblNewLabel_2 = new JLabel("\u52E4\u6D17\u624B");
		lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 25));
		
		JLabel lblNewLabel_3 = new JLabel("\u5E38\u901A\u98CE");
		lblNewLabel_3.setFont(new Font("宋体", Font.BOLD, 25));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(85)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_1)
								.addComponent(label_1))
							.addGap(164)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_2)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(label)))
					.addGap(30))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(142, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(23))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(39)
					.addComponent(label)
					.addGap(18)
					.addComponent(lblNewLabel)
					.addGap(53)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(label_1))
					.addContainerGap(72, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
}
