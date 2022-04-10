package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class D07_PhoneBook1 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static class Info {
		// ������ ��ɲ�
		String name;
		String addr;
		String birth_year; 
		
		Info() {
			this.name = "��ȣ";
			this.addr = "�ּ�";
			this.birth_year = "�¾ ��";
			
		}
		
		@Override
		public String toString() {
			return String.format("�̸�: %s\n�ּ�: %s\n�¾ ��: %s\n", name, addr, birth_year);
		}
		
	}
	
	public static HashMap<String, HashMap<String, Info>> phoneBook;

	public D07_PhoneBook1() {
		phoneBook = new HashMap<>();
		
	}
	
	public static void main(String[] args) {
		
		new D07_PhoneBook2();
		
		phoneBook.put("����Ƽ��ũ", new HashMap<>());
		
		
		phoneBook.get("����Ƽ��ũ").put("01037639849", new Info());
		
		System.out.println(phoneBook.get("����Ƽ��ũ").keySet());
		
		phoneBook.get("����Ƽ��ũ").get("01037639849").name = "���¹�";
		phoneBook.get("����Ƽ��ũ").get("01037639849").addr = "������ �߿���";
		phoneBook.get("����Ƽ��ũ").get("01037639849").birth_year = "1993";
		
		phoneBook.get("����Ƽ��ũ").put("01049406393", new Info());
		
		System.out.println(phoneBook.get("����Ƽ��ũ").keySet());
		
		phoneBook.get("����Ƽ��ũ").get("01049406393").name = "������";
		phoneBook.get("����Ƽ��ũ").get("01049406393").addr = "������ ������";
		phoneBook.get("����Ƽ��ũ").get("01049406393").birth_year = "1992";
		
		phoneBook.get("����Ƽ��ũ").put("01050301208", new Info());
		
		System.out.println(phoneBook.get("����Ƽ��ũ").keySet());
		
		phoneBook.get("����Ƽ��ũ").get("01050301208").name = "������";
		phoneBook.get("����Ƽ��ũ").get("01050301208").addr = "����Ư���� �뷮��";
		phoneBook.get("����Ƽ��ũ").get("01050301208").birth_year = "1989";
		
		System.out.println(phoneBook.get("����Ƽ��ũ").values());
		
		ArrayList<String> b = new ArrayList<>();
		for (String a : phoneBook.get("����Ƽ��ũ").keySet()) {
			b.add(a);
		}
		System.out.println("����Ʈ" + b.toString());			
		
		Collections.sort(b);
		
		System.out.println("������ ����Ʈ" + b.toString());
		
		Collections.reverse(b);
		
		System.out.println("������ ����Ʈ" + b.toString());
		
	}
	
	static void input_g() {
		System.out.print("�߰��� �׷����� �Է��ϼ��� >");
		String a = sc.nextLine();
		
		phoneBook.put(a, new HashMap<>());
		
		System.out.println("�߰��Ǿ��� �׷�");
		System.out.println(phoneBook.keySet());
	}
	
	static void input_Num() {
		while (true) {
			System.out.print("��ȭ��ȣ�� �߰��� �׷����� �Է��ϼ��� >");
			String a = sc.nextLine();
			System.out.print("�߰��� ��ȭ��ȣ�� �Է��ϼ��� >");
			String b = sc.nextLine();
			System.out.print("�̸��� �Է��ϼ��� >");
			String c = sc.nextLine();
			System.out.print("�ּҸ� �Է��ϼ��� >");
			String d = sc.nextLine();
			System.out.print("�¾ �ظ� �Է��ϼ��� >");
			String e = sc.nextLine();
			
			phoneBook.get(a).put(b, new Info());
			System.out.printf("�׷� %s�� ��ȣ��", a);
			System.out.println(phoneBook.get(a).keySet());
			
			phoneBook.get(a).get(b).name = c;
			phoneBook.get(a).get(b).addr = d;
			phoneBook.get(a).get(b).birth_year = e;
			
			System.out.println("�߰��Ͻ� ����");
			System.out.println(phoneBook.get(a).get(b).toString());
			
			System.out.print("�� �߰� �Ͻðڽ��ϱ�? �� �ƴϿ� �Է� >");
			String f = sc.nextLine();
			
			if (f.equals("�ƴϿ�")) {
				break;
			} else {
				continue;
			}
		}
			
	}
	
	static void search(String name) {
	}
	
	static void asc(HashMap<String, HashMap> a) {
		ArrayList<String> b = new ArrayList<>();
		for (String c : a.keySet()) {
			b.add(c);
		}
		
		System.out.println("�п� ���" + b.toString());		
		
		Collections.sort(b);
		
		System.out.println("�������� �п� ���" + b.toString());
		
		for (Entry<String, HashMap> entry : a.entrySet()) {
			
		}
		
		
		
		
		
	}
	
	static void dsc(HashMap<String, HashMap> a) {
		ArrayList<String> b = new ArrayList<>();
		for (String c : a.keySet()) {
			b.add(c);
		}
		System.out.println("�п� ���" + b.toString());
		
		Collections.sort(b);
		Collections.reverse(b);
		
		System.out.println("�������� �п����" + b.toString());
		
	}
	
	
	
	
	
	
	/*
	 	# HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
	 	
	 	1. phonebook���� �׷�/��ȭ��ȣ/������ ������ �� �ִ�
	 	2. �׷����� Ű������ ������ �ش� �׷��� �ش��ϴ� HashMap�� ���� �� �ִ�
	 	3. ���� HashMap�� ��ȭ��ȣ�� ������ �̸��� ���� �� �ִ�.
	 	
	 	# �����ؾ� �� �޼���
	 	
	 	1. ���ο� �׷��� �߰��ϴ� �޼���
	 	2. �׷��� ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
	 	3. ��ϵ� ��� ��ȣ�� ������ �׸� �������� ����/������������ �����ִ� �޼���
	 	4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ �˻��Ǵ� �޼���
	 	5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ �˻��Ǵ� �޼���
	 */
	
}



















