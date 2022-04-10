package quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import quiz.E01_SaveGame;

public class E02_LoadGame {
	/*
	  	�Ʊ� �����ص� ���������� ���̺� ���Ϸκ��� ��/��/��/ ������ �о���� ��
	  	������ ����ǵ��� �������� (�ٽ� ���嵵 �Ǿ�� ��)
	 */
	static ArrayList<Character> total = new ArrayList<>();
	
	public static void main(String[] args) {
		try {
			
			FileInputStream in = new FileInputStream("���������� ���.txt");
			
			
			int ch = -1;
			while ((ch = in.read()) != -1) {
				System.out.println((char)ch);
				total.add((char) ch);
			} 
			
			
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(total);
		
		System.out.println("��ǻ�Ͱ� �̱� Ƚ��: " + total.get(0));
		System.out.println("�÷��̾ �̱� Ƚ��: " + total.get(1));
		System.out.println("���º�: " + total.get(2));
		
		for (int i = 0; i < 100; ++i) {
			E01_SaveGame.rps();
		}
		
		E01_SaveGame.win_count_computer += total.get(0);
		E01_SaveGame.win_count_player += total.get(1);
		E01_SaveGame.draw_count += total.get(2);

		System.out.println(E01_SaveGame.win_count_computer);
		System.out.println(E01_SaveGame.win_count_player);
		System.out.println(E01_SaveGame.draw_count);
		
		
		try {
			FileOutputStream out = new FileOutputStream("���������� ���.txt", false);
			
			out.write(E01_SaveGame.win_count_computer);
			out.write(E01_SaveGame.win_count_player);
			out.write(E01_SaveGame.draw_count);
			
			

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		E01_SaveGame.win_count_computer = 0;
		E01_SaveGame.win_count_player = 0;
		E01_SaveGame.draw_count = 0;
		
		
		
	}
	
	
}
