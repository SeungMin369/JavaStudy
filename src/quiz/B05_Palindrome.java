package quiz;

import java.util.Scanner;

public class B05_Palindrome {

	public static void main(String[] args) {
		
		/*
		  	����ڷκ��� �ܾ �ϳ� �Է¹ް�
		  	�ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
		  	ȸ���� �ƴ϶�� "NOT PALINDROME"�� ���
		  	
		  	�� ȸ���̶� - MOM, BOB, ABBA, MADAM, EVE, TXT ���
		 */
		/* ���� �ߴ� ������
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���.");
		
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
		/* # �Ųٷ� ������ ��� 
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
		
		// # �յڸ� ���������� ���ϴ� ��� 
		
		String original = "LEeVeEL";
		int half = original.length() / 2;
		int correct = 0;
		for (int i = 0; i < original.length() / 2; ++i) {
			char front = original.charAt(i);
			char back = original.charAt(original.length() - 1 - i);
			
			System.out.printf("'%c'�� '%c'�� ���մϴ�. \n", front, back);
			
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









