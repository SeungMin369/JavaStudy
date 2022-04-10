package myobj.fivedice;

import java.util.Scanner;

public class FiveDice extends Dice {
	/*
  	랜덤으로 5개의 주사위를 굴린 다음에 주사위의 결과를 통해 다음을 구분하는 클래스를 만들어보세요
  	
  	1. 풀하우스 (같은 눈이 2개 + 3개) (11666/23332/55252)
  	2. 스몰 스트레이트 (1234/2345/3456)
  	3. 라지 스트레이트 (12345/23456)
  	4. 4다이스 (같은 숫자 4개)
  	5. 5다이스 (Yacht) (같은 숫자 5개)	 
  	
  	 (1) 모든 주사위를 한번에 던지는 메서드
  	 
  	 (2) 원하는 주사위를 제외하고 나머지만 던지는 메서드 (개수 선택 가능)
  	 
  	 (3) 주사위를 새로 던질 떄마다 족보를 확인
  	 
	*/
	
	public static void main(String[] args) {
				
		FiveDice a = new FiveDice();
		
		FiveDice.check();
		
		FiveDice.result();
		FiveDice.reset();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주사위를 더 던지시겠습니까? \n 1.던진다.\t2.안던진다.\n입력>");
		int b = sc.nextInt();
		
		if (b == 1) {
			System.out.println("한번에 던지시겠습니까?\n 1.한번에 던진다.\t2.나눠서던진다.\n입력>");			
			int c = sc.nextInt();
			
			while (c == 1) {
				FiveDice.start();
				FiveDice.reset();
				FiveDice.check();
				FiveDice.result();
				System.out.print("또 던지겠습니까?\n 1.던진다.\t2.안던진다.\n입력>");
				int d = sc.nextInt();
				if (d == 1) {
					continue;
				} else if (d == 2) {
					System.out.println("게임이 종료되었습니다.");
					break;
				}
				
			}	
		} else if (b == 2) {
			System.out.println("다시 던질 주사위를 순서대로 입력하세요.");
			boolean t = true;
			while (t) {
				System.out.print("다시 던질 주사위를 선택해주세요.\n앞에서부터 1번 ~ 5번(그만 던지려면 6번)\n입력>");
				int e = sc.nextInt();
				FiveDice.partDice(e);
				FiveDice.reset();
				FiveDice.check();
				FiveDice.result();
				if (e == 6) {
					t = false;
					System.out.println("게임이 종료되었습니다");
					break;
				}
			}


			
			
		} else {
			System.out.println("게임이 종료되었습니다.");
		}
		
		
		
		
		
		
		
		
		
	}	
}

















