
public class C04_Static {
	/*
	  	# static (정적 영역, 클래스영역 <=> 인스턴스영역)
	  	
	  	 - static 영역은 같은 클래스의 모든 인스턴스가 공동으로 사용하는 영역이다
	  	 - 앞에 static이 붙은 자원은 같은 클래스로 만들어진 모든 인스턴스가 
	  	   공동으로 사용하는 자원이 된다.
  	   	 - static 영역은 아무리 인스턴스가 많아도 클래스당 하나 밖에 생성되지 않기 때문에 
  	   	   메모리가 절약된다.
   	   	 - static 영역은 클래스당 하나이기 때문에 클래스 이름에 .을 찍고 접근하는 것이 가능하다(권장)
   	   	 - static이 붙은 자원은 인스턴스가 생기기 전에도 호출할 수 있다
   	   	 - static 메서드는 static 자원만을 활용할 수 있는 메서드이다
	  	 - 인스턴스가 하나도 존재하지 않을 때도 static 메서드가 사용될 가능성이 존재하기 때문에
	  	   static 메서드에서는 인스턴스 자원을 사용할 수 있다
	 */
	//static int a = 10;
	//int b = 10;
	public static void main(String[] args) {
		/*
		System.out.println(붕어빵.완벽한구운시간 + "초");
		
		붕어빵.완벽한시간변경하기(35);
		
		System.out.println(붕어빵.완벽한구운시간 + "초");
		*/
		// myobj 패키지에 static 자원을 포함한 클래스를 정의해보세요
		// ※ 가로/세로, 너비/높이 금지
		
		
	}
}

class 붕어빵 {
	static int 완벽한구운시간 = 33;
	static int 가로 = 100; // 바뀌지 않는값은 static으로 해주는게 메모리낭비가 없다
	static int 세로 = 50;
	int 팥의양;
	int 구운시간;
	
	static void 완벽한시간변경하기(int time) {
		완벽한구운시간 = time;
	}
	
}
class YellowGomJelly {
	static int score = 150;
	int x;
	int y;
}
class Marine {
	static int attack = 5;
}









