package myobj.ArrayList;

import java.util.Random;

public class Student1 implements Comparable<Student1> {
	public int snum;
	public int kor;
	public int eng;
	public int math;
	public double avg;
	
	public static double best_avg = 0;
	public static int best_avg_snum = 0;
	
	final private int MAX_SCORE = 100;
	final private int NUM_OF_SUBJECT = 3;
	
	private static int curr_snum = 1000;
	private static Random ran = new Random();
	
	public Student1() {
		snum = curr_snum++;
		kor = ran.nextInt(MAX_SCORE + 1);
		eng = ran.nextInt(MAX_SCORE + 1);
		math = ran.nextInt(MAX_SCORE + 1);
		avg = (kor + eng + math) / (double) NUM_OF_SUBJECT;
		
		if (avg > best_avg) {
			best_avg = avg;
			best_avg_snum = snum;
		}
	}
	
	public String toString() {
		return String.format("[%d]번 학생의 평균 점수는 %.2f입니다", snum, avg);
	}

	@Override
	public int compareTo(Student1 o) {
		return Double.compare(this.avg, o.avg) != 0 ?
				Double.compare(this.avg, o.avg) : Integer.compare(snum, o.snum);
		
		
	}
	
}
