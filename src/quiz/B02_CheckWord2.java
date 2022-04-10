package quiz;

import java.util.Scanner;

public class B02_CheckWord2 {
	/*
	  사용자로부터 단어를 하나 입력받고 첫번째 글자가 영어이면서 마지막 번쨰 글자와 일치하면 "OK"
	  를 출력하고 일치하지 않으면 "NOT OK"를 출력해보세요
	  
	 */

	public static void main(String[] args) {
		System.out.print("문자를 입력하세요 > ");
		String word = new Scanner(System.in).nextLine();
		
		System.out.println(checkword(word));
		

	}

	public static String checkword(String word) {
		char first_letter = word.charAt(0);
		char last_letter = word.charAt(word.length() - 1);
		
		boolean match = (first_letter >= 'a' && first_letter <= 'z') ||
				(first_letter >= 'A' && first_letter <= 'Z');
		boolean match2 = first_letter == last_letter;
		
		if (match && match2) {
			return "OK";
		} else {
			return "NOT OK";
		}
	}
	
	
}
