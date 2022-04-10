package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E03_Copy {
	/*
	  	image ���� ������ ��� ������ image_copy ���� ���η� �����غ�����
	  	
	  	EASY: �׳� ���۸� �ϸ� ����
	  	HARD: ���߿� ���� ������ ���� �̸��� ���ϴ��� �ùٸ��� �����ϸ� ����
	  	
	  	(�� ����� ���� ���߿� ���� ������ ���ϴ��� �ùٸ��� �����ϵ��� ��������)
	  	
	 */
	
	public static void main(String[] args) throws IOException {
		File src = new File("image");
		File dst = new File("image_copy");
		
		if(!dst.exists()) {
			dst.mkdir();
		}
		
		File[] src_files = src.listFiles();
		
		for (File file : src_files) {
			System.out.println(file);
			System.out.println("���丮 ����: " + (file.isDirectory() ? "y" : "n"));
			System.out.println("------------------");
			
			if (file.isDirectory()) {
				System.out.println("Dir to creat: " + file.getName());
				
				File new_dir = new File(dst, file.getName());
				new_dir.mkdirs();
				File[] inner_files = file.listFiles();
				
				for (File file2 : inner_files) {
					System.out.println(file2);
					System.out.println("���丮 ����2: " + (file2.isDirectory() ? "y" : "n"));
					System.out.println("------------------");
					
					if (!file2.isDirectory()) {
						FileInputStream in = new FileInputStream(file2);
						FileOutputStream out = new FileOutputStream(
								new File(new_dir, file2.getName()));

						byte[] buffer = new byte[2048];
						
						int len = -1;
						while ((len = in.read(buffer)) != -1) { 
							out.write(Arrays.copyOf(buffer, len));
						}
						
						out.close();
						in.close();
					}
				}
			} else {
				FileInputStream in = new FileInputStream(file);
				FileOutputStream out = new FileOutputStream(
						new File(dst, file.getName()));
				byte[] buffer = new byte[2048];
				
//				int _byte = -1;
//				while ((_byte = in.read()) != -1) { // �� ���ھ� �ϴ� ���
//					out.write(_byte);
//				}
				
				int len = -1;
				while ((len = in.read(buffer)) != -1) { // �Ѳ����� �ϴ� ���
//					byte[] to_write = new byte[len];
//					
//					for (int i = 0; i < len; ++i) { // copyof ���
//						to_write[i] = buffer[i];
//					}
//					out.write(to_write);
					out.write(Arrays.copyOf(buffer, len));
				}
				
				out.close();
				in.close();
			}
		}
		System.out.println("���簡 ��� �������ϴ�.");
	}
}











