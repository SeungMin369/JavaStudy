package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade2 {
	/*
	  점수를 입력받으면 정수에 해당하는 알맞은 등급을 출력해주는 프로그램을 만들어보세요
	  
	  		 90점 이상 : A
	  		 80점 이상 : B
	  		 70점 이상 : C
	  		 60점 이상 : D
	  		 그 외 : F
	  		 함수로 해보자~
	 */

	public static void main(String[] args) {
		System.out.print("점수를 입력하세요. > ");
		int score = new Scanner(System.in).nextInt();
		
		
		System.out.println(scoretograde(score));
		
		
		
		

	}

	public static char scoretograde(int score) {
		char grade;
		if (score < 0 && score > 100) {
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
		return grade;
	}
	
	
	
	
	
	
	
}








