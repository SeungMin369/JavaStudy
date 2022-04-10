package quiz;

import java.util.Scanner;

public class C17_InputRightPassword {
	
	
	/*
	  	# 올바른 패스워드를 만들기 위한 규칙
	  	
	  	1. 모두 숫자이면 안됨
	  	
	  	2. 대문자와 소문자가 숫자 특수문자가 섞여있어야 함
	  	
	  	3. 특수 문자는 !, @, #, $, %, ^, &, * 만 사용 가능합니다
	  	
	  	4. 비밀번호의 길이가 8자리 이상 24자리 이하여야 함
	  	
	  	규칙을 어긴 경우 예외를 발생시켜서 알맞은 안내 문구를 출력해보세요
	  	(여러 규칙을 한번에 어겼다고 해서 모든 것이 나올 필요는 없음)
	 */
	static char[] a;
	static char[] special = {'!', '@', '#', '$', '%', '^', '&', '*'};
	
	public static void main(String[] args) throws Checklength, CheckNum, CheckEng, CheckSpecial {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("비밀번호를 입력하세요. >");
//		String password = sc.nextLine();
		
		String password = "Tuy!159630";
		
		System.out.println("입력하신 비밀번호는 ");
		a = new char[password.length()];

		for(int i = 0; i < password.length(); i++){
			a[i]=(password.charAt(i));
			System.out.print(a[i]);
		}
		System.out.println("입니다.");

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
		super("비밀번호 길이를 확인하세요.");
	}
}
class CheckNum extends Exception {
	public CheckNum() {
		super("비밀번호에 숫자가 포함되어 있지 않습니다.");
	}
}

class CheckEng extends Exception {
	public CheckEng() {
		super("비밀번호에 영어 대문자 소문자가 없습니다.");
	}
}

class CheckSpecial extends Exception {
	public CheckSpecial() {
		super("비밀번호에 특수문자가 포함되어 있지 않습니다.");
	}
}






















