package quiz;

public class A09_ConditionQuiz {
	
	public static void main(String[] arge) {
		
		int a = 19;
		System.out.println(a > 10 && a < 20);//1
		
		int b = 2;
		System.out.println(b % 2 == 0);//2
		
		int c = 14;
		System.out.println(c % 7 == 0);//3
		
		int hour = 13;
		System.out.println(!(hour < 0) && !(hour >= 24) && hour >= 12);//4
		// !(hour < 0 || hour >= 24) �� ����� ���
		
		int d = 30, e = 60;
		System.out.println(d - e == 30 || e - d == 30);//5
		// System.out.println(math.abs(d - e) == 30); ���밪 ����
		
		int year = 800;
		System.out.println(year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0)));//6
		//System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		
		int minsu = 27, ironsu = 25;
		System.out.println(minsu - ironsu == 2);//7
		
		int minbirth = 12, subirth = 9;
		System.out.println(minbirth - subirth == 3);//8
		
		boolean powerOn = false;
		System.out.println(!powerOn);//9
				
		String str = "yes";
		String str2 = "yes";
		String str3 = new String("yes"); //������ ���� ũ��� �׻� �ٸ���
		
		// ������ ������ ==�� �� ������ ���� ���� �ּҸ� ���ϰ� �ִ����� ���Ѵ�
		System.out.println("str == \"yes\" : " + (str == "yes"));//10
		System.out.println("str == str2 : " + (str == str2));
		System.out.println("str == str3 : " + (str == str3));// �ٸ� �ּҿ� �����ϱ� ������ Ʋ����
		// Ÿ�Ը��� �빮�ڷ� �����ϴ� ������ �������� �ݵ�� .equals()�� �̿��� ���ؾ� �Ѵ�
		// �빮�� Ÿ���� �޸𸮿� �ּҰ� ����ȴ�. ������ �����ϸ� �ּҰ� �޶����� ��� ��¥ ������ ���Ϸ��� .equals
		// �ҹ��ڷ� �����ϴ� �������� stack�� �������� ���δ�
		// �빮�ڷ� �����ϴ� Ÿ�� �������� stack���� �ּҰ��� �����ϰ� ��ü�� heap�� �����Ѵ�
		// �빮�ڷ� �����ϴ� Ÿ�Ժ������� �ּҰ��� ����Ǿ� �ְ�, �ű⿡ .�� ��� ���� �����͸� ������ �� �ִ�.
		System.out.println(str.equals("yes"));
		System.out.println(str.equals(str3));
			
		  
		 
		
		
		
		
				
		
		
		
		
		
	}
	
}
		
		
		
		
		
		
		
