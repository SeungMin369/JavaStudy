package quiz;

import java.util.Scanner;

public class D07_CheckValidPhoneNumber {
	/* 
	 	����ڷκ��� �Է¹��� ���ڿ��� �ڵ��� ��ȣ���� �����ϴ� ���α׷��� ��������
	 	
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
			System.out.println("[WARNING] �� ���� ���ڰ� ������ �ʴ� �����Դϴ�.");
		} else if (phoneNumber.length != 13) {
			valid = false;
			System.out.println("[WARNING] �ڵ��� ��ȣ�� ���̰� �ƴմϴ�.");
		} else if (!checkNumeric(phoneNumber)) {
			valid = false;
			System.out.println("[WARNING] ���� �ƴ� ���ڰ� ���ԵǾ��ų� -�� ��ġ�� �̻��մϴ�.");
		}
		
		
		
		
		
		
		System.out.println(new String(phoneNumber) + "�� "
				+ (valid ? "�ùٸ� �ڵ��� ��ȣ�Դϴ�." : "�ùٸ��� ���� �ڵ��� ��ȣ�Դϴ�."));
		return valid;
	}
		
		
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("��ȣ�� �Է��ϼ���. >");
//		String a = sc.nextLine();
//		
//		System.out.println(check(a));
		
		CheckValidPhoneNumber("010-12341234".toCharArray());
		
	
	}
	
}










