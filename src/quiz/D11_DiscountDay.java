package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D11_DiscountDay {
	/*
	  	어떤 옷가게에서 할인 행사를 짝수번째 목요일마다 진행한다고 한다.
	  	년도를 입력하면 해당 년도의 모든 할인 날짜를 출력해주는 프로그램을 만들어보세요.
	*/
	
	
	public static void main(String[] args) {
		
		int year = 2021;
		
		printEventOfYear(year);
	}
	
	
	public static void printEventOfYear(int year) {
		SimpleDateFormat eventDateFormat = 
				new SimpleDateFormat("[y년 이벤트] M월 d일\t E요일");
		Calendar event = Calendar.getInstance();
		
		event.set(year, 0, 1);
		event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		
		int count = 1;
		while (event.get(Calendar.YEAR) <= year) {
			event.add(Calendar.DATE, 7);
			
			if (event.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 != 0) {
				continue;
			}
			System.out.printf(eventDateFormat.format(event.getTime()) + "\n", count++);
		}
	}
		
		
		
//		Calendar calendar = Calendar.getInstance();
//		
//		for (int i = 0; i < Month.values().length; ++i) {
//			calendar.set(Calendar.MONTH, i);
//			calendar.set(Calendar.DAY_OF_MONTH, 1);
//			System.out.println(getCurrentDate(calendar));
//		}
//		
//		System.out.println(getCurrentDate(calendar));
//		
//		
//	}
//	
//	public static String getCurrentDate(Calendar calendar) {
//		SimpleDateFormat current = new SimpleDateFormat(
//				"yyyy년 MM월 dd일 / EEEEEE");
//		
//		return current.format(calendar.getTime());
	


	
	
	
}























