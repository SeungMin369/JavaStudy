package quiz;

public class B06_is_contain_alpha {

	public static void main(String[] args) {
		/*
		  	1. 사용자가 입력한 문자열에 
	  		   알파벳이 포함되어 있으면 true를 출력, 없으면 false를 출력
	  		   
  		    2. 사용자가 입력한 문자열이 알파벳으로만 이루어져 있으면 true, 아니면 false
  		    
  		    3. 사용자가 허락한 문자만으로 이루어진 문자열이라면 true, 아니먄 false
  		    	(허락한 문자열: 알파벳 소문자, 숫자, _, $, 첫번째 문자에 숫자 불가)
		  	
		  	
		 */
		/*
		String str = "a건담";
		//1	

		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') ||
					(ch >= 'a' && ch <= 'z')) {
				System.out.println(true); 
				break;
			}else {
				System.out.println(false);
			}
		}
		//2
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			if ((ch < 'A' && ch > 'Z') || (ch < 'a' && ch > 'z')) {
				System.out.println(false);
				break;
			}else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				continue;
			}else {
				System.out.println(true);
				
			}
		}
		// 실패
		*/
		
		//1
		String str = "a2_$";
		
		boolean contain = false;
		
		for (int i = 0; i < str.length(); ++i) {
			
			char ch = str.charAt(i);
			
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				contain = true;
				break;
			}
		}
		
		System.out.println("영어가 한번이라도 나온적 있나요?" + contain);
		
		//2
		boolean only_alpha = true;
		
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			
			if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
				only_alpha = false;
				break;
			}	
		}
		
		System.out.println("영어만 나왔나요" + only_alpha);
		/*
		boolean text = false;
		
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				text = true;
				continue;
			}else if (ch >= 0 && ch <= 9) {
				text = true;
				continue;
			}else if (ch == '_') {
				text = true;
				continue;
			}else if (ch == '$') {
				text = true;
				continue;
			}else if (str.charAt(0) >= 0 && str.charAt(0) <= 9) {
				text = false;
				break;
			}else {
				text = false;
				break;
			}
			
		}
		
		System.out.println("허락된 문자만 사용했나요?" + text);
		*/
		
		//3 강사님 풀이
		
		boolean first_letter_check = true, letter_check = true;
		
		if (str.charAt(0) > '0' && str.charAt(0) <= '9') {
			first_letter_check = false;
		}
		
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			
			if(!(ch >= '0' && ch <= 9 || ch >='a' && ch <= 'z' ||
					ch == '_' || ch == '$')) {
				letter_check = false;
				break;
			}
		}
	
		if (first_letter_check && letter_check) {
			System.out.println("올바른 문자열입니다." + true);
		}else {
			System.out.println("허용되지 않은 문자열입니다." + false);
		}
		
		

	}

}










