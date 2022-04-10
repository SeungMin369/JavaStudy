package quiz;

import java.util.Scanner;

public class B01_AppleQuiz2 {
	/*
	  사과를 10개씩 담을 수 있는 바구니가 있다.
	  사용자가 구매하고 싶은 사과의 개수를 입력하면
	  사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어보세요!
	 */

	public static void main(String[] args) {
		System.out.print("사과의 개수를 입력하세요~ >");
		int sc = new Scanner(System.in).nextInt();
		System.out.println("필요한 바구니의 개수는 " + applebasket(sc) + "개 입니다.");

	}
	
	public static int applebasket(int apple) {
		int basket = apple % 10 != 0 ? apple / 10 + 1 : apple / 10;
		return basket;
	}
	
	
	
}
