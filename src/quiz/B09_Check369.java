package quiz;

import java.util.Scanner;

public class B09_Check369 {

	public static void main(String[] args) {

		/*		  	
		  	사용자로부터 정수를 하나 입력받은 후 
		  	해당 숫자까지 369 게임이 진행된다면 박수를 총 몇번 쳐야하는지 세어보세요
		  	
		  	※ 33, 36, 39... 등의 숫자는 여러번칩니다
			charAt length() 사용 
			
			문제해결력 - 문제를 푸는 길을 찾는것
			구현력 - 생각해낸 길을 코드로 구현하는것
			언어 이해력 - 사용하는 언어에 대한 깊은 이해도
			
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 >");
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
		
		System.out.printf("박수의 횟수는 %d입니다\n", c);
		
		
		
		
		
		
		
		System.out.print("박수 체크해볼 숫자 > ");
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
					System.out.print("짝");
					count++;
				}
				checkNum /= 10;
				
			}
			System.out.println();		
		}
		System.out.printf("박수는 총 %d회 쳤습니다.\n", count);	
		
		
		
		
		
		
		
		
		
		
		
	}

}









