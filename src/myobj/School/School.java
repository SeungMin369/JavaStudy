package myobj.School;

public class School {
	public static void main(String[] args) {
		ProgrammingStudent pro = new ProgrammingStudent();
		
		Student[] school = new Student[30];
		
		for (int i = 0; i < school.length; ++i) {
			school[i] = new ProgrammingStudent();
			
			school[i].printGradeCard();
		}
		
//		Student[] school1 = new Student[30];
//		
//		for (int i = 0; i < school1.length; ++i) {
//			school1[i] = new NetworkStudent();
//			
//			school1[i].printGradeCard();
//		}
		
//		Student[] school2 = new Student[30];
//		
//		for (int i = 0; i < school2.length; ++i) {
//			school2[i] = new MLStudent();
//			
//			school2[i].printGradeCard();
//		}
	}
}
