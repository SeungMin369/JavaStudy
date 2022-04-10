package myobj;

public class Weapon {
	public static void main(String[] args) {
		// ��ü ������ ���� ���� �޼��尡 ���ο��� ��� ���� ������ �����ϸ鼭 ����� ���� ����
		Weapon gun = new Weapon(10, "�񴰹�� ��");
		
		for (int i = 0; i < 30; ++i) {
			gun.upgrade();
			gun.attack();
		}
	}
	
	
	/*
	  	Į�� �Ӽ�
	  	 - ���ݷ�
	  	 - ���� ��ȭ ���
	  	 - ���뺰 ��ȭ Ȯ�� ( ��޸��� ��ȭ Ȯ���� �ٸ�)
	  	 - ���뺰 ���ݷ� ������
	  	 
  	 	������ �޼���
  	 	 - ��ȭ�ϱ�
  	 	   ���뺰 ��ȭ Ȯ���� ���� ��ȭ�� �����ϰų� �����Ѵ� (����)
  	 	   �����ϸ� ��ȭ ����� 1 �����Ѵ�
  	 	   �����ϸ� ��ȭ ����� �״�� �����ȴ� ( ���Ѵٸ� ����߷��� ����)
  	 	   
 	   	- �����ϱ�
   		  ���ݷ��� Ȯ���� �� �ִ�
	 */
	/*
	int sharpness;
	int reinforcement_level;
	int reinforce_chance;
	int Increase_by_Level;
	
	Weapon() {
		this.sharpness = 3;
		this.reinforcement_level = 1;
		this.reinforce_chance = 100;
		this.Increase_by_Level = 5;
	}
	
	void reinforce() {
		int l = reinforcement_level;
		
		int i = (int)(Math.random() * (l * 2) + 1);
		if (i == 1 || i == 2) {
			System.out.println("��ȭ�� �����Ͽ����ϴ�.");
			sharpness += 5;
			reinforcement_level++;
			reinforce_chance = (2 * 100) / (l * 2);
			return;
		} else {
			System.out.println("��ȭ�����߽��ϴ�. ��ȭ ����� 1�� �������ϴ�.");
			sharpness = 3;
			reinforcement_level = 1;
			reinforce_chance = 100;
		}
		
		
		
	}
	void attack() {
		System.out.println("������" + sharpness);
	}
	*/
	
	 String name;
	 int attack;
	 int grade;
	 int[] upgrade_chance = {
	 	90, 90, 80, 80, 80, 70, 70, 30, 30, 30,
	 	 15, 15, 15, 10, 10, 10, 10, 5, 5, 5
 	 };
	 int[] attack_increment = {
	 	10, 30, 100, 150, 200, 300, 700, 700, 700, 700, 
	 	1000, 1000, 1000, 1000, 1500, 1500, 2500, 2500, 3000, 3500
	 };
	 
	 Weapon() {
	 	name = "��������";
	 	attack = 5;
	 	grade = 1;
	 }
	 
	 Weapon( int attack, String name) {
		this.name = name;
	 	this.attack = attack;
	 	grade = 0;
	 }
	 
	 boolean upgrade() {
		 int value = (int)(Math.random() * 100);
		 
		 if (value < upgrade_chance[grade]) {
			 System.out.printf("\"%s %d\" ��ȭ�� �����ϼ̽��ϴ�!\n ", name, grade);
			 grade++;
			 return true;
		 }else {
			 System.out.println("��ȭ ���� ...");
			 return false;
		 }
	 }
	 void attack() {
		 int damage = attack;
		 
		 for (int i = 0; i < grade; ++i) {
			 damage += attack_increment[i];
		 }
		 
		 System.out.printf("\"%s %+d\"�� �ֵѷ����ϴ�. [������:%d]\n", 
				 name, grade, damage);
	 }
}
















