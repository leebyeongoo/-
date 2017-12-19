package view;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;

import data.Data;
import data.DataString;
import engene.Sound;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntroView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroView window = new IntroView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					//에러가 발생한 메소드의 호출기록출력
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IntroView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame(); //JFrame객체생성
		frame.setResizable(false);
		//버튼들의 위치(x,y)와 크기를 설정
		frame.setBounds((int) ((Toolkit.getDefaultToolkit().getScreenSize()
				.getWidth() - 335) / 2), (int) ((Toolkit.getDefaultToolkit()
				.getScreenSize().getHeight() - 194) / 2), 335, 194);
		//프레임이 닫힐때 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("English");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DataString.getInstence().setLanguageType(DataString.LANGUAGE_ENGLISH);
				Data.GameGender = "woman";
				Data.loadData();
				Sound sound = new Sound("Battle5.mid",true);
				sound.start();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							IdealType window = new IdealType();
							window.getFrame().setVisible(true);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				//프레임숨김
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.setBounds(0, 0, 165, 165);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uD55C\uAE00");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataString.getInstence().setLanguageType(DataString.LANGUAGE_KOREAN);				
				Data.loadData();
				Sound sound = new Sound("Field1.mid",true);
				sound.start();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							//IdealType프레임 출력
							IdealType window = new IdealType();
							window.getFrame().setVisible(true);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_1.setBounds(163, 0, 165, 165);
		frame.getContentPane().add(btnNewButton_1);
	}
}
