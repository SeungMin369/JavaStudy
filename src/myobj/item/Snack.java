package myobj.item;

public class Snack extends Item {
	public Snack(String name, int price) {
		super(name, price);		
	}

	@Override
	public void use() {
		System.out.println("과자를 먹는다.");
		
	}
}
