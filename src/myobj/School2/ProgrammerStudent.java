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

public class ProgrammerStudent extends Student1 {
	
	static int math;
	static int pl;
	static int al;
	static int ds;
	
	ProgrammerStudent() {
		math = randomScore();
		pl = randomScore();
		al = randomScore();
		ds = randomScore();
	}
	
	static int sum() {
		return kor + eng + math + pl + al + ds;
	}
	
	public static int average() {
		return sum() / 6;
	} 
	
	@Override
	public void grade() {
		System.out.printf("�̸�: %s, ����: %d, �������: %d\n", name, sum(), average());
		

		
		
	}

}
