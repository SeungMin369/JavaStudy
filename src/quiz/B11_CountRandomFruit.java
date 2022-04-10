package quiz;

import java.util.Scanner;

public class B11_CountRandomFruit {

	public static void main(String[] args) {
		/*
		  	사용자로부터 숫자를 입력받으면 해당 개수 만큼의 랜덤 과일을 선택한다
		  	(랜덤으로 등장하는 과일 - apple, banana, kiwi, orange, grape, peach)
		  	
		  	그 후 각 과일이 몇 번 등장했는지 모두 기록하고 출력
		 */
		/*
		System.out.print("숫자를 입력하세요 > ");
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
		
		System.out.println("###과일 등장 횟수###");
		
		for (int i = 0; i < fruits.length; ++i) {
			System.out.printf("%s는 %d번 등장했습니다\n", fruits[i], fruit_count[i]);
		}
		
	}

}







