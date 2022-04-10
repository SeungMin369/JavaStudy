package quiz;

public class A09_ConditionQuiz {
	
	public static void main(String[] arge) {
		
		int a = 19;
		System.out.println(a > 10 && a < 20);//1
		
		int b = 2;
		System.out.println(b % 2 == 0);//2
		
		int c = 14;
		System.out.println(c % 7 == 0);//3
		
		int hour = 13;
		System.out.println(!(hour < 0) && !(hour >= 24) && hour >= 12);//4
		// !(hour < 0 || hour >= 24) 를 강사님 사용
		
		int d = 30, e = 60;
		System.out.println(d - e == 30 || e - d == 30);//5
		// System.out.println(math.abs(d - e) == 30); 절대값 계산식
		
		int year = 800;
		System.out.println(year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0)));//6
		//System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		
		int minsu = 27, ironsu = 25;
		System.out.println(minsu - ironsu == 2);//7
		
		int minbirth = 12, subirth = 9;
		System.out.println(minbirth - subirth == 3);//8
		
		boolean powerOn = false;
		System.out.println(!powerOn);//9
				
		String str = "yes";
		String str2 = "yes";
		String str3 = new String("yes"); //참조형 변수 크기는 항상 다르다
		
		// 참조형 변수의 ==은 두 변수가 서로 같은 주소를 지니고 있는지를 비교한다
		System.out.println("str == \"yes\" : " + (str == "yes"));//10
		System.out.println("str == str2 : " + (str == str2));
		System.out.println("str == str3 : " + (str == str3));// 다른 주소에 존재하기 때문에 틀리다
		// 타입명이 대문자로 시작하는 참조형 변수들은 반드시 .equals()를 이용해 비교해야 한다
		// 대문자 타입은 메모리에 주소가 저장된다. 새로이 선언하면 주소가 달라진다 고로 진짜 같은지 비교하려면 .equals
		// 소문자로 시작하는 변수들은 stack에 차곡차곡 쌓인다
		// 대문자로 시작하는 타입 변수들은 stack에는 주소값만 보관하고 실체는 heap에 존재한다
		// 대문자로 시작하는 타입변수에는 주소값이 저장되어 있고, 거기에 .을 찍고 실제 데이터를 참조할 수 있다.
		System.out.println(str.equals("yes"));
		System.out.println(str.equals(str3));
			
		  
		 
		
		
		
		
				
		
		
		
		
		
	}
	
}
		
		
		
		
		
		
		
