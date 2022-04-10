package quiz;

import java.util.Scanner;

public class A06_GuessAge {
	
	/*
	    사용자로부터 태어난 해와 올해의 년도를 입력받으면
	    그 사람의 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을 만들어보세요
	  
	  
	 */
	public static void main(String[] arge) {
				
		Scanner sc = new Scanner(System.in);
		
			System.out.print("태어난 해가 어떻게 되세요?");
			
			int num = sc.nextInt(); // 변수명을 알아먹게 해야한다.
			
			System.out.print("올해의 년도는 어떻게 되나요?");
			
			int d = sc.nextInt();
			
			
			System.out.println("당신의 나이는" + (d + 1 - num) + "세 입니다.");
			
			
			//아래는 강사님 풀이 방법
			
			int birthYear, thisYear;
			int age;
			
			System.out.print("태어난 해를 입력 > ");
			
			birthYear = sc.nextInt();
			
			System.out.print("올해를 입력 > ");
			
			thisYear = sc.nextInt();
			
			age = thisYear - birthYear + 1; // 나중에 쓰일거면 변수를 선언하는것이 더 효율적이다
			
			System.out.println("당신의 나이는" + age + "살 입니다");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
}
			
		
		
		
		
