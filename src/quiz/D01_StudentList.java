package quiz;

import java.util.ArrayList;

import myobj.ArrayList.Student1;

public class D01_StudentList {
	/*
	  	�л� Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ�����
	  	
	  	1. �� �л��� ������ �������� ����
	  	
	  	2. ������ ��/��/��
	  	
	  	3. 30���� ��� ������ ���
	  	
	  	4. 30�� �� ���� ������ ���� �л��� ������ ��� 
	 */
	public static void main(String[] args) {
		ArrayList<Student1> student_list = new ArrayList<>();
		
		for (int i = 0; i < 30; ++i) {
			student_list.add(new Student1());
		}
		
		for(Student1 student : student_list) {
			System.out.println(student);
		}
		
		System.out.println("���� ���� ���� : " + Student1.best_avg);
		System.out.println("���� ���� ������ �л��� �й� : " + Student1.best_avg_snum);
	}
}
