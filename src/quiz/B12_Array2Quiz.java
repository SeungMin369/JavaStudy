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
		
		//1. numArr�� ��� ���� 0~100 ������ ���� ������ �ٲ㺸����
		
		//2. �������� �ٲ� numArr�� ��� ���� ����ϰ� ���հ� ���(�Ҽ��� ��° �ڸ�)�� ���ؼ� ����غ�����
		
		//3. numArr�� �� ��(row)�� ���� ��� ���ؼ� ����غ�����
		
		//4. numArr�� �� ��(column)�� ���� ��� ���ؼ� ����غ�����
		
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
			System.out.printf("numArr[%d]�� ���� %d �Դϴ�.\n", i, sum[i]);
			System.out.printf("numArr[%d]�� ���� ����� %d �Դϴ�.\n\n", i, average);
			
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
		
		System.out.printf("%d���� ���� %d�Դϴ�\n", i, row[i]);
		}
		
		//4
		int[] row = new int[numArr.length];
				
				for (int i = 0; i < numArr.length; ++i) {
					for (int j = 0; j < numArr[i].length; ++j) {
						row[i] += numArr[i][j];
						
						continue;
						
						
					}
				
				System.out.printf("%d���� ���� %d�Դϴ�\n", i, row[i]);
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
		System.out.printf("����: %d, ���: %.2f\n", sum, sum / (double)count);	
		
		
		//3
		int[] rowSum = new int[numArr.length];
		
		for (int row = 0; row < numArr.length; ++row) {
			for (int column = 0; column < numArr[row].length; ++column) {
				rowSum[row] += numArr[row][column];// if ������ Ǯ� �Ẹ�� �����ϱ� ���� ���� �̹� �Ȱ��� Ǯ����
				
				
		
			}
		}
		
		//4
		int max_len = 0;
		
		for (int row = 0; row < numArr.length; ++ row) {
			max_len = Math.max(max_len, numArr[row].length);
			// Math.max(a, b);�� a, b �߿��� �� ū���� ����ش�
		}
		int[] colSum = new int[max_len];
		
		for (int row = 0; row < numArr.length; ++row) {
			for (int column = 0; column < numArr[row].length; ++column) {
				colSum[column] += numArr[row][column];
			}
		}
		
		// �迭�� ���ϰ� ���ڿ��� ��ȯ�ϱ�
		System.out.println("���� ��: " + java.util.Arrays.toString(rowSum));
		System.out.println("���� ��: " + java.util.Arrays.toString(colSum));
		
		
		
	}

}








