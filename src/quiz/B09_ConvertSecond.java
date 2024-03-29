package quiz;

import java.util.Scanner;

public class B09_ConvertSecond {
	public static void main(String[] arge) {
		/*
		  	초를 입력받으면 년/일/시간/분/초로 변환하여 출력해보세요
		  	
		  	※ 단, 필요없는 단위는 출력하지 말 것
		  	
		  	ex: 0년 0일 13시간 0분 5초인 경우 -> 13시간 0분 5초반 나와야 함
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요");
		int second = sc.nextInt();
		// 배열을 사용한 방법 많이 짧아졋다
		int[] converted = new int[4];
		int[] seconds = new int[4];
		String[] units = {"년", "일", "시", "분"};
		
		seconds[0] = 365 * 24 * 60 * 60;
		seconds[1] = 24 * 60 * 60;
		seconds[2] = 60 * 60;
		seconds[3] = 60;
		
		for (int i = 0; i < converted.length; ++i) {
			converted[i] = second / seconds[i];
			second %= seconds[i];
			
		}
		boolean exist = false;
		
		for (int i = 0; i < converted.length; ++i) {
			if (converted[i] != 0 || exist) {
				System.out.printf("%d%s", converted[i], units[i]);
				exist = true;
			}
		}
		
		System.out.printf("%d초\n", second);
		
		/*
		 	배열을 사용하지 않은 방법 
		System.out.print(second + "초는 변환하면");
		
		int y = 0, d = 0, h = 0, m = 0, s = 0;
		
		final int SECOND_PER_YEAR = 365 * 24 * 60 * 60;
		final int SECOND_PER_DAY = 24 * 60 * 60;
		final int SECOND_PER_HOUR = 60 * 60;
		final int SECOND_PER_MINUTE= 60;
		
		y = second / SECOND_PER_YEAR;		
		second %= SECOND_PER_YEAR;
		
		d = second / SECOND_PER_DAY;
		second %= SECOND_PER_DAY;
		
		h = second / SECOND_PER_HOUR;
		second %= SECOND_PER_HOUR;
		
		m = second / SECOND_PER_MINUTE;
		second %= SECOND_PER_MINUTE;
		
		boolean exist = false;
		
		if (y != 0) {
			System.out.print(y + "년 ");
			exist = true;
		}
		if (d != 0 || exist) {
			System.out.print(d + "일 ");
			exist = true;
		}
		if (h != 0 || exist) {
			System.out.print(h + "시 ");
			exist = true;
		}
		if (m != 0 || exist) {
			System.out.print(m + "분 ");
			exist = true;
		}
		System.out.print(second + "초 ");
		*/
	}

}









