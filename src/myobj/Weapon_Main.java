package myobj;

public class Weapon_Main {

	public static void main(String[] args) {
		Weapon gum = new Weapon();
		
		System.out.println("������" + gum.sharpness);
		System.out.println("��ȭ���" + gum.reinforcement_level);
		System.out.println("��ȭȮ��" + gum.reinforce_chance);
		
		for (int i = 0; i < 5; ++i) {
			gum.reinforce();
			if (gum.reinforcement_level == 1) {
				break;
			}
			System.out.println("������" + gum.sharpness);
			System.out.println("��ȭ���" + gum.reinforcement_level);
			System.out.println("��ȭȮ��" + gum.reinforce_chance);
			
			System.out.print("gum�� �����ߴ�! ");
			gum.attack();
		}
		
	}

}







