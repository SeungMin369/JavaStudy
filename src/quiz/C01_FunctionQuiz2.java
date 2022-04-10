package quiz;

public class C01_FunctionQuiz2 {
	/*
	 	# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 	
	 	1. 최대값을 매개변수로 전달받으면
	 	   0부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성하여 반환하는
	 	   range 함수를 만들어보세요
	 	   
	 	   range(10)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 	   
 	   	2. 최소값과 최대값을 매개변수로 전달받으면
   		   그 사이에 존재하는 모든 정수값을 포함하는 int 배열을 생성하여 반환하는
   		   range 함수를 만들어보세요
   		   
   		   range(5, 10)의 결과 -> [5, 6, 7, 8, 9]
   		   
   		3. 최소값과 최대값과 증가값을 매개변수로 전달받으면
   		   최소값부터 최대값 미만까지 증가값만큼 증가하는 int 배열을 생성하여 반환하는
   		   range 함수를 만들어보세요
   		   
   		   ex: range(40, 50, 3)의 결과 -> [40, 43, 46, 49]
   		   	   range(40, 45, 5)의 결과 -> [40]
	 */
	/*
	 	# 함수 오바로딩(overloading)
	   		-매개변수의 개수 또는 타입이 다르면 똑같은 함수명을 사용할 수 있다
	   		그래서 제목을 전부 range로 사용가능함 매개변수의 수가 다르기 때문
	 */
	 //  println()에는 다양한 타입들의 오버로딩이 존재한다
	public static void main(String[] args) {
		
		for (int i = 0; i < range1(10).length; ++i) {

			System.out.printf("%d, ",range1(10)[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < range2(5, 10).length; ++i) {

			System.out.printf("%d, ", range2(5, 10)[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < range3(40, 50, 2).length; ++i) {

			System.out.printf("%d, ", range3(40, 50, 2)[i]);
		
		}
		
		
	}

	//1 
	public static int[] range1(int num) {
		int[] num1 = new int[num];
		
		for (int i = 0; i < num; ++i) {
			num1[i] = i;
			
		}
		return num1;
	}
	// 1. 강사님 버전 나랑 똑같다
	
	
	/*2 최소값과 최대값을 매개변수로 전달받으면
	   그 사이에 존재하는 모든 정수값을 포함하는 int 배열을 생성하여 반환하는
	   range 함수를 만들어보세요
	   
	   range(5, 10)의 결과 -> [5, 6, 7, 8, 9]
	*/
	public static int[] range2(int num, int num1) {
		
		int[] num2 = new int[num1 - num];
		
		for (int i = 0; i < num1 - num; ++i) {
			num2[i] = num + i;
		}
		return num2;
	}
	//2. 강사님 버전 나랑은 다르게 역으로 돌리는것도 생각했다
	public static int[] range(int start, int end) {
		int increase = start > end ? -1 : 1;
		int [] arr = new int[increase < 0 ? start - end : end - start];
		for (int value = start, index = 0; value != end; value += increase) {
			arr[index++] = value;
		}
		return arr;
	}
	
	/*
	  3. 최소값과 최대값과 증가값을 매개변수로 전달받으면
   		   최소값부터 최대값 미만까지 증가값만큼 증가하는 int 배열을 생성하여 반환하는
   		   range 함수를 만들어보세요
   		   
   		   ex: range(40, 50, 3)의 결과 -> [40, 43, 46, 49]
   		   	   range(40, 45, 5)의 결과 -> [40]
	 */
	public static int[] range3(int num, int num1, int num2) {
		int count = 0;
		for (int i = num; i < num1; i += num2) {
			count++;
		}
		int[] num3 = new int[count];
		
		for (int i = 0; i < count; ++i) {
			num3[i] = num + (num2 * i);
		}
		return num3;
	}
	//3. 강사님버전 이상한 값에 대한 대비를 했다 난 안했고
	/**
	  문서화 주석 (이 기능에 대한 설명을 할 수 있다)
	  @start 
	  	시작하는 값을 넣으세요
  	  @end 
  	  	끝나는 값을 넣으세요
  	  @return
  	  	잘못된 값을 입력하면 null이 나오고, 제대로 넣으시면 int[]이 나옵니다
	 */
	
	
	public static int[] range(int start, int end, int increase) {
		if (increase < 0 && start <= end) {
			return null;
		} else if (increase > 0 && start >= end) {
			return null;
		} else if (increase == 0) {
			return null;
		}
		int size;
		
		if (increase > 0) {
			int range = end - start;
			size = (end - start) % increase == 0 ? range / increase : range / increase + 1;
		} else {
			int range = start - end;
			size = range % (increase * -1) == 0 ? range / (increase * -1) : range / (increase * -1) + 1;
			
		}
		
		int [] arr = new int[size];
		for (int value = start, index = 0; increase > 0 ? value < end : value > end; value += increase) {
			
			arr[index++] = value;
			
		}
		return arr;
		
	}
	
	
	
	
	
	
	
	
	
	
}














