package data;
public class DataString {
	private static DataString instence;

	public static final int LANGUAGE_KOREAN = 0;
	public static final int LANGUAGE_ENGLISH = 1;
	private int LanguageType;

	public static final int IDEALTPYE_TITLE = 0;
	public static final int IDEALTPYE_MENU_FILE = 1;
	public static final int IDEALTPYE_MENU_GAME = 2;
	public static final int IDEALTPYE_MENU_INFO = 3;
	public static final int IDEALTPYE_MENUITEM_IMPORT = 4;
	public static final int IDEALTPYE_MENUITEM_EXPORT = 5;
	public static final int IDEALTPYE_MENUITEM_EXIT = 6;
	public static final int IDEALTPYE_MENUITEM_NEWGAME = 7;
	public static final int IDEALTPYE_MENUITEM_REPLAYGAME = 8;
	public static final int IDEALTPYE_MENUITEM_RANKING = 9;
	public static final int IDEALTPYE_MENUITEM_INFO = 10;
	public static final int IDEALTPYE_MENUITEM_LANGUAGE = 11;
	
	public static final int EXPORT_TITLE = 12;
	public static final int EXPORT_URL = 13;
	public static final int EXPORT_SELLECTURL = 14;
	public static final int EXPORT_OK = 15;
	
	public static final int IMPORT_TITLE = 16;
	public static final int IMPORT_URL = 17;
	public static final int IMPORT_BACK = 18;
	public static final int IMPORT_FILENAME = 19;
	public static final int IMPORT_IMEGENAME = 20;
	public static final int IMPORT_OK = 21;
	public static final int IMPORT_MAN = 22;
	public static final int IMPORT_WOMAN = 23;
	
	public static final int STR_URL = 24;
	public static final int STR_BACK = 25;
	public static final int STR_OK = 26;
	
	public static final int ABOUT_TITLE = 27;
	public static final int ABOUT_SCHOOL = 28;
	public static final int ABOUT_DEPARTMENT = 29;
	public static final int ABOUT_DATE = 30;
	public static final int ABOUT_SUBJECT =31;
	public static final int ABOUT_GYOUNGGYU = 32;
	public static final int ABOUT_DAJUNG =33;
	public static final int ABOUT_KYUHWAN = 34;
	public static final int ABOUT_JIEUN = 35;
	
	public static final int GAME_START = 36;
	
	public static final int ABOUT_MAN = 37;
	public static final int ABOUT_WOMAN = 38;
	
	public class Korean {
		public static final String IDEALTPYE_TITLE = "이상형 월드컵";
		public static final String IDEALTPYE_MENU_FILE = "파일";
		public static final String IDEALTPYE_MENU_GAME = "게임";
		public static final String IDEALTPYE_MENU_INFO = "정보";
		public static final String IDEALTPYE_MENUITEM_IMPORT = "이미지 가져오기";
		public static final String IDEALTPYE_MENUITEM_EXPORT = "이미지 내보내기";
		public static final String IDEALTPYE_MENUITEM_EXIT = "종료하기";
		public static final String IDEALTPYE_MENUITEM_NEWGAME = "새로하기";
		public static final String IDEALTPYE_MENUITEM_REPLAYGAME = "다시하기";
		public static final String IDEALTPYE_MENUITEM_RANKING = "누적순위";
		public static final String IDEALTPYE_MENUITEM_INFO = "프로그램 정보";
		public static final String IDEALTPYE_MENUITEM_LANGUAGE = "English";
		
		public static final String EXPORT_TITLE = "이미지 내보내기";
		public static final String EXPORT_URL = "   경  로 ";
		public static final String EXPORT_SELLECTURL = "경로검색";
		public static final String EXPORT_OK = "확인";
		
		public static final String IMPORT_TITLE = "이미지 가져오기";
		public static final String IMPORT_URL = "경 로";
		public static final String IMPORT_BACK = "뒤로";
		public static final String IMPORT_FILENAME = "  파 일 ";
		public static final String IMPORT_IMEGENAME = "이름";
		public static final String IMPORT_OK = "확인";
		public static final String IMPORT_MAN = "남자";
		public static final String IMPORT_WOMAN = "여자";
		
