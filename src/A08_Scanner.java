import java.util.Scanner;// *로 전부 불러올 수 있지만 비효율적이다

public class A08_Scanner {
	public static void main(String[] arge) {
		
		
	
		/*
			   # java.util.Scanner 클래스 // 대문자가 있으면 클래스임을 알 수 있다
			   	- 프로그램의 외부로부터 입력을 받을 수 있는 기능들이 미리 구현되어 있는 클래스
			   	- 어디에서 입력을 받을지 결정한 뒤에 다양한 값들을 입력받을 수 있다
			   	- 콘솔로부터 입력받고 싶을 때는 System.in을 사용한다
		 */
			
			Scanner sc = new Scanner(System.in); //sc에 새로생성된 스캐너를 담는다는뜻 System은 시스템에서 입력받는다는 뜻
			//- new는 새로운 스캐너를 생성할 떄 사용한다
			//- new 할 때 스캐너에 전달한 입력통로(ImputStream)를 사용하는 스캐너를 생성한다
			//- System.in으로부터 입력받는 새로운 스캐너를 하나 생성한다
			// Scanner 타입 변수 sc에 생성한 스캐너를 담아 놓는다
			
	
			/* # Scanner 클래스의 nextint()
				  -  다음으로 들어오는 정수를 하나 꺼낸다
				  -  스캐너에 꺼낼 값이 아무것도 없을 떄는 멈춰서 입력을 계속 기다린다	
				- 정수만 입력받아야 한다
			*/ 
			System.out.print("사과 몇개 필요하세요? ");
			int num = sc.nextInt();
			
			System.out.println(num * 500 + "원 입니다.");
			
			// 실수를 입력받을 때는 nextDouble()을 사용한다
			System.out.print("이번에는 소수를 입력해보세요 >>");
			double d = sc.nextDouble();
			
			
			System.out.println("입력한 소수는 %.5f입니다");
			
			// 문자열이 아닌 것을 입력받은 스캐너에는 '\n'이 남아있게 된다
			sc.nextLine(); // 스캐너에 남아있는 '\n' 비우기
			
			//문자열을 입력받을 때는 next() 또는 nextLine()을 사용한다
			//next()는 모든 공백을 기준으로 입력받고
			//nextline()은 '\n'을 기준으로 입력받는다
			System.out.print("이번에는 문자열을 입력해보세요 >> ");
			String str = sc.nextLine();
			
			System.out.println("당신 : " + str);
			
		
			
			
			
			
			
			
			
	}
	
}







		
