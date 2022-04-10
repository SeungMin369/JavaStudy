package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D11_DiscountDay {
	/*
	  	� �ʰ��Կ��� ���� ��縦 ¦����° ����ϸ��� �����Ѵٰ� �Ѵ�.
	  	�⵵�� �Է��ϸ� �ش� �⵵�� ��� ���� ��¥�� ������ִ� ���α׷��� ��������.
	*/
	
	
	public static void main(String[] args) {
		
		int year = 2021;
		
		printEventOfYear(year);
	}
	
	
	public static void printEventOfYear(int year) {
		SimpleDateFormat eventDateFormat = 
				new SimpleDateFormat("[y�� �̺�Ʈ] M�� d��\t E����");
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
//				"yyyy�� MM�� dd�� / EEEEEE");
//		
//		return current.format(calendar.getTime());
	


	
	
	
}























