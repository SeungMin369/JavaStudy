import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	/*
	  	# 정규표현식 (Regular Expression)
	  	
	  	- 문자열의 패턴을 표현할 수 있는 표현식
	  	- 특정 프로그래밍 언어에 종속되지 않는 공통의 규칙이다
	  	- 정의한 문자열 패턴과 일치하는 문자열을 걸러낼 수 있다
	  	
	  	# Java에서 정규표현식을 다룰 때 사용하는 클래스
	  	
	  	- Pattern
	  	- Matcher
	 */
	
	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : input이 regex에 일치하는지 여부를 검사
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : 해당 위치의 한 글자에 어떤 문자들이 올 수 있는지 정의하는 표현식
		System.out.println(Pattern.matches("s[lh@]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep"));
		System.out.println(Pattern.matches("s[lh@]eep", "saeep"));
		System.out.println(Pattern.matches("s[lh@]ee[abcdef]", "sleeK")); // 대 소문자도 구분한다
		
		/*
		  	[abc]	: 해당 자리에 a 또는 b 또는 c를 허용
		  	[^abc]	: 해당 자리에 abc를 제외한 모든 것을 허용
		  	[a-z]	: a부터 z까지 모두 허용
		  	[A-Z]	: A부터 Z까지 모두 허용
		  	[\\-]	: 문자로써 -를 허용 (Escape)
		  	[a-e&&c-z] : a-e와 c-z를 모두 만족시키는 문자를 허용(교집합)
		 */
		System.out.println("================================================================");
		System.out.println(Pattern.matches("s[A-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[A\\-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[a-e&&c-z]", "saeep"));
		
		/*
		  	# 하나로 여러 문자를 나타내는 것들
		  	
		  	.  : 모든 문자
		  	\d : 모든 숫자 [0-9]
		  	\D : 숫자를 제외한 모든 것
		  	\s : 모든 공백 (\t, \n, \r, ' ')
		  	\S : 공백을 제외한 모든 것
		  	\w : 일반적인 문자들을 허용 [a-zA-z0-9_]
		  	\W : \w를 제외한 모든 것 
		 */
		System.out.println(Pattern.matches("s\\Seep", "sdeep"));
		
		/*
		  	# 해당 패턴이 적용될 문자의 개수를 정의하는 방법
		  	
		  	[.]{n} : {}앞의 패턴이 n개 일치해야 한다
		  	[.]{n, m} : {}앞의 패턴이 최소 n개 최대 m개 일치해야 한다
		  	[.]{n,} : {}앞의 패턴이 최소 n개 이상 일치해야 한다
		  	[.]? : ? 앞의 패턴이 0번 또는 1번 나와야 한다
		  	[.]+ : + 앞의 최소 한번 이상 나와야 한다
		  	[.]* : * 앞의 패턴이 0번 이상 나와야 한다
		 */
		System.out.println("====" + Pattern.matches("[.a-zA-Z]{5}", "abs.."));
		System.out.println("====" + Pattern.matches("[.]{2,5}", ".."));
		System.out.println("====" + Pattern.matches("[.]{2,5}", "..."));
		System.out.println("====" + Pattern.matches("[.]{2,5}", "...."));
		System.out.println("====" + Pattern.matches("[.]{2,5}", "....."));
		System.out.println("====" + Pattern.matches("[.]{2,5}", "......"));
		System.out.println("====" + Pattern.matches("S?heep", "kheep")); // 있거나 없거나 
		System.out.println("====" + Pattern.matches("s+heep", "ssssssheep")); // 최소 한번 많아도 상관없음
		System.out.println(Pattern.matches("s+heep", "heep"));
		
		// 연습문제 : 해당 문자열이 핸드폰 번호인지 검사할 수 있는 정규 표현식을 만들어보세요 
		
		System.out.println(phoneNumberCheck("01037639849"));
		
		// 연습문제 : 해당 문자열이 주민등록번호인지 검사할 수 있는 정규표현식을 만들어보세요
		
		System.out.println(socialNumberCheck("930120-1144444"));
		
		// 연습문제: 해당 문자열이 이메일인지 검사할 수 있는 정규 표현식을 만들어보세요.
		//아이디는 6-12자의 영문, 숫자, 기호( - _ )만 사용이 가능

		System.out.println(Pattern.matches(
				"\\w+@\\w+.\\w+(\\.\\w+)?(\\.\\w+)?", "usm369@naver.com"));
		
		// # Matcher 사용해서 긴 문자열 검사하기
		String fruit = "apple/banana/orange/pineapple/greenapple/redapple/mango";
		
		Pattern pattern1 = Pattern.compile("na");
		
		// pattern1로 fruit을 검사한 결과를 반환한다
		Matcher matcher = pattern1.matcher(fruit);
		
		// matcher.find() : 찾은 것들 중에 다음 것이 존재하면 true
		while (matcher.find()) {
			System.out.println("찾은 것: " + matcher.group());
			System.out.println("위치: " + matcher.start() + "부터 " + (matcher.end() - 1) + "까지"); // end는 미포함
		}
		
		
		
		
		
		
		
		
		
	}
	
	static boolean phoneNumberCheck(String num) {
//		return Pattern.matches("010(-?\\d{4}){2}", num); // 이게 내버전
		return Pattern.matches("010-?[2-9]\\d{3}-?\\d{4}", num);
	}
	
	static boolean socialNumberCheck(String num) {
		//return Pattern.matches("\\d{2}[0-1]\\d[0-3]\\d-?[1-4]\\d{6}", num);
		return Pattern.matches(
				"\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])-?[1-4]\\d{6}", num); // | (or) 사용합시다
		
	}
	
}















































