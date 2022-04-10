
public class B10_Operator {

	public static void main(String[] args) {
		/*
		  	# 삼항 연산자
		  	- 조건 ? 예 : 아니오;
		 */
		
		
		int turn = 0;
		int apple = 15;
		int basket = apple % 10 != 0 ? apple / 10 + 1 : apple / 10;// 삼항연산자 예시
												//이질문에 대한 답이	yes		no // 삼항 연산자
		System.out.printf("게임 종료! %s의 승리!\n", turn == 0 ? "컴퓨터" : "플레이어");
		
		char ch = '0';
		String msg = ch >= 'A' && ch <= 'Z' ? "대문자입니다." : "대문자가 아닙니다.";
		
		
		
		
	}

}
