
public class B10_Operator {

	public static void main(String[] args) {
		/*
		  	# ���� ������
		  	- ���� ? �� : �ƴϿ�;
		 */
		
		
		int turn = 0;
		int apple = 15;
		int basket = apple % 10 != 0 ? apple / 10 + 1 : apple / 10;// ���׿����� ����
												//�������� ���� ����	yes		no // ���� ������
		System.out.printf("���� ����! %s�� �¸�!\n", turn == 0 ? "��ǻ��" : "�÷��̾�");
		
		char ch = '0';
		String msg = ch >= 'A' && ch <= 'Z' ? "�빮���Դϴ�." : "�빮�ڰ� �ƴմϴ�.";
		
		
		
		
	}

}
