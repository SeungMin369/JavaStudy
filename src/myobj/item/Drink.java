package myobj.item;

public class Drink extends Item {
	public Drink(String name, int price) {
		super(name, price);
	}

	@Override
	public void use() {
		System.out.println("������� �Դ´�.");
	}
}
