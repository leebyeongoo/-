package engene;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
//Thred�� ��ӹ��� SoundŬ���� 
public class Sound extends Thread {
	//�� ��ǲ��Ʈ������ ���������� ����
	private static AudioInputStream ais;
	private static Clip clip;
	private String soundName;
	private boolean soundSwi = true;
	private long playTime;
	//�ٽ� �����
	public Sound(String soundName, boolean replay) {
		this.soundName = soundName;
		this.soundSwi = replay;
		this.playTime = 110000;
	}

	public Sound(String soundName, boolean replay, long playTime) {
		this.soundName = soundName;
		this.soundSwi = replay;
		this.playTime = playTime * 1000;
	}
//run() �޼ҵ� �������̵�
	public void run() {
		while (soundSwi) {
			try {
				//���������� ���� ��ǲ��Ʈ���� ����
				ais = AudioSystem.getAudioInputStream(new File("res/res_sound/"
						+ soundName));
				clip = AudioSystem.getClip();
				clip.stop();
				clip.open(ais);
				clip.start();
				Thread.sleep(playTime);
			} catch (Exception ex) {
			}
		}
	}
}
