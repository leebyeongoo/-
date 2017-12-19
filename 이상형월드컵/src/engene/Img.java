package engene;

import java.awt.Graphics;
import java.awt.MediaTracker;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//���̺� ������Ʈ�� ��ӹ��� Ŭ���� Img�����
public class Img extends JLabel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//res/res_image���Ϸΰ��� �̹�������
	private String urlhead = "res/res_image/";
	
	ImageIcon imgIcon;
	private String imgName;
	public Img(String _imgName, int posX, int posY, int width, int height) {
		imgName = _imgName;
		//�̹����� ���ٸ� �����̹�����
		if (_imgName == null)
			imgIcon = new ImageIcon(urlhead+"img_null.png");
		else
			imgIcon = new ImageIcon(urlhead+_imgName);
		this.setIcon(imgIcon);
		this.setBounds(posX, posY, width, height);

		this.setVisible(true);
	}

	public void setImgSize(int _width, int _height) {
		this.setSize(_width, _height);
	}

	public void setImgName(String name) {
		imgIcon = new ImageIcon(urlhead+name);
		this.setIcon(imgIcon);
	}

	public void setImgUrl(String url) {
		imgIcon = new ImageIcon(url);

		if (imgIcon.getImageLoadStatus() != MediaTracker.ERRORED)
			this.setIcon(imgIcon);
	}
	
	@Override
	//�̹����� �г��� ũ�⿡ �� ������ �׸��� �Լ�
	public void  paintComponent(Graphics g) {
		g.drawImage(imgIcon.getImage(), 0, 0, this.getWidth(),
				this.getHeight(), 0, 0, imgIcon.getIconWidth(),
				imgIcon.getIconHeight(), this);
	}

	
	public void drawImg(JPanel view1) {
		view1.add(this);
	}
	public void removeImg(JPanel view1){
		view1.remove(this);
	}
	public void removeImg(JFrame view1){
		view1.remove(this);
	}
	public void drawImg(JFrame frame) {
		frame.add(this);
	}
	public String getImgName(){
		return imgName;
	}
}
