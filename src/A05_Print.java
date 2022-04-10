
public class A05_Print {
	public static void main(String[] args) {
		
		/*
		 * 	# �ֿܼ� ����ϴ� �Լ���
		 * 
		 *  1. print()
		 *  	- ���� �ڵ����� �ٲ����� �ʴ� ���� �⺻ ��� �Լ�
		 *  
		 *  2. prontln()
		 * 		- ���� �ڵ����� �ٲ��ָ� ����ϴ� �Լ�
		 * 		-()�� ������ ������ �� �ڿ� '\n' �� �߰��Ͽ� ����Ѵ�
		 * 		-()�� �ƹ��͵� �������� ������ '\n'�� ����Ѵ�
		 * 
		 */
		System.out.print("Hello!\n");
		System.out.print("Hello!\n");
		System.out.print("Hello!\n");
		
		System.out.print("���: "); // �ٸ� ��ĭ �������
		System.out.println("apple");
		
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
		
		/*	3. printf()
		 * 	- ������ �̿��� ���ϴ� ���¸� ���� ����� ����ϴ� �Լ�
		 *  - ����� ���¸� �̸� �����, ���� ���� �ڸ��� ���� ������� ä���� ����Ѵ�
		 *  - ���ڿ��� +�� �̾���̴� ��ĺ��� ���� ��쿡 ����Ѵ�
		 *  - ���� �ڵ����� �ٲ����� �ʴ´�
		 *  
		 *  # ���� ������ ����
		 *  %d : �ش� �ڸ��� ������ ���� ���� 10������ ������ش�(decimal)
		 *  %x, %X : �ش� �ڸ��� ������ �������� 16������ ������ش� (hexa decimal)
		 *  %s : ���ڿ�
		 *  %c : ����
		 *  %f : �Ǽ�
		 *  
		 *  //�� ������ �������ߴ�.
		 *  
		 *  
		 *  
		 *  
		 */
		  
		 int year = 2021, month = 5, day = 10,
				hour = 15, minute = 50, second = 13;
		 
		 System.out.print(year + "��" + month + "��" + day + "��");
		 System.out.println(hour + ":" + minute + ":" + second);
		 
		 System.out.printf("%d�� %d�� %d��\t%d:%d:%d\n",
				 year, month, day, hour, minute, second);
		 

		 System.out.printf("%d�� 10������ ����ϸ� %d�Դϴ�.\n", year, year);
		 System.out.printf("%d�� 10������ ����ϸ� %o�Դϴ�.\n", year, year);
		 System.out.printf("%d�� 10������ ����ϸ� %x�Դϴ�.\n", year, year);
		 System.out.printf("%d�� 10������ ����ϸ� %X�Դϴ�.\n", year, year);
		 
		 /*
		  *  * ���� ���� �ɼǵ�
		  *  	1. %����d, %����s ...
		  *  	- �ڸ����� ���ڸ�ŭ Ȯ���ϸ鼭 ����Ѵ�
		  *    	2 %-����d, ...
		  *     - �ڸ��縦 ���ڸ�ŭ Ȯ���ϸ鼭 ���� �����Ͽ� ����Ѵ�
		  *     3. %0����d
		  *     - �ڸ����� ���ڸ�ŭ Ȯ���ϰ� ��ĭ�� 0�� ä�� ����Ѵ�
		  *     4. %+d
		  *     - ��� �տ��� ��ȣ�� �ٿ��� ����Ѵ�
		  *     5. %.����f
		  *     - �Ҽ��� �ڸ����� �����Ѵ�
		  * 
		  */
		 
		 System.out.printf("%20d\n", 2000);
		 System.out.printf("%-10s: %d\n", "Price", 15000);
		 System.out.printf("%-10s: %d\n", "Income", 15000);
		 System.out.printf("%-15s: %d\n", "Calorie", 15000);
		 System.out.printf("%-15s: %d\n", "Tax", 150000);
		 
		 System.out.printf("%02d\n", 1);
		 System.out.printf("%02d\n", 2);// 0�� ä���� ���������.
		 System.out.printf("%02d\n", 11);
		 System.out.printf("%02d\n", 15);
		 
		 System.out.println("-------------------------------------");
		 

		 System.out.printf("%+d\n", -50);// -���� �������ʴ´�.
		 System.out.printf("%+d\n", 50);//+�� �������ν� ������� ��ȣ�� ����
		 // ��� �ɼǵ��� ��� ������ �����ϴ�(��ġ�� ������ �ȵȴ�)
		 System.out.printf("%0+20.5f\n", 123.1234567);
		 System.out.printf("%.4f\n", 123.1234567);
		 System.out.printf("%.3f\n", 123.1234567);
		 System.out.printf("%.2f\n", 123.1234567);// �ڸ����� ���缭 �ݿø��� ����.
		 System.out.printf("%.1f\n", 123.1234567);
		 System.out.printf("%.0f\n", 123.1234567);
		 System.out.printf("%300f\n", 123.1234567);
		 
		 // ����
		 System.out.printf("%-5s\n" , 20);
		 System.out.printf("%+5d" , 20);
		 
		
		 
		 
		 
		 
		 
		  
		  
		
		
		
		
	}

}
