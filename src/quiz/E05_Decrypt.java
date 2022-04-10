package quiz;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E05_Decrypt {
	/*
	 	����ڷκ��� ���ϸ�� ���� ���� �Է¹�����
	 	�ش� ���谪���� ��ȣȭ �� ������� �����ϴ� ���α׷��� ����� ������
	 	
	 	test. ��ȣȭ �Ǿ��ִ� frankenstein_encrypted.txt�� ��ȣȭ �غ�����
	  
	 */
	
	public static void main(String[] args) {	
		try {
			
			File ori = new File("frankenstein_encrypted.txt");
			File restore = new File("restore.txt");
			
			Charset charset = Charset.forName("UTF-8");
			
			FileWriter out = new FileWriter(restore, charset);
			FileReader in = new FileReader(ori, charset);
			
			int ch = -1;
			String original = "";
			while ((ch = in.read()) != -1) {
				original += (char)ch;
			}
			
			for (int i = 0; i < original.length(); ++i) {
				char word = original.charAt(i);
				char w;
				char w2;
				if (word >= 'a' && word <= 'z' || word >= 'A' && word <= 'Z') {
					w = (char)(word - 2);
					
					if (w >= 'a' && w <= 'z' || w >= 'A' && w <= 'Z') {
						out.write(w);
					} else {
						out.write(word);
					}
				} else {
					
				}
				
				
			}
			out.close();
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
