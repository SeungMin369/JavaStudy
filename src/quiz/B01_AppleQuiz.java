package quiz;

import java.util.Scanner;

public class B01_AppleQuiz {
	public static void main(String[] arge) {
		/*
		  ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
		  ����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ�
		  ����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������!
		 */
		//Scanner sc = new Scanner(System.in);
		
		
		/*System.out.print("����� � �Դϱ�? ");
		
		int apple = sc.nextInt();
		
		int basket = apple / 10;
		
		if (basket * 10 <= apple -1) { 
			System.out.println("�ٱ����� ������" + (basket + 1) + "�� �Դϴ�!");
			
		} else if (basket * 10 == apple) {
			System.out.println("�ٱ����� ������" + basket + "�� �Դϴ�!");
		}
		*/
		Scanner sc = new Scanner(System.in);
		
		int apple;
		int basket_size = 10;
		int basket;
		
//		double basket = 10;
//		double basket;
		
		System.out.print("����� �");
		apple = sc.nextInt();
		
		// 10, 20 ,30 �� �ٱ��� ũ��� �� �¾� �������� ���
		if (apple % basket_size == 0) {
			basket = apple / basket_size;
		}else {
			basket = apple / basket_size + 1;
		}
		if (apple < 0) {
			System.out.print("�ùٸ� ��� ������ �ƴմϴ�");
		}else {
			System.out.printf("�ʿ��� �ٱ����� ������ %d�� �Դϴ�.", basket); // ������ ������ ���޼����� �ʿ��ϴ� 
		}
		
//		basket = apple / 10.0;
		//Math.ceil(a) : a�� �Ҽ� ù° �ڸ����� �ø���
		//Math.floor(a) : a�� �Ҽ� ù° �ڸ����� ������
//		System.out.print("�ʿ��� �ٱ����� ������" + (int)Math.ceil(basket) + "�� �Դϴ�!");
		
		
		
		
	
		
		
		
		
		
		
		
		
	}
	
}
		
		
		
