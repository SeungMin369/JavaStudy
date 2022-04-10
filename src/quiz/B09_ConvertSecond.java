package quiz;

import java.util.Scanner;

public class B09_ConvertSecond {
	public static void main(String[] arge) {
		/*
		  	�ʸ� �Է¹����� ��/��/�ð�/��/�ʷ� ��ȯ�Ͽ� ����غ�����
		  	
		  	�� ��, �ʿ���� ������ ������� �� ��
		  	
		  	ex: 0�� 0�� 13�ð� 0�� 5���� ��� -> 13�ð� 0�� 5�ʹ� ���;� ��
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�ʸ� �Է��ϼ���");
		int second = sc.nextInt();
		// �迭�� ����� ��� ���� ª�Ơ���
		int[] converted = new int[4];
		int[] seconds = new int[4];
		String[] units = {"��", "��", "��", "��"};
		
		seconds[0] = 365 * 24 * 60 * 60;
		seconds[1] = 24 * 60 * 60;
		seconds[2] = 60 * 60;
		seconds[3] = 60;
		
		for (int i = 0; i < converted.length; ++i) {
			converted[i] = second / seconds[i];
			second %= seconds[i];
			
		}
		boolean exist = false;
		
		for (int i = 0; i < converted.length; ++i) {
			if (converted[i] != 0 || exist) {
				System.out.printf("%d%s", converted[i], units[i]);
				exist = true;
			}
		}
		
		System.out.printf("%d��\n", second);
		
		/*
		 	�迭�� ������� ���� ��� 
		System.out.print(second + "�ʴ� ��ȯ�ϸ�");
		
		int y = 0, d = 0, h = 0, m = 0, s = 0;
		
		final int SECOND_PER_YEAR = 365 * 24 * 60 * 60;
		final int SECOND_PER_DAY = 24 * 60 * 60;
		final int SECOND_PER_HOUR = 60 * 60;
		final int SECOND_PER_MINUTE= 60;
		
		y = second / SECOND_PER_YEAR;		
		second %= SECOND_PER_YEAR;
		
		d = second / SECOND_PER_DAY;
		second %= SECOND_PER_DAY;
		
		h = second / SECOND_PER_HOUR;
		second %= SECOND_PER_HOUR;
		
		m = second / SECOND_PER_MINUTE;
		second %= SECOND_PER_MINUTE;
		
		boolean exist = false;
		
		if (y != 0) {
			System.out.print(y + "�� ");
			exist = true;
		}
		if (d != 0 || exist) {
			System.out.print(d + "�� ");
			exist = true;
		}
		if (h != 0 || exist) {
			System.out.print(h + "�� ");
			exist = true;
		}
		if (m != 0 || exist) {
			System.out.print(m + "�� ");
			exist = true;
		}
		System.out.print(second + "�� ");
		*/
	}

}









