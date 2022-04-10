package quiz;

public class B12_Array2Quiz {

	public static void main(String[] args) {
		
		int[][] numArr = new int[][] {
			{1, 1 ,1 ,1},
			{1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1},
			{1, 1},
			{1, 1, 1, 1}
		};
		
		//1. numArr의 모든 값을 0~100 사이의 랜덤 정수로 바꿔보세요
		
		//2. 랜덤으로 바뀐 numArr의 모든 값을 출력하고 종합과 평균(소수점 둘째 자리)을 구해서 출력해보세요
		
		//3. numArr의 각 행(row)의 합을 모두 구해서 출력해보세요
		
		//4. numArr의 각 열(column)의 합을 모두 구해서 출력해보세요
		
		//1
		/*
		for (int i = 0; i < numArr.length; ++i) {
			for (int j = 0; j < numArr[i].length; ++j) {
				numArr[i][j] = (int)(Math.random() * 100);
				System.out.printf("numArr[%d]: %d \n", i, numArr[i][j]);
				
			}
			System.out.println();
		}
		*/
		//2
		/*
		int[] sum = new int[numArr.length];
		
		
		for (int i = 0; i < numArr.length; ++i) {
			for (int j = 0; j < numArr[i].length; ++j) {
				numArr[i][j] = (int)(Math.random() * 101);
				System.out.printf("numArr[%d]: %d \n", i, numArr[i][j]);
				sum[i] += numArr[i][j];
				
				
			}
			int average = sum[i] / numArr.length;
			System.out.printf("numArr[%d]의 합은 %d 입니다.\n", i, sum[i]);
			System.out.printf("numArr[%d]의 합의 평균은 %d 입니다.\n\n", i, average);
			
		}
		 
		 
		 */
		/*
		//3
		int[] row = new int[numArr.length];
		
		for (int i = 0; i < numArr.length; ++i) {
			for (int j = 0; j < numArr[i].length; ++j) {
				row[i] += numArr[i][j];
				
				continue;
				
				
			}
		
		System.out.printf("%d행의 합은 %d입니다\n", i, row[i]);
		}
		
		//4
		int[] row = new int[numArr.length];
				
				for (int i = 0; i < numArr.length; ++i) {
					for (int j = 0; j < numArr[i].length; ++j) {
						row[i] += numArr[i][j];
						
						continue;
						
						
					}
				
				System.out.printf("%d행의 합은 %d입니다\n", i, row[i]);
				}
		*/		
		//1 
		for (int row = 0; row < numArr.length; ++row) {
			for (int column = 0; column < numArr[row].length; ++column) {
				numArr[row][column] = (int)(Math.random() * 101);
				
			}
		}
		
		//2
		int sum = 0;
		int count = 0;
		for (int row = 0; row < numArr.length; ++row) {
			int len = numArr[row].length;
			count += len;
			for (int column = 0; column < len; ++column) {
				System.out.print(numArr[row][column] + "\t");
				sum += numArr[row][column];
				
				
				
				
			}		
			System.out.println();
		}		
		System.out.printf("총합: %d, 평균: %.2f\n", sum, sum / (double)count);	
		
		
		//3
		int[] rowSum = new int[numArr.length];
		
		for (int row = 0; row < numArr.length; ++row) {
			for (int column = 0; column < numArr[row].length; ++column) {
				rowSum[row] += numArr[row][column];// if 문으로 풀어서 써보자 이해하기 위해 ㅋㅋ 이미 똑같이 풀었음
				
				
		
			}
		}
		
		//4
		int max_len = 0;
		
		for (int row = 0; row < numArr.length; ++ row) {
			max_len = Math.max(max_len, numArr[row].length);
			// Math.max(a, b);는 a, b 중에서 더 큰값을 골라준다
		}
		int[] colSum = new int[max_len];
		
		for (int row = 0; row < numArr.length; ++row) {
			for (int column = 0; column < numArr[row].length; ++column) {
				colSum[column] += numArr[row][column];
			}
		}
		
		// 배열을 편리하게 문자열로 변환하기
		System.out.println("행의 합: " + java.util.Arrays.toString(rowSum));
		System.out.println("열의 합: " + java.util.Arrays.toString(colSum));
		
		
		
	}

}








