package myobj.fivedice;

import java.util.Scanner;

public class FiveDice extends Dice {
	/*
  	�������� 5���� �ֻ����� ���� ������ �ֻ����� ����� ���� ������ �����ϴ� Ŭ������ ��������
  	
  	1. Ǯ�Ͽ콺 (���� ���� 2�� + 3��) (11666/23332/55252)
  	2. ���� ��Ʈ����Ʈ (1234/2345/3456)
  	3. ���� ��Ʈ����Ʈ (12345/23456)
  	4. 4���̽� (���� ���� 4��)
  	5. 5���̽� (Yacht) (���� ���� 5��)	 
  	
  	 (1) ��� �ֻ����� �ѹ��� ������ �޼���
  	 
  	 (2) ���ϴ� �ֻ����� �����ϰ� �������� ������ �޼��� (���� ���� ����)
  	 
  	 (3) �ֻ����� ���� ���� ������ ������ Ȯ��
  	 
	*/
	
	public static void main(String[] args) {
				
		FiveDice a = new FiveDice();
		
		FiveDice.check();
		
		FiveDice.result();
		FiveDice.reset();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֻ����� �� �����ðڽ��ϱ�? \n 1.������.\t2.�ȴ�����.\n�Է�>");
		int b = sc.nextInt();
		
		if (b == 1) {
			System.out.println("�ѹ��� �����ðڽ��ϱ�?\n 1.�ѹ��� ������.\t2.������������.\n�Է�>");			
			int c = sc.nextInt();
			
			while (c == 1) {
				FiveDice.start();
				FiveDice.reset();
				FiveDice.check();
				FiveDice.result();
				System.out.print("�� �����ڽ��ϱ�?\n 1.������.\t2.�ȴ�����.\n�Է�>");
				int d = sc.nextInt();
				if (d == 1) {
					continue;
				} else if (d == 2) {
					System.out.println("������ ����Ǿ����ϴ�.");
					break;
				}
				
			}	
		} else if (b == 2) {
			System.out.println("�ٽ� ���� �ֻ����� ������� �Է��ϼ���.");
			boolean t = true;
			while (t) {
				System.out.print("�ٽ� ���� �ֻ����� �������ּ���.\n�տ������� 1�� ~ 5��(�׸� �������� 6��)\n�Է�>");
				int e = sc.nextInt();
				FiveDice.partDice(e);
				FiveDice.reset();
				FiveDice.check();
				FiveDice.result();
				if (e == 6) {
					t = false;
					System.out.println("������ ����Ǿ����ϴ�");
					break;
				}
			}


			
			
		} else {
			System.out.println("������ ����Ǿ����ϴ�.");
		}
		
		
		
		
		
		
		
		
		
	}	
}

















