package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import engene.Img;
//������̹����� ����Ʈ�ҿ� �ٿ��
public class WinnerView extends JPanel {

	private GameView view;
	public WinnerView(GameView view, String imgName) {
		this.view = view;
		setBounds(100,0,780,520);
		setLayout(null);
		Img imgWinner =new Img(imgName, 200, 50, 400, 400);
		imgWinner.drawImg(this);
		
		Img img  = new Img("img_winner.png", 0, 0, 780, 520);
		img.drawImg(this);
		//���̺� ��Ȱ��ȭ
		view.lblNewLabel_3.setVisible(false);
		view.btnNewButton.setVisible(false);
	}
}
