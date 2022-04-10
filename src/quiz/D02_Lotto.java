package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class D02_Lotto {
	/*
	  	1. 1 ~ 45의 중복없는 랜덤 숫자 6개 또는 7개를 생성하는 메서드를 작성해보세요
	  	   (당첨번호는 6개 보너스번호 1개, 손님이 고르는 번호는 6개)
	  	
	  	2. 프로그램이 시작되면 당첨번호를 하나 지정하고 (숫자 7개)
	  	   당첨번호와 일치하는 6개의 숫자가 나올 때 까지 번호를 계속 뽑아보세요.
	  	   
	  	3. 1등 또는 2등에 당첨될때까지 돈을 얼마나 썻는지 계산해보세요 (숫자 6개 뽑을 때마다 천원)
	  	
	 */
	static final int MAX_NUM = 45;
	public static Random ran = new Random();
	static HashSet<Integer> player = new HashSet<>();
	static ArrayList<Integer> bonus = new ArrayList<>();
	static HashSet<Integer> winning = new HashSet<>();	
	public static void main(String[] args) {
		
		start();
		System.out.println(winning);
		System.out.println(bonus);
		
		long count = 0;
		while (true) {
			count++;
			buy();
//			System.out.print("뽑은 번호: ");
			for (int num : player) {
//				System.out.printf("[%d]", num);
			}
//			System.out.println();
			HashSet<Integer> check = new HashSet<>();
			check.addAll(player);
			check.removeAll(winning);
			player.addAll(winning);
			if (player.size() == 6) {
				System.out.println("1등에 당첨되었습니다.");
				System.out.print("당첨번호" + winning);
					break;
			} else if (check.size() == 1) {
					check.removeAll(bonus);
					if (check.size() == 0) {
						System.out.print("당첨번호" + winning);
						System.out.println("2등에 당첨되었습니다. 보너스번호" + bonus);
						break;
					}
			} else {
//				System.out.println("당첨 기록이 없습니다.");
				
			}	
		}
		
		long money = count * 1000;
		
		System.out.printf("\n사용된 비용은 %d원 입니다.", money);
	}
	
	
	static void buy() {
		player.removeAll(player);
		
		while (true) {
			player.add(ran.nextInt(MAX_NUM + 1));
			
			if (player .size() == 6) {
				break;
			}
		}	
	}
	
	static void bonus() {
		bonus.add(ran.nextInt());
	}
	
	static void start() {
		winning.removeAll(winning);
		bonus.removeAll(bonus);
		while (true) {
			winning.add(ran.nextInt(MAX_NUM + 1));
			
			if (winning .size() == 6) {
				break;
			}
		}	
		while (true) {
			bonus.add(ran.nextInt(MAX_NUM + 1));
			bonus.removeAll(winning);
			if (bonus.size() == 1) {
				break;
			}
		}	
			
			
			
	}

}
