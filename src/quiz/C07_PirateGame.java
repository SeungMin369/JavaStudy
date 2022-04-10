package quiz;

public class C07_PirateGame {
	public static void main(String[] args) {
		C07_PirateGame game = new C07_PirateGame(20, 3);
		
		game.stab(0);
				
				
				
				
				
	}
	/*
	  	1. �÷��̾�� ���ϴ� ���� ���ư��鼭 Į�� ���
	  	
	  	2. ���� �������� ���ư��� ������ �������� �����ȴ�
	  	
	  	3. �÷��̾�� �������� �� �� �ִ� (�ּ� 2��, �ִ�� ���� ���� ��ŭ)
	  	
	  	4. �� ���� ������ ���� ������ ������ �� �ִ�
	  	
	  	5. ���� �������� ���� �÷��̾ �й��Ѵ�
	*/
	
	int hole;	
	int players;
	
	int cueue = 0;
	int random_num;
	
	int[] stab_hole;
	
	
	boolean check_player() {
		return players < 2 || players > hole;
	}
	
			
	public C07_PirateGame(int hole, int players) {		
		this.hole = hole;
		this.players = players;
		
		stab_hole = new int[hole];	
		
		for (int i = 0; i < hole; ++i) {
			int r = (int)(Math.random() * 5);
			if (r == 0) {
				stab_hole[i] = 2;
			}
		}
		
		System.out.println("Į�� � �� �ִ� ��ȣ");
		for (int i = 0; i < hole; ++i) {
			if (stab_hole[i] == 0 || stab_hole[i] == 2) {
				System.out.printf("%d, ", i);
			}
		}
		System.out.println();
		
	}
		
	void stab(int num) {
		if (check_player()) {
			System.out.println("�߸��� �ο��� �Դϴ�.");
			return;
		}
		
		if (stab_hole[num] == 1) {
			System.out.println("�̹� � �ڸ��Դϴ�.");
			return;
		}else if (stab_hole[num] == 2) {
			System.out.println("������ Ƣ��ö����ϴ�. �й��߽��ϴ�.");
		}else if (stab_hole[num] == 0) {
			System.out.println(num + "���� Į�� �񷶽��ϴ�.");
			stab_hole[num] = 1;	
		}else {
			System.out.println("���� ������ �񷶽��ϴ�.");
		}
		System.out.println("Į�� � �� �ִ� ��ȣ");
		for (int i = 0; i < hole; ++i) {
			if (stab_hole[i] == 0 || stab_hole[i] == 2) {
				System.out.printf("%d,", i);
			}
		}
				
	}
	
	
}
















