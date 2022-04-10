package myobj.School;
/*
	1. 각 반의 정원은 30명이다.
	
	2-1. 프로그래밍 반 학생들은 각자의 국어, 영어, 수학, 프로그래밍 언어, 알고리즘, 자료구조 점수가 있다
	
	2-2. 네트워크 반 학생들은 각자의 국어, 영어, 리눅스, 네트워크, CCNA 점수가 있다
	
	2-3. 머신러닝 반 학생들은 각자의 국어, 영어, 수학, 통계학, 프로그래밍 언어 점수가 있다
	
	3. 모든 학생의 점수와 이름을 랜덤으로 생성한다.
	   학번은 중복없이 순차적으로 생성되어야 한다. (또는 중복없이 랜덤도 가능)
	   
	4. 성적표 메서드를 통해 각 학생의 이름/총점/평균점수를 볼 수 있어야 한다.

*/

abstract public class Student {
	
	final static int MAX_SCORE = 100;
	
	static String[] lastNameArray = {"강", "고", "구", "권", "김", "나", "박", "이",
			"최", "남궁", "제갈", "배", "서", "현", "안", "임", "유", 
			"백", "오", "신", "양", "진"};
	
	static String[] firstNameArray = {
			"수환", "의성", "종윤", "지수", "천혁", "소영", "은철", "승모",
			"수빈", "승민", "수영", "덕중", "지호", "한나", "소윤", "두식",
			"웅빈", "진호"
	};
	
	static String generateRandomName() {
		return lastNameArray[(int)(Math.random() * lastNameArray.length)]
				+ firstNameArray[(int)(Math.random() * firstNameArray.length)];
	}
	
	static int generateRandomScore() {
		return (int)(Math.random() * MAX_SCORE + 1);
	}
	
	String name;
	int kor;
	int eng;
	
	public Student() {
		name = generateRandomName();
		kor = generateRandomScore();
		eng = generateRandomScore();
	}
	
	abstract public void printGradeCard();
	
	public String getname() {
		return name;
	}
}



















