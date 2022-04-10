package quiz;

public class C01_FunctionQuiz2 {
	/*
	 	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	 	
	 	1. �ִ밪�� �Ű������� ���޹�����
	 	   0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	 	   range �Լ��� ��������
	 	   
	 	   range(10)�� ��� -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	 	   
 	   	2. �ּҰ��� �ִ밪�� �Ű������� ���޹�����
   		   �� ���̿� �����ϴ� ��� �������� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
   		   range �Լ��� ��������
   		   
   		   range(5, 10)�� ��� -> [5, 6, 7, 8, 9]
   		   
   		3. �ּҰ��� �ִ밪�� �������� �Ű������� ���޹�����
   		   �ּҰ����� �ִ밪 �̸����� ��������ŭ �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
   		   range �Լ��� ��������
   		   
   		   ex: range(40, 50, 3)�� ��� -> [40, 43, 46, 49]
   		   	   range(40, 45, 5)�� ��� -> [40]
	 */
	/*
	 	# �Լ� ���ٷε�(overloading)
	   		-�Ű������� ���� �Ǵ� Ÿ���� �ٸ��� �Ȱ��� �Լ����� ����� �� �ִ�
	   		�׷��� ������ ���� range�� ��밡���� �Ű������� ���� �ٸ��� ����
	 */
	 //  println()���� �پ��� Ÿ�Ե��� �����ε��� �����Ѵ�
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
	// 1. ����� ���� ���� �Ȱ���
	
	
	/*2 �ּҰ��� �ִ밪�� �Ű������� ���޹�����
	   �� ���̿� �����ϴ� ��� �������� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
	   range �Լ��� ��������
	   
	   range(5, 10)�� ��� -> [5, 6, 7, 8, 9]
	*/
	public static int[] range2(int num, int num1) {
		
		int[] num2 = new int[num1 - num];
		
		for (int i = 0; i < num1 - num; ++i) {
			num2[i] = num + i;
		}
		return num2;
	}
	//2. ����� ���� ������ �ٸ��� ������ �����°͵� �����ߴ�
	public static int[] range(int start, int end) {
		int increase = start > end ? -1 : 1;
		int [] arr = new int[increase < 0 ? start - end : end - start];
		for (int value = start, index = 0; value != end; value += increase) {
			arr[index++] = value;
		}
		return arr;
	}
	
	/*
	  3. �ּҰ��� �ִ밪�� �������� �Ű������� ���޹�����
   		   �ּҰ����� �ִ밪 �̸����� ��������ŭ �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
   		   range �Լ��� ��������
   		   
   		   ex: range(40, 50, 3)�� ��� -> [40, 43, 46, 49]
   		   	   range(40, 45, 5)�� ��� -> [40]
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
	//3. ����Թ��� �̻��� ���� ���� ��� �ߴ� �� ���߰�
	/**
	  ����ȭ �ּ� (�� ��ɿ� ���� ������ �� �� �ִ�)
	  @start 
	  	�����ϴ� ���� ��������
  	  @end 
  	  	������ ���� ��������
  	  @return
  	  	�߸��� ���� �Է��ϸ� null�� ������, ����� �����ø� int[]�� ���ɴϴ�
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














