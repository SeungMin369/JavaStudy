package myobj.School;

public class NetworkStudent extends Student {
	
	int linux;
	int network;
	int CCNA;
	
	public NetworkStudent() {
		linux = generateRandomScore();
		network= generateRandomScore();
		CCNA = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + linux + network + CCNA);
	}
	
	double getAverage() {
		return getSum() / 5.0;
	}
	
	
	

	@Override
	public void printGradeCard() {
		System.out.println("����������������������������������������������������������������������������������������������������������");
		System.out.println("���̸� : " + name + " ����: " + getSum() + " ���: " + getAverage() +  "��" );	
		System.out.println("������\t����\tLinux\tnet\tCCNA");
		System.out.println("��--------------------------------------");// �ٵ� ����� 
		System.out.printf( "��%d\t%d\t%d\t%d\t%d\t\n", kor, eng, linux, network, CCNA);
		System.out.println("����������������������������������������������������������������������������������������������������������");
	}

}











