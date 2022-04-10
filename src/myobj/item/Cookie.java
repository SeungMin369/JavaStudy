package myobj.item;

public class Cookie extends Item {
	public Cookie(String name, int price) {
		super(name, price);
	}

	@Override
	public void use() {
		System.out.println("쿠키를 먹는다.");
		
	}
	
//	public void info() {
//		파이널은 오버라이드가 안된다.
//	}
}
