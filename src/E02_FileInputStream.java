import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class E02_FileInputStream {
	public static void main(String[] args) {
		try {
			// ������ �о���̴� ���
			FileInputStream in = new FileInputStream("a.txt");
			
			/*
			  	InputStream.read() : �� ����Ʈ�� �о���δ�.
			  	InputStream.read(byte[]) : ������ �����͸� byte[]�� ũ�⸸ŭ �о���δ�.
			  	InputStream.read(byte[], start, end) : ...������ �Ϻκп��� �бⰡ �����ϴ�
			  	
			  	in.read() : �� ����Ʈ�� ���� ���� �̹��� ���� ����Ʈ���� ����
				in.read(�迭) : �̹��� �о���� ������ ������ ����
				
			  	�� �޼��� ��� �� �̻� ���� ���� ���ٸ� -1�� ��ȯ�Ѵ�.
			 */
			
			byte[] buffer = new byte[16];
			
			// line1:
			buffer[0] = 'l';
			buffer[1] = 'i';
			buffer[2] = 'n';
			buffer[3] = 'e';
			buffer[5] = ':';
			
			int len = -1, count = 0;
			
			while ((len = in.read(buffer ,6 , 10)) != -1) {
				buffer[4] = (byte)(count++ + '0');
				
				System.out.println(new String(buffer));
				System.out.println("--------------------------------");
//				System.out.printf("-- %d ����\n", len); // �ڸ��� 10�ڸ��� ���� ������ ���� �����.
			}
			
			int ch = -1;
			while ((ch = in.read()) != -1) {
				System.out.println((char)ch);	
			} // �� ���ھ� ���� �� ���� �⺻�� �Ǵ� �ݺ���
			
			
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
