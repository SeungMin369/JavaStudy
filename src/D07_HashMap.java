import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import myobj.ArrayList.Student1;

public class D07_HashMap {
	/*
	  	# Map
	  	
	  	- 데이터를 Key와 Value 한 쌍으로 저장하는 방식의 자료구조
	  	- Key값을 통해 Value에 접근할 수 있다
	  	- Key는 중복을 허용하지 않는다
	  	
	 */
	public static void main(String[] args) {
		// 첫 번째 제네릴은 Key의 타입이고, 두번째 제네릭은 Value의 타입이다
		HashMap<String, String> addr = new HashMap<>();
		
		// Map.put(Key, Value) 	 : 맵에 데이터를 추가한다
		// Map.put(Map)			 : 다른 맵의 데이터를 모두 추가한다
		// Map.putIfAbsent() 	 : 비어있으면 넣고, 뭔가 있으면 꺼내준다, 넣은 경우 null을 리턴한다
		addr.put("우리집", "서울특별시 동작구 노량진 1동 ..");
		addr.put("직장", "서울특별시 강남구 강남대로 84길 16 11, 12층");
		addr.put("직장2", "서울특별시 종로구 종로 3가");
		
		System.out.println("1" + addr.putIfAbsent("우리집", "넣을 수 없다"));
		System.out.println("2" + addr.putIfAbsent("우리집2", "넣을 수 있다"));
		
		// 이미 존재하는 키에 값을 추가하면 value를 수정한다
		addr.put("직장", "없어짐");
		
		System.out.println(addr.get("우리집"));
		System.out.println(addr.get("직장"));
		System.out.println(addr.get("직장2"));
		
		// 직접 정의한 타입도 사용할 수 있다
		HashMap<Integer, Student1> students = new HashMap<>();
		
		students.put(1, new Student1());
		students.put(2, new Student1());
		
		System.out.println(students.get(1));
		System.out.println(students.get(2));
		
		
		// 여러가지 타입을 사용할 수 있다
		HashMap<String, Object> info = new HashMap<>();
		
		info.put("이름", "홍길동");
		info.put("나이", 23);
		info.put("전화번호", "010-3763-9849");
		info.put("좋아하는 것", new String[] {"영화", "운동", "햄버거"});
		info.put("친구 목록", new ArrayList<>());
		
		// 연습문제: 친구 목록에 데이터를 3개만 추가해보세요
//		ArrayList<String> friends = (ArrayList<String>)info.get("친구 목록");
		
		((ArrayList<String>)info.get("친구 목록")).add("철수");
		((ArrayList<String>)info.get("친구 목록")).add("영희");
		((ArrayList<String>)info.get("친구 목록")).add("민수");
		System.out.println();
		System.out.println(info.get("친구 목록"));
		
		
		/*
		  	# 반복문으로 Map타입 활용하기
		  	
		  	- Map.keySet() : key들로 이루어진 Set을 반환한다
		  	- Map.values() : 값들로 이루어진 Collection을 반환한다
		  	- Map.entrySet() : Entry<key, value>로 이루어진 Set을 반환한다
		 */
		System.out.println(info.keySet());
		
		for (String key : info.keySet()) {
			System.out.println("반복분으로 꺼낸 내용: " + info.get(key));
		}
		
		System.out.println("============================================================");
		
		System.out.println(info.values());
		
		List value_list = new ArrayList<>(info.values());
		System.out.println(value_list);
		
		for (Object value : info.values()) {
			System.out.println(value);
		}
		
		for (Entry<String, Object> entry : info.entrySet()) {
			System.out.print(entry.getKey() + "\t: ");
			System.out.println(entry.getValue());
		}
	}
}






















