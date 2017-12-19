package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import data.Data;

import engene.Img;

public class GameView implements MouseListener {

	public GameView gameview;
	private JFrame IdealFrame;
	private JPanel frame;
	private Img imgBtn;
	private Img imgBt;
	private Img img1;
	private Img img2;
	private Img img3;
	private Img img4;
	private Img img5;
	private Img img6;
	private Img img7;
	private Img img8;
	private Img img9;
	private Img img10;
	private Img img11;
	private Img img12;
	private Img img13;
	private Img img14;
	private Img img15;
	private Img img16;
	private JLabel lblNewLabel_2;
	public JButton btnNewButton;
	
	private JLabel textCharName1;
	private JLabel textCharName2;
	
	public JLabel lblNewLabel_3 ;

	private int ROUND = 16;
	

	/**
	 * Create the application.
	 */
	public GameView(JFrame frame) {
		gameview = this;
		IdealFrame = frame;
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JPanel();
		frame.setBounds(0, 0, 997, 640);
		frame.setBackground(Color.black);
		frame.addMouseListener(this);
		//Img자바에서 Img함수이용 이름,위치,크기
		imgBtn = new Img("", 80, 70, 300, 300);
		imgBtn.drawImg(frame);

		imgBt = new Img("", 600, 70, 300, 300);
		imgBt.drawImg(frame);

		img1 = new Img(Data.entry[0], 12, 520, 60, 60);
		img1.drawImg(frame);

		img2 = new Img(Data.entry[1], 72, 520, 60, 60);
		img2.drawImg(frame);

		img3 = new Img(Data.entry[2], 132, 520, 60, 60);
		img3.drawImg(frame);

		img4 = new Img(Data.entry[3], 192, 520, 60, 60);
		img4.drawImg(frame);

		img5 = new Img(Data.entry[4], 252, 520, 60, 60);
		img5.drawImg(frame);

		img6 = new Img(Data.entry[5], 312, 520, 60, 60);
		img6.drawImg(frame);

		img7 = new Img(Data.entry[6], 372, 520, 60, 60);
		img7.drawImg(frame);

		img8 = new Img(Data.entry[7], 432, 520, 60, 60);
		img8.drawImg(frame);

		img9 = new Img(Data.entry[8], 492, 520, 60, 60);
		img9.drawImg(frame);

		img10 = new Img(Data.entry[9], 552, 520, 60, 60);
		img10.drawImg(frame);

		img11 = new Img(Data.entry[10], 612, 520, 60, 60);
		img11.drawImg(frame);

		img12 = new Img(Data.entry[11], 672, 520, 60, 60);
		img12.drawImg(frame);

		img13 = new Img(Data.entry[12], 732, 520, 60, 60);
		img13.drawImg(frame);

		img14 = new Img(Data.entry[13], 792, 520, 60, 60);
		img14.drawImg(frame);

		img15 = new Img(Data.entry[14], 852, 520, 60, 60);
		img15.drawImg(frame);

		img16 = new Img(Data.entry[15], 912, 520, 60, 60);
		img16.drawImg(frame);
		
		
		textCharName1 = new JLabel();
		textCharName1.setBounds(180, 370, 300, 50);
		textCharName1.setHorizontalTextPosition(JLabel.CENTER);
		textCharName1.setFont(new Font("굴림", Font.PLAIN, 35));
		textCharName1.setForeground(Color.WHITE);
		frame.add(textCharName1);
		textCharName2 = new JLabel();
		textCharName2.setBounds(700, 370, 300, 50);
		textCharName2.setHorizontalTextPosition(JLabel.CENTER);
		textCharName2.setFont(new Font("굴림", Font.PLAIN, 35));
		textCharName2.setForeground(Color.WHITE);
		frame.add(textCharName2);
		frame.setLayout(null);

		btnNewButton = new JButton("라운드시작");
		btnNewButton.setBounds(437, 269, 104, 44);
		btnNewButton.addActionListener(new ActionListener() {
			//버튼클릭시 호출되는 메소드를 오버라이딩
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (btnNewButton.getText().equals("라운드시작")) {
					//누르면 바로 Random버튼으로 
					btnNewButton.setText("Random");
					//각 회차마다 이미지를 넣은 버튼 컨포넌트를 만들고
					//Date.selecwinerName함수를 이용하여 이름이 같은지 확인하여 	
					//문자를 넣은 레이블 컴포넌트를 생성한다.
					if (roundCount == 1) {
						imgBtn.setImgName(img1.getImgName());
						imgBt.setImgName(img2.getImgName());
						textCharName1.setText(Data.selecWinerName(img1.getImgName()));
						textCharName2.setText(Data.selecWinerName(img2.getImgName()));
						startSwi = true;
					}
					else if (roundCount == 2) {
						imgBtn.setImgName(eight1);
						imgBt.setImgName(eight2);
						textCharName1.setText(Data.selecWinerName(eight1));
						textCharName2.setText(Data.selecWinerName(eight2));
						startSwi = true;
					}
					else if (roundCount == 3) {
						imgBtn.setImgName(four1);
						imgBt.setImgName(four2);
						textCharName1.setText(Data.selecWinerName(four1));
						textCharName2.setText(Data.selecWinerName(four2));
						startSwi = true;
					}
					else if (roundCount == 4) {
						imgBtn.setImgName(two1);
						imgBt.setImgName(two2);
						textCharName1.setText(Data.selecWinerName(two1));
						textCharName2.setText(Data.selecWinerName(two2));
						startSwi = true;
					}
					clickCount++;
					//경기진행정보의 레이블 컴포넌트를 만든다.
					lblNewLabel_2
							.setText(ROUND + "강 " + clickCount + "회차");
				}
				else if (btnNewButton.getText().equals("Random")) {
					//random메소드를 이용하여 2까지 나온수자를 2를 나우어 그 숫자에 따른 좌우선택
					if((int)(Math.random()*2)%2 == 0){
						Left();
					}
					else
					{
						Right();
					}
				}
				//버튼컴포넌트가 우승자이면 WinnerView.java를 통해 지금화면 이미지이름을 뛰운다.
				else if(btnNewButton.getText().equals("우승자")) {
					WinnerView winView = new WinnerView(gameview,thefinal);
					frame.add(winView);
					frame.repaint();
					//Data함수를 이용 저장한다.
					Data.selectWiner(thefinal);
					Data.saveData();
				//	IdealFrame.remove(frame);
				//	IdealFrame.repaint();
				}
			}
		});
		frame.add(btnNewButton);

