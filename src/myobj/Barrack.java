package myobj;

public class Barrack {
	
	final int MAX_QUEUE_SIZE = 5;
	Unit[] queue;
	int queue_index;
	
	Barrack() {
		queue = new Unit[MAX_QUEUE_SIZE];
	}
	boolean checkMaxQueue() {
		return queue_index == MAX_QUEUE_SIZE;
	}
	void createSheep() {
		if (checkMaxQueue()) {
			System.out.println("���� ��⿭�� ���� á���ϴ�! ���� ������ �� �����ϴ�");
			return;
			// void�Լ��� return�� �� �� �ִ�
			// ȣ���� ���� ���� ���������� �ʰ� �Լ��� �����Ѵ�.
		}
		queue[queue_index++] = new Unit("��", 5);
	}
	void createcow() {
		if (checkMaxQueue()) {
			System.out.println("���� ��⿭�� ���� á���ϴ�! �Ҹ� ������ �� �����ϴ�");
			return;
			// void�Լ��� return�� �� �� �ִ�
			// ȣ���� ���� ���� ���������� �ʰ� �Լ��� �����Ѵ�.
		}
		queue[queue_index++] = new Unit("��", 7);
	}
}