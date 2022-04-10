
public class A03_Vartypes {
	public static void main(String[] arge) {
		
		/*
		 * 	# 정수 타입
		 *  - byte 	(1byte)				-128 ~ +127
		 *   
		 *   1 byte = 8 bit
		 *   1 byte = 0000 0000 전구 8개라고 보면되고 두가지 색으로 표현할 범위는 2의 8승 즉 256
		 *   0000 0000(0) ~ 1111 1111(255) (부호가 없는 경우 0 ~ 255까지 표현 가능)
		 *   부호를 사용하는 경우에는 첫 번째 bit를 부호 비트로 사용한다
		 *   
		 *    byte타입의 양수 범위 0000 0000(0) ~ 0111 1111(127)
		 *    byte타입의 음수 범위 1000 0000(-128) ~ 1111 1111(-1)
		 *   (맨앞자리가 1이면 음수를 표현하므로 음수가 반 포함된다)
		 *			
		 *  
		 *  - short	(2byte)	
		 *  
		 *  -32768 ~ +32767
		 *    			
		 *  - char	(2byte unsigned) // 양수만 있기 때문에 문자 코드 저장용
		 *  
		 *  0 ~ 65536
		 *  	
		 *  - int	(4byte)
		 * 	
		 *  -2147483648 ~ +2147483647
		 *  -2^31 ~ + 2^31-1
		 *  
		 *  - long 	(8byte)
		 *  
		 *   -2^63 ~ + 2^63-1	
		 *  			
		 *  // 등등이 있지만 숫자가 너무 커지는건 쓸 일이 거의 없다(우주선, 암호학)
		 * 
		 */
		
		byte a = 10;
		short b = 10;
		char c = 10;
		int d = 10;
		long e = 10;
		
		byte _byte = 127;
		short _short = 32767;
		char _char = 65535;
		int _int = 2100000000; //대충 21억 
		// 개인질문 _ 을 붙이는 이유는 타입이 아니고 이름이라는것을 말하기 위함
		//정수타입 리터럴은 기본적으로 int타입이다
		//int타입의 범위를 벗어나는 값을 사용하고 싶다면 뒤에 l 또는 L 을 붙여야 한다.
		long _long = 2000000000000000000L;//L을 적어 롱 타입이라는것을 표시
			
		
		// 각자 범위 만큼만 쓸 수 있다
		
		System.out.println(a);
		
		/*
		 * 	# 실수 타입
		 * 	 
		 * 	- float	(4byte)
		 *  - double(8byte)
		 *  
		 *  실수는 주로 그래픽 계산에 사용된다.
		 *  부동 소수점 방식을 사용한다.
		 * 
		 * 
		 */
		// 소수 리터럴은 기본적으로 double타입이므로 double타입 변수에는 아무 문제 없이 들어간다
		double _double = 123.1234;
		
		// 소수 뒤에 f 또는 F를 적어주면 float타입 리터럴이라는 표시가 된다
		float _float = 123.123F;
		
		/*
		 * 		# 참/거짓 타입
		 * 		- boolean
		 * 
		 * 		들어갈 수 있는 값은 true/false 밖에 없다
		 */
		boolean male = true;
		boolean female = true;
		boolean poweron = false;
		boolean goodpil = true;
		boolean computerScience = true;
		
		
		/* 
		 * 
		 * 		# 참조형 타입
		 * 			
		 * 			참조형 타입은 대문자로 시작한다.
		 * 			소문자로 시작하는 타입은 모두 기본형 타입이라고 부른다.
		 * 
		 * 			- String
		 * 			- 그 외 모든 클래스들..
		 */
		
		String welcome_messge = "hello, world";
		System.out.println(welcome_messge);
		
		//char 타입은 문자 코드를 저장하는 정수 타입이다
		char ch = 120;
		char ch2 = 'x';//문자로 보는 x 값
		int num1 = 'x';//정수로 보는 x 값 (아스키코드)
		System.out.println("ch에 저장된 값:" + ch);
		System.out.println("'x'를 저장한 char타입 변수의 출력:" + ch2);
		System.out.println("'x'를 저장한 int타입 변수의 출력:" + num1);
	}

}
