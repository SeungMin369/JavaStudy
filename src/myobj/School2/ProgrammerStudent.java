package myobj.School2;
/*
1. 각 반의 정원은 30명이다.

2-1. 프로그래밍 반 학생들은 각자의 국어, 영어, 수학, 프로그래밍 언어, 알고리즘, 자료구조 점수가 있다

2-2. 네트워크 반 학생들은 각자의 국어, 영어, 리눅스, 네트워크, CCNA 점수가 있다

2-3. 머신러닝 반 학생들은 각자의 국어, 영어, 수학, 통계학, 프로그래밍 언어 점수가 있다

3. 모든 학생의 점수와 이름을 랜덤으로 생성한다.
   학번은 중복없이 순차적으로 생성되어야 한다. (또는 중복없이 랜덤도 가능)
   
4. 성적표 메서드를 통해 각 학생의 이름/총점/평균점수를 볼 수 있어야 한다.

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
		System.out.printf("이름: %s, 총점: %d, 평균점수: %d\n", name, sum(), average());
		

		
		
	}

}
