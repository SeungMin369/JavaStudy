package quiz;

public class B06_is_contain_alpha {

	public static void main(String[] args) {
		/*
		  	1. ����ڰ� �Է��� ���ڿ��� 
	  		   ���ĺ��� ���ԵǾ� ������ true�� ���, ������ false�� ���
	  		   
  		    2. ����ڰ� �Է��� ���ڿ��� ���ĺ����θ� �̷���� ������ true, �ƴϸ� false
  		    
  		    3. ����ڰ� ����� ���ڸ����� �̷���� ���ڿ��̶�� true, �ƴϐ� false
  		    	(����� ���ڿ�: ���ĺ� �ҹ���, ����, _, $, ù��° ���ڿ� ���� �Ұ�)
		  	
		  	
		 */
		/*
		String str = "a�Ǵ�";
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
		// ����
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
		
		System.out.println("��� �ѹ��̶� ������ �ֳ���?" + contain);
		
		//2
		boolean only_alpha = true;
		
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			
			if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
				only_alpha = false;
				break;
			}	
		}
		
		System.out.println("��� ���Գ���" + only_alpha);
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
		
		System.out.println("����� ���ڸ� ����߳���?" + text);
		*/
		
		//3 ����� Ǯ��
		
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
			System.out.println("�ùٸ� ���ڿ��Դϴ�." + true);
		}else {
			System.out.println("������ ���� ���ڿ��Դϴ�." + false);
		}
		
		

	}

}










