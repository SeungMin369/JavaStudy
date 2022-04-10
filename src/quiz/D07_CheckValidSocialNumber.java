package quiz;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class D07_CheckValidSocialNumber {
	/*
	  	����ڰ� �ֹε�Ϲ�ȣ�� �Է��ϸ�
	  	�� �ֹε�Ϲ�ȣ�� ��ȿ���� �˻��մ� ���α׷��� ��������
	  	
	  	�� �� 2�ڸ� ����
	  	�� �ڸ��� 01 ~ 12 �̳��� ����
	  	�� �ڸ��� 01 ~ 31 �̳��� ����
	  	(1, 3, 5, 7, 8, 10, 12���̸� 31 / 4, 6, 9, 11�� �̸� 30 / 2���� �����϶� 29 �ƴϸ� 28)
	  	
	  	7��° �ڸ� '-'
	  	���ڸ� ���� ����
	  	
	  	930120-1188154
	 */
	
	
	
	public static boolean checkSocialNumber(char[] socialNumber) {
		boolean valid = true;
		if (!(socialNumber.length == 14)) {
			System.out.println("�ֹε�Ϲ�ȣ�� ���̰� Ʋ�Ƚ��ϴ�.");
			return false;
			
		}
		
		if (socialNumber[6] != '-') {
			System.out.println("6��° �ڸ��� -�� �ٿ��� �մϴ�.");
			valid = false;
		}
		
		
		for (int i = 0; i < socialNumber.length; ++i) {
			if (socialNumber[i] != '-') {
				valid = Character.isDigit(socialNumber[i]);
			}
		}
		
		
		String year = "" + socialNumber[0] + socialNumber[1];
		String month = "" + socialNumber[2] + socialNumber[3];
		String day = "" + socialNumber[4] + socialNumber[5];
		
		int year_int = Integer.parseInt(year);
		int month_int = Integer.parseInt(month);
		int day_int = Integer.parseInt(day);
		
		if (socialNumber[7] == 1 || socialNumber[7] == 2) {
			year_int += 1900;
		} else if (socialNumber[7] == 3 || socialNumber[7] == 4) {
			year_int += 2000;
		}
		
		
		
		if (month_int > 12) {
			System.out.println("���� 12���� ���� �� �����ϴ�.");
			valid = false;
		} else if (day_int > 31) {
			System.out.println("���� 31���� ���� �� �����ϴ�.");
			valid = false;
		}
		
		if (month_int == 4 || month_int == 6 || month_int == 9 || month_int == 11) {
			if (day_int > 30) {
				System.out.println("4�� 6�� 9�� 11���� ��¥�� 30�� ������ �����ϴ�.");
				valid = false;
			}
			
		/*
		 ������ �ش� ������ 4�� ���� ���� 0�� ���� �ǹ��Ѵ�.
		  ���� 100���� ���� ���� 0�� ���� ���⿡�� �����ϳ�, 400���� ���� ���� 0�� ���� �������� ���Եȴ�.  
		 */
		} else if (month_int == 2) {
			if (!((year_int % 4 == 0 && year_int % 100 != 0) || year_int % 400 == 0)) {
				if (day_int > 28) {
					System.out.println("������ �ƴѰ�� 2�� ������ 28�� ���� �� �����ϴ�.");
					valid = false;
				}
			}
		}
		
		
		
		
		return valid;
		
	}
	// ����� Ǯ��
	private static HashSet<Integer> month30;
	private static HashSet<Integer> month31;
	
	static {
		month30 = new HashSet<>();
		month31 = new HashSet<>();
		
		Collections.addAll(month30, 4, 6, 9, 11);
		Collections.addAll(month31, 1, 3, 5, 7, 8, 10, 12);
	}
	
	private static boolean validGender(char gender) {
		return gender >= '1' && gender <= '4';
	}
	
	public static int calcYear(int year,char gender) {

		return gender < '3' ? year + 1900 : year + 2000;
	}
	public static boolean check(String sn) {
		char[] sn_arr = sn.toCharArray();
		
		if (validGender(sn_arr[7])) {
			System.out.println("������ ������ �ֽ��ϴ�.");
			return false;
		}
	
		int year = calcYear(
				Integer.parseInt("" + sn_arr[0] + sn_arr[1]),
				sn_arr[7]);
		int month = Integer.parseInt("" + sn_arr[2] + sn_arr[3]);
		int date = Integer.parseInt("" + sn_arr[4] + sn_arr[5]);
		
		if (month30.contains(month) && (date < 1 && date > 30)) {
			System.out.println("��¥�� ������ �ֽ��ϴ�.");
			return false;
		} else if (month31.contains(month) && (date < 1 && date > 31)) {
			System.out.println("��¥�� ������ �ֽ��ϴ�.");
			return false;
		} else if (month == 2) {
			boolean leapYear = (year % 400 == 0)
					|| (year % 4 == 0 && year % 100 != 0);
			
			if (leapYear && (date < 1 || date > 29)) {
				System.out.println("������ 29�ϱ��� �Դϴ�.");
				return false;
			} else if (!leapYear && (date < 1 || date > 28)) {
				System.out.println("2���� 28�ϱ��� �Դϴ�.");
				return false;
			}
			
		}
		
		
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���.>");
		String socialNumber = sc.nextLine();
		
		System.out.println(checkSocialNumber(socialNumber.toCharArray()));
		
		
		if (check("000229-3234567")) {
			System.out.println("�ùٸ� �ֹι�ȣ�Դϴ�.");
		} else {
			System.out.println("�߸��� �ֹι�ȣ�Դϴ�.");
		}
		
		
	}
}















