package quiz;

import java.util.Scanner;

public class B05_PrintReverse {

	public static void main(String[] args) {
		// 사용자가 어떤 문장을 입력하면 그 문장을 거꾸로 출력해보세요
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요.");
		
		String word = sc.nextLine();
		
		int num = word.length();
		
		for (int c = 1; c < num; ++c ) {
			System.out.print(word.charAt(word.length() - c));
			c += 1;
		}
		*/
		
		String text = "i am a black cow";
		
		for (int i = text.length() - 1; i > -1; --i) {
			System.out.println(text.charAt(i));
		}
			
			

		
		
		
		

	}

}