		public static final String STR_URL = "경 로";
		public static final String STR_BACK = "뒤로";
		public static final String STR_OK = "확인";
		
		
		public static final String GAME_START = "라운드시작";
		
		public static final String ABOUT_MAN = "남자";
		public static final String ABOUT_WOMAN = "여자";
	}

	public class English {
		public static final String IDEALTPYE_TITLE = "WorldCup Of IdealType";
		public static final String IDEALTPYE_MENU_FILE = "FILE";
		public static final String IDEALTPYE_MENU_GAME = "GAME";
		public static final String IDEALTPYE_MENU_INFO = "INFO";
		public static final String IDEALTPYE_MENUITEM_IMPORT = "Image Import";
		public static final String IDEALTPYE_MENUITEM_EXPORT = "Image Export";
		public static final String IDEALTPYE_MENUITEM_EXIT = "EXIT";
		public static final String IDEALTPYE_MENUITEM_NEWGAME = "NewGame";
		public static final String IDEALTPYE_MENUITEM_REPLAYGAME = "RePlayGame";
		public static final String IDEALTPYE_MENUITEM_RANKING = "Ranking";
		public static final String IDEALTPYE_MENUITEM_INFO = "About...";
		public static final String IDEALTPYE_MENUITEM_LANGUAGE = "한글";
		
		public static final String EXPORT_TITLE = "Image Export";
		public static final String EXPORT_URL = "  U  R  L";
		public static final String EXPORT_SELLECTURL = "Sellect";
		public static final String EXPORT_OK = "OK";
		
		public static final String IMPORT_TITLE = "Image Import";
		public static final String IMPORT_URL = "U R L";
		public static final String IMPORT_BACK = "Back";
		public static final String IMPORT_FILENAME = "FileName";
		public static final String IMPORT_IMEGENAME = "Name";
		public static final String IMPORT_OK = "OK";
		public static final String IMPORT_MAN = "MAN";
		public static final String IMPORT_WOMAN = "WOMAN";
		
		public static final String STR_URL = "U R L";
		public static final String STR_BACK = "Back";
		public static final String STR_OK = "OK";

		public static final String GAME_START = "Game Start";
		public static final String ABOUT_MAN = "Man";
		public static final String ABOUT_WOMAN = "Woman";
	}

	public static DataString getInstence() {
		if (instence == null)
			instence = new DataString();
		return instence;
	}
	
	public void setLanguageType(int _languageType){
		if (instence == null)
			instence = new DataString();
		LanguageType = _languageType;
	}
	
	public int getLanguageType(){
		if (instence == null)
			instence = new DataString();
		return LanguageType;
	}
	
