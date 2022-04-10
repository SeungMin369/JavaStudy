package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D11_�ҿ����� {

	/*
		2018�� 9�� 1�Ϻ��� ����. ������ ���Ѿ���.
		����ȣ���� ��������
		�� 1 6
		ȭ 2 7
		�� 3 8
		�� 4 9
		�� 5 0
		�������޹��� ��������(��������)
		��������: �����, ���Ƶ���, ����
	 */
	
	// 0: �Ϲ���, 1: �������, 2: ���Ƶ�����, 3: ����
	int type;
	// 4�ڸ� ������ȣ
	String number;
	// �����ϴ� ��
	Calendar calendar;

	public D11_�ҿ�����() {
		type = (int)(Math.random() * 4);
		number = "" + (int)(Math.random() * 10);
		number += (int)(Math.random() * 10);
		number += (int)(Math.random() * 10);
		number += (int)(Math.random() * 10);
		calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, (int)(Math.random() * 3000) * -1);
		System.out.println("car number: " + number + ", type: " + type + " (0: �Ϲ���, 1: �������, 2: ���Ƶ�����, 3: ����)");
	}
	
	// ���Ͽ� ���� ����ȣ ����
	boolean checkLastNumWithDay() {
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		int last = Integer.parseInt(number.substring(3));
		
		return (day == 2 && (last == 1 || last == 6)) 
				|| (day == 3 && (last == 2 || last == 7)) 
				|| (day == 4 && (last == 3 || last == 8)) 
				|| (day == 5 && (last == 4 || last == 9))
				|| (day == 6 && (last == 5 || last == 0));
	}
	
	// �ָ�, ������ ����
	boolean checkHoliday() {
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		int month = calendar.get(Calendar.MONTH);
		int date = calendar.get(Calendar.DATE);
		
		return (day == 1 || day == 7) // ��
				|| (month == 1 && date == 1) // ����
				|| (month == 3 && date == 1) // ������
				|| (month == 5 && date == 5) // ��̳�
				|| (month == 6 && date == 6) // ������
				|| (month == 8 && date == 15) // ������
				|| (month == 10 && date == 3) // ��õ��
				|| (month == 10 && date == 9) // �ѱ۳�
				|| (month == 12 && date == 25); // ũ��������
	}
	
	// ��������
	boolean checkExeptCar() {
		// 0: �Ϲ������� ���ܾƴ�
		return type != 0;
	}
	
	// ��� ���� �Ⱓ
	boolean checkPeriod() {
		Calendar start = Calendar.getInstance();
		start.set(2018, 9, 1);
		
		return calendar.compareTo(start) >= 0;
	}
	
	void checkCarNumber() {
		SimpleDateFormat current = new SimpleDateFormat("yyyy�� MM�� dd�� EEEEEE");
		if(!checkPeriod()) {
			System.out.println("���� " + current.format(calendar.getTime()) + "�� " + "����Ⱓ�� �ƴմϴ�.");
			return;
		}
		if(checkHoliday()) {
			System.out.println("���� " + current.format(calendar.getTime()) + "�� " + "������, �޹��� �Դϴ�.");
			return;
		}
		if(checkExeptCar()) {
			String carT = "�Ϲ���";
			if(type == 1) carT = "�������";
			else if(type == 2) carT = "���Ƶ�����";
			else if(type == 3) carT = "����";
			System.out.println(carT + "�� ���������Դϴ�.");
			return;
		}
		if(checkLastNumWithDay()) {
			System.out.println("���� " + current.format(calendar.getTime()) + "�� " + number + "�� ������ ������ �Ұ��մϴ�.");
			return;
		}

		System.out.println("���� " + current.format(calendar.getTime()) + "�� " + number + "�� ������ ������ �����մϴ�.");
	}
	
	public static void main(String[] args) {
		D11_�ҿ����� car = new D11_�ҿ�����();
		car.checkCarNumber();
		System.out.println();
		D11_�ҿ����� car2 = new D11_�ҿ�����();
		car2.checkCarNumber();
		System.out.println();
		D11_�ҿ����� car3 = new D11_�ҿ�����();
		car3.checkCarNumber();
		System.out.println();
	}
}