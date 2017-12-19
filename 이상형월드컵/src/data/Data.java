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
			//����� ��Ʈ�� Ŭ������ �̿��� res/data.txt�� ����� 
			//����, ����, �̸� , �̹��������̸�,�̱���� �ҷ����δ�.		
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
			//���Ͽ��� file��ü�� ����Ű�� ������ ����Ʈ ������ �����͸��� �аų� �������� FileInputStreamŬ���� �̿�
			FileInputStream fis = new FileInputStream("res/data.txt");

			Scanner s = new Scanner(fis);

			int count = 0;
			int lineCount = 0;
			// s.hasNext() : ���� ������ �����Ѵ�. ����, ��, �ٹٲ�
			while (s.hasNext()) {
				//������ ������ �о��� �迭�� ����
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
		// ���������� ���� ����ŭ �迭�� ����� -1�� �ʱ�ȭ
		for (int i = 0; i < Data.MAXNUM; i++) {
			db[i] = -1;
		}
		for (int i = 0; i < Data.MAXNUM; i++) {
			if (!Data.gender[i].equals(Data.GameGender)) {

				db[i] = 0;
			}
		}
		// �ߺ����� �ʰ� ����.
		for (int i = 0; i < 16; i++) {
			//random�Լ��� ���������� ����ŭ ���� ������ ����
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

		// ���ڿ� ���� ����.
		// ���ڸ� ã�� ���� ���� ��� -1�� �ʱ�ȭ
		for (int i = 0; i < MAXNUM; i++) {
			if (!gender[i].equals(_gender)) {
				all[i] = -1;

			}
		}

		// �������� ����
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
			//1������ 5������ ���������� ���� ���� ������� ����
			rank[i] = allIndex[i];
		}

		return rank;
	}

	//�̱� �������ٰ� ��ü�����Ϳ��� ���� ������ ã�� �̱�� 1 ����
	public static void selectWiner(String _imgName){
		for(int i=0;i<Data.MAXNUM;i++){
			if(imgName[i].equals(_imgName)){
				numOfWin[i]++;
				break;
			}
		}
	}
	//�̸��� ������ Ȯ���Ͽ� �� �̸��� ����
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
