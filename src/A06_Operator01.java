
public class A06_Operator01 {
	public static void main(String[] arge) {
		/* 
		 * 	# 연산자 (Operator)
		 * 		- 계산할 떄 사용하는 것
		 * 		- +, -, *, / ...\
		 * 	
		 * 
		 * 
		 */
		
		// # 산술 연산자
		
		int a = 10, b = 7;
		double c = 7.0;
		
		System.out.println("a + b : " + (a + b));
		System.out.println("a - b : " + (a - b));
		System.out.println("a * b : " + a * b);
		
		// 정수 나누기 정수는 몫만 나온다
		// 정확한 계산을 원한다면 double을 앞에 적는다
		System.out.println("a / b : " + a / b);
		System.out.println("a / c : " + a / c);// 정수 나누기 소수는 소수가 나온다.
		System.out.println("a / (double)b : " + a / (double)b);// 소수점까지 나온다.
		System.out.println("(double)a / b : " + (double)a / b);
		
		// 나머지 연산 % / 의 차이
		System.out.println("b 나누기 a를 하면 나머지는? : " + b % a);// 안나눠지고 나머지 7이 나옴
		
		// ^는 제곱이 아니다 (아주 작은연산 임베디드 할때 쓴다)
		System.out.println(10 ^ 2);
		System.out.println(10 ^ 3);
		System.out.println(10 ^ 4);
		
		//Math.pow(a, b) : a의 b제곱을 계산하여 반환해주는 함수
		System.out.println(Math.pow(10, 2));// 커서올렸을때 맨 앞에 나오는값은 어떤 타입으로 반환되는지를 말함//void는 없다는뜻
		System.out.println(Math.pow(10, 3));
		System.out.println(Math.pow(10, 4));
		//Math.sqrt(a) : a의 제곱근을 구해서 반환한다
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(12));
		
		//Math.abs(a) : a의 절대값을 구해서 반환한다 // 무조건 양수
		System.out.println(Math.abs(-123.12345));
		
		//Math.round(a) : a를 소수 첫째 자리에서 반올림한 결과를 반환한다 // 정수로
		System.out.println(Math.round(123.5678));
		
		//Math.round()로 원하는 자릿수에서 반올림하기
		// - 반올림하고 싶은 자리를 소수 첫쨰 자리로 만들만큼 곱한 후 다시 나눈다
		System.out.println(Math.round(123.5678 * 1000) / 1000.0);// .0을 붙이면 1000이 1000.0으로 정수에서 소수로 바뀌
		System.out.println(Math.round(123.5678 * 100) / 100.0 );// 기 때문에 double 역할을 한다.
		
		//max_len = Math.max(max_len, numArr[row].length);
		// Math.max(a, b);는 a, b 중에서 더 큰값을 골라준다
		//int max = num1 > num2 ? num1 : num2;// Math.max(num1, num2);
		//int min = num1 < num2 ? num1 : num2;// Math.max(num1, num2);

	}
		


}







