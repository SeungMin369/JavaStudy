package myobj.School;

public class MLStudent extends Student {
	
	int math;
	int sta;
	int pl;
	
	public MLStudent() {
		math = generateRandomScore();
		sta = generateRandomScore();
		pl = generateRandomScore();
	}

	
	int getSum() {
		return (kor + eng + math + sta + pl);
	}
	
	double getAverage() {
		return getSum() / 5.0;
	}
	
	
	@Override
	public void printGradeCard() {
		System.out.println("����������������������������������������������������������������������������������������������������������");
		System.out.println("���̸� : " + name + " ����: " + getSum() + " ���: " + getAverage() +  "��" );	
		System.out.println("������\t����\t����\tsta\tpl");
		System.out.println("��--------------------------------------");// �ٵ� ����� 
		System.out.printf( "��%d\t%d\t%d\t%d\t%d\n", kor, eng, math, sta, pl);
		System.out.println("����������������������������������������������������������������������������������������������������������");
		
	}

}
