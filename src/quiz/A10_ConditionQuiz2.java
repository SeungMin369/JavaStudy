package quiz;

import java.util.Scanner;

public class A10_ConditionQuiz2 {
	public static void main(String[] arge) {
		
		char a = 'q';
		
		System.out.println(a == 'q' || a == 'Q');//1
		
		char b = ' ';
		
		System.out.println(b != ' ' && b != '\t');//2 ||붙여서 틀림 근데 말이 애매했잖아
		
		char c = '2';
		
		System.out.println(c >= '0' && c <= '9' );//3 int 변환시킨 사람이 많은데 굳이 그럴필요없다
		
		char d = '3';
		
		System.out.println((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z'));//4
		
		char e = '이';
				
		System.out.println(e >= '가' && e <= '힣');//5
		System.out.println(e >= '가' && e <= '힣');//이왕이면 공식 사이트들어가서 봐라ㅐ 유니코드 적어도 상관없음
		
		char f = '일';
		
		System.out.println((f >= 0x3041 && f <= 0x3096) || 
				(f >= 0x30A1 && f <= 0x30ff));//6 유니코드는 0x땡떙떙떙 으로 적는다
		// 수단과 방법을 가리지말고 해결해라 일본 홈페이지를 들어가서라도 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("exit을 입력하면 true가 나옵니다 > ");
		String txt = sc.nextLine();
		System.out.println(txt.equals("exit")); // 컨디션 퀴즈 1에서 설명되어있음 equals를 써야하는 이유
		
		boolean exit = true;
		
		System.out.println(exit);//7
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
	}

}
