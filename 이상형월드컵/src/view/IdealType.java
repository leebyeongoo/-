package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import data.Data;
import data.DataString;

public class IdealType {

	private JFrame frame;
	private GameView game;
	private JMenuItem replayGameMenuItem;


	/**
	 * Create the application.
	 */
	public IdealType() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//�����Ӽ���
		frame = new JFrame();
		frame.setTitle(DataString.getInstence().setString(
				DataString.IDEALTPYE_TITLE));
		frame.setBounds(100, 100, 997, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);		
		ImageIcon image = new ImageIcon("res/res_image/titleicon.png");//vs�̹���
		frame.setIconImage(image.getImage());
		
		//�޴��� ����
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.GRAY);
		frame.setJMenuBar(menuBar);

		JMenu menu = new JMenu(DataString.getInstence().setString(
				DataString.IDEALTPYE_MENU_FILE));
		menu.setForeground(Color.BLACK);
		menuBar.add(menu);

		JMenuItem exitMenuItem = new JMenuItem(DataString.getInstence()
				.setString(DataString.IDEALTPYE_MENUITEM_EXIT));
		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//����
				System.exit(0); 
			}
		});
		menu.add(exitMenuItem);
		//���Ӹ޴�â
		JMenu mnNewMenu = new JMenu(DataString.getInstence().setString(
				DataString.IDEALTPYE_MENU_GAME));
		
		mnNewMenu.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu);
		//�����ϱ�
		JMenu newGameMenu = new JMenu(DataString.getInstence()
				.setString(DataString.IDEALTPYE_MENUITEM_NEWGAME));
		mnNewMenu.add(newGameMenu);
		//����
		JMenuItem newGameMan = new JMenuItem(DataString.getInstence()
				.setString(DataString.ABOUT_MAN));
		newGameMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.GameGender = "man";
				if(game !=null){
					frame.remove(game.getPanel());
				}
				Data.RandomEntry();
				game = new GameView(frame);
				frame.setSize(997, 640);
				frame.add(game.getPanel());
				//Ȱ��ȭ
				replayGameMenuItem.setEnabled(true);
				frame.repaint();
			}
		});
		newGameMenu.add(newGameMan);
		//����
		JMenuItem newGameWoman = new JMenuItem(DataString.getInstence()
				.setString(DataString.ABOUT_WOMAN));
		newGameWoman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.GameGender = "woman";
				//gameviewâ�� ������ ����� 
				if(game !=null){
					frame.remove(game.getPanel());
				}
				//Data�ڹ��� �����Լ�����
				Data.RandomEntry();
				//GameViewâ
				game = new GameView(frame);
				frame.setSize(997, 640);
				frame.add(game.getPanel());
				//�ٽ��Ͻ� Ȱ��ȭ
				replayGameMenuItem.setEnabled(true);
				frame.repaint();
			}
		});
		newGameMenu.add(newGameWoman);
		//�ٽ��ϱ�
		replayGameMenuItem = new JMenuItem(DataString.getInstence()
				.setString(DataString.IDEALTPYE_MENUITEM_REPLAYGAME));
		replayGameMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(game !=null){
					frame.remove(game.getPanel());
				}
				game = new GameView(frame);
				frame.setSize(997, 640);
				frame.add(game.getPanel());
				frame.repaint();
			}
		});
		mnNewMenu.add(replayGameMenuItem);

		
		JMenu mnNewMenu_1 = new JMenu(DataString.getInstence().setString(
				DataString.IDEALTPYE_MENU_INFO));
		mnNewMenu_1.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_1);

		
		
		JMenu rankingMenu = new JMenu(DataString.getInstence()
				.setString(DataString.IDEALTPYE_MENUITEM_RANKING));
	
		mnNewMenu_1.add(rankingMenu);

		JMenuItem Man = new JMenuItem(DataString.getInstence()
				.setString(DataString.ABOUT_MAN));
		Man.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.GameGender = "man";
				RankingView ranking = new RankingView();
				ranking.getFrame().setVisible(true);
			}
		});
		rankingMenu.add(Man);
		
		JMenuItem Woman = new JMenuItem(DataString.getInstence()
				.setString(DataString.ABOUT_WOMAN));
		Woman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data.GameGender = "woman";
				RankingView ranking = new RankingView();
				ranking.getFrame().setVisible(true);
			}
		});
		rankingMenu.add(Woman);

		if(game == null){
			replayGameMenuItem.setEnabled(false);
		}
	}
	
	public JFrame getFrame(){
		return frame;
	}
}
