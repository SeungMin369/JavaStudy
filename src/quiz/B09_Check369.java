package quiz;

import java.util.Scanner;

public class B09_Check369 {

	public static void main(String[] args) {

		/*		  	
		  	����ڷκ��� ������ �ϳ� �Է¹��� �� 
		  	�ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� ��� �ľ��ϴ��� �������
		  	
		  	�� 33, 36, 39... ���� ���ڴ� ������Ĩ�ϴ�
			charAt length() ��� 
			
			�����ذ�� - ������ Ǫ�� ���� ã�°�
			������ - �����س� ���� �ڵ�� �����ϴ°�
			��� ���ط� - ����ϴ� �� ���� ���� ���ص�
			
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� >");
		int num = sc.nextInt();
		
		int c = 0;
		
		for (int i = 1; i <= num; ++i) {
			int a = i / 10, b = i % 10;
			if (a == 3 || a == 6 || a == 9)  {
				if(b == 3 || b == 6 || b == 9) {
					c += 2;
					continue;
				}
			}else if (a == 3 || a == 6 || a == 9) {
				c += 1;	
				
			}else if (b == 3 || b == 6 || b == 9) {
				c += 1;
				continue;
			}
					
		}
		
		System.out.printf("�ڼ��� Ƚ���� %d�Դϴ�\n", c);
		
		
		
		
		
		
		
		System.out.print("�ڼ� üũ�غ� ���� > ");
		int num = sc.nextInt();
		
		// 353 % 10
		// 353 / 10 % 10
		// 353 / 100 % 10
		// 353 / 1000 % 10
		//
		int count = 0;
		for (int i = 1; i <= num; ++i) {
			int checkNum = i;
			
			System.out.printf("[%d]\t", checkNum);
			
			while (checkNum != 0) {
				int digit = checkNum % 10;
				
				if (digit != 0 && digit % 3 == 0) {
					System.out.print("¦");
					count++;
				}
				checkNum /= 10;
				
			}
			System.out.println();		
		}
		System.out.printf("�ڼ��� �� %dȸ �ƽ��ϴ�.\n", count);	
		
		
		
		
		
		
		
		
		
		
		
	}

}









