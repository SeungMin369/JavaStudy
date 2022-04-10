package myobj.fivedice;
/*
	랜덤으로 5개의 주사위를 굴린 다음에 주사위의 결과를 통해 다음을 구분하는 클래스를 만들어보세요
	
	1. 풀하우스 (같은 눈이 2개 + 3개) (11666/23332/55252)
	2. 스몰 스트레이트 (1234/2345/3456)
	3. 라지 스트레이트 (12345/23456)
	4. 4다이스 (같은 숫자 4개)
	5. 5다이스 (Yacht) (같은 숫자 5개)	  
*/

public class Dice {
	
	public final static int MAX_DICE = 5;
	
	public static String[] eyes = new String[MAX_DICE];
	
	public final static String[] dice = {"1", "2", "3", "4", "5", "6"};
	
	public static boolean full_House;
	public static boolean small;
	public static boolean large;
	public static boolean four_Dice;
	public static boolean five_Dice;
	
	public static int[] numSum = new int[6];
		
	public static String getRoll() {
		int random = (int)(Math.random() * 6);
		return dice[random];
	}
	
	Dice() {

		for (int i = 0; i < MAX_DICE; ++i) {
			eyes[i] = getRoll();
		}
		for (int i = 0; i < MAX_DICE; ++i) {
			System.out.printf("%s ", eyes[i]);
		}
		System.out.println();
	}
	
	public static void start() {
		for (int i = 0; i < MAX_DICE; ++i) {
			eyes[i] = getRoll();
		}
		for (int i = 0; i < MAX_DICE; ++i) {
			System.out.printf("%s ", eyes[i]);
		}
		System.out.println();
		
	}
	
	public static void partDice(int num) {
		eyes[num] = getRoll();
		
	}
	
	public static void reset() {
		full_House = false;
		small = false;
		large = false;
		four_Dice = false;
		five_Dice = false;
	}
	
	
	public static void check() {
		
		for (int i = 0; i < MAX_DICE; ++i) {
			if (eyes[i].equals("1") ) {// equals 스트링은 주소값이 다르면 다르다고 나올 수 있다 그러므로 문자열 비교는 equals를 사용한다
				numSum[0]++;
			} else if (eyes[i].equals("2")) {
				numSum[1]++;
			} else if (eyes[i].equals("3")) {
				numSum[2]++;
			} else if (eyes[i].equals("4")) {
				numSum[3]++;
			} else if (eyes[i].equals("5")) {
				numSum[4]++;
			} else if (eyes[i].equals("6")) {
				numSum[5]++;
			}
		}
		
		
		for (int i = 0; i < 6; ++i) {
			if (numSum[i] == 5) {
				five_Dice = true;
			}
		}
		
		for (int i = 0; i < 6; ++i) {
			if (numSum[i] == 4) {
				four_Dice = true;
			}
		}
		
		for (int i = 0; i < 6; ++i) {
			if (numSum[i] == 3) {
				for (int j = 0; j < 6; ++j) {
					if (numSum[j] == 2) {
						full_House = true;
					}
				}
			}
		}
		
		if (numSum[0] == 1 && numSum[1] == 1 && numSum[2] == 1 && numSum[3] == 1 && numSum[4] == 1) {
			large = true;
		} else if (numSum[1] == 1 && numSum[2] == 1 && numSum[3] == 1 && numSum[4] == 1 &&  numSum[5] == 1) {
			large = true;
		} else if ((numSum[0] == 1 || numSum[0] == 2) && (numSum[1] == 1 || numSum[1] == 2)
				&& (numSum[2] == 1 || numSum[2] == 2) && (numSum[3] == 1 || numSum[3] == 2)) {
			small = true;
		} else if ((numSum[1] == 1 || numSum[1] == 2) && (numSum[2] == 1 || numSum[2] == 2)
				&& (numSum[3] == 1 || numSum[3] == 2) && (numSum[4] == 1 || numSum[4] == 2)) {
			small = true;
		} else if ((numSum[2] == 1 || numSum[2] == 2) && (numSum[3] == 1 || numSum[3] == 2)
				&& (numSum[4] == 1 || numSum[4] == 2) && (numSum[5] == 1 || numSum[5] == 2)) {
			small = true;
		}
	}

	public static void result() {
		
		if (full_House) {
			System.out.println("풀 하우스입니다.");
		} else if (small) {
			System.out.println("스몰 스트레이트 입니다.");
		} else if (large) {
			System.out.println("라지 스트레이트 입니다.");
		} else if (four_Dice) {
			System.out.println("4 다이스 입니다.");
		} else if (five_Dice) {
			System.out.println("5 다이스 입니다.");
		}
	}	
}



















