package quiz;

public class B08_WhileBasicQuiz {
	public static void main(String[] arge) {
		/*
		  		while���� �̿��Ͽ� ������ ���Ͻÿ�.
		  		
		  		1. 1 ���� 100 ���̿� �ִ� 3�� ����� ����
		  		
		  		2. 355���� 237���� ���
		  		
		  		3. continue�� �ݵ�� ����Ͽ� 3000���� 5000������ 7�� ����� ����ϱ�
		  		
		  		4. 1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
		 */
		
		//1
		
		int i = 2;
		int sum = 0;
		while (i++ < 100) {
			if (i % 3 == 0) {
				sum += i;
				continue;
			}
		}
		System.out.println(sum);
		
		/*
		 int i = 1;
		 while (i < 100) {
		 	if (++i % 3 == 0) {
		 		System.outt.println(i);
			}
		 }
		  
		 */
		
		//2
		int j = 355;
		while (j >= 237) {
			System.out.println(j);	
			--j;
		}
		/*
		 i = 355;
		 
		 while (i >= 237) {
		 	System.out.print(i--);
		 	
		 	if (i != 236) {
		 		System.out.print(", ");
		 	}else {
		 		System.out.println();
		 	}
		 }
		 */
		//3
		int t = 3000;
		
		while (t++ < 5000) {
			if (t % 7 == 0) {
				System.out.println(t);
				continue;
			}
		}
		/*
		 i = 3000;
		 
		 while (i <= 5000) {
		 	if (i % 7 != 0) {
		 		++i;
		 		continue;
		 	}
		 	System.out.println(i);
		 	++i
		 }
		 */
		//4
		int y = 1;
		int sum2 = 0;
		while (y++ < 200) {
			if (!(y % 2 == 0 || y % 3 == 0)) {
				sum2 += y;
				continue;
			}
		}
		System.out.println(sum2);
		
		/*
		 i = 1;
		 sum = 0;
		 
		 while (i <= 200) {
		 	if(i % 2 == 0 && i % 3 != 0) {
		 		sum += i;
		 	}
		 	++i
		 }
		 
		 System.out.println("4�� ��: " + sum);
		 */
		
		
		
		
		
		
		
		
		
	}

}