	public String setString(int _stringIndex) {
		if (LanguageType == LANGUAGE_KOREAN) {
			switch (_stringIndex) {
			case IDEALTPYE_TITLE:
				return Korean.IDEALTPYE_TITLE;
			case IDEALTPYE_MENU_FILE :
				return Korean.IDEALTPYE_MENU_FILE ;
			case IDEALTPYE_MENU_GAME  :
				return Korean.IDEALTPYE_MENU_GAME;
			case IDEALTPYE_MENU_INFO :
				return Korean.IDEALTPYE_MENU_INFO ;
			case IDEALTPYE_MENUITEM_IMPORT :
				return Korean.IDEALTPYE_MENUITEM_IMPORT ;
			case IDEALTPYE_MENUITEM_EXPORT  :
				return Korean.IDEALTPYE_MENUITEM_EXPORT  ;
			case IDEALTPYE_MENUITEM_EXIT   :
				return Korean.IDEALTPYE_MENUITEM_EXIT ;
			case IDEALTPYE_MENUITEM_REPLAYGAME   :
				return Korean.IDEALTPYE_MENUITEM_REPLAYGAME  ;
			case IDEALTPYE_MENUITEM_NEWGAME :
				return Korean.IDEALTPYE_MENUITEM_NEWGAME ;
			case IDEALTPYE_MENUITEM_RANKING  :
				return Korean.IDEALTPYE_MENUITEM_RANKING  ;
			case IDEALTPYE_MENUITEM_INFO   :
				return Korean.IDEALTPYE_MENUITEM_INFO ;
			case IDEALTPYE_MENUITEM_LANGUAGE   :
				return Korean.IDEALTPYE_MENUITEM_LANGUAGE ;
		
				
			case EXPORT_TITLE:
				return Korean.EXPORT_TITLE;
			case EXPORT_URL:
				return Korean.EXPORT_URL;
			case EXPORT_SELLECTURL:
				return Korean.EXPORT_SELLECTURL;
			case EXPORT_OK:
				return Korean.EXPORT_OK;
				
				
			case IMPORT_TITLE:
				return Korean.IMPORT_TITLE;
			case IMPORT_URL:
				return Korean.IMPORT_URL;
			case IMPORT_BACK:
				return Korean.IMPORT_BACK;
			case IMPORT_FILENAME:
				return Korean.IMPORT_FILENAME;
			case IMPORT_IMEGENAME:
				return Korean.IMPORT_IMEGENAME;
			case IMPORT_OK:
				return Korean.IMPORT_OK;
			case IMPORT_MAN:
				return Korean.IMPORT_MAN;
			case IMPORT_WOMAN:
				return Korean.IMPORT_WOMAN;
				
				
			case STR_URL:
				return Korean.STR_URL;
			case STR_BACK:
				return Korean.STR_BACK;
			case STR_OK:
				return Korean.STR_OK;
				
				
			case ABOUT_TITLE:

			case ABOUT_MAN:
				return Korean.ABOUT_MAN;
			case ABOUT_WOMAN:
				return Korean.ABOUT_WOMAN;
				
			}
		}
		else if (LanguageType == LANGUAGE_ENGLISH) {
			switch (_stringIndex) {
			case IDEALTPYE_TITLE:
				return English.IDEALTPYE_TITLE;
			case IDEALTPYE_MENU_FILE :
				return English.IDEALTPYE_MENU_FILE ;
			case IDEALTPYE_MENU_GAME  :
				return English.IDEALTPYE_MENU_GAME;
			case IDEALTPYE_MENU_INFO :
				return English.IDEALTPYE_MENU_INFO ;
			case IDEALTPYE_MENUITEM_IMPORT :
				return English.IDEALTPYE_MENUITEM_IMPORT ;
			case IDEALTPYE_MENUITEM_EXPORT  :
				return English.IDEALTPYE_MENUITEM_EXPORT  ;
			case IDEALTPYE_MENUITEM_EXIT   :
				return English.IDEALTPYE_MENUITEM_EXIT ;
			case IDEALTPYE_MENUITEM_REPLAYGAME   :
				return English.IDEALTPYE_MENUITEM_REPLAYGAME  ;
			case IDEALTPYE_MENUITEM_NEWGAME :
				return English.IDEALTPYE_MENUITEM_NEWGAME ;
			case IDEALTPYE_MENUITEM_RANKING  :
				return English.IDEALTPYE_MENUITEM_RANKING  ;
			case IDEALTPYE_MENUITEM_INFO   :
				return English.IDEALTPYE_MENUITEM_INFO ;
			case IDEALTPYE_MENUITEM_LANGUAGE   :
				return English.IDEALTPYE_MENUITEM_LANGUAGE ;
				
				
			case EXPORT_TITLE:
				return English.EXPORT_TITLE;
			case EXPORT_URL:
				return English.EXPORT_URL;
			case EXPORT_SELLECTURL:
				return English.EXPORT_SELLECTURL;
			case EXPORT_OK:
				return English.EXPORT_OK;
				
			case IMPORT_TITLE:
				return English.IMPORT_TITLE;
			case IMPORT_URL:
				return English.IMPORT_URL;
			case IMPORT_BACK:
				return English.IMPORT_BACK;
			case IMPORT_FILENAME:
				return English.IMPORT_FILENAME;
			case IMPORT_IMEGENAME:
				return English.IMPORT_IMEGENAME;
			case IMPORT_OK:
				return English.IMPORT_OK;
			case IMPORT_MAN:
				return English.IMPORT_MAN;
			case IMPORT_WOMAN:
				return English.IMPORT_WOMAN;
				
			case STR_URL:
				return English.STR_URL;
			case STR_BACK:
				return English.STR_BACK;
			case STR_OK:
				return English.STR_OK;
				
			case ABOUT_MAN:
				return English.ABOUT_MAN;
			case ABOUT_WOMAN:
				return English.ABOUT_WOMAN;
			}
		}
		return null;
	}
}
