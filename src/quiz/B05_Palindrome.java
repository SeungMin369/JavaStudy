package quiz;

import java.util.Scanner;

public class B05_Palindrome {

	public static void main(String[] args) {
		
		/*
		  	사용자로부터 단어를 하나 입력받고
		  	해당 단어가 회문이라면 "PALINDROME"을 출력
		  	회문이 아니라면 "NOT PALINDROME"을 출력
		  	
		  	※ 회문이란 - MOM, BOB, ABBA, MADAM, EVE, TXT 등등
		 */
		/* 내가 했던 쓰레기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요.");
		
		String word = sc.nextLine();
		
		int n = word.length();
		
		for (int a = 1; a < n/2; ++a) {	
			if (word.charAt(a) == word.charAt(n)) {
				a = a + 1;
				n = n - 1;
			}else if(word.charAt(a) != word.charAt(n)) {
				System.out.println("NOT PALINDROME");							
		}else {
			System.out.println("PALINDROME");
		}
		}
		}
		*/
		/* # 거꾸로 뒤집는 방법 
		String original = "LEVEL";
		
		String reverse = "";
		
		for (int i = original.length() - 1; i > -1; --i) {
			reverse += original.charAt(i);
		}
		if (original.equals(reverse)) {
			System.out.println("PALINDROME");
		}else {
			System.out.println("NOT PALINDROME");
		}
		*/
		
		// # 앞뒤를 순차적으로 비교하는 방법 
		
		String original = "LEeVeEL";
		int half = original.length() / 2;
		int correct = 0;
		for (int i = 0; i < original.length() / 2; ++i) {
			char front = original.charAt(i);
			char back = original.charAt(original.length() - 1 - i);
			
			System.out.printf("'%c'와 '%c'를 비교합니다. \n", front, back);
			
			if (front == back) {
				correct++;
			}
		}
		
		if (correct == half) {
			System.out.println("PALINDROME");
		}else {
			System.out.println("NOT PALINDROME");
		}
		
		
		
		
	}

}









