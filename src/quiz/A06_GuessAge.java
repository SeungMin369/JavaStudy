package quiz;

import java.util.Scanner;

public class A06_GuessAge {
	
	/*
	    ����ڷκ��� �¾ �ؿ� ������ �⵵�� �Է¹�����
	    �� ����� �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ��������
	  
	  
	 */
	public static void main(String[] arge) {
				
		Scanner sc = new Scanner(System.in);
		
			System.out.print("�¾ �ذ� ��� �Ǽ���?");
			
			int num = sc.nextInt(); // �������� �˾Ƹ԰� �ؾ��Ѵ�.
			
			System.out.print("������ �⵵�� ��� �ǳ���?");
			
			int d = sc.nextInt();
			
			
			System.out.println("����� ���̴�" + (d + 1 - num) + "�� �Դϴ�.");
			
			
			//�Ʒ��� ����� Ǯ�� ���
			
			int birthYear, thisYear;
			int age;
			
			System.out.print("�¾ �ظ� �Է� > ");
			
			birthYear = sc.nextInt();
			
			System.out.print("���ظ� �Է� > ");
			
			thisYear = sc.nextInt();
			
			age = thisYear - birthYear + 1; // ���߿� ���ϰŸ� ������ �����ϴ°��� �� ȿ�����̴�
			
			System.out.println("����� ���̴�" + age + "�� �Դϴ�");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
}
			
		
		
		
		
