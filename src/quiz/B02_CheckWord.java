package quiz;

import java.util.Scanner;

public class B02_CheckWord {
	
	public static void main(String[] arge) {
		
		/*
		  ����ڷκ��� �ܾ �ϳ� �Է¹ް� ù��° ���ڰ� �����̸鼭 ������ ���� ���ڿ� ��ġ�ϸ� "OK"
		  �� ����ϰ� ��ġ���� ������ "NOT OK"�� ����غ�����
		  
		 */
		/*Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�ܾ �Է��غ�����");		
		String word = sc.nextLine();
		
		String text = word;
		
		if (text.charAt(0) >= a && text.charAt(0) <= z) && (text.charAt(0) >= A && 
				text.charAt(0) <= Z)) {
			System.out.println("��� �ƴմϴ�.");
			
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
		// boolean�� Ȱ�뵵 ������� ���� �������� if ���� ��밡���ϴ�
		
		
		if (match && alphabet) {
			System.out.println("OK");
		}else {
			System.out.println("NOT OK");
		}
		
				 
				 
		 
		
		
		
		
		
		
	}

}
