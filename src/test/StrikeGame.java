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
			System.out.println("시도 횟수가 8번을 넘었습니다.");
		}
		Scanner sc = new Scanner(System.in);
		
		boolean resultCheck = false;
		while (true) {
			System.out.println("4자리 번호를 입력하시오.");
			String num = sc.nextLine();
			char[] check = num.toCharArray();
			for (char i : check) {
				if (!Character.isDigit(i)) {
					System.out.println("숫자말고 다른 것을 입력하셨습니다.");
					resultCheck = true;
					continue;
				}
				
			}
			HashSet<Character> overlapCheck = new HashSet<>();
			
			for (int i = 0; i < check.length - 1; ++i) {
				overlapCheck.add(check[i]);
			}
			if (num.length() > 4) {
				System.out.println("번호가 자릿수를 넘었습니다 4자리 번호를 입력하세요");
				resultCheck = true;
				continue;
			} else if (num.length() < 4) {
				System.out.println("4자리보다 적은 수를 입력하셧습니다. 4자리 번호를 입력하세요");
				resultCheck = true;
				continue;
			} else if (overlapCheck.size() != 4) {
				System.out.println("중복되는 숫자를 입력하셧습니다.");
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
