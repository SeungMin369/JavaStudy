package quiz;

import myobj.checkpass.IllegalCharactor;
import myobj.checkpass.IllegalLength;
import myobj.checkpass.NotSatisfiedPassword;
import myobj.checkpass.NumericPassword;

public class C17_InputRightPassword2 {
	public static void main(String[] args) {
		try {
			check_password("1234454545454");
			System.out.println("��й�ȣ�� �����Դϴ�");
		} catch (IllegalLength e) {
			System.out.println("���̰� �߸��ƽ��ϴ�");
		} catch (NumericPassword e) {
			System.out.println("��� ������ ��й�ȣ�Դϴ�. ����Ͻðڽ��ϱ�? [y/n]");
		} catch (NotSatisfiedPassword e) {
			System.out.println("��й�ȣ���� ����, Ư������, �빮��, �ҹ��ڰ� ��� ���ԵǾ�� �մϴ�.");
		} catch (IllegalCharactor e) {
			System.out.println("������ ���� ���ڰ� �ֽ��ϴ�.");
		}
		
	}
	
	public static void check_password(String password) 
			throws IllegalLength, NumericPassword, NotSatisfiedPassword, IllegalCharactor {
		
		int len = password.length();
		
		if (len < 8 || len > 24) {
			throw new IllegalLength();
		}
		
		if (check_numeric(password.toCharArray())) {
			throw new NumericPassword();
		}
		
		if (!check_character_types(password.toCharArray())) {
			throw new NotSatisfiedPassword();
		}
	}
	private static boolean check_special(char ch) {
		String permit = "!@#$%^&*";
		for (int i = 0; i < permit.length(); ++i) {
			if (ch == permit.charAt(i)) {
				return true;
			}
		}
		return true;
	}
	
	private static boolean check_character_types(char[] pass) throws IllegalCharactor {
		int len = pass.length;
		
		boolean num = false;
		boolean low = false;
		boolean upper = false;
		boolean special = false;
		
		for (int i = 0; i < len; ++i ) {
			char ch = pass[i];
			if (ch >= '0' && ch <= '9') {
				num = true;
			} else if (ch >= 'a' && ch <= 'z') {
				low = true;
			} else if (ch >= 'A' && ch <= 'Z') {
				upper = true;
			} else if (check_special(ch)) {
				special = true;
			} else {
				throw new IllegalCharactor();
			}
		}
		
		return num && low && upper && special;
	}
	
	
	
	private static boolean check_numeric(char[] pass) {
		for (int i = 0, len = pass.length; i < len; ++i) {
			char ch = pass[i];
			if (ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}
}
