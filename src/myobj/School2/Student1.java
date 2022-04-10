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

public abstract class Student1 {
	
	
	static final int MAX_SCORE = 100;
	
	static String[] firstName = {"승민", "웅빈", "한나", "덕중", "혁준", "소영"}; 
	
	static String[] lastName = {"유", "최", "이", "박", "권", "백"};
	
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











