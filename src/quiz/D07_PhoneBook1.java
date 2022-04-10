package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class D07_PhoneBook1 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static class Info {
		// 내용은 양심껏
		String name;
		String addr;
		String birth_year; 
		
		Info() {
			this.name = "번호";
			this.addr = "주소";
			this.birth_year = "태어난 해";
			
		}
		
		@Override
		public String toString() {
			return String.format("이름: %s\n주소: %s\n태어난 해: %s\n", name, addr, birth_year);
		}
		
	}
	
	public static HashMap<String, HashMap<String, Info>> phoneBook;

	public D07_PhoneBook1() {
		phoneBook = new HashMap<>();
		
	}
	
	public static void main(String[] args) {
		
		new D07_PhoneBook2();
		
		phoneBook.put("아이티뱅크", new HashMap<>());
		
		
		phoneBook.get("아이티뱅크").put("01037639849", new Info());
		
		System.out.println(phoneBook.get("아이티뱅크").keySet());
		
		phoneBook.get("아이티뱅크").get("01037639849").name = "유승민";
		phoneBook.get("아이티뱅크").get("01037639849").addr = "성남시 중원구";
		phoneBook.get("아이티뱅크").get("01037639849").birth_year = "1993";
		
		phoneBook.get("아이티뱅크").put("01049406393", new Info());
		
		System.out.println(phoneBook.get("아이티뱅크").keySet());
		
		phoneBook.get("아이티뱅크").get("01049406393").name = "유정민";
		phoneBook.get("아이티뱅크").get("01049406393").addr = "성남시 수정구";
		phoneBook.get("아이티뱅크").get("01049406393").birth_year = "1992";
		
		phoneBook.get("아이티뱅크").put("01050301208", new Info());
		
		System.out.println(phoneBook.get("아이티뱅크").keySet());
		
		phoneBook.get("아이티뱅크").get("01050301208").name = "권혁준";
		phoneBook.get("아이티뱅크").get("01050301208").addr = "서울특별시 노량진";
		phoneBook.get("아이티뱅크").get("01050301208").birth_year = "1989";
		
		System.out.println(phoneBook.get("아이티뱅크").values());
		
		ArrayList<String> b = new ArrayList<>();
		for (String a : phoneBook.get("아이티뱅크").keySet()) {
			b.add(a);
		}
		System.out.println("리스트" + b.toString());			
		
		Collections.sort(b);
		
		System.out.println("정리한 리스트" + b.toString());
		
		Collections.reverse(b);
		
		System.out.println("뒤집은 리스트" + b.toString());
		
	}
	
	static void input_g() {
		System.out.print("추가할 그륩명을 입력하세요 >");
		String a = sc.nextLine();
		
		phoneBook.put(a, new HashMap<>());
		
		System.out.println("추가되어진 그륩");
		System.out.println(phoneBook.keySet());
	}
	
	static void input_Num() {
		while (true) {
			System.out.print("전화번호를 추가할 그륩명을 입력하세요 >");
			String a = sc.nextLine();
			System.out.print("추가할 전화번호를 입력하세요 >");
			String b = sc.nextLine();
			System.out.print("이름을 입력하세요 >");
			String c = sc.nextLine();
			System.out.print("주소를 입력하세요 >");
			String d = sc.nextLine();
			System.out.print("태어난 해를 입력하세요 >");
			String e = sc.nextLine();
			
			phoneBook.get(a).put(b, new Info());
			System.out.printf("그륩 %s의 번호들", a);
			System.out.println(phoneBook.get(a).keySet());
			
			phoneBook.get(a).get(b).name = c;
			phoneBook.get(a).get(b).addr = d;
			phoneBook.get(a).get(b).birth_year = e;
			
			System.out.println("추가하신 정보");
			System.out.println(phoneBook.get(a).get(b).toString());
			
			System.out.print("더 추가 하시겠습니까? 예 아니오 입력 >");
			String f = sc.nextLine();
			
			if (f.equals("아니오")) {
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
		
		System.out.println("학원 목록" + b.toString());		
		
		Collections.sort(b);
		
		System.out.println("오름차순 학원 목록" + b.toString());
		
		for (Entry<String, HashMap> entry : a.entrySet()) {
			
		}
		
		
		
		
		
	}
	
	static void dsc(HashMap<String, HashMap> a) {
		ArrayList<String> b = new ArrayList<>();
		for (String c : a.keySet()) {
			b.add(c);
		}
		System.out.println("학원 목록" + b.toString());
		
		Collections.sort(b);
		Collections.reverse(b);
		
		System.out.println("내림차순 학원목록" + b.toString());
		
	}
	
	
	
	
	
	
	/*
	 	# HashMap을 이용해 전화번호부를 구현해보세요
	 	
	 	1. phonebook에는 그륩/전화번호/정보을 저장할 수 있다
	 	2. 그륩명을 키값으로 넣으면 해당 그륩에 해당하는 HashMap을 꺼낼 수 있다
	 	3. 꺼낸 HashMap에 전화번호를 넣으면 이름을 꺼낼 수 있다.
	 	
	 	# 구현해야 할 메서드
	 	
	 	1. 새로운 그륩을 추가하는 메서드
	 	2. 그륩에 새로운 전화번호를 등록하는 메서드
	 	3. 등록된 모든 번호를 선택한 항목 기준으로 오름/내림차순으로 보여주는 메서드
	 	4. 이름을 일부를 입력하면 일치하는 모든 정보가 검색되는 메서드
	 	5. 전화번호의 일부를 입력하면 일치하는 모든 정보가 검색되는 메서드
	 */
	
}



















