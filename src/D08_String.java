import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class D08_String {
	
	public static void main(String[] args) {
		String str = new String("abcdefg");
		String str2 = "hello"; // String �� Ư���� ����� �޾Ƽ� �̷��Ե� ������ �����ϴ� .
		
		String fruits = "apple/banana/orange/pineapple/kiwi";
		
		// String.split(delimiter) : ���ڿ��� ���ϴ� �������� �ڸ� ���ڿ� �迭�� ��ȯ�Ѵ�.
		String[] splitted = fruits.split("/");
		
		for (int i = 0; i < splitted.length; ++i) {
			System.out.println(i + ": " + splitted[i]);
		}
		
		// String.join(delim, �̾���̰������...) : ���� ���ڿ��� ���ϴ� �����ڸ� �߰��Ͽ� �̾���δ�
		String after = String.join(", ", splitted);
		
		System.out.println(after);
		System.out.println(String.join("-", "����", "���", "����", "�췰", "����"));
		
		printRabbitWithMessage("Ŀ��", "����", "�ֽ�", "���", "�Ǹ�");
		printRabbitWithMessage("����", "����");
		
		// substring(start) : ���ڿ��� start���� ���������� �ڸ���
		// substring(start, end) : ���ڿ��� start���� end�̸����� �ڸ� �ν��Ͻ��� ��ȯ
		
		
		String sn = "991231-1234567";
		
		String year = sn.substring(0, 2);
		String month = sn.substring(2, 4);
		String date = sn.substring(4, 6);
		
		System.out.println("year: " + year);
		System.out.println("month: " + month);
		System.out.println("date: " + date);
		
		// contains(seq) : ���ڿ��� �ش� ���ڿ��� ���ԵǾ� �ִ��� �˻��Ѵ�
		String ph = "010-1234-1234";
		System.out.println("ph�� 1234�� ���ԵǾ� �ֳ���? " + ph.contains("1234"));
		
		// startsWith(seq) : ���ڿ��� �ش� ���ڿ��� �����ϴ��� �˻��Ѵ�
		System.out.println("ph�� 010���� �����ϳ���? " + ph.startsWith("010"));
		
		// endsWith(seq) : ���ڿ��� �ش� ���ڿ��� �������� �˻��Ѵ�
		System.out.println("ph�� 4�� ��������? " + ph.endsWith("4"));
		
		// replace(old, new) : ���ڿ��� �ٸ� ���ڿ��� ��ü�� �ν��Ͻ��� ��ȯ�Ѵ�
		String result = ph.replace("1234", "abcd");
		System.out.println("���� : " + ph + ", ��� : " + result);
		
		// getBytes() : ���ڿ��� byte[]�� ��ȯ�Ѵ� (������ ���� �غ�)
		System.out.println(Arrays.toString("Hello".getBytes()));
		System.out.println(Arrays.toString("�ȳ��ϼ��� �ݰ����ϴ�".getBytes()));
		
		// � ��Ģ(���ڵ� Ÿ��)�� ����� byte[]�� ��ȯ���� ������ �� �ִ�.
		try {
			System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes("UTF-8")));
			System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes("UTF-16")));
			System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes("EUC-KR")));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		// byte[]�� �������� �����͵��� �ٽ� ���ڿ��� ��ĥ �� �ִ�
		byte[] message = "�ȳ��ϼ��� �ݰ����ϴ�.".getBytes();
		System.out.println(new String(message)); // String ���� byte�迭�� �ٽ� ���ڿ��� ��ȯ�ϴ� ����� �ִ�
		
		// trim() : ���ڿ� �ٱ����� ������ �������ش�
		String user_input = "    java \n";
		String answer = "java";
		
		System.out.println(user_input.trim().equals(answer));
		
		// toUpperCase() : ���ڿ��� �빮�ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�
		// toLowerCase() : ���ڿ��� �ҹ��ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�
		
		String text = "hell0, java!!";
		System.out.println(text.toUpperCase());
		System.out.println(text.toUpperCase().toLowerCase());
		
		//indexOf(seq) : ���ϴ� ���ڿ��� �ε����� ��ȯ�Ѵ�
		// indexOf(seq, start) : ���� ��ġ���� ���ϴ� ���ڿ��� �ε����� ��ȯ�Ѵ�
		String languages = "Java, Python, C, C++, C#, kotlin, JavaScript";
		languages += languages;
		languages += languages;
		languages += languages;
		
		
		System.out.println(languages.indexOf("Java"));
		System.out.println(languages.indexOf("Java", 1));
		
		// ����: languages ���� "java"��� ���ڿ��� ��� �ε����� ã�Ƽ� ������ �÷��ǿ� �����Ͽ� ����غ�����
		int count = 0;
		TreeSet<Integer> index1 = new TreeSet<>();
		
		for (int i = 0; i < languages.length(); ++i) {
			index1.add(languages.indexOf("Java",count));
			count = Collections.max(index1) + 1;
		}
		index1.remove(-1);
		System.out.println(index1);
		
		ArrayList<Integer> indexes = new ArrayList<>();
		String search = "Java";
		
		// �ִ��� ���� ����
		int found = -1;
		while ((found = languages.indexOf(search, found + 1)) != -1) {
			indexes.add(found);
		}
		
//		for (int start = 0; start < languages.length();) {
//			int index = languages.indexOf(search, start);
//			if (index == -1) {
//				break;
//			}
//			indexes.add(index);
//			start = index + 1;
//		}
		System.out.println("ã���� : " +  indexes);
	}
	
	// Type... : ��������, �������� ���� ������ ���ڸ� �ش� Ÿ�� �迭�� �Ѱܹ��� �� �ִ�
	// �� �������ڴ� �׻� �޼����� �������� �����ؾ� �Ѵ�
	static void printRabbitWithMessage(String... msgs) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >��");
		System.out.println(Arrays.toString(msgs));
	}

}



















