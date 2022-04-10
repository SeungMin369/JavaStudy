package quiz;

import java.util.Scanner;

public class B04_ForBasicQuiz {

	public static void main(String[] args) {
		/*
			   사용자가 숫자를 입력 했을 때
			   
			   1. 10부터 입력한 숫자까지의 총합을 구해보세요
			   
			   2. 1000부터 입력한 숫자까지 순서대로 나오게 만들어보세요
			   
			   3. 1부터 입력한 숫자 사이의 5의 배수만 출력해보세요
		 */
		//1
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해 보세요 > ");
		
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
		
		System.out.printf("10부터 %d까지의 총합은 %d입니다.", user, sum);
		//지우고 다시 풀어봐야된다
		
		//2	
		if (user > 1000) {
			for (int i = 1000; i <= user; ++i) {
				System.out.printf("1000부터 %d까지 출력: %d\n", user, i);
			}
		}else {
			for (int i = 1000; i >= user; ++i) {
				System.out.printf("1000부터 %d까지 출력: %d\n", user, i);
			}
		}
		
		//3 
		if (user > 1) {
			for (int i = 1; i <= user; ++i) {
				if (i % 5 == 0) {
					System.out.printf("1부터 %d까지 5의 배수만 출력: %d\n", user, i);
				}
				}
			
		}else {
			for (int i = 1; i >= user; --i) {
				if (i % 5 == 0) {
					System.out.printf("1부터 %d까지 5의 배수만 출력: %d\n", user, i);
				
				}
			}
			
		}
		
		
		
		
		
		
	
			
			
		
		
			
		
		
		
		
		
	}

}










