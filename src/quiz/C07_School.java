package quiz;

/*
	 	1. �� ���� ������ 30���̴�.
	 	
	 	2-1. ���α׷��� �� �л����� ������ ����, ����, ����, ���α׷��� ���, �˰���, �ڷᱸ�� ������ �ִ�
	 	
	 	2-2. ��Ʈ��ũ �� �л����� ������ ����, ����, ������, ��Ʈ��ũ, CCNA ������ �ִ�
	 	
	 	2-3. �ӽŷ��� �� �л����� ������ ����, ����, ����, �����, ���α׷��� ��� ������ �ִ�
	 	
	 	3. ��� �л��� ������ �̸��� �������� �����Ѵ�.
	 	   �й��� �ߺ����� ���������� �����Ǿ�� �Ѵ�. (�Ǵ� �ߺ����� ������ ����)
	 	   
	 	4. ����ǥ �޼��带 ���� �� �л��� �̸�/����/��������� �� �� �־�� �Ѵ�.

 */
abstract public class C07_School {
	public static void main(String[] args) {
		Programming a = new Programming("�Ѹ�", "���α׷��ְ�");
		Programming b = new Programming("�Ѹ�2", "���α׷��ְ�2");
		Programming c = new Programming("�Ѹ�3", "���α׷��ְ�3");
		
		
		System.out.println("�Ѹ��� �˰��� ����: " + a.algorithm);
		System.out.println("�Ѹ��� �й�: " + a.Student_ID);
		a.grade_card();
		
		
	}
	
	String name;
	String department;
	final int max_personnel = 30;
	final int personnel[] = new int[max_personnel];
	int cueue = 0;
	int personnel_index[];
	
	boolean maxCheck = personnel_index[cueue] == personnel[max_personnel];
	
	int Student_ID = 20210000 + (int)(Math.random() * 10000);
	
	int random = (int)(Math.random() * 101);
		
	abstract void grade_card();
		
	
}

class Programming extends C07_School {

	Programming(String name, String department) {
		if (maxCheck) {
			System.out.println("������ ����á���ϴ�.");
			return;
		}
		this.name = name;
		this.department = department;
		cueue++;
		
	}
	
	
	
	
	
	int language = random;
	int english = random;
	int math = random;
	int programming_language = random;
	int algorithm = random;
	int data_structure = random;
	
	int sum = language + english + math + programming_language + algorithm +
			data_structure;
	
	int average_score = (language + english + math + programming_language + algorithm +
			data_structure) / 6;
	@Override
	void grade_card() {	
		System.out.printf("�̸�: %s, ����: %d, �������: %d", name, sum, average_score);
	}
		
}

class Network extends C07_School  {

	Network(String name, String department) {
		if (maxCheck) {
			System.out.println("������ ����á���ϴ�.");
			return;
		}
		this.name = name;
		this.department = department;
		cueue++;	
	}
	
	
	
	
	int language = random;
	int english = random;
	int linux = random;
	int network = random;
	int CCNA = random;
	
	int sum = language + english + linux + network + CCNA;
	int average_score = (language + english + linux + network + CCNA) / 5;		
	
	@Override
	void grade_card() {
		System.out.printf("�̸�: %s, ����: %d, �������: %d", name, sum, average_score);	
	}
	
}

class Machine_learning extends C07_School {

	Machine_learning(String name, String department) {
		if (maxCheck) {
			System.out.println("������ ����á���ϴ�.");
			return;
		}
		this.name = name;
		this.department = department;
		cueue++;
	}
	
	
	
	
	int language = random;
	int english = random;
	int math = random;
	int statistics = random;
	int programming_language = random;
	
	int sum = language + english + math + statistics + programming_language;
	int average_score = (language + english + math + statistics + programming_language) / 5;
	@Override
	void grade_card() {
		System.out.printf("�̸�: %s, ����: %d, �������: %d", name, sum, average_score);
	}
	
}





















