package myobj.fivedice;
/*
	�������� 5���� �ֻ����� ���� ������ �ֻ����� ����� ���� ������ �����ϴ� Ŭ������ ��������
	
	1. Ǯ�Ͽ콺 (���� ���� 2�� + 3��) (11666/23332/55252)
	2. ���� ��Ʈ����Ʈ (1234/2345/3456)
	3. ���� ��Ʈ����Ʈ (12345/23456)
	4. 4���̽� (���� ���� 4��)
	5. 5���̽� (Yacht) (���� ���� 5��)	  
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
			if (eyes[i].equals("1") ) {// equals ��Ʈ���� �ּҰ��� �ٸ��� �ٸ��ٰ� ���� �� �ִ� �׷��Ƿ� ���ڿ� �񱳴� equals�� ����Ѵ�
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
			System.out.println("Ǯ �Ͽ콺�Դϴ�.");
		} else if (small) {
			System.out.println("���� ��Ʈ����Ʈ �Դϴ�.");
		} else if (large) {
			System.out.println("���� ��Ʈ����Ʈ �Դϴ�.");
		} else if (four_Dice) {
			System.out.println("4 ���̽� �Դϴ�.");
		} else if (five_Dice) {
			System.out.println("5 ���̽� �Դϴ�.");
		}
	}	
}



















