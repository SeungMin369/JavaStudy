package quiz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class D11 {
	/*
	  	����ȣ ���� �������� (2018�� 9�� 1�� ����)
	  	�� 1 6 ����
	  	ȭ 2 7 ����
	  	�� 3 8 ����
	  	�� 4 9 ����
	  	�� 5 0 ����
	  	������ �޹��� ���� ���� (���� ���� ����)
	  	�����, ���Ƶ���, ���� ����
	  	
	  	1�� 1��
	  	3�� 1�� 
	  	5�� 5�� 
	  	6�� 6�� 
	  	8�� 15�� 
	  	10�� 3�� 
	  	10�� 9�� 
	  	12�� 25��
	 */
	
	final static LocalDate start_date = LocalDate.of(2018, 9, 1);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ȣ �� ���ڸ��� �Է��ϼ���. �����, ���Ƶ���, ������ ���������� �����ϴ�.\n>>");
		String carNum = sc.nextLine();
		if (!(Pattern.matches("\\d{4}", carNum))) {
			System.out.println("�߸��� ������ȣ �Է��Դϴ�");
		}
		
		
//		String carNum = "9357";
		LocalDate today = LocalDate.of(2019, 12, 25);

		System.out.println(accessRestrictions(carNum,today));
	}
	
	public static boolean accessRestrictions(String carNum, LocalDate today) {
		
		boolean check = true;
		if (today.isBefore(start_date)) {
			System.out.println("���೯¥ �� �Դϴ�.");
			return false;
		}

		char[] car = carNum.toCharArray();
		char lastNum = car[3];
		
		DateTimeFormatter my_date_format = 
				DateTimeFormatter.ofPattern("E");
		DateTimeFormatter my_date_format2 = 
				DateTimeFormatter.ofPattern("M�� d��");
		
		
		String day_of_week = my_date_format.format(today);
		String month_and_day =  my_date_format2.format(today);
		
		if (month_and_day.equals("1�� 1��")) {
			System.out.println("�����Դϴ�. ���������� �����ϴ�.");
			return true;
		} else if (month_and_day.equals("3�� 1��")) {
			System.out.println("�������Դϴ�. ���������� �����ϴ�.");
			return true;
		} else if (month_and_day.equals("5�� 5��")) {
			System.out.println("��̳��Դϴ�. ���������� �����ϴ�.");
			return true;
		} else if (month_and_day.equals("6�� 6��")) {
			System.out.println("�������Դϴ�. ���������� �����ϴ�.");
			return true;
		} else if (month_and_day.equals("8�� 15��")) {
			System.out.println("�������Դϴ�. ���������� �����ϴ�.");
			return true;
		} else if (month_and_day.equals("10�� 3��")) {
			System.out.println("��õ���Դϴ�. ���������� �����ϴ�.");
			return true;
		} else if (month_and_day.equals("10�� 9��")) {
			System.out.println("�ѱ۳��Դϴ�. ���������� �����ϴ�.");
			return true;
		} else if (month_and_day.equals("12�� 25��")) {
			System.out.println("ũ���������Դϴ�. ���������� �����ϴ�.");
			return true;
		}
		
		if (day_of_week.equals("��")) {
			if (lastNum == '1' || lastNum == '6') {
				check = false;
			}
		} else if (day_of_week.equals("ȭ")) {
			if (lastNum == '2' || lastNum == '7') {
				check = false;
			}	
		} else if (day_of_week.equals("��")) {
			if (lastNum == '3' || lastNum == '8') {
				check = false;
			}
		} else if (day_of_week.equals("��")) {
			if (lastNum == '4' || lastNum == '9') {
				check = false;
			}
		} else if (day_of_week.equals("��")) {
			if (lastNum == '5' || lastNum == '0') {
				check = false;
			}
		}	
		return check;
	}
		
}
