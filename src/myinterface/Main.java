package myinterface;

public class Main {

	public static void main(String[] args) {
		//vehicle �������̽��� ������ ���𰡸� ����� �׽�Ʈ�غ�����
		Bus bus = new Bus();
		
		test(bus);
		
		SeungMin yoo = new SeungMin();
		
		test1(yoo);
		
		
	}
	
	

	public static void test(Vehicle vehicle) {
		for  (int i = 0; i < 100; ++i) {
			System.out.println("�ӵ��� �� �½��ϴ�.");
			System.out.println("���� �ӵ��� " + vehicle.acceleration() + "km/h �Դϴ�.");
		}
		
		System.out.println("�������� �ӵ��� �����մϴ�.");
		for (int i = 0; i < 30; ++i) {
			System.out.println("���� �ӵ��� " + vehicle.deceleration() + "km/h �Դϴ�.");
		}
		
		for (int i = 0; i < 15; ++i) {
			if (!vehicle.ride()) {
				System.out.println("�� �̻� Ż �� �����ϴ�.");
			} else {
				System.out.println("�Ѹ��� �� �����ϴ�.");
			}
		}
	}
	
	public static void test1(Human human) {
		for (int i = 0; i < 20; ++i) {
			System.out.println("�ð��� ������ Ű�� ũ�� �����԰� �þ�ϴ�");
			System.out.println("���� ����: " + human.age() + "���� Ű: " + human.height() + 
					"���� ������: " + human.weight());			
		}
		
		for (int i = 0; i < 45; ++i) {
			System.out.println("��� �ؼ� ������" + human.muscle() + "kg ������ϴ�.");
		}
	}
	
	public static void gullit(FootballPlayer st) {
		System.out.println("����Ʈ�� ��ȭ�Ͻðڽ��ϱ�?");
	}
	
}
















