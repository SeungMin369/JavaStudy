package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade2 {
	/*
	  ������ �Է¹����� ������ �ش��ϴ� �˸��� ����� ������ִ� ���α׷��� ��������
	  
	  		 90�� �̻� : A
	  		 80�� �̻� : B
	  		 70�� �̻� : C
	  		 60�� �̻� : D
	  		 �� �� : F
	  		 �Լ��� �غ���~
	 */

	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ���. > ");
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








