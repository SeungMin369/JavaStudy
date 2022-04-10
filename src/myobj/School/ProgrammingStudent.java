package myobj.School;

public class ProgrammingStudent extends Student {
	
	int math;
	int pl;
	int al;
	int ds;
	
	public ProgrammingStudent() {
		super();// 儅楞陛棟л
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
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
		System.out.println("弛檜葷 : " + name + " 識薄: " + getSum() + " ゎ敕: " + getAverage() +  "弛" );	
		System.out.println("弛措橫\t艙橫\t熱з\tpl\tal\tds");
		System.out.println("弛--------------------------------------");// 還紫 蜃醮瑭 
		System.out.printf( "弛%d\t%d\t%d\t%d\t%d\t%d\n", kor, eng, math, pl, al, ds);
		System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
	}
	

}













