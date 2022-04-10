package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class E01_SaveGame {
	
	/*
	  	간단한 컴퓨터와의 가위바위보 게임을 하나 만들고, 전적을 파일에 저장해보세요
	 */
	public static int win_count_computer;
	public static int win_count_player;
	public static int draw_count;
	static Random ran = new Random();
	final static String[] RPS = {"가위", "바위", "보"};
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			rps();
		}
		
		System.out.println("컴퓨터가 이긴 횟수" + win_count_computer);
		System.out.println("플레이어가 이긴 횟수" + win_count_player);
		System.out.println("무승부 한 횟수" + draw_count);
		
		try {
			FileOutputStream out = new FileOutputStream("가위바위보 결과.txt", false);
			
//			out.write("\n컴퓨터가 이긴 횟수".getBytes());
			out.write(win_count_computer);
//			out.write("\n플레이어가 이긴 횟수".getBytes());
			out.write(win_count_player);
//			out.write("\n비긴 횟수".getBytes());
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
		
		System.out.println("컴퓨터: " + RPS[computer]);
		System.out.println("플레이어: " + RPS[player]);
		
		if (RPS[computer].equals("가위") && RPS[player].equals("보")) {
			System.out.println("컴퓨터의 승리입니다.");
			win_count_computer++;
		} else if (RPS[computer].equals("가위") && RPS[player].equals("바위")) {
			System.out.println("플레이어의 승리입니다");
			win_count_player++;
		} else if (RPS[computer].equals("가위") && RPS[player].equals("가위")) {
			System.out.println("비겼습니다.");
			draw_count++;
		} else if (RPS[computer].equals("보") && RPS[player].equals("바위")) {
			System.out.println("컴퓨터의 승리입니다.");
			win_count_computer++;
		} else if (RPS[computer].equals("보") && RPS[player].equals("가위")) {
			System.out.println("플레이어의 승리입니다.");
			win_count_player++;
		} else if (RPS[computer].equals("보") && RPS[player].equals("보")) {
			System.out.println("비겼습니다.");
			draw_count++;
		} else if (RPS[computer].equals("바위") && RPS[player].equals("가위")) {
			System.out.println("컴퓨터의 승리입니다.");
			win_count_computer++;
		} else if (RPS[computer].equals("바위") && RPS[player].equals("보")) {
			System.out.println("플레이어의 승리입니다.");
			win_count_player++;
		} else if (RPS[computer].equals("바위") && RPS[player].equals("바위")) {
			System.out.println("비겼습니다.");
			draw_count++;
		}
	}
	
	
	
}
