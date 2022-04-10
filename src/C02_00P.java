
public class C02_00P {
	/*
	  	# ��ü���� ���α׷��� (OOP: Object Oriented Programming)
	  	
	  	- ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
	  	- ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ� 
	  	  ���ǿ� �����ϴ� ��ü ������ ��� ǥ���Ͽ� �������� �ø���
  	  	- ��ü (Object) : ���� �����ϴ� ��� �� (�繰, ����, ... ���)
  	  	
  	  	
  	  		ex: ���
  	  		 - ����� ���� : ũ��, �絵, ����, Į�θ�, �������, ��� ...
  	  		 - ����� �޼��� (������ ��ȭ��Ű�� �͵�)
  	  		 	�Դ´� (ũ�Ⱑ �پ��鼭 Į�θ���ŭ ���� ����� Į�θ� ����)
  	  		 	���� ���Ѵ�
  	  		 	��������� �پ���
  	  		 	������ (ũ�⸸ŭ�� �������� ������)
  	  		 	���� �����Ѵ� (��������� ������ �����Ѵ�)
  	  		 	
  		 	�� Ŭ������ ���� �ִ� �Լ����� �޼����� �θ��� ( JAVA���� �޼��� �ۿ� ����)
  		 	
	 	# Ŭ���� (Class)
	 	
	 	 - ��ü�� ���α׷��� ���� ǥ���� ��
	 	 - Ŭ������ �ش� ��ü�� ���赵�̴� (������ ���������� ��ü�� ����)
	 	 - ���赵��� ���� ���� ��ü�� '�ν��Ͻ�'��� �θ���
	 	 - Ŭ������ ������ ���� Ÿ���̴�
	 	 
	 	 
	 	 
	 	 
	 */
	// main�� �ݵ�� public class ���ο� �����ؾ� �Ѵ�.
	// (���� �̸��� �Ȱ��� �̸��� Ŭ������ �����ؾ� ã�� �� �ִ�)
	public static void main(String[] args) {
		Window window1 = new Window();
		Window w2 = new Window();
		Window w3 = new Window();
		
		w3.status();
		
		w2.open();
		w2.status();
		
		
		window1.open();
		window1.close();
		window1.lock();
		
		window1.status();
		
		String status = window1.getStatus();
		System.out.println("������ ���� ���ڿ��� ���. " + status);
		
		
		
		
		// new �� ���� �ν��Ͻ��� ����
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		a1.size  = 15;
		a1.color = "������";
		
		a2.size = 13;
		a2.color = "�����";
		
		a3.size = 25;
		a3.calorie = 100;
		
		System.out.println(a1.color);
		System.out.println(a2.color);
		
		System.out.println("�Ա� �� a3�� ũ��: " + a3.size);
		System.out.println("�Ա� �� a3�� Į�θ�: " + a3.calorie);
		
		a3.eat();
		
		System.out.println("���� �� a3�� ũ��: " + a3.size);
		System.out.println("���� �� a3�� Į�θ�: " + a3.calorie);
		
		Coffee c1 = new Coffee();
		Coffee c2 = new Coffee();
		
		c1.size = 20;
		c1.bitter = 50;
		c1.ice = 40;
		c1.origin = "Columbia";
		
		c2.size = 20;
		c2.bitter = 30;
		c2.ice = 30;
		c2.origin = "Arabica";
		
		System.out.println("�Ա� �� c1�� ������: " + c1.ice);
		System.out.println("�Ա� �� c1�� ����: " + c1.bitter + "%");
		
		c1.time();
		
		System.out.println("���� �� c1�� ������: " + c1.ice);
		System.out.println("���� �� c1�� ����: " + c1.bitter + "%");
		
		System.out.println("�Ա� �� c2�� ������: " + c2.ice);
		System.out.println("�Ա� �� c2�� ������: " + c2.size);
		
		c2.eat();
		
		System.out.println("���� �� c2�� ������: " + c2.ice);
		System.out.println("���� �� c2�� ������: " + c2.size);
		
	}
	
	
	
	
	
}
class IceCream { //Ŭ������ �ȸ���� ��û ���������� �ϳ��ϳ� �迭�� ����ϰ� 
	String flaver;
	String color;
	int price;
	int calorie;
	String product;
	String type;
}



class Apple{
	/* 
	  # �ν��Ͻ� ����
	  
	  	- Ŭ���� ���ο� ������ ����
	  	- �ν��Ͻ� ���� ������ ������ ������ �ִ� ������
	  	- aka. �ʵ�, �Ӽ�, ��� ����, ���, ���� ...
	*/
	int size;
	double sweet;
	String color;
	int calorie;
	/*
	  	# �ν��Ͻ� �޼���
	  	
	  	 - �ν��Ͻ� ������ ���� �ش� �ν��Ͻ��� ���¸� ��ȭ��Ű�� �޼���
	*/
	void eat() {
		size--;
		calorie -= 10;
	}
}	
	
/*
   �������� : ������ ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ �� �ν��Ͻ��� �����ϰ� ���� ä����� ����غ�����
   
   �� �ν��Ͻ� ������ 3�� �̻�, �ν��Ͻ� �޼��� 2�� �̻�, ���� ����
 */

class Coffee{ // Ŭ�������� �빮�ڷ� �����Ѵ�
	int size;
	int ice;
	double bitter;
	String origin;
	
	void time() { // �ν��Ͻ� �޼������ �ҹ��ڷ� �����Ѵ�
		ice -= 2;
		bitter--;
	}
	void eat() {
		size--;
		ice--;
	}
		
	
	
	
}

class Window {
	boolean open;
	boolean lock;
	double width;
	double height;
	
	void open() {
		open = true;
	}
	void close() {
		open = false;
	}
	void lock() {
		lock = true;
	}
	void unlock() {
		lock = false;
	}
	void status() {
		System.out.printf("�� â���� %s. %s", 
				open ? "�����ֽ��ϴ�." : "����ֽ��ϴ�.", 
				lock ? "����ֽ��ϴ�." : "������������Դϴ�.");
	}
	String getStatus() {
		//String.format() : ������ �̿��� ���ϴ� ���ڿ��� �����Ѵ�
		
		return String.format("�� â���� %s. %s", 
				open ? "�����ֽ��ϴ�." : "����ֽ��ϴ�.", 
				lock ? "����ֽ��ϴ�." : "������������Դϴ�.");
	}
	
	
	
}
	
	









