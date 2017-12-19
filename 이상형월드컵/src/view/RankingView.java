
package view;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

import data.Data;
import data.DataString;
import engene.Img;
//정보에서 누적순위를 보여주는 클래스
public class RankingView {

	private JFrame frame;
	private JPanel panel;
	private JScrollBar scrollBar;
	private String[] imgName = new String[5];
	private String[] charName = new String[5];
	private String[] numberOfWin = new String[5];
	
	/**
	 * Create the application.
	 */
	public RankingView() { 
		int rankIndex[] = Data.ranking(Data.GameGender);
		//Data.java에서 함수를 이용 이긴횟수의 5번째까지 이미지이름,이름을
		//배열값 불러들임
		imgName[0] = Data.imgName[rankIndex[0]];
		imgName[1] = Data.imgName[rankIndex[1]];
		imgName[2] = Data.imgName[rankIndex[2]];
		imgName[3] = Data.imgName[rankIndex[3]];
		imgName[4] = Data.imgName[rankIndex[4]];
		charName[0] = Data.charName[rankIndex[0]];
		charName[1] = Data.charName[rankIndex[1]];
		charName[2] = Data.charName[rankIndex[2]];
		charName[3] = Data.charName[rankIndex[3]];
		charName[4] = Data.charName[rankIndex[4]];
		numberOfWin[0] = "우승횟수 : "+ Data.numOfWin[rankIndex[0]];
		numberOfWin[1] = "우승횟수 : "+ Data.numOfWin[rankIndex[1]];
		numberOfWin[2] = "우승횟수 : "+ Data.numOfWin[rankIndex[2]];
		numberOfWin[3] = "우승횟수 : "+ Data.numOfWin[rankIndex[3]];
		numberOfWin[4] = "우승횟수 : "+ Data.numOfWin[rankIndex[4]];
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//프레임만들기
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 260, 270);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle(DataString.getInstence().setString(DataString.IDEALTPYE_MENUITEM_RANKING));
		//컴포넌트 스크로바객체생성 위치크기조절
		scrollBar = new JScrollBar();
		scrollBar.setMaximum(368);
		scrollBar.setBounds(235, 0, 20, 243);
		scrollBar.addMouseMotionListener(new MouseMotionListener() {
			//마우스이벤트에 따른 리스너의 메소드
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				panel.setLocation(0, -(scrollBar.getValue()));
			}
		});
		
		frame.getContentPane().add(scrollBar);
		//Jpanel을 상속받아 패널만듬
		panel = new JPanel();
		panel.setBounds(0, 0, 245, 600);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.ORANGE);
		
		//순위 : 
		//이미지이름
		//이름
		//우승횟수
		JLabel label_1 = new JLabel("\uC21C\uC704 : 1\uC704");
		label_1.setBounds(113, 10, 120, 15);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("<"+imgName[0]+">");
		label_2.setBounds(113, 35, 120, 15);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel(charName[0]);
		label_3.setBounds(113, 60, 120, 15);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel(numberOfWin[0]);
		label_4.setBounds(113, 85, 120, 15);
		panel.add(label_4);
		

		JLabel label_9 = new JLabel("\uC21C\uC704 : 2\uC704");
		label_9.setBounds(113, 134, 120, 15);
		panel.add(label_9);
		
		JLabel label_8 = new JLabel("<"+imgName[1]+">");
		label_8.setBounds(113, 159, 120, 15);
		panel.add(label_8);
		
		JLabel label_7 = new JLabel(charName[1]);
		label_7.setBounds(113, 184, 120, 15);
		panel.add(label_7);
		
		JLabel label_6 = new JLabel(numberOfWin[1]);
		label_6.setBounds(113, 209, 120, 15);
		panel.add(label_6);
		
		
		
		
		JLabel label_14 = new JLabel("\uC21C\uC704 : 3\uC704");
		label_14.setBounds(113, 258, 120, 15);
		panel.add(label_14);
		
		JLabel label_13 = new JLabel("<"+imgName[2]+">");
		label_13.setBounds(113, 283, 120, 15);
		panel.add(label_13);

		JLabel label_12 = new JLabel(charName[2]);
		label_12.setBounds(113, 308, 120, 15);
		panel.add(label_12);
		
		JLabel label_11 = new JLabel(numberOfWin[2]);
		label_11.setBounds(113, 333, 120, 15);
		panel.add(label_11);
		
		
		
		
		JLabel label_19 = new JLabel("\uC21C\uC704 : 4\uC704");
		label_19.setBounds(113, 382, 120, 15);
		panel.add(label_19);
		
		JLabel label_18 = new JLabel("<"+imgName[3]+">");
		label_18.setBounds(113, 407, 120, 15);
		panel.add(label_18);
		
		JLabel label_17 = new JLabel(charName[3]);
		label_17.setBounds(113, 432, 120, 15);
		panel.add(label_17);
		
		JLabel label_16 = new JLabel(numberOfWin[3]);
		label_16.setBounds(113, 457, 120, 15);
		panel.add(label_16);
		
		
		
		JLabel label_24 = new JLabel("\uC21C\uC704 : 5\uC704");
		label_24.setBounds(113, 506, 120, 15);
		panel.add(label_24);
		
		JLabel label_23 = new JLabel("<"+imgName[4]+">");
		label_23.setBounds(113, 531, 120, 15);
		panel.add(label_23);
		
		JLabel label_22 = new JLabel(charName[4]);
		label_22.setBounds(113, 556, 120, 15);
		panel.add(label_22);
		
		JLabel label_21 = new JLabel(numberOfWin[4]);
		label_21.setBounds(113, 581, 120, 15);
		panel.add(label_21);
		
		
		
		
		
		Img img1 = new Img(imgName[0],10, 10, 90, 90);
		img1.drawImg(panel);
		Img img2 = new Img(imgName[1],10, 134, 90, 90);
		img2.drawImg(panel);
		Img img3 = new Img(imgName[2],10, 258, 90, 90);
		img3.drawImg(panel);
		Img img4 = new Img(imgName[3],10, 382, 90, 90);
		img4.drawImg(panel);
		Img img5 = new Img(imgName[4],10, 506, 90, 90);
		img5.drawImg(panel);
		

	}
	
	public JFrame getFrame(){
		return frame;
	}
}
