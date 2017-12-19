package view;


import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import data.DataString;

public class AboutView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	//ÀÚ¹ÙµéÀÇ ·¹ÀÌºí ÄÄÆ÷³ÍÆ® À§Ä¡,Å©±â,ÆùÆ®µî¼³Á¤
	public AboutView() {
		setTitle(DataString.getInstence().setString(DataString.ABOUT_TITLE));
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 405, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(DataString.getInstence().setString(DataString.ABOUT_SCHOOL));
		lblNewLabel.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 19));
		lblNewLabel.setBounds(12, 10, 196, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(DataString.getInstence().setString(DataString.ABOUT_DATE));
		lblNewLabel_1.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(12, 86, 238, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(DataString.getInstence().setString(DataString.ABOUT_SUBJECT));
		lblNewLabel_2.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(12, 115, 299, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(DataString.getInstence().setString(DataString.ABOUT_GYOUNGGYU));
		lblNewLabel_3.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(118, 157, 253, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel label = new JLabel(DataString.getInstence().setString(DataString.ABOUT_DAJUNG));
		label.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 17));
		label.setBounds(118, 181, 253, 20);
		contentPane.add(label);
		
		JLabel lblNewLabel_4 = new JLabel(DataString.getInstence().setString(DataString.ABOUT_KYUHWAN));
		lblNewLabel_4.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(118, 206, 253, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(DataString.getInstence().setString(DataString.ABOUT_JIEUN));
		lblNewLabel_5.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(118, 232, 253, 20);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblUniversityIndustrialmanagementEngineering = new JLabel(DataString.getInstence().setString(DataString.ABOUT_DEPARTMENT));
		lblUniversityIndustrialmanagementEngineering.setFont(new Font("ÈÞ¸Õ¿¢½ºÆ÷", Font.PLAIN, 19));
		lblUniversityIndustrialmanagementEngineering.setBounds(22, 39, 461, 23);
		contentPane.add(lblUniversityIndustrialmanagementEngineering);
		
	
	}
}
