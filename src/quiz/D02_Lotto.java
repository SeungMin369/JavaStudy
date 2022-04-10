package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class D02_Lotto {
	/*
	  	1. 1 ~ 45�� �ߺ����� ���� ���� 6�� �Ǵ� 7���� �����ϴ� �޼��带 �ۼ��غ�����
	  	   (��÷��ȣ�� 6�� ���ʽ���ȣ 1��, �մ��� ���� ��ȣ�� 6��)
	  	
	  	2. ���α׷��� ���۵Ǹ� ��÷��ȣ�� �ϳ� �����ϰ� (���� 7��)
	  	   ��÷��ȣ�� ��ġ�ϴ� 6���� ���ڰ� ���� �� ���� ��ȣ�� ��� �̾ƺ�����.
	  	   
	  	3. 1�� �Ǵ� 2� ��÷�ɶ����� ���� �󸶳� ������ ����غ����� (���� 6�� ���� ������ õ��)
	  	
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
//			System.out.print("���� ��ȣ: ");
			for (int num : player) {
//				System.out.printf("[%d]", num);
			}
//			System.out.println();
			HashSet<Integer> check = new HashSet<>();
			check.addAll(player);
			check.removeAll(winning);
			player.addAll(winning);
			if (player.size() == 6) {
				System.out.println("1� ��÷�Ǿ����ϴ�.");
				System.out.print("��÷��ȣ" + winning);
					break;
			} else if (check.size() == 1) {
					check.removeAll(bonus);
					if (check.size() == 0) {
						System.out.print("��÷��ȣ" + winning);
						System.out.println("2� ��÷�Ǿ����ϴ�. ���ʽ���ȣ" + bonus);
						break;
					}
			} else {
//				System.out.println("��÷ ����� �����ϴ�.");
				
			}	
		}
		
		long money = count * 1000;
		
		System.out.printf("\n���� ����� %d�� �Դϴ�.", money);
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
