package quiz;

import java.util.Scanner;

public class B04_ForBasicQuiz {

	public static void main(String[] args) {
		/*
			   ����ڰ� ���ڸ� �Է� ���� ��
			   
			   1. 10���� �Է��� ���ڱ����� ������ ���غ�����
			   
			   2. 1000���� �Է��� ���ڱ��� ������� ������ ��������
			   
			   3. 1���� �Է��� ���� ������ 5�� ����� ����غ�����
		 */
		//1
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��� ������ > ");
		
		int user = sc.nextInt();
		
		int sum = 0;
		
		int start, end;
		
		if (user > 10) {
			start = 10;
			end = user;
		}else {
			start = user;
			end = 10;
		}
		
		for (int i = 10; i <= end; ++i) {
			sum += i;
		}
		
		System.out.printf("10���� %d������ ������ %d�Դϴ�.", user, sum);
		//����� �ٽ� Ǯ����ߵȴ�
		
		//2	
		if (user > 1000) {
			for (int i = 1000; i <= user; ++i) {
				System.out.printf("1000���� %d���� ���: %d\n", user, i);
			}
		}else {
			for (int i = 1000; i >= user; ++i) {
				System.out.printf("1000���� %d���� ���: %d\n", user, i);
			}
		}
		
		//3 
		if (user > 1) {
			for (int i = 1; i <= user; ++i) {
				if (i % 5 == 0) {
					System.out.printf("1���� %d���� 5�� ����� ���: %d\n", user, i);
				}
				}
			
		}else {
			for (int i = 1; i >= user; --i) {
				if (i % 5 == 0) {
					System.out.printf("1���� %d���� 5�� ����� ���: %d\n", user, i);
				
				}
			}
			
		}
		
		
		
		
		
		
	
			
			
		
		
			
		
		
		
		
		
	}

}










