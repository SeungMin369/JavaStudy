package quiz;

import java.util.Scanner;

public class B02_CheckWord {
	
	public static void main(String[] arge) {
		
		/*
		  사용자로부터 단어를 하나 입력받고 첫번째 글자가 영어이면서 마지막 번쨰 글자와 일치하면 "OK"
		  를 출력하고 일치하지 않으면 "NOT OK"를 출력해보세요
		  
		 */
		/*Scanner sc = new Scanner(System.in);
		
		
		System.out.print("단어를 입력해보세요");		
		String word = sc.nextLine();
		
		String text = word;
		
		if (text.charAt(0) >= a && text.charAt(0) <= z) && (text.charAt(0) >= A && 
				text.charAt(0) <= Z)) {
			System.out.println("영어가 아닙니다.");
			
		}else if (text.charAt(0) != text.charAt(text.length()-1)) {
			System.out.println("NOT Ok");
		}else if (text.charAt(0) == text.charAt(text.length()-1)) {
			System.out.println("Ok");
		}	
		*/
		
		String word = "ABC";
		
		char first_letter = word.charAt(0);
		char last_letter = word.charAt(word.length() - 1);
		
		boolean match = first_letter == last_letter;
		boolean alphabet = (first_letter >= 'A' && first_letter <= 'Z') ||
				(first_letter >= 'a' && first_letter <= 'z');
		// boolean의 활용도 기억하자 참과 거짓으로 if 문에 사용가능하다
		
		
		if (match && alphabet) {
			System.out.println("OK");
		}else {
			System.out.println("NOT OK");
		}
		
				 
				 
		 
		
		
		
		
		
		
	}

}
