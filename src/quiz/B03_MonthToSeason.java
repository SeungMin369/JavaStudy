package quiz;

import java.util.Scanner;

public class B03_MonthToSeason {

	public static void main(String[] args) {
		
		/*
		  ����ڷκ��� ���� �Է¹����� �ش��ϴ� ������ ����غ�����
		  (switch-case���� ����� ��)
		 
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("month�� �Է��ϼ��� > ");
		int month = sc.nextInt();
				
		switch (month) {
		case 1:
			System.out.println("�ܿ��Դϴ�.");
			break;
		case 2:
			System.out.println("�ܿ��Դϴ�.");
			break;
		case 3:
			System.out.println("���Դϴ�.");
			break;
		case 4:
			System.out.println("���Դϴ�.");
			break;
		case 5:
			System.out.println("���Դϴ�.");
			break;
		case 6:
			System.out.println("�����Դϴ�.");
			break;
		case 7:
			System.out.println("�����Դϴ�.");
			break;
		case 8:
			System.out.println("�����Դϴ�.");
			break;
		case 9:
			System.out.println("�����Դϴ�.");
			break;
		case 10:
			System.out.println("�����Դϴ�.");
			break;
		case 11:
			System.out.println("�ܿ��Դϴ�.");
			break;
		case 12:
			System.out.println("�ܿ��Դϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
			
		}
		
		
		// break�� �������� �������� ��� ����� ����.
	/* String season;
	 * switch (month) {
		case 12: case 1: case 2:
			season = "�ܿ�";
			break;
		case 3: case 4: case 5:
			season = "��";
			break;
		case 6: case 7: case 8:
			season = "����";
			break;
		case 9: case 10: case 11:
			season = "�ܿ�";
			break;
		default:
		season = "����";
		    break;
		}
		
		if (month < 1 || month > 12) {
			System.out.printf("�߸��� �����Դϴ�");
		}
		System.out.println("%d���� %s�Դϴ�.\n", month, season);
		
	*/	
	}

}










