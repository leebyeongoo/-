package engene;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
//Thred를 상속받은 Sound클래스 
public class Sound extends Thread {
	//이 인풋스트림으로 음악파일이 들어옴
	private static AudioInputStream ais;
	private static Clip clip;
	private String soundName;
	private boolean soundSwi = true;
	private long playTime;
	//다시 실행시
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
//run() 메소드 오버라이딩
	public void run() {
		while (soundSwi) {
			try {
				//음악파일을 열어 인풋스트림에 넣음
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
