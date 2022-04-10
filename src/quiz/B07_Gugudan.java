package quiz;

public class B07_Gugudan {

	public static void main(String[] args) {
		/*
		  	1. 구구단을 다음과 같이 가로로 출력해보세요
		  	2단: 2x1=2 2x2=4 2x3=6 ...
		  	3단: 3x1=3 3x2=6 3x3=9 ...
		  	
		  	2. 구구단을 다음과 같이 세로로 출력해보세요
		  	
		  	2단		3단		4단		...
		  	2x1=2	3x1=3	4x1=4	...
		  	2x2=4	3x2=6	3x3=9	...
		 */
		
		for (int dan = 2; dan <= 9; ++dan) {
			
			System.out.printf("%d 단: ", dan);
					
			for (int gop = 1; gop <= 9; ++gop) {
				
				
				System.out.printf("%dX%d=%02d ", dan, gop, dan * gop);// %02d 사용한다
			}
			System.out.println();			
		}
		
		
		for (int gop2 = 2; gop2 <= 9; ++gop2) {
			System.out.printf("%d단\t\t", gop2);
		}
		
		
		for (int gop = 1; gop <= 9; ++gop) {
			
								
			System.out.println();			
		

			for (int dan = 2; dan <= 9; ++dan) {
				
				System.out.printf("%d X %d = %d \t", dan, gop, dan * gop);
			}
		}
		/*
		  강사님 풀이 
		  	for (int line = 0; line < 10; ++line) {
		  		
		  		for (int dan = 2; dan <= 9; ++dan) {
		  			
		  		}
		  	}		
		  	
		  	
		  	
		 */
		
		
					
							 
					
		

	}

}
