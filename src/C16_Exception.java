import java.util.InputMismatchException;
import java.util.Scanner;

public class C16_Exception {
	/*
	  	# ���� (Exception)
	  	
	  	- �츮�� ������� �˰� �ִ� ���� �۾����� ��� ���ܶ�� �θ���
	  	- �ڹ��� ������ Ʋ���� ���� ���ܰ� �ƴ϶� ������ ������� �θ��� (��Ÿ ��)
	  	- ���α׷��Ӱ� �߻� ������ ���ܸ� �̸� �����ϰ� ����صδ� ���� ����ó����� �θ���
	  	- ����ó���� �⺻ ������ ���α׷� �������������� ���α׷��Ӱ� �ٸ� ��ġ�� ���Ѵٸ�
	  	  ���α׷��� ����ؼ� ������ �� �ִ�
	  	  
  	  	# ���� ó�� ����
  	  	
  	  	- ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 try�� ���ο� ���Խ�Ų��
  	  	- try�� ������ �ڵ忡�� ���ܰ� �߻����� ������ ��� ���� ����ȴ�
  	  	- try�� ���ο��� ���ܰ� �߻��ϴ� ��� ������ �ߴ��ϰ� �߻��� ���ܸ� ����ϴ� 
  	  	  catch������ �Ѿ�� �ȴ�
  	  	- catch������ �߻��� ���ܿ� ���� ������ ����ִ� ���� �ν��Ͻ��� ���޵ȴ�
  	  	- catch���� ��ø�ؼ� ������ ����� �� �ִ�
  	  	- ���ܰ� �߻��ϵ� ���ϵ� ������ �����ϰ� ���� �ڵ�� finally���� �ۼ��Ѵ�
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] values = new int[5];
		
		// ����ó�� ��Ÿ�� 2���� (�� �� �� 1)
		// 1. if���� ����������
		// 2. ����ó��
		try {
			int a = sc.nextInt();
			System.out.println(10/0);
			System.out.println("�ݵ�� 10���� ������ �Է����ּ��� ^^");
			System.out.println(values.length);
		} catch(ArithmeticException e) {
			//Exception.printStackTrace(): ���ܰ� �߻��� ������ ���� ����� ����ϴ� �޼���
			e.printStackTrace();
			System.out.println(e);
			System.out.println("���� �ȵǴ� ����� �ϼ̳׿�. �������ʹ� �׷���������. �����������");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�ִ� �ε����� ���̺��� 1�۽��ϴ�!!");
		} catch (InputMismatchException e) {
			System.out.println("�ݵ�� 10���� ������ �Է��϶�� ���ݾ�");
		} finally {
			System.out.println(" /)/)");
			System.out.println("( ..)");
			System.out.println("( >��)");
			System.out.println("Have a Good Time.");
		}
		
		
		System.out.println("Hello!1");
	}
}
