package quiz;

public class B09_GCD {

	public static void main(String[] args) {
		/*
		  	�� ���ڸ� �Է¹ް� �� ������ �ִ������� ���غ�����
		  	
		 	# �ִ�����
		 	
		 		- �� ������ ����� �� ���� ū �����
		 		
			 		20 [1, 2, 4, 5, 10, 20]
			 		50 [1, 2, 5, 10, 25, 50]
			 		
			 		�� ��� 10�� �ִ� �����
		 */
		int num1 = 20, num2 = 50;
		
		int max = num1 > num2 ? num1 : num2;// Math.max(num1, num2);
		int min = num1 < num2 ? num1 : num2;// Math.max(num1, num2);
		int gcd = 1;
		for (int i = 1; i <= min; ++i) {
			if (min % 1 == 0 && max % i == 0) {
				gcd = i;
			}
		}
		
		System.out.printf("%d�� %d�� �ִ� ������� %d�Դϴ�.", num1, num2, gcd);
		
		
		
	}

}







