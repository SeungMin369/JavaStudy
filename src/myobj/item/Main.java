package myobj.item;

public class Main {
	int money;
	
	public Main() {
		money = 10000;
	}
	
	public void purchase(Item item) {
		this.money -= item.price;
		System.out.println(item.name + "�� ���" + this.money + "���� ���ҽ��ϴ�.");
	}
	
	public static void main(String[] args) {
		Cookie a = new Cookie("������Ű", 2000);
		Snack b = new Snack("����Ĩ", 1500);
		Drink c = new Drink("Ʈ����ī��", 2500);
		
		Item d =  new Cookie("������Ű", 20000);
		Item e = new Snack("Ȳ�� ����Ĩ", 200000);
		Item f = new Drink("�������ֽ�", 900000000);
	
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
		
		m.purchase(new Cookie("������Ű", 2000));
		m.purchase(new Snack("����Ĩ", 1500));
		m.purchase(new Drink("Ʈ����ī��", 2500));
	}
	


}
