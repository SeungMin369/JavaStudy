
// 주석 (Comment)
// - 프로그램 실행에 영향을 미치지 않음
// - 컴파일러가 해석하지 않음
// - 주로 프로그래머가 이 소스를 보게 될 다른  프로그래머들에게 하고 싶은 말을 적을 때 사용한다
// - 우리는 공부용으로 사용한다

/* 여러 줄 주석 
 * - 해당 범위 내부의 모든 텍스트가 주석이 된다
 * 
 * # Eclipse 단축키
 * 
 * - ctrl + F11 : Run (컴파일 후 컴파일 결과 실행)
 * - Ctrl + [+, -] : 글씨 크기 조절
 * - Ctrl + M : 현재 화면 최대/최소화
 * - Ctrl + x : 잘라내기
 * - Ctrl + c : 복사하기
 * - Ctrl + V : 붙여넣기
 * - Alt + 방향키 : 줄 이동
 * - Home : 줄의 맨 앞으로 이동
 * - Shift + Home : 현재 커서 위치부터 줄의 맨 앞까지 블록지정
 * - End : 줄의 맨 뒤로 이동
 * - Shift + End : 현재 커서 위치부터 줄의 맨 뒤까지 블록지정
 * - Tab : 들여쓰기 
 * - Shift + Tab : 역으로 들여쓰기
 * - Ctrl + Shift + F : 자동으로 들여쓰기 맞춤
 * # Windows 단축키
 * 
 * - win + . : 이모티콘😊😁😊😁
 * - win + Shift + s : 캡쳐
 * - win + D : 바탕화면
 * - win + E : 탐색기
 * - win + 방향키 : 화면 절반 쓰기
 */

// ※ public class의 이름은 반드시 파일명과 같아야 한다
public class A00_Hello {
	// 빨간 줄이 생겼을 때는 그곳에 마우스 커서를 두거나 F2 누르면
	// 해당 에러에 대한 정보와 해결책을 볼 수 있다
	/*
	 * # main() 함수 - 프로그램의 시작 지점 - 사용자가 프로그램을 실행하면 가장 먼저 main() 함수를 찾아서 실행한다 -
	 * main() 함수의 범위는 중괄호{}로 결정된다 - 중괄호의 범위를 알기 쉽게 하기 위해 들여쓰기(Tab)를 사용한다 - main()
	 * 함수가 끝나면 프로그램도 종료된다 (나중엔 아니다) # 함수란? -어떤 단어 뒤에 ()가 있는 것을 모두 함수라고 부른다
	 */
	public static void main(String[] args) {
		// 프로그램의 시작
		/*
		 * #System.out.println() 함수 -()안에 전달한 데이터를 콘솔에 출력하는 함수
		 * 
		 * # 콘솔 (Console) - 글자만 나오는 검은 화면 (옛날 컴퓨터 화면) - eclipse에서는 테스트용으로 하얀 바탕의 콘솔을
		 * 제공한다(성능 안좋음) - 이클립스에서 Ctrl + F11을 누르면 우리가 만든 프로그램을 테스트용 콘솔에서 실행해볼 수 있다 - 우리가
		 * 만든 소스코드(.Java)의 컴파일 결과물(.class)은 bin폴더에 저장되어 있다
		 */
		System.out.println("Hello, world! 1");
		System.out.println("Hello, world! 2");
		System.out.println("Hello, world! 3");
		System.out.println("Hello, world! 4");
		System.out.println("Hello, world! 5");
		/*
		 * # JAVA의 데이터 종류(리터럴) - ""사이에 적는 것들 : 문자열 (String), 문자를 여러개 쓸 수 있는 데이터 타입 -
		 * ''사이에 적는 것: 문자 (Charactor), 문자 단 하나만 쓸 수 있는 데이터 타입 - 숫자를 적는 것 : 정수 (integer)
		 * - 소수를 적는 것 : 실수 (Float, Double) - true, false : 참/거짓 타입 (Boolean)
		 */
		System.out.println("ABCDEFG");
		System.out.println('A');
		System.out.println(123456789 + 10);
		System.out.println("123456789" + 10);

		System.out.println(123.12345 + 0.0333);

		System.out.println(true);
		System.out.println(false);
		
		String a = "aacde__";
		char[] b = a.toCharArray();
		String c = new String(b);
		String d = String.valueOf(b);
		
		System.out.println(c);
		System.out.println(d);

		// 프로그램의 끝
	}
}
