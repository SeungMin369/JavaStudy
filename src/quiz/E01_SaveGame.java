package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class E01_SaveGame {
	
	/*
	  	������ ��ǻ�Ϳ��� ���������� ������ �ϳ� �����, ������ ���Ͽ� �����غ�����
	 */
	public static int win_count_computer;
	public static int win_count_player;
	public static int draw_count;
	static Random ran = new Random();
	final static String[] RPS = {"����", "����", "��"};
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			rps();
		}
		
		System.out.println("��ǻ�Ͱ� �̱� Ƚ��" + win_count_computer);
		System.out.println("�÷��̾ �̱� Ƚ��" + win_count_player);
		System.out.println("���º� �� Ƚ��" + draw_count);
		
		try {
			FileOutputStream out = new FileOutputStream("���������� ���.txt", false);
			
//			out.write("\n��ǻ�Ͱ� �̱� Ƚ��".getBytes());
			out.write(win_count_computer);
//			out.write("\n�÷��̾ �̱� Ƚ��".getBytes());
			out.write(win_count_player);
//			out.write("\n��� Ƚ��".getBytes());
			out.write(draw_count);
			
			
			
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void rps() {
		int computer;
		int player;
		computer = ran.nextInt(2);
		player = ran.nextInt(2);
		
		System.out.println("��ǻ��: " + RPS[computer]);
		System.out.println("�÷��̾�: " + RPS[player]);
		
		if (RPS[computer].equals("����") && RPS[player].equals("��")) {
			System.out.println("��ǻ���� �¸��Դϴ�.");
			win_count_computer++;
		} else if (RPS[computer].equals("����") && RPS[player].equals("����")) {
			System.out.println("�÷��̾��� �¸��Դϴ�");
			win_count_player++;
		} else if (RPS[computer].equals("����") && RPS[player].equals("����")) {
			System.out.println("�����ϴ�.");
			draw_count++;
		} else if (RPS[computer].equals("��") && RPS[player].equals("����")) {
			System.out.println("��ǻ���� �¸��Դϴ�.");
			win_count_computer++;
		} else if (RPS[computer].equals("��") && RPS[player].equals("����")) {
			System.out.println("�÷��̾��� �¸��Դϴ�.");
			win_count_player++;
		} else if (RPS[computer].equals("��") && RPS[player].equals("��")) {
			System.out.println("�����ϴ�.");
			draw_count++;
		} else if (RPS[computer].equals("����") && RPS[player].equals("����")) {
			System.out.println("��ǻ���� �¸��Դϴ�.");
			win_count_computer++;
		} else if (RPS[computer].equals("����") && RPS[player].equals("��")) {
			System.out.println("�÷��̾��� �¸��Դϴ�.");
			win_count_player++;
		} else if (RPS[computer].equals("����") && RPS[player].equals("����")) {
			System.out.println("�����ϴ�.");
			draw_count++;
		}
	}
	
	
	
}
