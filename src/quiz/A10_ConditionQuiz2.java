package quiz;

import java.util.Scanner;

public class A10_ConditionQuiz2 {
	public static void main(String[] arge) {
		
		char a = 'q';
		
		System.out.println(a == 'q' || a == 'Q');//1
		
		char b = ' ';
		
		System.out.println(b != ' ' && b != '\t');//2 ||�ٿ��� Ʋ�� �ٵ� ���� �ָ����ݾ�
		
		char c = '2';
		
		System.out.println(c >= '0' && c <= '9' );//3 int ��ȯ��Ų ����� ������ ���� �׷��ʿ����
		
		char d = '3';
		
		System.out.println((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z'));//4
		
		char e = '��';
				
		System.out.println(e >= '��' && e <= '�R');//5
		System.out.println(e >= '��' && e <= '�R');//�̿��̸� ���� ����Ʈ���� ����� �����ڵ� ��� �������
		
		char f = '��';
		
		System.out.println((f >= 0x3041 && f <= 0x3096) || 
				(f >= 0x30A1 && f <= 0x30ff));//6 �����ڵ�� 0x�������� ���� ���´�
		// ���ܰ� ����� ���������� �ذ��ض� �Ϻ� Ȩ�������� ������ 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("exit�� �Է��ϸ� true�� ���ɴϴ� > ");
		String txt = sc.nextLine();
		System.out.println(txt.equals("exit")); // ����� ���� 1���� ����Ǿ����� equals�� ����ϴ� ����
		
		boolean exit = true;
		
		System.out.println(exit);//7
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
	}

}
