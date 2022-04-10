import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	/*
	  	# ����ǥ���� (Regular Expression)
	  	
	  	- ���ڿ��� ������ ǥ���� �� �ִ� ǥ����
	  	- Ư�� ���α׷��� �� ���ӵ��� �ʴ� ������ ��Ģ�̴�
	  	- ������ ���ڿ� ���ϰ� ��ġ�ϴ� ���ڿ��� �ɷ��� �� �ִ�
	  	
	  	# Java���� ����ǥ������ �ٷ� �� ����ϴ� Ŭ����
	  	
	  	- Pattern
	  	- Matcher
	 */
	
	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : input�� regex�� ��ġ�ϴ��� ���θ� �˻�
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[lh@]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep"));
		System.out.println(Pattern.matches("s[lh@]eep", "saeep"));
		System.out.println(Pattern.matches("s[lh@]ee[abcdef]", "sleeK")); // �� �ҹ��ڵ� �����Ѵ�
		
		/*
		  	[abc]	: �ش� �ڸ��� a �Ǵ� b �Ǵ� c�� ���
		  	[^abc]	: �ش� �ڸ��� abc�� ������ ��� ���� ���
		  	[a-z]	: a���� z���� ��� ���
		  	[A-Z]	: A���� Z���� ��� ���
		  	[\\-]	: ���ڷν� -�� ��� (Escape)
		  	[a-e&&c-z] : a-e�� c-z�� ��� ������Ű�� ���ڸ� ���(������)
		 */
		System.out.println("================================================================");
		System.out.println(Pattern.matches("s[A-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[A\\-Z]eep", "s-eep"));
		System.out.println(Pattern.matches("s[a-e&&c-z]", "saeep"));
		
		/*
		  	# �ϳ��� ���� ���ڸ� ��Ÿ���� �͵�
		  	
		  	.  : ��� ����
		  	\d : ��� ���� [0-9]
		  	\D : ���ڸ� ������ ��� ��
		  	\s : ��� ���� (\t, \n, \r, ' ')
		  	\S : ������ ������ ��� ��
		  	\w : �Ϲ����� ���ڵ��� ��� [a-zA-z0-9_]
		  	\W : \w�� ������ ��� �� 
		 */
		System.out.println(Pattern.matches("s\\Seep", "sdeep"));
		
		/*
		  	# �ش� ������ ����� ������ ������ �����ϴ� ���
		  	
		  	[.]{n} : {}���� ������ n�� ��ġ�ؾ� �Ѵ�
		  	[.]{n, m} : {}���� ������ �ּ� n�� �ִ� m�� ��ġ�ؾ� �Ѵ�
		  	[.]{n,} : {}���� ������ �ּ� n�� �̻� ��ġ�ؾ� �Ѵ�
		  	[.]? : ? ���� ������ 0�� �Ǵ� 1�� ���;� �Ѵ�
		  	[.]+ : + ���� �ּ� �ѹ� �̻� ���;� �Ѵ�
		  	[.]* : * ���� ������ 0�� �̻� ���;� �Ѵ�
		 */
		System.out.println("====" + Pattern.matches("[.a-zA-Z]{5}", "abs.."));
		System.out.println("====" + Pattern.matches("[.]{2,5}", ".."));
		System.out.println("====" + Pattern.matches("[.]{2,5}", "..."));
		System.out.println("====" + Pattern.matches("[.]{2,5}", "...."));
		System.out.println("====" + Pattern.matches("[.]{2,5}", "....."));
		System.out.println("====" + Pattern.matches("[.]{2,5}", "......"));
		System.out.println("====" + Pattern.matches("S?heep", "kheep")); // �ְų� ���ų� 
		System.out.println("====" + Pattern.matches("s+heep", "ssssssheep")); // �ּ� �ѹ� ���Ƶ� �������
		System.out.println(Pattern.matches("s+heep", "heep"));
		
		// �������� : �ش� ���ڿ��� �ڵ��� ��ȣ���� �˻��� �� �ִ� ���� ǥ������ �������� 
		
		System.out.println(phoneNumberCheck("01037639849"));
		
		// �������� : �ش� ���ڿ��� �ֹε�Ϲ�ȣ���� �˻��� �� �ִ� ����ǥ������ ��������
		
		System.out.println(socialNumberCheck("930120-1144444"));
		
		// ��������: �ش� ���ڿ��� �̸������� �˻��� �� �ִ� ���� ǥ������ ��������.
		//���̵�� 6-12���� ����, ����, ��ȣ( - _ )�� ����� ����

		System.out.println(Pattern.matches(
				"\\w+@\\w+.\\w+(\\.\\w+)?(\\.\\w+)?", "usm369@naver.com"));
		
		// # Matcher ����ؼ� �� ���ڿ� �˻��ϱ�
		String fruit = "apple/banana/orange/pineapple/greenapple/redapple/mango";
		
		Pattern pattern1 = Pattern.compile("na");
		
		// pattern1�� fruit�� �˻��� ����� ��ȯ�Ѵ�
		Matcher matcher = pattern1.matcher(fruit);
		
		// matcher.find() : ã�� �͵� �߿� ���� ���� �����ϸ� true
		while (matcher.find()) {
			System.out.println("ã�� ��: " + matcher.group());
			System.out.println("��ġ: " + matcher.start() + "���� " + (matcher.end() - 1) + "����"); // end�� ������
		}
		
		
		
		
		
		
		
		
		
	}
	
	static boolean phoneNumberCheck(String num) {
//		return Pattern.matches("010(-?\\d{4}){2}", num); // �̰� ������
		return Pattern.matches("010-?[2-9]\\d{3}-?\\d{4}", num);
	}
	
	static boolean socialNumberCheck(String num) {
		//return Pattern.matches("\\d{2}[0-1]\\d[0-3]\\d-?[1-4]\\d{6}", num);
		return Pattern.matches(
				"\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])-?[1-4]\\d{6}", num); // | (or) ����սô�
		
	}
	
}















































