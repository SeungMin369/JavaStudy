
public class C14_AnonymousInnerClass {
	/*
	  	# �͸� ���� Ŭ����
	  	
	  	- Ŭ������ �������ڸ��� �̸��� �����ʰ� �ٷ� ����� ���� ������ ���
	  	- ��ȸ���̴�	  
	*/
	public static void main(String[] args) {
		fight(new Dragon());
		fight(new SkeletonWarrior());
		
		// �͸� ���� Ŭ������ �Ｎ���� �ش� Ŭ������ ����� �����Ѵ�
		// ������ �ڿ� {}�� ���� �ش� Ŭ������ �����ؼ� ����ϴ� ����� �͸� ���� Ŭ������� �Ѵ�.
		Dragon dragon01 = new Dragon() { 
			@Override
			void attack() {
				
					System.out.println("���� �巡���� ������ �վ �����մϴ�.");
				}
		};
		
		fight(dragon01);
		fight(new SkeletonWarrior() {
			@Override
			void attack() {
				System.out.println("���̷��� ���к��� ���и� �о �����մϴ�.");
			}
		});
		
		// �ν��Ͻ�ȭ �� �� ���� �߻� Ŭ������ �Ｎ���� ��ӹ޾� �����ع����� �ִ� 
		Monster monster01 = new Monster() {
			@Override
			void attack() {
				System.out.println("���� ��ġ��!");
			}
		};
		fight(monster01);
	}
	
	private static void fight(Monster monster) {
		monster.attack();
	}
}

abstract class Monster {
	
	abstract void attack();
}

class Dragon extends Monster {
	@Override
	void attack() {
		System.out.println("�巡���� ���� �վ �����մϴ�.");		
	}	
}

class SkeletonWarrior extends Monster {
	@Override
	void attack() {
		System.out.println("�ذ����簡 Į�� �ֵѷ��� �����մϴ�.");		
	}	
}