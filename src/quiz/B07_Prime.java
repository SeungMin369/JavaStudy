package quiz;

import java.util.Scanner;

public class B07_Prime {
	public static void main (String[] arge) {
		/*
		  	����ڷκ��� ����(���)�� �Է¹�����
		  	1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����
		  	(������ �Է��ϸ� �ٽ� ����� �Է��ϰ� �ϱ�)
		  	
		  	�� �Ҽ� : ������ �������� ���� 1�� �ڱ� �ڽ� �ۿ� ���� ����
		  	
		  		2, 3, 5, 7, 11, 13 ...
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("> ");
		int num = sc.nextInt();
		
		for (; num < 2;) {
			System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���");
			System.out.println("> ");
			num = sc.nextInt(0);
			
		}
		System.out.println(2);
		for (int chknum = 3; chknum <= num; chknum += 2) { //2�� ����� �����ص� �Ǵϱ� 2�� �������ѵ� �ȴ� 			
			boolean prime = true;
			for (int divnum  = 3; divnum <= Math.sqrt(chknum); divnum += 2) {// �������� �����ϰ� 2�� �̸�ǥ���ϰ� �񱳱ٵ� 2�� ������Ų��
				if (chknum % divnum == 0) {
					prime = false;
				}
			}
			if (prime) { // ������ �������� ���� 2���� ī��Ʈ�� 2�϶� ����� �Ѵ�.
				System.out.println(chknum);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}











