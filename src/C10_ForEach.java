import java.util.ArrayList;

public class C10_ForEach {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50, 60};
		
		// for each
		for (int number : numbers) {
			System.out.println("���ڸ� �ϳ��� ���� ��� : " + number);
		}
		
		for (int number : new int[] {10, 20, 30, 40, 50, 60}) {
			System.out.println("���ڸ� �ϳ��� ���� ���2: " + number);
		}
		boolean[] examresult = {true, false, true, true, false, true};
		
		for (boolean complete : examresult) {
			if (complete) {
				System.out.println("���");
			} else {
				System.out.println("���հ�");
			}
		}
		
	}
	

}
