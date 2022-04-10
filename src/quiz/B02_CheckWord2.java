package quiz;

import java.util.Scanner;

public class B02_CheckWord2 {
	/*
	  ����ڷκ��� �ܾ �ϳ� �Է¹ް� ù��° ���ڰ� �����̸鼭 ������ ���� ���ڿ� ��ġ�ϸ� "OK"
	  �� ����ϰ� ��ġ���� ������ "NOT OK"�� ����غ�����
	  
	 */

	public static void main(String[] args) {
		System.out.print("���ڸ� �Է��ϼ��� > ");
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
