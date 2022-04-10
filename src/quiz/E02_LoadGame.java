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
	  	아까 저장해둔 가위바위보 세이브 파일로부터 승/무/패/ 정보를 읽어들인 후
	  	게임이 진행되도록 만들어보세요 (다시 저장도 되어야 함)
	 */
	static ArrayList<Character> total = new ArrayList<>();
	
	public static void main(String[] args) {
		try {
			
			FileInputStream in = new FileInputStream("가위바위보 결과.txt");
			
			
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
		
		System.out.println("컴퓨터가 이긴 횟수: " + total.get(0));
		System.out.println("플레이어가 이긴 횟수: " + total.get(1));
		System.out.println("무승부: " + total.get(2));
		
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
			FileOutputStream out = new FileOutputStream("가위바위보 결과.txt", false);
			
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
