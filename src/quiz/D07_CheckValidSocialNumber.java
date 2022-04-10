package quiz;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class D07_CheckValidSocialNumber {
	/*
	  	사용자가 주민등록번호를 입력하면
	  	그 주민등록번호가 유효한지 검사합는 프로그램을 만들어보세요
	  	
	  	맨 앞 2자리 숫자
	  	월 자리에 01 ~ 12 이내의 숫자
	  	일 자리에 01 ~ 31 이내의 숫자
	  	(1, 3, 5, 7, 8, 10, 12월이면 31 / 4, 6, 9, 11월 이면 30 / 2월은 윤년일때 29 아니면 28)
	  	
	  	7번째 자리 '-'
	  	뒷자리 전부 숫자
	  	
	  	930120-1188154
	 */
	
	
	
	public static boolean checkSocialNumber(char[] socialNumber) {
		boolean valid = true;
		if (!(socialNumber.length == 14)) {
			System.out.println("주민등록번호의 길이가 틀렸습니다.");
			return false;
			
		}
		
		if (socialNumber[6] != '-') {
			System.out.println("6번째 자리에 -을 붙여야 합니다.");
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
			System.out.println("달은 12월을 넘을 수 없습니다.");
			valid = false;
		} else if (day_int > 31) {
			System.out.println("일은 31일을 넘을 수 없습니다.");
			valid = false;
		}
		
		if (month_int == 4 || month_int == 6 || month_int == 9 || month_int == 11) {
			if (day_int > 30) {
				System.out.println("4월 6월 9월 11월은 날짜가 30을 넘을수 없습니다.");
				valid = false;
			}
			
		/*
		 윤년은 해당 연도를 4로 나눈 값이 0인 것을 의미한다.
		  그중 100으로 나눈 값이 0인 것은 윤년에서 제외하나, 400으로 나눈 값이 0인 것은 윤년으로 포함된다.  
		 */
		} else if (month_int == 2) {
			if (!((year_int % 4 == 0 && year_int % 100 != 0) || year_int % 400 == 0)) {
				if (day_int > 28) {
					System.out.println("윤년이 아닌경우 2월 생일이 28을 넘을 수 없습니다.");
					valid = false;
				}
			}
		}
		
		
		
		
		return valid;
		
	}
	// 강사님 풀이
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
			System.out.println("성별에 문제가 있습니다.");
			return false;
		}
	
		int year = calcYear(
				Integer.parseInt("" + sn_arr[0] + sn_arr[1]),
				sn_arr[7]);
		int month = Integer.parseInt("" + sn_arr[2] + sn_arr[3]);
		int date = Integer.parseInt("" + sn_arr[4] + sn_arr[5]);
		
		if (month30.contains(month) && (date < 1 && date > 30)) {
			System.out.println("날짜에 문제가 있습니다.");
			return false;
		} else if (month31.contains(month) && (date < 1 && date > 31)) {
			System.out.println("날짜에 문제가 있습니다.");
			return false;
		} else if (month == 2) {
			boolean leapYear = (year % 400 == 0)
					|| (year % 4 == 0 && year % 100 != 0);
			
			if (leapYear && (date < 1 || date > 29)) {
				System.out.println("윤년은 29일까지 입니다.");
				return false;
			} else if (!leapYear && (date < 1 || date > 28)) {
				System.out.println("2월은 28일까지 입니다.");
				return false;
			}
			
		}
		
		
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민등록번호를 입력하세요.>");
		String socialNumber = sc.nextLine();
		
		System.out.println(checkSocialNumber(socialNumber.toCharArray()));
		
		
		if (check("000229-3234567")) {
			System.out.println("올바른 주민번호입니다.");
		} else {
			System.out.println("잘못된 주민번호입니다.");
		}
		
		
	}
}















