package quiz;

public class C07_PirateGame {
	public static void main(String[] args) {
		C07_PirateGame game = new C07_PirateGame(20, 3);
		
		game.stab(0);
				
				
				
				
				
	}
	/*
	  	1. 플레이어는 원하는 곳에 돌아가면서 칼을 찌른다
	  	
	  	2. 해적 아저씨가 날아가는 구멍이 랜덤으로 설정된다
	  	
	  	3. 플레이어는 여러명이 될 수 있다 (최소 2인, 최대는 구멍 숫자 만큼)
	  	
	  	4. 새 게임 생성시 구멍 개수를 설정할 수 있다
	  	
	  	5. 해적 아저씨를 날린 플레이어가 패배한다
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
		
		System.out.println("칼을 찌를 수 있는 번호");
		for (int i = 0; i < hole; ++i) {
			if (stab_hole[i] == 0 || stab_hole[i] == 2) {
				System.out.printf("%d, ", i);
			}
		}
		System.out.println();
		
	}
		
	void stab(int num) {
		if (check_player()) {
			System.out.println("잘못된 인원수 입니다.");
			return;
		}
		
		if (stab_hole[num] == 1) {
			System.out.println("이미 찌른 자리입니다.");
			return;
		}else if (stab_hole[num] == 2) {
			System.out.println("해적이 튀어올랐습니다. 패배했습니다.");
		}else if (stab_hole[num] == 0) {
			System.out.println(num + "번에 칼을 찔렀습니다.");
			stab_hole[num] = 1;	
		}else {
			System.out.println("없는 구멍을 찔렀습니다.");
		}
		System.out.println("칼을 찌를 수 있는 번호");
		for (int i = 0; i < hole; ++i) {
			if (stab_hole[i] == 0 || stab_hole[i] == 2) {
				System.out.printf("%d,", i);
			}
		}
				
	}
	
	
}
















