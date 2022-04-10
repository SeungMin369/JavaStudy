package quiz;

public class C01_FuntionQuiz {
	/*
	  	# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	  	
	  	 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	  	 
	  	 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	  	 
	  	 3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	  	 
	  	 4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
	  	 
	  	 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수 
	  	 
	  	 6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	  	 	factorial: (n)*(n-1)*(n-2) ... 3*2*1
	 */
	public static void main (String[] arge) {
		
		System.out.println(number_Check(15));
		
		System.out.println(alphabet_Check("abc"));
		
		System.out.println(allYaksu(7)[1]);
			
			
		}
	
	//1
	public static boolean alphabet_Check(String alphabet) {
		boolean check = false;
		int len = alphabet.length();
		for (int i = 0; i < len; ++i) {
			if (alphabet.charAt(i) >= 'a' && alphabet.charAt(i) <= 'z' 
					|| alphabet.charAt(i) >= 'A' && alphabet.charAt(i) <= 'Z') {
				check = true;
				continue;
			}else {
				check = false;
				break;
			}
		}	
		return check;
	}
	//1 강사 
	public static boolean isAlphabet(char ch) {
		return ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z';
	}
	
	//2
	public static boolean number_Check(int num) {
		boolean check = (num % 3 == 0);
		
		return check;
	}
	//2 강사
	public static boolean isMul3(int num) {
		return num % 3 == 0;
	}
	
	//3 
	public static String evenOdd(int num) {
		return num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
	}
	
	//4 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
	public static int[] allYaksu(int num) {
		//50인 경우 boolean 타입 변수 50개를 생성
		boolean[] divided = new boolean[num];
		
		int count = 0;
		for (int i = 1; i <= num; ++i) {
			if (num % 1 == 0) {
				divided[i - 1] = true; // 배열에 나누어 떨어진 숫자들을 표시 해놓음
				count++;
			}
		}
		int[] yaksu = new int[count];
		int index = 0;
		
		for (int i = 0; i < num; ++i) {
			if (divided[i]) {
				yaksu[index++] = i + 1;
			}
		}
		
		return yaksu;
		
		
	}
	// 5,6 은 나중에 풀어준다
	//5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		if (num == 2) {
			return true;
		} else if (num % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	//6 6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	 //	factorial: (n)*(n-1)*(n-2) ... 3*2*1
	public static int factorial(int num) {
		// 곱하기를 반복할때는 초기값을 1로 준다 ( 0은 곱해도 0이라서 반복이 안된다)
		int factorial = 1;
		for (int i = num; i > 0; --i) {
			factorial *= i;
		}
		return factorial;
	}
	//6 2
	//어떤 함수가 자기 자신을 불러서 사용하는 것을 재귀함수라고 부른다 (성능 안좋음, 겉멋) 느려서 안쓰는게 낫다 
	public static int recursive_factorial(int num) {
		if (num == 1) {
			return 1;
		}
		return num * recursive_factorial(num - 1);
	}
	
	
	
}












