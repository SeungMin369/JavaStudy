package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {
	public static void main(String[] arge) {
		/*
		  ������ �Է¹����� ������ �ش��ϴ� �˸��� ����� ������ִ� ���α׷��� ��������
		  
		  		 90�� �̻� : A
		  		 80�� �̻� : B
		  		 70�� �̻� : C
		  		 60�� �̻� : D
		  		 �� �� : F
		  
		 */
		
		Scanner sc = new Scanner(System.in);
				
		/*int score;
		
		System.out.print("������ �����ΰ���?");
		score = sc.nextInt();
		if (score > 100 || score < 0 ) {
			System.out.println("�߸��� ������ �Է��߽��ϴ�.");
		}else if (score >= 90) {
			System.out.println("����� ������ A �Դϴ�.");
		}else if (score >= 80) {
			System.out.println("����� ������ B �Դϴ�.");
		}else if (score >= 70) {
			System.out.println("����� ������ C �Դϴ�.");
		}else if (score >= 60) {
			System.out.println("����� ������ D �Դϴ�.");		
		}else {
			System.out.println("����� ������ F �Դϴ�.");
		}
		*/
		
		// �Է��� �޾��� ���� �߸��� ���� ���� �Ÿ��� ���� ����
		char grade = 'Z';
		int score;
		
		System.out.print("������ �Է����ּ��� > ");
		score = sc.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("�߸��� �����Դϴ�.");
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
			
		System.out.printf("����� ����� %c�Դϴ�.\n", grade);
		// grade�� if���� ������ �� ���� �ٽ� ���� ���ֹǷ� �ξ� ȿ�����̴� 
		// ������ �ξ� ���߳�
		
		
		
	
		
		
		
		
	}

}
