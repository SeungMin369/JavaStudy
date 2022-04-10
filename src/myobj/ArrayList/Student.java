package myobj.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Student {
	 /*
  	학생 클래스를 요소로 갖는 ArrayList를 생성하고 학생을 30명 추가해보세요
  	
  	1. 각 학생의 점수는 랜덤으로 설정
  	
  	2. 과목은 국/영/수
  	
  	3. 30명의 평균 점수를 출력
  	
  	4. 30명 중 가장 점수가 높은 학생의 성적을 출력 
	*/
	int kor;
	int eng;
	int math;
	static double max_average = 0;
	double average;
	
	static Random random = new Random();
	
	public static int Random() {
		return random.nextInt(101);
	}	
	public Student() {
		kor = Random();
		eng = Random();
		math = Random();
		
		average = (kor + eng + math) / 3.0;
		
	}
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		
		for (int i = 0; i < 30; ++i) {
			students.add(new Student());
			System.out.println((i + 1) + "번 학생의 평균" + students.get(i).average);		
		}
		
		for (int i = 0; i < 30; ++i) {
//			if (max_average <=  students.get(i).average) {
//				max_average = students.get(i).average;
//			} if 문 사용방식
			max_average = max_average > students.get(i).average ? max_average : students.get(i).average;
		}
		
		System.out.println(max_average);
		
	}
	
}
