package myobj.School;

public class ProgrammingStudent extends Student {
	
	int math;
	int pl;
	int al;
	int ds;
	
	public ProgrammingStudent() {
		super();// ����������
		math = generateRandomScore();
		pl = generateRandomScore();
		al = generateRandomScore();
		ds = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + math + pl + al + ds);
	}
	
	
	double getAverage() {
		return getSum() / 6.0;
	}

	@Override
	public void printGradeCard() {
		System.out.println("����������������������������������������������������������������������������������������������������������");
		System.out.println("���̸� : " + name + " ����: " + getSum() + " ���: " + getAverage() +  "��" );	
		System.out.println("������\t����\t����\tpl\tal\tds");
		System.out.println("��--------------------------------------");// �ٵ� ����� 
		System.out.printf( "��%d\t%d\t%d\t%d\t%d\t%d\n", kor, eng, math, pl, al, ds);
		System.out.println("����������������������������������������������������������������������������������������������������������");
	}
	

}













