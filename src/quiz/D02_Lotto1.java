package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


// 강사님 풀이방법
public class D02_Lotto1 {
	
	
	final private static int LOTTO_SIZE = 45;
	final private static int BONUS_INDEX = 3;
	private static int bonus = 0;
	
	public static Set<Integer> generate(int len) {
		HashSet<Integer> lotto = new HashSet<>();
		while (lotto.size() != len) {
			int ranNum = (int)(Math.random() * LOTTO_SIZE + 1);
			//System.out.println("Set에 " + ranNum + "이 더해집니다.");
			lotto.add(ranNum);
			
			if (len == 7 && lotto.size() == BONUS_INDEX) {
				bonus = ranNum;
			}
		}
		
		return lotto;
	}
	public void test() {
		
				
		Set<Integer> win = generate(7);
		
		System.out.println("당첨번호는" + win + "입니다. 그 중 보너스 번호는 " + bonus + "입니다.");
		
		List<Integer> checkList = new ArrayList<>(7);
		long count = 0;
		long spent = 0;
		while (true) {
			Set<Integer> blackcow = generate(6);
			count++;
			
			checkList.addAll(win);
			checkList.removeAll(blackcow);
			
			if (checkList.size() == 1) {
				spent = count * 1000;
				
				if (checkList.get(0) == bonus) {
					System.out.println("1등 당첨입니다. " + count + "번 도전 하셧으며"
							+ "여태까지 쓰신 돈은 " + spent + "원 입니다.");
				} else {
					System.out.println("2등 당첨입니다. " + count + "번 도전 하셧으며"
							+ "여태까지 쓰신 돈은 " + spent + "원 입니다.");
				}
				break;
			}
			checkList.clear();
			
		}
	}
	
	public static void main(String[] args) {
		
		D02_Lotto1 quiz = new D02_Lotto1();
		
		for (int i = 0; i < 10; ++i) {
			quiz.test();
		}
	}

	
}
