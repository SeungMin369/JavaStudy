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
	  	
	  	- ������ �ִ� Set (������ ���� ���� Hash�� Ư¡)
	  	- �ߺ��� ������� �ʴ´� (Set�� Ư¡)
	  	- ó�� Set�� �����͸� �߰��� �� ���� �����ؼ� �ֱ� ������ HashSet�� ���� ���� �ӵ��� ������
	  	- �̸� ������ �Ǿ� �ֱ� ������ ���ĵ� ������ ���� ������ ������ Set�̴�
	  	- �ش� TreeSet �ν��Ͻ����� ����� Comparator�� ������ �� �ִ�
	  	
	*/
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);
		numbers.add(99);
		numbers.add(86);
		numbers.add(41);
		numbers.add(50);
		numbers.add(13);
		
		System.out.println(numbers); // ������ ������ �Ǿ� �ִ�.
		
		// TreeSet�� ���ϴ� Comparator�� ����ϱ�
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				 /*
				  	�ڸ��� �ٲٰ� �ʹٸ� ��� ����
				  	�ڸ��� �ٲٱ� ������ ���� ����
				  	�� ���� ���� ���̸� 0 ����
				 */
				return o2 - o1;
			}
		});
		
		numbers2.addAll(numbers);
		
		System.out.println(numbers2);
		
		// * TreeSet�� Set�� �Ϻκ��� �����ϴµ��� Ưȭ�� ����� ����
		SortedSet<Integer> head = numbers.headSet(44);
		System.out.println("head" + head);
		
		SortedSet<Integer> tail = numbers.tailSet(44);
		System.out.println(tail);
		
		// �̸� �����س��� ����� �ݴ� ������ Set �ν��Ͻ��� ��ȯ�Ѵ�
		NavigableSet<Integer> desc = numbers.descendingSet();
		System.out.println(desc);
		
		System.out.println("first" + numbers.first());
		System.out.println("last" + numbers.last());
		
		System.out.println("pollFirst?" + numbers.pollFirst());
		System.out.println(numbers);
		System.out.println("pollLast?" + numbers.pollLast());
		System.out.println(numbers);		
		System.out.println("subSet(30, 70)?" + numbers.subSet(30, 70)); // �κ�����
		
		System.out.println(numbers.comparator()); // Set�� ���� ����� ��ȯ
		System.out.println(numbers2.comparator()); // �͸� �̳�Ŭ������ ��Ȱ�� �� �� �ִ�
		
		TreeSet<Integer> number3 = new TreeSet<>(numbers2.comparator());
		
		List<Integer> list = new ArrayList<>(numbers);
		Collections.sort(list, numbers2.comparator());
		
		System.out.println("list: " + list);
		
		System.out.println("contains 41? " + numbers2.contains(41));
		System.out.println("contains 42? " + list.contains(42));
		
		
		

		ArrayList<Integer> a = new ArrayList<>();
		a.add(41);
		
		// �Ʒ��� �ڵ尡 true�� �������� null�� �ٸ� ������ �ٲ㺸����(3���� �̻�)
		System.out.println(list.containsAll(a));
		System.out.println(list.containsAll(numbers2.subSet(43, 41)));
		System.out.println(list.containsAll(list));
		
		// �л� �ν��Ͻ��� 100�� �����, Ʈ���¿� ��� ���� ������ ������ ��
		// ��� ������ 50������ 70�� ������ �л��� ��� ������� �������
		
		TreeSet<Student1> stu_set= new TreeSet<>();
		
		for (int i = 0; i < 100; ++i) {
			stu_set.add(new Student1());
		}
		
		System.out.println(stu_set);
		
		System.out.println("�л��� �� " + stu_set.size() + "�� �Դϴ�.");
		
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
		
		System.out.println("Ű�� 120���� 160�� ���� �� " + sheeps.subSet(t, fro).size() + "����");
		
	}

}

























