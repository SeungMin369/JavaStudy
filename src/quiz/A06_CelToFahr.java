package quiz;

import java.util.Scanner;

public class A06_CelToFahr {
	
	/*
	 
	  	����ڷκ��� ���� �µ��� �Է¹����� ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������
	  	(��ȯ ������ �˻� ���, ����� �Ҽ� ù° �ڸ�����)
	  
	  
	 */
	public static void main(String[] arge) {
		
		
		Scanner sc = new Scanner(System.in);// sc������ ��Ƴ��°�
		
		System.out.print("���� �µ��� ��� �ǳ���?");
		
		double temperature = sc.nextDouble();
		
		System.out.println("ȭ�� �µ���" + (temperature * 1.8 + 32) + "�� �Դϴ�");
		
		/*/����� Ǯ��
		
		int cel, fahr;
		
		System.out.print("���� �µ�(��)�� �Է� > ");
		cel = sc.nextDouble();// ��ĳ�ʸ� �ٷ� �־ ������ �ι��̻� ���Ÿ� ������ ��Ƶ־��Ѵ�
		//cel = new Scanner(System.in).nextDouble();// ��ĳ�ʸ� �ٷ� �־ ������ �ι��̻� ���Ÿ� ������ ��Ƶ־��Ѵ�
		
		
		fahr = cel * 9/5 + 32;
		
		System.out.print("%.1f�ɴ� %.1f���Դϴ�", cel, fahr);
		
		*/
		
		
	}
	
	

}
