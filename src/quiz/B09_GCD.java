package quiz;

public class B09_GCD {

	public static void main(String[] args) {
		/*
		  	두 숫자를 입력받고 두 숫자의 최대공약수를 구해보세요
		  	
		 	# 최대공약수
		 	
		 		- 두 숫자의 공약수 중 가장 큰 공약수
		 		
			 		20 [1, 2, 4, 5, 10, 20]
			 		50 [1, 2, 5, 10, 25, 50]
			 		
			 		의 경우 10이 최대 공약수
		 */
		int num1 = 20, num2 = 50;
		
		int max = num1 > num2 ? num1 : num2;// Math.max(num1, num2);
		int min = num1 < num2 ? num1 : num2;// Math.max(num1, num2);
		int gcd = 1;
		for (int i = 1; i <= min; ++i) {
			if (min % 1 == 0 && max % i == 0) {
				gcd = i;
			}
		}
		
		System.out.printf("%d와 %d의 최대 공약수는 %d입니다.", num1, num2, gcd);
		
		
		
	}

}







