package quiz;

import java.util.Scanner;

public class B11_CountAlphabet2 {

	public static void main(String[] args) {
		/*
	  	사용자로부터 문장을 하나 입력받고
	  	해당 문장에 어떤 알파벳이 몇번 등장했는지 세어서 모두 출력해보세요
	  	(대소문자도 구분할 것)
		*/
		System.out.print("문자열을 입력하시오 > ");
		
		String text = new Scanner(System.in).nextLine();
		
		int[] lower = new int[26];
		int[] upper = new int[26];
		for (int i = 0, len = text.length(); i < len; ++i) {
			char ch = text.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				lower [ch - 'a']++;                                                                                                                                                                                                                                                                                                                                                                                                                                   
			}else if (ch >= 'A' && ch <= 'Z') {
				upper [ch - 'A']++;
			}
		}
		
	}

}