		lblNewLabel_2 =new JLabel("라운드 준비");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 35));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalTextPosition(JLabel.CENTER);
		lblNewLabel_2.setBounds(400, 383, 193, 44);
		frame.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("VS");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 100));
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(430, 110, 200, 200);
		frame.add(lblNewLabel_3);


	}
	//마우스이벤트의 리스너의 추상메소드를 오버라이드
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	private int clickCount = 0;
	private int roundCount = 1;
	private boolean startSwi = false;
	//8강
	private String eight1;
	private String eight2;
	private String eight3;
	private String eight4;
	private String eight5;
	private String eight6;
	private String eight7;
	private String eight8;
	//4강
	private String four1;
	private String four2;
	private String four3;
	private String four4;
	//결승
	private String two1;
	private String two2;
	//최종 승자
	private String thefinal;

	@Override
	public void mouseReleased(MouseEvent e) {
		//버튼컴포넌트가 라운드시작눌러 if문을 통해 true,fales값을 starSwi로 받기
		if (startSwi) {
			//마우스클릭시 위치와 크기에따라 좌우그림판별후 그에따른 함수 실행
			// 왼쪽 그림
			if (e.getX() >= imgBtn.getX() && e.getX() <= imgBtn.getX()+imgBtn.getWidth()
					&& e.getY() >= imgBtn.getY() && e.getY() <= imgBtn.getY()+imgBtn.getHeight()) {
				Left();

			}

			// 오른쪽 그림
			if (e.getX() >= imgBt.getX() && e.getX() <= imgBt.getX()+imgBt.getWidth()
					&& e.getY() >= imgBt.getY() && e.getY() <= imgBt.getY()+imgBt.getHeight()) {
				Right();
				
			}

			frame.repaint();
		}
	}

	public JPanel getPanel() {
		return frame;
	}
	
	//경기진행에따라 클릭횟수에따른 다음 이미지가 나오는데 좌우클릭에따라 그 이미지의 이름을 변수에 저장
	public void Left(){
		//16강
		if (roundCount == 1 && clickCount == 1) {
			eight1 = img1.getImgName();
			imgBtn.setImgName(img3.getImgName());
			imgBt.setImgName(img4.getImgName());

			textCharName1.setText(Data.selecWinerName(img3.getImgName()));
			textCharName2.setText(Data.selecWinerName(img4.getImgName()));

		} else if (roundCount == 1 && clickCount == 2) {
			eight2 = img3.getImgName();
			imgBtn.setImgName(img5.getImgName());
			imgBt.setImgName(img6.getImgName());
			textCharName1.setText(Data.selecWinerName(img5.getImgName()));
			textCharName2.setText(Data.selecWinerName(img6.getImgName()));

		} else if (roundCount == 1 && clickCount == 3) {
			eight3 = img5.getImgName();
			imgBtn.setImgName(img7.getImgName());
			imgBt.setImgName(img8.getImgName());
			textCharName1.setText(Data.selecWinerName(img7.getImgName()));
			textCharName2.setText(Data.selecWinerName(img8.getImgName()));

		} else if (roundCount == 1 && clickCount == 4) {
			eight4 = img7.getImgName();
			imgBtn.setImgName(img9.getImgName());
			imgBt.setImgName(img10.getImgName());
			textCharName1.setText(Data.selecWinerName(img9.getImgName()));
			textCharName2.setText(Data.selecWinerName(img10.getImgName()));

		} else if (roundCount == 1 && clickCount == 5) {
			eight5 = img9.getImgName();
			imgBtn.setImgName(img11.getImgName());
			imgBt.setImgName(img12.getImgName());
			textCharName1.setText(Data.selecWinerName(img11.getImgName()));
			textCharName2.setText(Data.selecWinerName(img12.getImgName()));

		} else if (roundCount == 1 && clickCount == 6) {
			eight6 = img11.getImgName();
			imgBtn.setImgName(img13.getImgName());
			imgBt.setImgName(img14.getImgName());
			textCharName1.setText(Data.selecWinerName(img13.getImgName()));
			textCharName2.setText(Data.selecWinerName(img14.getImgName()));

		} else if (roundCount == 1 && clickCount == 7) {
			eight7 = img13.getImgName();
			imgBtn.setImgName(img15.getImgName());
			imgBt.setImgName(img16.getImgName());
			textCharName1.setText(Data.selecWinerName(img15.getImgName()));
			textCharName2.setText(Data.selecWinerName(img16.getImgName()));

		} else if (roundCount == 1 && clickCount == 8) {
			eight8 = img15.getImgName();
			imgBtn.setImgName(eight1);
			imgBt.setImgName(eight2);
			textCharName1.setText(Data.selecWinerName(eight1));
			textCharName2.setText(Data.selecWinerName(eight2));

			btnNewButton.setText("라운드시작");
			startSwi = false;
			clickCount = -1; //초기화
			roundCount++;
			ROUND/=2; 
			imgBtn.setImgName("");
			imgBt.setImgName("");
			textCharName1.setText("");
			textCharName2.setText("");
		}
		//8강
		else if (roundCount == 2 && clickCount == 1) {
			four1 = eight1;
			imgBtn.setImgName(eight3);
			imgBt.setImgName(eight4);
			textCharName1.setText(Data.selecWinerName(eight3));
			textCharName2.setText(Data.selecWinerName(eight4));

		} else if (roundCount == 2 && clickCount == 2) {
			four2 = eight3;
			imgBtn.setImgName(eight5);
			imgBt.setImgName(eight6);
			textCharName1.setText(Data.selecWinerName(eight5));
			textCharName2.setText(Data.selecWinerName(eight6));

		} else if (roundCount == 2 && clickCount == 3) {
			four3 = eight5;
			imgBtn.setImgName(eight7);
			imgBt.setImgName(eight8);
			textCharName1.setText(Data.selecWinerName(eight7));
			textCharName2.setText(Data.selecWinerName(eight8));

		} else if (roundCount == 2 && clickCount == 4) {
			four4 = eight7;
			imgBtn.setImgName(four1);
			imgBt.setImgName(four2);
			textCharName1.setText(Data.selecWinerName(four1));
			textCharName2.setText(Data.selecWinerName(four2));

			btnNewButton.setText("라운드시작");
			startSwi = false;
			clickCount = -1;
			roundCount++;
			ROUND/=2;
			imgBtn.setImgName("");
			imgBt.setImgName("");

			textCharName1.setText("");
			textCharName2.setText("");
		}
		//4강
		else if (roundCount == 3 && clickCount == 1) {
			two1 = four1;
			imgBtn.setImgName(four3);
			imgBt.setImgName(four4);
			textCharName1.setText(Data.selecWinerName(four3));
			textCharName2.setText(Data.selecWinerName(four4));

		} else if (roundCount == 3 && clickCount == 2) {
			two2 = four3;
			imgBtn.setImgName(two1);
			imgBt.setImgName(two2);
			textCharName1.setText(Data.selecWinerName(two1));
			textCharName2.setText(Data.selecWinerName(two2));

			btnNewButton.setText("라운드시작");
			startSwi = false;
			clickCount = -1;
			roundCount++;
			ROUND/=2;
			imgBtn.setImgName("");
			imgBt.setImgName("");
			textCharName1.setText("");
			textCharName2.setText("");

		}
		//결승
		else if (roundCount == 4 && clickCount == 1) {
			thefinal = two1;
			imgBtn.setImgName(thefinal);
			imgBt.setImgName(thefinal);

			btnNewButton.setText("우승자");
			startSwi = false;
			clickCount = -1;
			roundCount++;
			ROUND=1;
			imgBtn.setImgName("");
			imgBt.setImgName("");
			textCharName1.setText("");
			textCharName2.setText("");
		}

		clickCount++;
		if(ROUND !=1)
			lblNewLabel_2.setText(ROUND + "강 " + clickCount + "회차");
		else
			lblNewLabel_2.setText("");
	}
	
	public void Right(){
		lblNewLabel_2.setText(roundCount + "강 " + clickCount + "회차");
		if (roundCount == 1 && clickCount == 1) {
			eight1 = img2.getImgName();
			imgBtn.setImgName(img3.getImgName());
			imgBt.setImgName(img4.getImgName());
			textCharName1.setText(Data.selecWinerName(img3.getImgName()));
			textCharName2.setText(Data.selecWinerName(img4.getImgName()));

		} else if (roundCount == 1 && clickCount == 2) {
			eight2 = img4.getImgName();
			imgBtn.setImgName(img5.getImgName());
			imgBt.setImgName(img6.getImgName());
			textCharName1.setText(Data.selecWinerName(img5.getImgName()));
			textCharName2.setText(Data.selecWinerName(img6.getImgName()));

		} else if (roundCount == 1 && clickCount == 3) {
			eight3 = img6.getImgName();
			imgBtn.setImgName(img7.getImgName());
			imgBt.setImgName(img8.getImgName());
			textCharName1.setText(Data.selecWinerName(img7.getImgName()));
			textCharName2.setText(Data.selecWinerName(img8.getImgName()));

		} else if (roundCount == 1 && clickCount == 4) {
			eight4 = img8.getImgName();
			imgBtn.setImgName(img9.getImgName());
			imgBt.setImgName(img10.getImgName());
			textCharName1.setText(Data.selecWinerName(img9.getImgName()));
			textCharName2.setText(Data.selecWinerName(img10.getImgName()));

		} else if (roundCount == 1 && clickCount == 5) {
			eight5 = img10.getImgName();
			imgBtn.setImgName(img11.getImgName());
			imgBt.setImgName(img12.getImgName());
			textCharName1.setText(Data.selecWinerName(img11.getImgName()));
			textCharName2.setText(Data.selecWinerName(img12.getImgName()));

		} else if (roundCount == 1 && clickCount == 6) {
			eight6 = img12.getImgName();
			imgBtn.setImgName(img13.getImgName());
			imgBt.setImgName(img14.getImgName());
			textCharName1.setText(Data.selecWinerName(img13.getImgName()));
			textCharName2.setText(Data.selecWinerName(img14.getImgName()));

		} else if (roundCount == 1 && clickCount == 7) {
			eight7 = img14.getImgName();
			imgBtn.setImgName(img15.getImgName());
			imgBt.setImgName(img16.getImgName());
			textCharName1.setText(Data.selecWinerName(img15.getImgName()));
			textCharName2.setText(Data.selecWinerName(img16.getImgName()));

		} else if (roundCount == 1 && clickCount == 8) {
			eight8 = img16.getImgName();
			imgBtn.setImgName(eight1);
			imgBt.setImgName(eight2);
			textCharName1.setText(Data.selecWinerName(eight1));
			textCharName2.setText(Data.selecWinerName(eight2));

			btnNewButton.setText("라운드시작");
			startSwi = false;
			clickCount = -1;
			roundCount++;
			ROUND/=2;
			imgBtn.setImgName("");
			imgBt.setImgName("");

			textCharName1.setText(Data.selecWinerName(""));
			textCharName2.setText(Data.selecWinerName(""));
		}

		else if (roundCount == 2 && clickCount == 1) {
			four1 = eight2;
			imgBtn.setImgName(eight3);
			imgBt.setImgName(eight4);
			textCharName1.setText(Data.selecWinerName(eight3));
			textCharName2.setText(Data.selecWinerName(eight4));

		} else if (roundCount == 2 && clickCount == 2) {
			four2 = eight4;
			imgBtn.setImgName(eight5);
			imgBt.setImgName(eight6);

			textCharName1.setText(Data.selecWinerName(eight5));
			textCharName2.setText(Data.selecWinerName(eight6));

		} else if (roundCount == 2 && clickCount == 3) {
			four3 = eight6;
			imgBtn.setImgName(eight7);
			imgBt.setImgName(eight8);
			textCharName1.setText(Data.selecWinerName(eight7));
			textCharName2.setText(Data.selecWinerName(eight8));

		} else if (roundCount == 2 && clickCount == 4) {
			four4 = eight8;
			imgBtn.setImgName(four1);
			imgBt.setImgName(four2);

			btnNewButton.setText("라운드시작");
			startSwi = false;
			clickCount = -1;
			roundCount++;
			ROUND/=2;
			imgBtn.setImgName("");
			imgBt.setImgName("");

			textCharName1.setText("");
			textCharName2.setText("");
		}

		else if (roundCount == 3 && clickCount == 1) {
			two1 = four2;
			imgBtn.setImgName(four3);
			imgBt.setImgName(four4);
			textCharName1.setText(Data.selecWinerName(four3));
			textCharName2.setText(Data.selecWinerName(four4));

		} else if (roundCount == 3 && clickCount == 2) {
			two2 = four4;
			imgBtn.setImgName(two1);
			imgBt.setImgName(two2);

			btnNewButton.setText("라운드시작");
			startSwi = false;
			clickCount = -1;
			roundCount++;
			ROUND/=2;
			imgBtn.setImgName("");
			imgBt.setImgName("");
			textCharName1.setText("");
			textCharName2.setText("");
		}

		else if (roundCount == 4 && clickCount == 1) {
			thefinal = two2;
			imgBtn.setImgName(thefinal);
			imgBt.setImgName(thefinal);

			btnNewButton.setText("우승자");
			startSwi = false;
			clickCount = -1;
			roundCount++;
			ROUND=1;
			imgBtn.setImgName("");
			imgBt.setImgName("");

			textCharName1.setText("");
			textCharName2.setText("");
		}
		clickCount++;
		//결승이면 공백
		if(ROUND!=1)
			lblNewLabel_2.setText(ROUND + "강 " + clickCount + "회차");
		else
			lblNewLabel_2.setText("");
	}
}
