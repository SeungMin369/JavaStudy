package quiz;

import java.util.Scanner;

public class B01_AppleQuiz2 {
	/*
	  ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
	  ����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ�
	  ����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������!
	 */

	public static void main(String[] args) {
		System.out.print("����� ������ �Է��ϼ���~ >");
		int sc = new Scanner(System.in).nextInt();
		System.out.println("�ʿ��� �ٱ����� ������ " + applebasket(sc) + "�� �Դϴ�.");

	}
	
	public static int applebasket(int apple) {
		int basket = apple % 10 != 0 ? apple / 10 + 1 : apple / 10;
		return basket;
	}
	
	
	
}
