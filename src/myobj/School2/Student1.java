package myobj.School2;
/*
1. �� ���� ������ 30���̴�.

2-1. ���α׷��� �� �л����� ������ ����, ����, ����, ���α׷��� ���, �˰���, �ڷᱸ�� ������ �ִ�

2-2. ��Ʈ��ũ �� �л����� ������ ����, ����, ������, ��Ʈ��ũ, CCNA ������ �ִ�

2-3. �ӽŷ��� �� �л����� ������ ����, ����, ����, �����, ���α׷��� ��� ������ �ִ�

3. ��� �л��� ������ �̸��� �������� �����Ѵ�.
   �й��� �ߺ����� ���������� �����Ǿ�� �Ѵ�. (�Ǵ� �ߺ����� ������ ����)
   
4. ����ǥ �޼��带 ���� �� �л��� �̸�/����/��������� �� �� �־�� �Ѵ�.

*/

public abstract class Student1 {
	
	
	static final int MAX_SCORE = 100;
	
	static String[] firstName = {"�¹�", "����", "�ѳ�", "����", "����", "�ҿ�"}; 
	
	static String[] lastName = {"��", "��", "��", "��", "��", "��"};
	
	public String getName() {
		return lastName[(int)(Math.random() * lastName.length)]
				+ firstName[(int)(Math.random() * firstName.length)];				
	}
	
	public int randomScore() {
		return (int)(Math.random() * MAX_SCORE);
	}
	
	String name;
	public static int kor;
	public static int eng;
	
	Student1() {
		name = getName();
		kor = randomScore();
		eng = randomScore();
		
	}
	
	abstract public void grade();
	
	
	
	
	
	
}











