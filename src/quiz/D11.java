package quiz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class D11 {
	/*
	  	끝번호 차량 출입제한 (2018년 9월 1일 부터)
	  	월 1 6 제한
	  	화 2 7 제한
	  	수 3 8 제한
	  	목 4 9 제한
	  	금 5 0 제한
	  	공휴일 휴무일 자유 주차 (음력 명절 제외)
	  	장애인, 유아동승, 경차 제외
	  	
	  	1월 1일
	  	3월 1일 
	  	5월 5일 
	  	6월 6일 
	  	8월 15일 
	  	10월 3일 
	  	10월 9일 
	  	12월 25일
	 */
	
	final static LocalDate start_date = LocalDate.of(2018, 9, 1);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("차량번호 뒤 네자리를 입력하세요. 장애인, 유아동승, 경차는 주차제한이 없습니다.\n>>");
		String carNum = sc.nextLine();
		if (!(Pattern.matches("\\d{4}", carNum))) {
			System.out.println("잘못된 차량번호 입력입니다");
		}
		
		
//		String carNum = "9357";
		LocalDate today = LocalDate.of(2019, 12, 25);

		System.out.println(accessRestrictions(carNum,today));
	}
	
	public static boolean accessRestrictions(String carNum, LocalDate today) {
		
		boolean check = true;
		if (today.isBefore(start_date)) {
			System.out.println("시행날짜 전 입니다.");
			return false;
		}

		char[] car = carNum.toCharArray();
		char lastNum = car[3];
		
		DateTimeFormatter my_date_format = 
				DateTimeFormatter.ofPattern("E");
		DateTimeFormatter my_date_format2 = 
				DateTimeFormatter.ofPattern("M월 d일");
		
		
		String day_of_week = my_date_format.format(today);
		String month_and_day =  my_date_format2.format(today);
		
		if (month_and_day.equals("1월 1일")) {
			System.out.println("신정입니다. 주차제한이 없습니다.");
			return true;
		} else if (month_and_day.equals("3월 1일")) {
			System.out.println("삼일절입니다. 주차제한이 없습니다.");
			return true;
		} else if (month_and_day.equals("5월 5일")) {
			System.out.println("어린이날입니다. 주차제한이 없습니다.");
			return true;
		} else if (month_and_day.equals("6월 6일")) {
			System.out.println("현충일입니다. 주차제한이 없습니다.");
			return true;
		} else if (month_and_day.equals("8월 15일")) {
			System.out.println("광복절입니다. 주차제한이 없습니다.");
			return true;
		} else if (month_and_day.equals("10월 3일")) {
			System.out.println("개천절입니다. 주차제한이 없습니다.");
			return true;
		} else if (month_and_day.equals("10월 9일")) {
			System.out.println("한글날입니다. 주차제한이 없습니다.");
			return true;
		} else if (month_and_day.equals("12월 25일")) {
			System.out.println("크리스마스입니다. 주차제한이 없습니다.");
			return true;
		}
		
		if (day_of_week.equals("월")) {
			if (lastNum == '1' || lastNum == '6') {
				check = false;
			}
		} else if (day_of_week.equals("화")) {
			if (lastNum == '2' || lastNum == '7') {
				check = false;
			}	
		} else if (day_of_week.equals("수")) {
			if (lastNum == '3' || lastNum == '8') {
				check = false;
			}
		} else if (day_of_week.equals("목")) {
			if (lastNum == '4' || lastNum == '9') {
				check = false;
			}
		} else if (day_of_week.equals("금")) {
			if (lastNum == '5' || lastNum == '0') {
				check = false;
			}
		}	
		return check;
	}
		
}
