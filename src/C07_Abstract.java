                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
public class C07_Abstract {
	/*
	    # 추상 클래스 (abstract class)
	    
	     - 형태만 만들어 놓고 완성을 자손 클래스에게 미루는 클래스
	     - 내부에 추상 메서드를 포함하고 있는 클래스
	     - 하위 클래스에게 특정 메서드를 만들라고 강요하는 방식
	     
     	# 추상 메서드(abstract method)
     	
     	 - 몸통이 없는 메서드
     	 - abstract가 붙으면 직접 구현할 수 없고, 상속받은 클래스에서 구현해야 한다
	*/
	public static void main(String[] args) {
		testPokemon(new Pikachu());
		testPokemon(new Longstone());
		
		
		
		
	}
	// Pokemon 클래스를 상속받은 모든 인스턴스가 매개변수로 들어올 수 있는 메서드
	public static void testPokemon(Pokemon p) {
		p.skill1();
		p.skill2();
	}
	// 이렇게 만들면 포켓몬 한마리 추가할때마다 메서드가 하나씩 추가된다 ..
//	public static void testPokemon(Pikachu p) {
//		p.skill1();
//		p.skill2();
//	}
//	public static void testPokemon(Longstone stone) {
//		stone.skill1();
//		stone.skill2();
//	} // 한번에 주석처리는 컨트롤 슬래시, 컨트롤 쉬프트 슬래시
}

abstract class Pokemon {
	abstract void skill1();
	abstract void skill2();
}

class Pikachu extends Pokemon {

	@Override
	void skill1() {
		System.out.println("몸통박치기");
		
	}

	@Override
	void skill2() {
		System.out.println("백만볼트");
		
	}
	
}

class Longstone extends Pokemon {

	@Override
	void skill1() {
		System.out.println("땅파기");
	}

	@Override
	void skill2() {
		System.out.println("박치기");
		
	}
	
}















