package myobj.item;

public class Main {
	int money;
	
	public Main() {
		money = 10000;
	}
	
	public void purchase(Item item) {
		this.money -= item.price;
		System.out.println(item.name + "을 사고" + this.money + "원이 남았습니다.");
	}
	
	public static void main(String[] args) {
		Cookie a = new Cookie("초코쿠키", 2000);
		Snack b = new Snack("감자칩", 1500);
		Drink c = new Drink("트로피카나", 2500);
		
		Item d =  new Cookie("포츈쿠키", 20000);
		Item e = new Snack("황금 감자칩", 200000);
		Item f = new Drink("수명연장주스", 900000000);
	
		a.use();
		b.use();
		c.use();
		d.use();
		e.use();
		f.use();
		
		a.info();
		b.info();
		c.info();
		d.info();
		e.info();
		f.info();
		
		Main m = new Main();
		
		m.purchase(new Cookie("초코쿠키", 2000));
		m.purchase(new Snack("감자칩", 1500));
		m.purchase(new Drink("트로피카나", 2500));
	}
	


}
