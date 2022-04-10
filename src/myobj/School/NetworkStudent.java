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
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
		System.out.println("弛檜葷 : " + name + " 識薄: " + getSum() + " ゎ敕: " + getAverage() +  "弛" );	
		System.out.println("弛措橫\t艙橫\tLinux\tnet\tCCNA");
		System.out.println("弛--------------------------------------");// 還紫 蜃醮瑭 
		System.out.printf( "弛%d\t%d\t%d\t%d\t%d\t\n", kor, eng, linux, network, CCNA);
		System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
	}

}











