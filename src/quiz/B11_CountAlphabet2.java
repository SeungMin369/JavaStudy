package quiz;

import java.util.Scanner;

public class B11_CountAlphabet2 {

	public static void main(String[] args) {
		/*
	  	����ڷκ��� ������ �ϳ� �Է¹ް�
	  	�ش� ���忡 � ���ĺ��� ��� �����ߴ��� ��� ��� ����غ�����
	  	(��ҹ��ڵ� ������ ��)
		*/
		System.out.print("���ڿ��� �Է��Ͻÿ� > ");
		
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










