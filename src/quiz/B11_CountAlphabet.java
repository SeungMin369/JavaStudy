package quiz;

import java.util.Scanner;

public class B11_CountAlphabet {

	public static void main(String[] args) {
		/*
		  	����ڷκ��� ������ �ϳ� �Է¹ް�
		  	�ش� ���忡 � ���ĺ��� ��� �����ߴ��� ��� ��� ����غ�����
		  	(��ҹ��ڵ� ������ ��)
		 */
		System.out.print("���ڿ��� �Է��Ͻÿ� >");
		String text = new Scanner(System.in).nextLine();
		int[] lowercount = new int[26];
		int[] uppercount = new int[26];	
		for (int i = 0, len = text.length(); i < len; ++i) {
			char ch = text.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				lowercount[ch - 'a']++;
			}else if (ch >= 'A' && ch <= 'Z') {
				uppercount[ch - 'A']++;
			}
		}
		for (int i = 0; i < 26; ++i) {
			System.out.printf("�빮�� %c�� %d�� �����߽��ϴ�.\n",
					'A' + i, uppercount[i]);
			System.out.printf("�ҹ��� %c�� %d�� �����߽��ϴ�.\n",
					'a' + i, lowercount[i]);
		
		}
		
		
		/*
		

		System.out.print("���ڿ��� �Է��Ͻÿ� >");
		String text = new Scanner(System.in).nextLine();

		final String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		int[] symbol_count = new int[SYMBOLS.length()];
		
		for (int i = 0; len = text.length(); i < len; ++i) {
			
			char ch = text.charAt(i);
			System.out.println("�̹��� �˻��� ���ڴ�" + ch + "�Դϴ�.");
			
			for (int j = 0, len2 = SYMBOLS.length(); j < len2; ++j) {
				if (ch == SYMBOLS.charAt(j)) {
					symbol_count[j]++;
					System.out.println("'" + ch + "'�� SYMBOLS��" + j + "������ �����Ƿ� symbol_count�� "
							+ j + "��° ���� ������ŵ�ϴ�.");	
					break;
				}
			}
		}
		 */
		
		
		
		
		
		
	}

}













