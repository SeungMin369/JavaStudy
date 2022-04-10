package quiz;

/*
	 	1. 각 반의 정원은 30명이다.
	 	
	 	2-1. 프로그래밍 반 학생들은 각자의 국어, 영어, 수학, 프로그래밍 언어, 알고리즘, 자료구조 점수가 있다
	 	
	 	2-2. 네트워크 반 학생들은 각자의 국어, 영어, 리눅스, 네트워크, CCNA 점수가 있다
	 	
	 	2-3. 머신러닝 반 학생들은 각자의 국어, 영어, 수학, 통계학, 프로그래밍 언어 점수가 있다
	 	
	 	3. 모든 학생의 점수와 이름을 랜덤으로 생성한다.
	 	   학번은 중복없이 순차적으로 생성되어야 한다. (또는 중복없이 랜덤도 가능)
	 	   
	 	4. 성적표 메서드를 통해 각 학생의 이름/총점/평균점수를 볼 수 있어야 한다.

 */
abstract public class C07_School {
	public static void main(String[] args) {
		Programming a = new Programming("둘리", "프로그래밍과");
		Programming b = new Programming("둘리2", "프로그래밍과2");
		Programming c = new Programming("둘리3", "프로그래밍과3");
		
		
		System.out.println("둘리의 알고리즘 점수: " + a.algorithm);
		System.out.println("둘리의 학번: " + a.Student_ID);
		a.grade_card();
		
		
	}
	
	String name;
	String department;
	final int max_personnel = 30;
	final int personnel[] = new int[max_personnel];
	int cueue = 0;
	int personnel_index[];
	
	boolean maxCheck = personnel_index[cueue] == personnel[max_personnel];
	
	int Student_ID = 20210000 + (int)(Math.random() * 10000);
	
	int random = (int)(Math.random() * 101);
		
	abstract void grade_card();
		
	
}

class Programming extends C07_School {

	Programming(String name, String department) {
		if (maxCheck) {
			System.out.println("정원이 가득찼습니다.");
			return;
		}
		this.name = name;
		this.department = department;
		cueue++;
		
	}
	
	
	
	
	
	int language = random;
	int english = random;
	int math = random;
	int programming_language = random;
	int algorithm = random;
	int data_structure = random;
	
	int sum = language + english + math + programming_language + algorithm +
			data_structure;
	
	int average_score = (language + english + math + programming_language + algorithm +
			data_structure) / 6;
	@Override
	void grade_card() {	
		System.out.printf("이름: %s, 총점: %d, 평균점수: %d", name, sum, average_score);
	}
		
}

class Network extends C07_School  {

	Network(String name, String department) {
		if (maxCheck) {
			System.out.println("정원이 가득찼습니다.");
			return;
		}
		this.name = name;
		this.department = department;
		cueue++;	
	}
	
	
	
	
	int language = random;
	int english = random;
	int linux = random;
	int network = random;
	int CCNA = random;
	
	int sum = language + english + linux + network + CCNA;
	int average_score = (language + english + linux + network + CCNA) / 5;		
	
	@Override
	void grade_card() {
		System.out.printf("이름: %s, 총점: %d, 평균점수: %d", name, sum, average_score);	
	}
	
}

class Machine_learning extends C07_School {

	Machine_learning(String name, String department) {
		if (maxCheck) {
			System.out.println("정원이 가득찼습니다.");
			return;
		}
		this.name = name;
		this.department = department;
		cueue++;
	}
	
	
	
	
	int language = random;
	int english = random;
	int math = random;
	int statistics = random;
	int programming_language = random;
	
	int sum = language + english + math + statistics + programming_language;
	int average_score = (language + english + math + statistics + programming_language) / 5;
	@Override
	void grade_card() {
		System.out.printf("이름: %s, 총점: %d, 평균점수: %d", name, sum, average_score);
	}
	
}





















