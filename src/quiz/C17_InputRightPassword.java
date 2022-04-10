package quiz;

import java.util.Scanner;

public class C17_InputRightPassword {
	
	
	/*
	  	# �ùٸ� �н����带 ����� ���� ��Ģ
	  	
	  	1. ��� �����̸� �ȵ�
	  	
	  	2. �빮�ڿ� �ҹ��ڰ� ���� Ư�����ڰ� �����־�� ��
	  	
	  	3. Ư�� ���ڴ� !, @, #, $, %, ^, &, * �� ��� �����մϴ�
	  	
	  	4. ��й�ȣ�� ���̰� 8�ڸ� �̻� 24�ڸ� ���Ͽ��� ��
	  	
	  	��Ģ�� ��� ��� ���ܸ� �߻����Ѽ� �˸��� �ȳ� ������ ����غ�����
	  	(���� ��Ģ�� �ѹ��� ���ٰ� �ؼ� ��� ���� ���� �ʿ�� ����)
	 */
	static char[] a;
	static char[] special = {'!', '@', '#', '$', '%', '^', '&', '*'};
	
	public static void main(String[] args) throws Checklength, CheckNum, CheckEng, CheckSpecial {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("��й�ȣ�� �Է��ϼ���. >");
//		String password = sc.nextLine();
		
		String password = "Tuy!159630";
		
		System.out.println("�Է��Ͻ� ��й�ȣ�� ");
		a = new char[password.length()];

		for(int i = 0; i < password.length(); i++){
			a[i]=(password.charAt(i));
			System.out.print(a[i]);
		}
		System.out.println("�Դϴ�.");

		test();
	}
	
	public static void test() throws Checklength, CheckNum, CheckEng, CheckSpecial {
		
		if (a.length > 24 && a.length < 8) {
			throw new Checklength();
		} 
		boolean checkEng1 = true;
		boolean checkEng2 = true;
		boolean checkNum = true;
		boolean checkSpecial = true;
		for (int i = 0; i < a.length; ++i) {
			if (a[i] >= 'a' && a[i] <= 'z') {
				checkEng1 = false;
			} else if (a[i] >= 'A' && a[i] <= 'Z') {
				checkEng2 = false;
			} else if (a[i] >= 0 && a[i] <= 9) {
				checkNum = false;
			}
			for (int j = 0; j < special.length; ++j) {
				if (a[i] == special[j]) {
					checkSpecial = false;
				}
			}	
		}
		
		if (checkEng1 || checkEng2) {
			throw new CheckEng();
		} else if (checkNum) {
			throw new CheckNum();
		} else if (checkSpecial) {
			throw new CheckSpecial();
		}
		
		
	}
	
	
	
}

class Checklength extends Exception {
	public Checklength() {
		super("��й�ȣ ���̸� Ȯ���ϼ���.");
	}
}
class CheckNum extends Exception {
	public CheckNum() {
		super("��й�ȣ�� ���ڰ� ���ԵǾ� ���� �ʽ��ϴ�.");
	}
}

class CheckEng extends Exception {
	public CheckEng() {
		super("��й�ȣ�� ���� �빮�� �ҹ��ڰ� �����ϴ�.");
	}
}

class CheckSpecial extends Exception {
	public CheckSpecial() {
		super("��й�ȣ�� Ư�����ڰ� ���ԵǾ� ���� �ʽ��ϴ�.");
	}
}






















