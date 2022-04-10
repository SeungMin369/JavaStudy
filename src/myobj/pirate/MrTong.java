package myobj.pirate;

import java.util.Arrays;

public class MrTong {
	// true	: �ش� ������ ���� ����
	// false: �ش� ������ ���� ���� ����
	boolean[] stabbed;
	boolean[] launch;
	
	
	// launched�� true�� ��������� �߻�� ����
	public boolean launched;
	
	public MrTong(int size) {
		stabbed = new boolean[size];
		launch = new boolean[size];
		//���� �켱 1 ~ 4�� ����
		for (int i = 0; i < 4; ++i) {
			launch[(int)(Math.random() * size)] = true;
		}
		

		}
//		System.out.println("1000�� ���� ������� �߻��ư"); �߻��ư Ȯ��
//		System.out.println(Arrays.toString(launch));
	
	// �̹� �� ���̶�� return false, �ƴ϶�� ��� �� �񷶴ٸ� return true
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
//			�Ʒ��� �Ȱ��� �� �������� �Ʒ� ���ٷ� ������	
			launched = launch[index];
			return true;
		}
		
	}
	
	public boolean[] getStabbed() {
		return stabbed;
	}
}
