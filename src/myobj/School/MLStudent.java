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
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
		System.out.println("弛檜葷 : " + name + " 識薄: " + getSum() + " ゎ敕: " + getAverage() +  "弛" );	
		System.out.println("弛措橫\t艙橫\t熱з\tsta\tpl");
		System.out.println("弛--------------------------------------");// 還紫 蜃醮瑭 
		System.out.printf( "弛%d\t%d\t%d\t%d\t%d\n", kor, eng, math, sta, pl);
		System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
		
	}

}
