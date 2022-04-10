package myobj;

public class Weapon_Main {

	public static void main(String[] args) {
		Weapon gum = new Weapon();
		
		System.out.println("예리도" + gum.sharpness);
		System.out.println("강화등급" + gum.reinforcement_level);
		System.out.println("강화확률" + gum.reinforce_chance);
		
		for (int i = 0; i < 5; ++i) {
			gum.reinforce();
			if (gum.reinforcement_level == 1) {
				break;
			}
			System.out.println("예리도" + gum.sharpness);
			System.out.println("강화등급" + gum.reinforcement_level);
			System.out.println("강화확률" + gum.reinforce_chance);
			
			System.out.print("gum은 공격했다! ");
			gum.attack();
		}
		
	}

}







