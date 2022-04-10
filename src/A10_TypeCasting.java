
public class A10_TypeCasting {
	public static void main(String[] arge) {
		
		/*
		  	#타입 캐스팅
		  		1. 타입이 자연스럽게 변하는 경우 (암묵적인 타입캐스팅)
		  			- 작은 타입에서 큰 타입으로 변할 때는 아무 문제가 생기지 않는다
		  			- 때문에 자연스럽게 타입이 변한다
		  			
		  		2. 타입을 강제로 변환시키는 경우 (명시적인 타입캐스팅)
		  			- 타입을 변환 시킬 때 문제가 생길 가능성이 있는 경우에는
		  			  프로그래머가 직접 명시적으로 타입을 변환시켜야 한다
		  		
	  		# 타입 크기 순서
	  		
	  			byte < short < char < int < long < float < double
	  			
	  			-long은 8바이트고 float은 4바이트지만 숫자의 표현 범위는 float이 더 넓다
	  			- 실수 타입은 정수 타입보다 표현 범위가 넓다
			  			
				int i = 3000;
				byte b = (byte)i;//int의 크기를 byte에 집어넣으므로 큰 값은 다 잘린다
				
				int num = 10;
				byte b = (byte)num;// int의 범위에 10말고도 더 거대한 값이 있을수 있기 때문에 막힘
				// 고로 앞에 (byte)를 적으므로 강제로 변환
				 
				byte b = -70;
				char ch = (char)b;// char은 음수를 표현못해서 byte가 작은대도 불구하고 변환이안된다
				System.out.println((int)ch);
				*/
				// 음수까지 포함하고 있는 타입은 char타입으로 변환할 떄 문제가 생길 위험이 있다
		byte b = -70;
		
		char ch = (char)b;// char은 음수를 표현못해서 byte가 크기가 더 작은대도 불구하고 변환이안된다
		System.out.println((int)ch + "<<");
		
		// 일반적으로는 크기가 큰 타입에서 작은 타입으로 변할 때도 명시적인 타입 캐스팅이 필요하다
		float f = 123.123f;
		System.out.println(f);
		
		long l = (long)f;
		System.out.println(l); // long은 실수 타입이 아니라서 소수점 아래가 잘림
		
		// 문제가 생기지는 않지만 같은 값이 다르게 해석될 필요가 있는 경우에도 
		// 명시적 타입캐스팅이 필요하다
		System.out.println('A');
		System.out.println((int)'A');
		
		System.out.println(80);
		System.out.println((char)80);
		
	
	}

}



