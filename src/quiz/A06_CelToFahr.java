package quiz;

import java.util.Scanner;

public class A06_CelToFahr {
	
	/*
	 
	  	사용자로부터 섭씨 온도를 입력받으면 화씨 온도로 변환하여 출력해주는 프로그램을 만들어보세요
	  	(변환 공식은 검색 허용, 출력은 소수 첫째 자리까지)
	  
	  
	 */
	public static void main(String[] arge) {
		
		
		Scanner sc = new Scanner(System.in);// sc변수에 담아놓는것
		
		System.out.print("섭씨 온도가 어떻게 되나요?");
		
		double temperature = sc.nextDouble();
		
		System.out.println("화씨 온도는" + (temperature * 1.8 + 32) + "℃ 입니다");
		
		/*/강사님 풀이
		
		int cel, fahr;
		
		System.out.print("섭씨 온도(℃)를 입력 > ");
		cel = sc.nextDouble();// 스캐너를 바로 넣어도 되지만 두번이상 쓸거면 변수에 담아둬야한다
		//cel = new Scanner(System.in).nextDouble();// 스캐너를 바로 넣어도 되지만 두번이상 쓸거면 변수에 담아둬야한다
		
		
		fahr = cel * 9/5 + 32;
		
		System.out.print("%.1f℃는 %.1f℉입니다", cel, fahr);
		
		*/
		
		
	}
	
	

}
