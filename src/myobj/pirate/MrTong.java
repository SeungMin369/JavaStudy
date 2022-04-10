package myobj.pirate;

import java.util.Arrays;

public class MrTong {
	// true	: 해당 구멍은 찔린적 있음
	// false: 해당 구멍은 아직 찔린적 없음
	boolean[] stabbed;
	boolean[] launch;
	
	
	// launched가 true면 통아저씨가 발사된 상태
	public boolean launched;
	
	public MrTong(int size) {
		stabbed = new boolean[size];
		launch = new boolean[size];
		//정답 우선 1 ~ 4개 생성
		for (int i = 0; i < 4; ++i) {
			launch[(int)(Math.random() * size)] = true;
		}
		

		}
//		System.out.println("1000번 섞인 통아저씨 발사버튼"); 발사버튼 확인
//		System.out.println(Arrays.toString(launch));
	
	// 이미 찔린 곳이라면 return false, 아니라면 찌르고 잘 찔렀다며 return true
	public boolean stab(int index) {
		if (stabbed[index]) {
			return false;
		} else {
			stabbed[index] = true;
			
//			if (launch[index] == true) {
//				launch = true;
//			} else {
//				launch = false;
//			}
//			아래랑 똑같은 말 위에꺼를 아래 한줄로 적었다	
			launched = launch[index];
			return true;
		}
		
	}
	
	public boolean[] getStabbed() {
		return stabbed;
	}
}
