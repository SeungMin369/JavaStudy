package quiz;

public class B11_CountRandomFruit2 {

	public static void main(String[] args) {
		/*
	  	사용자로부터 숫자를 입력받으면 해당 개수 만큼의 랜덤 과일을 선택한다
	  	(랜덤으로 등장하는 과일 - apple, banana, kiwi, orange, grape, peach)
	  	
	  	그 후 각 과일이 몇 번 등장했는지 모두 기록하고 출력
		*/
		int num = 25;
		
		String[] fruits = {"apple", "banana", "kiwi", "orange", "grape", "peach"};
		
		int[] fruit_count = new int[fruits.length];
		
		for (int i = 0; i < num; ++i) {
			int random_number = (int)(Math.random() * fruits.length);
			System.out.println(fruits[random_number]);
			fruit_count[random_number]++;
		}
		
		for (int i = 0; i < fruits.length; ++i) {
			System.out.println(fruits[i] + "의 개수는" + fruit_count[i] + "개 입니다");
			
		}
		
		
		
		
		
		
		
		
	}

}











