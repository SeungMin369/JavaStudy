
public class B12_Array2 {

	public static void main(String[] args) {
		/*
		  	배열 내부에도 배열을 넣을 수 있다
		 */

		int[] numbers = {1, 2, 3, 4, 5, 6}; // 오른쪽의 배열은 힙에 들어있고 왼쪽은 스택의 주소값이다
		
		int[][] arr2 = {
				{65, 66, 67, 68, 69},
				numbers,
				{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}
				
		};
		
		System.out.println(arr2[0][0]);
		System.out.println(numbers); // 세부 주소까지 입력을 안하면 스택의 주소값이 나온다
		System.out.println(arr2[1]);
		System.out.println(arr2[0][1]);
		System.out.println(arr2[0][2]);
		
		// n차원 배열은 n중 반복문으로 모두 탐색할 수 있다 (최적화 되어있다)
		
		for(int i = 0; i < arr2.length; ++i) {
			
			for (int j = 0; j < arr2[i].length; ++j) {
				System.out.printf("aee2[%d][%d]: %d\n", i, j, arr2[i][j]);
			}
		}
		int [][] block1 = {
				{0, 1, 1},
				{0, 0, 1},
				{0, 0, 1}
		};
		int width = 3;
		int height = 3;
		
		
		for (int i = 0; i < width; ++i) {
			for(int j = 0; j < height; ++j) {
				if (block1[i][j] == 0) {
					System.out.print("ㅁ ");
				} else if (block1[i][j] == 1) {
					System.out.print("■ ");
				}
			}
			System.out.println();
				
		}
		
		
		
		
		
		
		
		
		
	}

}









