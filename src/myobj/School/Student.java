package myobj.School;
/*
	1. �� ���� ������ 30���̴�.
	
	2-1. ���α׷��� �� �л����� ������ ����, ����, ����, ���α׷��� ���, �˰���, �ڷᱸ�� ������ �ִ�
	
	2-2. ��Ʈ��ũ �� �л����� ������ ����, ����, ������, ��Ʈ��ũ, CCNA ������ �ִ�
	
	2-3. �ӽŷ��� �� �л����� ������ ����, ����, ����, �����, ���α׷��� ��� ������ �ִ�
	
	3. ��� �л��� ������ �̸��� �������� �����Ѵ�.
	   �й��� �ߺ����� ���������� �����Ǿ�� �Ѵ�. (�Ǵ� �ߺ����� ������ ����)
	   
	4. ����ǥ �޼��带 ���� �� �л��� �̸�/����/��������� �� �� �־�� �Ѵ�.

*/

abstract public class Student {
	
	final static int MAX_SCORE = 100;
	
	static String[] lastNameArray = {"��", "��", "��", "��", "��", "��", "��", "��",
			"��", "����", "����", "��", "��", "��", "��", "��", "��", 
			"��", "��", "��", "��", "��"};
	
	static String[] firstNameArray = {
			"��ȯ", "�Ǽ�", "����", "����", "õ��", "�ҿ�", "��ö", "�¸�",
			"����", "�¹�", "����", "����", "��ȣ", "�ѳ�", "����", "�ν�",
			"����", "��ȣ"
	};
	
	static String generateRandomName() {
		return lastNameArray[(int)(Math.random() * lastNameArray.length)]
				+ firstNameArray[(int)(Math.random() * firstNameArray.length)];
	}
	
	static int generateRandomScore() {
		return (int)(Math.random() * MAX_SCORE + 1);
	}
	
	String name;
	int kor;
	int eng;
	
	public Student() {
		name = generateRandomName();
		kor = generateRandomScore();
		eng = generateRandomScore();
	}
	
	abstract public void printGradeCard();
	
	public String getname() {
		return name;
	}
}



















