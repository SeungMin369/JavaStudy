
public class B02_CharAt {
	public static void main(String[] arge) {
		
		/*
		  	# "���ڿ�" .charat(index);
		  	
		  	- �ش� ���忭���� ���ϴ� ��°�� ���ڸ� charŸ������ ������ �Լ�
		  	- ù ��° ���ڴ� 0�� �ε����� �ִ�
		  	# "���ڿ�" .length();
		  	- �ش� ���ڿ��� �� �� ���������� intŸ������ �˷��ش�
		  
		  
		  
		 */
		String text ="Hello, everyone!!";
		
		System.out.println("Hello, everyone!!".charAt(0));
		System.out.println("Hello, everyone!!".charAt(1));
		System.out.println("Hello, everyone!!".charAt(2));
		System.out.println("Hello, everyone!!".charAt(3));
		System.out.println("Hello, everyone!!".charAt(4));
		System.out.println("Hello, everyone!!".length());
		
		// 0�� �ε��� ���� 17���� ���ڰ� �ֱ� ������ 16�� �ε����� �������̴�
		System.out.println(text.charAt(16));
		System.out.println(text.charAt(text.length() - 1));
		System.out.println(text.charAt(text.length() - 2));
		System.out.println(text.charAt(text.length() - 3));
		System.out.println(text.charAt(text.length() - 4));
		System.out.println(text.charAt(text.length() - 5));
		
		
	}
	

}
