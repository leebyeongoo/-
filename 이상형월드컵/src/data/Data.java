package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Data {

	public static int[] index = new int[1000];
	public static String[] gender = new String[1000];
	public static String[] imgName = new String[1000];
	public static String[] charName = new String[1000];
	public static int[] numOfWin = new int[1000];
	public static int MAXNUM;
	public static String[] entry = new String[16];
	public static int[] entryIndex = new int[16];
	public static String GameGender;

	public static void saveData() {
		try {
			//입출력 스트림 클래스를 이용해 res/data.txt에 저장된 
			//순서, 성별, 이름 , 이미지파일이름,이긴수를 불러들인다.		
			PrintStream pscan = new PrintStream("res/data.txt");
			for (int i = 0; i < MAXNUM ; i++) {
				pscan.printf("%d %s %s %s %d\n", Data.index[i], Data.gender[i],
						Data.charName[i], Data.imgName[i], Data.numOfWin[i]);
			}
			pscan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void loadData() {
		try {
			//파일에서 file객체가 가리키는 파일을 바이트 단위로 데이터르르 읽거나 쓰기위해 FileInputStream클래스 이용
			FileInputStream fis = new FileInputStream("res/data.txt");

			Scanner s = new Scanner(fis);

			int count = 0;
			int lineCount = 0;
			// s.hasNext() : 띄어쓰기 단위로 구분한다. 공백, 탭, 줄바꿈
			while (s.hasNext()) {
				//각각의 정보를 읽어들어 배열에 삽입
				if (count == 0)
					Data.index[lineCount] = Integer.parseInt(s.next());			
				else if (count == 1)
					Data.gender[lineCount] = s.next();
				else if (count == 2)
					Data.charName[lineCount] = s.next();
				else if (count == 3)
					Data.imgName[lineCount] = s.next();
				else if (count == 4) {
					Data.numOfWin[lineCount] = Integer.parseInt(s.next());
					lineCount++;
					count = -1;
				}
				count++;
			}
			MAXNUM = lineCount;
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void RandomEntry() {
		int[] db = new int[Data.MAXNUM];
		// 참여가능한 선수 수만큼 배열을 만들고 -1로 초기화
		for (int i = 0; i < Data.MAXNUM; i++) {
			db[i] = -1;
		}
		for (int i = 0; i < Data.MAXNUM; i++) {
			if (!Data.gender[i].equals(Data.GameGender)) {

				db[i] = 0;
			}
		}
		// 중복되지 않게 뽑음.
		for (int i = 0; i < 16; i++) {
			//random함수를 참여가능한 수만큼 숫자 나오게 실행
			entryIndex[i] = (int) (Math.random() * Data.MAXNUM);
			while (true) {
				if (db[entryIndex[i]] == -1) {
					db[entryIndex[i]] = 0;
					break;
				} else {
					entryIndex[i] = (int) (Math.random() * Data.MAXNUM);

				}
			}

			entry[i] = Data.imgName[entryIndex[i]];
		}
	}

	public static int[] ranking(String _gender) {
		int[] rank = new int[5];
		int[] all = new int[MAXNUM];
		int[] allIndex = new int[MAXNUM];

		for (int i = 0; i < MAXNUM; i++) {
			all[i] = numOfWin[i];
			allIndex[i] = index[i];
		}

		// 남자와 여자 선별.
		// 남자를 찾을 때는 여자 기록 -1로 초기화
		for (int i = 0; i < MAXNUM; i++) {
			if (!gender[i].equals(_gender)) {
				all[i] = -1;

			}
		}

		// 내림차순 정렬
		for (int i = 0; i < MAXNUM - 1; i++) {
			if (all[i] < all[i + 1]) {
				int a = all[i];
				all[i] = all[i + 1];
				all[i + 1] = a;

				int b = allIndex[i];
				allIndex[i] = allIndex[i + 1];
				allIndex[i + 1] = b;
				i = -1;

			}
		}
		for (int i = 0; i < 5; i++) {
			//1위부터 5위까지 내림차순을 통해 얻은 순서대로 대입
			rank[i] = allIndex[i];
		}

		return rank;
	}

	//이긴 사진에다가 전체데이터에서 같은 사진을 찾아 이긴수 1 증가
	public static void selectWiner(String _imgName){
		for(int i=0;i<Data.MAXNUM;i++){
			if(imgName[i].equals(_imgName)){
				numOfWin[i]++;
				break;
			}
		}
	}
	//이름이 같은지 확인하여 그 이름을 리턴
	public static String selecWinerName(String _imgName){
		String name = "";
		for(int i=0;i<Data.MAXNUM;i++){
			if(imgName[i].equals(_imgName)){
				name = charName[i];
				break;
			}
		}
		return name;
	}
}
