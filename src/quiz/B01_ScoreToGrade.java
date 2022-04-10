package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {
	public static void main(String[] arge) {
		/*
		  점수를 입력받으면 정수에 해당하는 알맞은 등급을 출력해주는 프로그램을 만들어보세요
		  
		  		 90점 이상 : A
		  		 80점 이상 : B
		  		 70점 이상 : C
		  		 60점 이상 : D
		  		 그 외 : F
		  
		 */
		
		Scanner sc = new Scanner(System.in);
				
		/*int score;
		
		System.out.print("점수가 몇점인가요?");
		score = sc.nextInt();
		if (score > 100 || score < 0 ) {
			System.out.println("잘못된 점수를 입력했습니다.");
		}else if (score >= 90) {
			System.out.println("당신의 점수는 A 입니다.");
		}else if (score >= 80) {
			System.out.println("당신의 점수는 B 입니다.");
		}else if (score >= 70) {
			System.out.println("당신의 점수는 C 입니다.");
		}else if (score >= 60) {
			System.out.println("당신의 점수는 D 입니다.");		
		}else {
			System.out.println("당신의 점수는 F 입니다.");
		}
		*/
		
		// 입력을 받았을 떄는 잘못된 값을 먼저 거르는 것이 좋다
		char grade = 'Z';
		int score;
		
		System.out.print("점수를 입력해주세요 > ");
		score = sc.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("잘못된 점수입니다.");
			grade = 'F';
		} else if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
	
		}
			
		System.out.printf("당신의 등급은 %c입니다.\n", grade);
		// grade를 if문이 지나갈 때 마다 다시 선언 해주므로 훨씬 효율적이다 
		// 나보다 훨씬 잘했네
		
		
		
	
		
		
		
		
	}

}
