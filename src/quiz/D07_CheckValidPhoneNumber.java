package quiz;

import java.util.Scanner;

public class D07_CheckValidPhoneNumber {
	/* 
	 	사용자로부터 입력받은 문자열이 핸드폰 번호인지 구분하는 프로그램을 만들어보세요
	 	
	*/
	static boolean check(String phoneNumber) {
		char[] c = phoneNumber.toCharArray();
		int count = 0;
		
		for (int i = 0; i < c.length; ++i) {
			if (c[i] == '-') {
				count++;
			}
		}
		if (c[3] == '-' && c[8] == '-' && count == 2) {
			String b = phoneNumber.replace("-", "");
			System.out.println(b);
			
			char[] a = b.toCharArray();
			for (int i = 0; i < a.length; ++i) {
				if (!(a[i] >= 0 && a[i] <= 9)) {
					return false;
				}
			}
		
			if (b.length() == 11) {
				if (a[0] == '0' && a[1] == '1' && a[2] == '0') {
					return true;
				}
			} else {
				return false;
			}
			return false;	
		}
		return false;	
	}
	
	private static boolean checkNumeric(char[] phoneNumber) {
		for (int i = 0; i < phoneNumber.length; ++i) {
			if ((i == 3 || i == 8) && phoneNumber[i] == '-') {
				continue;
			} else if ((i != 3 && i != 8)&& Character.isDigit(phoneNumber[i])) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static boolean CheckValidPhoneNumber(char[] phoneNumber) {
		boolean valid = true;
		
		String front = "" + phoneNumber[0] + phoneNumber[1] + phoneNumber[2];
		
		if (!front.equals("010")) {
			valid = false;
			System.out.println("[WARNING] 맨 앞의 숫자가 허용되지 않는 숫자입니다.");
		} else if (phoneNumber.length != 13) {
			valid = false;
			System.out.println("[WARNING] 핸드폰 번호의 길이가 아닙니다.");
		} else if (!checkNumeric(phoneNumber)) {
			valid = false;
			System.out.println("[WARNING] 숫자 아닌 문자가 포함되었거나 -의 위치가 이상합니다.");
		}
		
		
		
		
		
		
		System.out.println(new String(phoneNumber) + "는 "
				+ (valid ? "올바른 핸드폰 번호입니다." : "올바르지 않은 핸드폰 번호입니다."));
		return valid;
	}
		
		
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("번호를 입력하세요. >");
//		String a = sc.nextLine();
//		
//		System.out.println(check(a));
		
		CheckValidPhoneNumber("010-12341234".toCharArray());
		
	
	}
	
}










