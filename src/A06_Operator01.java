
public class A06_Operator01 {
	public static void main(String[] arge) {
		/* 
		 * 	# ������ (Operator)
		 * 		- ����� �� ����ϴ� ��
		 * 		- +, -, *, / ...\
		 * 	
		 * 
		 * 
		 */
		
		// # ��� ������
		
		int a = 10, b = 7;
		double c = 7.0;
		
		System.out.println("a + b : " + (a + b));
		System.out.println("a - b : " + (a - b));
		System.out.println("a * b : " + a * b);
		
		// ���� ������ ������ �� ���´�
		// ��Ȯ�� ����� ���Ѵٸ� double�� �տ� ���´�
		System.out.println("a / b : " + a / b);
		System.out.println("a / c : " + a / c);// ���� ������ �Ҽ��� �Ҽ��� ���´�.
		System.out.println("a / (double)b : " + a / (double)b);// �Ҽ������� ���´�.
		System.out.println("(double)a / b : " + (double)a / b);
		
		// ������ ���� % / �� ����
		System.out.println("b ������ a�� �ϸ� ��������? : " + b % a);// �ȳ������� ������ 7�� ����
		
		// ^�� ������ �ƴϴ� (���� �������� �Ӻ���� �Ҷ� ����)
		System.out.println(10 ^ 2);
		System.out.println(10 ^ 3);
		System.out.println(10 ^ 4);
		
		//Math.pow(a, b) : a�� b������ ����Ͽ� ��ȯ���ִ� �Լ�
		System.out.println(Math.pow(10, 2));// Ŀ���÷����� �� �տ� �����°��� � Ÿ������ ��ȯ�Ǵ����� ����//void�� ���ٴ¶�
		System.out.println(Math.pow(10, 3));
		System.out.println(Math.pow(10, 4));
		//Math.sqrt(a) : a�� �������� ���ؼ� ��ȯ�Ѵ�
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(12));
		
		//Math.abs(a) : a�� ���밪�� ���ؼ� ��ȯ�Ѵ� // ������ ���
		System.out.println(Math.abs(-123.12345));
		
		//Math.round(a) : a�� �Ҽ� ù° �ڸ����� �ݿø��� ����� ��ȯ�Ѵ� // ������
		System.out.println(Math.round(123.5678));
		
		//Math.round()�� ���ϴ� �ڸ������� �ݿø��ϱ�
		// - �ݿø��ϰ� ���� �ڸ��� �Ҽ� ù�� �ڸ��� ���鸸ŭ ���� �� �ٽ� ������
		System.out.println(Math.round(123.5678 * 1000) / 1000.0);// .0�� ���̸� 1000�� 1000.0���� �������� �Ҽ��� �ٲ�
		System.out.println(Math.round(123.5678 * 100) / 100.0 );// �� ������ double ������ �Ѵ�.
		
		//max_len = Math.max(max_len, numArr[row].length);
		// Math.max(a, b);�� a, b �߿��� �� ū���� ����ش�
		//int max = num1 > num2 ? num1 : num2;// Math.max(num1, num2);
		//int min = num1 < num2 ? num1 : num2;// Math.max(num1, num2);

	}
		


}







