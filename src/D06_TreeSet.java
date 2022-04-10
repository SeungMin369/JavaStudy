import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

import myobj.Sheep;
import myobj.ArrayList.Student1;


public class D06_TreeSet {

	/*
	  	# TreeSet
	  	
	  	- 순서가 있는 Set (순서가 없는 것은 Hash의 특징)
	  	- 중복은 허용하지 않는다 (Set의 특징)
	  	- 처음 Set에 데이터를 추가할 때 값을 정렬해서 넣기 때문에 HashSet에 비해 저장 속도가 느리다
	  	- 미리 정렬이 되어 있기 때문에 정렬된 순서로 값을 꺼내기 편리한 Set이다
	  	- 해당 TreeSet 인스턴스에서 사용할 Comparator를 지정할 수 있다
	  	
	*/
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);
		numbers.add(99);
		numbers.add(86);
		numbers.add(41);
		numbers.add(50);
		numbers.add(13);
		
		System.out.println(numbers); // 순서가 정렬이 되어 있다.
		
		// TreeSet에 원하는 Comparator를 사용하기
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				 /*
				  	자리를 바꾸고 싶다면 양수 리턴
				  	자리를 바꾸기 싫으면 음수 리턴
				  	두 값이 같은 값이면 0 리턴
				 */
				return o2 - o1;
			}
		});
		
		numbers2.addAll(numbers);
		
		System.out.println(numbers2);
		
		// * TreeSet은 Set의 일부분을 리턴하는데에 특화된 기능이 많다
		SortedSet<Integer> head = numbers.headSet(44);
		System.out.println("head" + head);
		
		SortedSet<Integer> tail = numbers.tailSet(44);
		System.out.println(tail);
		
		// 미리 정렬해놓은 방향과 반대 방향인 Set 인스턴스를 반환한다
		NavigableSet<Integer> desc = numbers.descendingSet();
		System.out.println(desc);
		
		System.out.println("first" + numbers.first());
		System.out.println("last" + numbers.last());
		
		System.out.println("pollFirst?" + numbers.pollFirst());
		System.out.println(numbers);
		System.out.println("pollLast?" + numbers.pollLast());
		System.out.println(numbers);		
		System.out.println("subSet(30, 70)?" + numbers.subSet(30, 70)); // 부분집합
		
		System.out.println(numbers.comparator()); // Set의 정렬 방식을 반환
		System.out.println(numbers2.comparator()); // 익명 이너클래스를 재활용 할 수 있다
		
		TreeSet<Integer> number3 = new TreeSet<>(numbers2.comparator());
		
		List<Integer> list = new ArrayList<>(numbers);
		Collections.sort(list, numbers2.comparator());
		
		System.out.println("list: " + list);
		
		System.out.println("contains 41? " + numbers2.contains(41));
		System.out.println("contains 42? " + list.contains(42));
		
		
		

		ArrayList<Integer> a = new ArrayList<>();
		a.add(41);
		
		// 아래의 코드가 true가 나오도록 null응 다른 것으로 바꿔보세요(3가지 이상)
		System.out.println(list.containsAll(a));
		System.out.println(list.containsAll(numbers2.subSet(43, 41)));
		System.out.println(list.containsAll(list));
		
		// 학생 인스턴스를 100개 만들고, 트리셋에 평균 점수 순으로 저장한 후
		// 평균 점수가 50점에서 70점 사이인 학생이 모두 몇명인지 세어보세요
		
		TreeSet<Student1> stu_set= new TreeSet<>();
		
		for (int i = 0; i < 100; ++i) {
			stu_set.add(new Student1());
		}
		
		System.out.println(stu_set);
		
		System.out.println("학생은 총 " + stu_set.size() + "명 입니다.");
		
		Student1 from = new Student1();
		Student1 to = new Student1();
		
		from.avg = 50.0;
		to.avg = 70.0;
		
		System.out.println(stu_set.subSet(from, to).size());
		
		TreeSet<Sheep> sheeps = new TreeSet<>();
		
		for (int i = 0; i < 100; ++i) {
			sheeps.add(new Sheep());
		}
		
		System.out.println(sheeps);
		
		Sheep fro = new Sheep();
		Sheep t = new Sheep();
		
		fro.height = 160;
		t.height = 120;
		
		System.out.println("키가 120부터 160인 양의 수 " + sheeps.subSet(t, fro).size() + "마리");
		
	}

}


























