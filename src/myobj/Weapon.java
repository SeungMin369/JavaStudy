package myobj;

public class Weapon {
	public static void main(String[] args) {
		// 객체 지향은 내가 만든 메서드가 메인에서 어떻게 갖다 쓰일지 생각하면서 만드는 것이 좋다
		Weapon gun = new Weapon(10, "비눗방울 총");
		
		for (int i = 0; i < 30; ++i) {
			gun.upgrade();
			gun.attack();
		}
	}
	
	
	/*
	  	칼의 속성
	  	 - 공격력
	  	 - 현재 강화 등급
	  	 - 레밸별 강화 확률 ( 등급마다 강화 확률이 다름)
	  	 - 레밸별 공격력 증가폭
	  	 
  	 	무기의 메서드
  	 	 - 강화하기
  	 	   레밸별 강화 확률에 따라 강화가 성공하거나 실패한다 (랜덤)
  	 	   성공하면 강화 등급이 1 증가한다
  	 	   실패하면 강화 등급이 그대로 유지된다 ( 원한다면 떨어뜨려도 좋음)
  	 	   
 	   	- 공격하기
   		  공격력을 확인할 수 있다
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
			System.out.println("강화에 성공하였습니다.");
			sharpness += 5;
			reinforcement_level++;
			reinforce_chance = (2 * 100) / (l * 2);
			return;
		} else {
			System.out.println("강화실패했습니다. 강화 등급이 1로 떨어집니다.");
			sharpness = 3;
			reinforcement_level = 1;
			reinforce_chance = 100;
		}
		
		
		
	}
	void attack() {
		System.out.println("데미지" + sharpness);
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
	 	name = "나뭇가지";
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
			 System.out.printf("\"%s %d\" 강화에 성공하셨습니다!\n ", name, grade);
			 grade++;
			 return true;
		 }else {
			 System.out.println("강화 실패 ...");
			 return false;
		 }
	 }
	 void attack() {
		 int damage = attack;
		 
		 for (int i = 0; i < grade; ++i) {
			 damage += attack_increment[i];
		 }
		 
		 System.out.printf("\"%s %+d\"를 휘둘렀습니다. [데미지:%d]\n", 
				 name, grade, damage);
	 }
}
















