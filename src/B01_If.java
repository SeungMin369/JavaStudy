
public class B01_If {
	public static void main(String[] arge) {
		/*
		  	# if��
		  	
		  		- ()���� ���� true�� �� {}���� ������ �����Ѵ�
		  		- ()���� ���� false�� �� {}���� ������ �����Ѵ�
		  		- {}�ȿ��� ������ ������ �� �� ���̶�� {}�� ������ �� �ִ�(�Ϻη� ���� �ʴ� ��찡 ����)
		  		
	  		# else if��
	  			- ���� �ִ� if���� ������� �ʾҴٸ� �ؿ��� if��ó�� �����Ѵ�
	  			- else if�� �ܵ����� ���� �� ����
	  			- else if�� ������ ����� �� �ִ�
	  			
  			#else��
  				- ���� �ִ� ��� if���� else if���� ��� ������� �ʾҴٸ� {}���� ������ ������ �����Ѵ�
  				- if�� �ٷ� ������ ����� ���� �ִ�
		  
		 */
		
		char ch = 'a';
		
		if (ch >= '��' && ch <= '�R') {
			System.out.println("ch�� ����ִ� ���� �ѱ��Դϴ�!");
			System.out.println("if�� ��!");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("ch�� ����ִ� ���� ���ĺ� �ҹ����Դϴ�!");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("ch�� ����ִ� ���� ���ĺ� �빮���Դϴ�!");
		} else {
			System.out.println("ch�� ����ִ� ���ڴ� ���ĺ��� �ƴϰ� �ѱ۵� �ƴմϴ�!");
		}
			
		
			
		System.out.println("���α׷� ��");
		
	}
	

}