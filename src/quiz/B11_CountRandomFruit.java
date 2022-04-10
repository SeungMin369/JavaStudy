package quiz;

import java.util.Scanner;

public class B11_CountRandomFruit {

	public static void main(String[] args) {
		/*
		  	����ڷκ��� ���ڸ� �Է¹����� �ش� ���� ��ŭ�� ���� ������ �����Ѵ�
		  	(�������� �����ϴ� ���� - apple, banana, kiwi, orange, grape, peach)
		  	
		  	�� �� �� ������ �� �� �����ߴ��� ��� ����ϰ� ���
		 */
		/*
		System.out.print("���ڸ� �Է��ϼ��� > ");
		int num = new Scanner(System.in).nextInt();
		
		String[] fruits = {"apple", "banana", "kiwi", "orange", "grape", "peach"};
		int[] fruit_count = new int[5];
		
		for (int i = 0; i < num; ++i) {
			fruit_count[(int)(Math.random() * 5)]++;
			
		}		
		System.out.println("apple :" + fruit_count[0]);
		System.out.println("banana :" + fruit_count[1]);
		System.out.println("kiwi :" + fruit_count[2]);
		System.out.println("orange :" + fruit_count[3]);
		System.out.println("grape :" + fruit_count[4]);
		System.out.println("peach :" + fruit_count[5]);
		*/
		int repeat = 100;
		String[] fruits = {"apple", "banana", "kiwi", "orange", "grape", "peach"};
		
		int[] fruit_count = new int[fruits.length];
		
		for (int i = 0; i < repeat; ++i) {
			int random_number = (int)(Math.random() * fruits.length);
			System.out.println(fruits[random_number]);
			fruit_count[random_number]++;
			
		}
		
		System.out.println("###���� ���� Ƚ��###");
		
		for (int i = 0; i < fruits.length; ++i) {
			System.out.printf("%s�� %d�� �����߽��ϴ�\n", fruits[i], fruit_count[i]);
		}
		
	}

}







