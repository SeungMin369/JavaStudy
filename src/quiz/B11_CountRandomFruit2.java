package quiz;

public class B11_CountRandomFruit2 {

	public static void main(String[] args) {
		/*
	  	����ڷκ��� ���ڸ� �Է¹����� �ش� ���� ��ŭ�� ���� ������ �����Ѵ�
	  	(�������� �����ϴ� ���� - apple, banana, kiwi, orange, grape, peach)
	  	
	  	�� �� �� ������ �� �� �����ߴ��� ��� ����ϰ� ���
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
			System.out.println(fruits[i] + "�� ������" + fruit_count[i] + "�� �Դϴ�");
			
		}
		
		
		
		
		
		
		
		
	}

}











