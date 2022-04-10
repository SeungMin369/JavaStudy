package myinterface;

public class Main {

	public static void main(String[] args) {
		//vehicle 인터페이스를 구현한 무언가를 만들고 테스트해보세요
		Bus bus = new Bus();
		
		test(bus);
		
		SeungMin yoo = new SeungMin();
		
		test1(yoo);
		
		
	}
	
	

	public static void test(Vehicle vehicle) {
		for  (int i = 0; i < 100; ++i) {
			System.out.println("속도를 더 냈습니다.");
			System.out.println("현재 속도는 " + vehicle.acceleration() + "km/h 입니다.");
		}
		
		System.out.println("무서워서 속도를 감소합니다.");
		for (int i = 0; i < 30; ++i) {
			System.out.println("현재 속도는 " + vehicle.deceleration() + "km/h 입니다.");
		}
		
		for (int i = 0; i < 15; ++i) {
			if (!vehicle.ride()) {
				System.out.println("더 이상 탈 수 없습니다.");
			} else {
				System.out.println("한명이 더 탔습니다.");
			}
		}
	}
	
	public static void test1(Human human) {
		for (int i = 0; i < 20; ++i) {
			System.out.println("시간이 지나서 키가 크고 몸무게가 늘어납니다");
			System.out.println("현재 나이: " + human.age() + "현재 키: " + human.height() + 
					"현재 몸무게: " + human.weight());			
		}
		
		for (int i = 0; i < 45; ++i) {
			System.out.println("운동을 해서 근육을" + human.muscle() + "kg 얻었습니다.");
		}
	}
	
	public static void gullit(FootballPlayer st) {
		System.out.println("굴리트를 강화하시겠습니까?");
	}
	
}

















