import java.util.Scanner;

public class A09_Operator02 {
	
	public static void main(String[] arge) {
		/* -
		 * 		#�� ������
		 * 
		 * 		- �� ���� ���ϴ� ����
		 * 		- �� ������ ����� boolean Ÿ���̴� (�� �Ǵ� ����)
		 * 		- ��� ����� �� ������ �Բ� ������ ��� ������ ���� ����Ѵ�
		 *      -
		 * 
		 * 
		 * 
		 * 
		 */
		
		int a = 10, b = 7;
		
		System.out.println(a > b);
		System.out.println(a < b);
		// �ݵ�� �ε�ȣ�� ���� ���;��� (��ȣ�� ���������� �ȵ�)
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		System.out.println(a == b); // �� ���� ���� ������ true
		System.out.println(a != b); // �� ���� ���� �ٸ��� true
		
		
		/*
		  	# �� ������
		  	
		  	 - boolean Ÿ�� ������ �ϴ� ����
		  	 - �� ����� �� ������ �Բ� ������ �� ������ ���� ����Ѵ�
		  	 - && : �� ���� ���� ��� true�� ���� true(and)
		  	 - || : �� ���� �� �� �ϳ��� true���� true(or)
		  	 - ! : true�� false, false�� true(not)
		 */
		System.out.println("trur && true : " + (true && true));
		System.out.println("trur && false : " + (true && false));
		System.out.println("false && true : " + (false && true));
		System.out.println("false && true : " + (false && false));
		
		System.out.println("trur || true : " + (true || true));
		System.out.println("trur || false : " + (true || false));
		System.out.println("false || true : " + (false || true));
		System.out.println("false || false : " + (false || false));
		
		System.out.println(!true);
		System.out.println(!false); //   ����ǥ�� �׳� ����
		
		int c = 53; 
		System.out.println("c�� ¦���ΰ���? ");
		System.out.println(c % 2 == 0);// ��������� ���� �۵��ϱ� ������ ��ȣ�� ĥ �ʿ䰡 ����
		
		System.out.println("c�� Ȧ���ΰ���? ");
		System.out.println(c % 2 == 1);
		
		System.out.println("c�� ¦���̸鼭 50���� ū����?");
		System.out.println(c % 2 == 0 || c > 50);
		
		// ��������: ���� x, y, z�� ��� 3�� ����� �ƴ� �� true�� �Ǵ� �� ������ ��������
		
		int x = 3, y = 7, z = 10;
		
		System.out.println(x % 3 != 0 && y % 3 != 0 && z % 3 != 0);// 3���� ������ �տ��� ������
		
		System.out.println(!(x % 3 ==0 || y % 3 ==0 || z % 3 == 0));
				
		
		
		
		
		

	}
	
}
		  
		
		
