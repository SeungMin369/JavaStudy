package test;

import java.util.HashSet;
import java.util.Scanner;

public class StrikeGame {
	static String[] numbers = new String[4];
	static String[] insertNum = new String[4];
	static int trial = 0;
	
	
	public static void main(String[] args) {
		random();
		start();
				
		
	}
	
	private static void start() {
		if (trial >= 9) {
			System.out.println("�õ� Ƚ���� 8���� �Ѿ����ϴ�.");
		}
		Scanner sc = new Scanner(System.in);
		
		boolean resultCheck = false;
		while (true) {
			System.out.println("4�ڸ� ��ȣ�� �Է��Ͻÿ�.");
			String num = sc.nextLine();
			char[] check = num.toCharArray();
			for (char i : check) {
				if (!Character.isDigit(i)) {
					System.out.println("���ڸ��� �ٸ� ���� �Է��ϼ̽��ϴ�.");
					resultCheck = true;
					continue;
				}
				
			}
			HashSet<Character> overlapCheck = new HashSet<>();
			
			for (int i = 0; i < check.length - 1; ++i) {
				overlapCheck.add(check[i]);
			}
			if (num.length() > 4) {
				System.out.println("��ȣ�� �ڸ����� �Ѿ����ϴ� 4�ڸ� ��ȣ�� �Է��ϼ���");
				resultCheck = true;
				continue;
			} else if (num.length() < 4) {
				System.out.println("4�ڸ����� ���� ���� �Է��ϼ˽��ϴ�. 4�ڸ� ��ȣ�� �Է��ϼ���");
				resultCheck = true;
				continue;
			} else if (overlapCheck.size() != 4) {
				System.out.println("�ߺ��Ǵ� ���ڸ� �Է��ϼ˽��ϴ�.");
				resultCheck = true;
				continue;
			} else {
				for (int i = 0; i < 4; ++i) {
					String n = "";
					insertNum[i] = n + check[i];
				}
				break;
			}
			
			
			
			
			
			
		}
		if (resultCheck) {
			start();
		}
		int strike = 0;
		int ball = 0;
		
		for (int i = 0; i < 4; ++i) {
			if (numbers[i].equals(insertNum[i])) {
				strike++;
			} else {
				for (int j = 0; j < 4; ++j) {
					if (numbers[i].equals(insertNum[j])) {
						ball++;
					}
				}
			}
		}	
	
		trial++;
		System.out.println("Strike: " + strike);
		System.out.println("ball: " + ball);
		System.out.println("number of attempts: " + trial);
		
		start();
		
	}
	
	private static void random() {
		HashSet<String> overlapCheck = new HashSet<>();
		
		while (true) {
			for (int i = 0; i < 4; ++i) {
				numbers[i] = Integer.toString((int)(Math.random() * 10));
				overlapCheck.add(numbers[i]);
			}
			if (overlapCheck.size() == 4) {
				break;
			}
		}
		
		
		
	}
}
