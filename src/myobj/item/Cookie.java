package myobj.item;

public class Cookie extends Item {
	public Cookie(String name, int price) {
		super(name, price);
	}

	@Override
	public void use() {
		System.out.println("��Ű�� �Դ´�.");
		
	}
	
//	public void info() {
//		���̳��� �������̵尡 �ȵȴ�.
//	}
}
