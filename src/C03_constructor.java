import java.util.Arrays;

public class C03_constructor {
	/*
	  	# 클래스의 생성자 (constructor)
	  	
	  	 - 클래스의 이름과 똑같은 이름의 메서드
	  	 - 메서드지만 리턴 타입을 정의하지 않는다
	  	 - 인스턴스를 생성할 때 new와 함께 사용된다
	  	 - 인스턴스 생성시 가장먼저 호출되기 때문에 주로 인스턴스 초기화에 사용된다
	  	 - 생성자를 하나도 정의하지 않은 클래스에는 자동으로 생성된 기본 생성자가 존재한다.
	  	 	(아무일도 하지 않음)
  	 	 - 따로 정의한 생성자가 존재하는 클래스는 기본생성자를 자동으로 생성하지 않는다.
  	 	 	(기본생성자를 사용하고 싶다면 기본 생성자를 추가로 정의해야 한다)
  	 	 	
	  	 
	 */
	public static void main(String[] arge) {
		Window w1 = new Window();
		Apple a1 = new Apple();
		Orange o1 = new Orange();
		Peach p1 = new Peach("분홍색");
		
		Peach peach01 = new Peach("연분홍색");
		Peach peach02 = new Peach("덜익은색");
		Peach peach03 = new Peach();
		
		
		String str = String.format("%d:%d:%d", 10, 20, 30);
		System.out.println(str);
		
		System.out.println(o1.sweet);
		System.out.println(o1.address);
		System.out.println(Arrays.toString(o1.color)); // Arrays.toString(i) 는 배열을 출력
		
		System.out.println("인스턴스 변수는 배열처럼 초기화가 미리 되어있다");
		System.out.println(a1.color);
		System.out.println(a1.calorie);
		System.out.println(w1.open);
		System.out.println(w1.lock);
		
		
		
		
	}
}
class Peach {
	String color;
	int size;
	
	// this : 각 인스턴스 자기 자신을 가리킨다
	Peach(String color) {
		this.color = color; // 컬러에 컬러를 넣는다는 말은 이상해서 앞에 this를 넣어서 인스턴스에 값을 넣는다는 의미가 된다
	}
	Peach(int size) {
		this.size = size;
		this.color = "default color";
	}
	// 생성자 오버로딩
	Peach() {
		this.color = "기본색";
		this.size = 10;
	}
}



class Orange {
	
	int[] color; //참조형 변수는 null이 들어간다
	double sweet;
	String address;
	
	Orange() {
		color = new int[] {255, 255, 0};
		sweet = 10.0;
		address = "제주도";
	}
}


















