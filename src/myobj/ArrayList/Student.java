package myobj.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Student {
	 /*
  	�л� Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ�����
  	
  	1. �� �л��� ������ �������� ����
  	
  	2. ������ ��/��/��
  	
  	3. 30���� ��� ������ ���
  	
  	4. 30�� �� ���� ������ ���� �л��� ������ ��� 
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
			System.out.println((i + 1) + "�� �л��� ���" + students.get(i).average);		
		}
		
		for (int i = 0; i < 30; ++i) {
//			if (max_average <=  students.get(i).average) {
//				max_average = students.get(i).average;
//			} if �� �����
			max_average = max_average > students.get(i).average ? max_average : students.get(i).average;
		}
		
		System.out.println(max_average);
		
	}
	
}
