import java.util.Scanner;// *�� ���� �ҷ��� �� ������ ��ȿ�����̴�

public class A08_Scanner {
	public static void main(String[] arge) {
		
		
	
		/*
			   # java.util.Scanner Ŭ���� // �빮�ڰ� ������ Ŭ�������� �� �� �ִ�
			   	- ���α׷��� �ܺηκ��� �Է��� ���� �� �ִ� ��ɵ��� �̸� �����Ǿ� �ִ� Ŭ����
			   	- ��𿡼� �Է��� ������ ������ �ڿ� �پ��� ������ �Է¹��� �� �ִ�
			   	- �ַܼκ��� �Է¹ް� ���� ���� System.in�� ����Ѵ�
		 */
			
			Scanner sc = new Scanner(System.in); //sc�� ���λ����� ��ĳ�ʸ� ��´ٴ¶� System�� �ý��ۿ��� �Է¹޴´ٴ� ��
			//- new�� ���ο� ��ĳ�ʸ� ������ �� ����Ѵ�
			//- new �� �� ��ĳ�ʿ� ������ �Է����(ImputStream)�� ����ϴ� ��ĳ�ʸ� �����Ѵ�
			//- System.in���κ��� �Է¹޴� ���ο� ��ĳ�ʸ� �ϳ� �����Ѵ�
			// Scanner Ÿ�� ���� sc�� ������ ��ĳ�ʸ� ��� ���´�
			
	
			/* # Scanner Ŭ������ nextint()
				  -  �������� ������ ������ �ϳ� ������
				  -  ��ĳ�ʿ� ���� ���� �ƹ��͵� ���� ���� ���缭 �Է��� ��� ��ٸ���	
				- ������ �Է¹޾ƾ� �Ѵ�
			*/ 
			System.out.print("��� � �ʿ��ϼ���? ");
			int num = sc.nextInt();
			
			System.out.println(num * 500 + "�� �Դϴ�.");
			
			// �Ǽ��� �Է¹��� ���� nextDouble()�� ����Ѵ�
			System.out.print("�̹����� �Ҽ��� �Է��غ����� >>");
			double d = sc.nextDouble();
			
			
			System.out.println("�Է��� �Ҽ��� %.5f�Դϴ�");
			
			// ���ڿ��� �ƴ� ���� �Է¹��� ��ĳ�ʿ��� '\n'�� �����ְ� �ȴ�
			sc.nextLine(); // ��ĳ�ʿ� �����ִ� '\n' ����
			
			//���ڿ��� �Է¹��� ���� next() �Ǵ� nextLine()�� ����Ѵ�
			//next()�� ��� ������ �������� �Է¹ް�
			//nextline()�� '\n'�� �������� �Է¹޴´�
			System.out.print("�̹����� ���ڿ��� �Է��غ����� >> ");
			String str = sc.nextLine();
			
			System.out.println("��� : " + str);
			
		
			
			
			
			
			
			
			
	}
	
}







		
