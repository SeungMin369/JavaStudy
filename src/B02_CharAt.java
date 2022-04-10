
public class B02_CharAt {
	public static void main(String[] arge) {
		
		/*
		  	# "문자열" .charat(index);
		  	
		  	- 해당 문장열에서 원하는 번째의 문자를 char타입으로 꺼내는 함수
		  	- 첫 번째 문자는 0번 인덱스에 있다
		  	# "문자열" .length();
		  	- 해당 문자열이 총 몇 글자인지를 int타입으로 알려준다
		  
		  
		  
		 */
		String text ="Hello, everyone!!";
		
		System.out.println("Hello, everyone!!".charAt(0));
		System.out.println("Hello, everyone!!".charAt(1));
		System.out.println("Hello, everyone!!".charAt(2));
		System.out.println("Hello, everyone!!".charAt(3));
		System.out.println("Hello, everyone!!".charAt(4));
		System.out.println("Hello, everyone!!".length());
		
		// 0번 인덱스 부터 17개의 문자가 있기 때문에 16번 인덱스가 마지막이다
		System.out.println(text.charAt(16));
		System.out.println(text.charAt(text.length() - 1));
		System.out.println(text.charAt(text.length() - 2));
		System.out.println(text.charAt(text.length() - 3));
		System.out.println(text.charAt(text.length() - 4));
		System.out.println(text.charAt(text.length() - 5));
		
		
	}
	

}
