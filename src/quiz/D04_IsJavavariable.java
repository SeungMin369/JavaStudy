package quiz;

public class D04_IsJavavariable {
	/*
	  	����ڷκ��� ���ڿ��� �Է¹����� �ش� ���ڿ��� �ڹ��� �����ν� 
	  	���� �� �ִ��� �˻��ϴ� �޼��带 ����� �׽�Ʈ�غ�����
	  	
	  	(1) ������ ù ���� ���ڴ� ���ڰ� �� �� ����
		  		ex: 1st, 2nd, 4pple
	  		
	  		(2) ������ ���̿��� ������ ����� �� ����
	  		
	  		(3) Ư�����ڴ� _�� $�� ����� �� �ֵ�
	  		
	  		(4) �̹� ����ϰ� �ִ� Ű����� ���������� ����� �� ����
	  		(Eclipse�󿡼� ��������� ǥ�õ�)
	  			ex: int, short, char, void, static, public, if, for, while ...
	 */
	
	public static void main(String[] args) {
		String str = "JAva123";
		
		System.out.println(str.toCharArray());
		
		System.out.println(check("java123".toCharArray()));
	}
	
	public static boolean check(char[] str) {
		// Character.isJavaIdentifierStart : �ڹ� �������� ù ��° ���ڷ� �������� üũ
		boolean check = Character.isJavaIdentifierStart(str[0]);
		
		// Character.isJavaIdentifierPart : �ڹ� �������� ������ �κ����� �������� üũ
		for (int i = 1; i < str.length; ++i) {
			check = check && Character.isJavaIdentifierPart(str[i]);
		}
		return check;
	}
}

















