package quiz;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E05_Encrypt {
	
	/*
	  frankenstein.txt를 암호화한 파일 frankenstein_encrypted.txt를 만들어보세요
	  ※ 열쇠값은 랜덤이지만 원본과 같은 결과가 나와서는 안됨
	  
	  # 암호 열쇠값이 2인 경우
	  		+2
	    C  -->  D
	    A  -->  B
	    R  -->  S
	    
	    CAR --> ECT
	    ZOO --> BQQ
	*/
	
	public static void main(String[] args) {
		
//		try {
//			File copy = new File("frankenstein_encrypted.txt");
//			File ori = new File("frankenstein.txt");
//			
//			Charset charset = Charset.forName("UTF-8");
//			
//			FileWriter out = new FileWriter(copy, charset);
//			FileReader in = new FileReader(ori, charset);
//			
//			
//			
//			int ch = -1;
//			String original = "";
//			while ((ch = in.read()) != -1) {
//				original += (char)ch;
//			}
//			
//			int num = (int)(Math.random() * 20);
//			System.out.println("랜덤 암호키" + num);
//			
//			for (int i = 0; i < original.length(); ++i) {
//				char word = original.charAt(i);
//				if (word >= 'a' && word <= 'z' || word >= 'A' && word <= 'Z') {
//					out.write((char)(word + 2));
//				} else {
//					out.write(word);
//				}
//				
//			}
//			
//			out.close();
//			in.close();
//			
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		// 강사
		encryption("files/frankenstein.txt", (int)(Math.random() * 24 + 1));
		
		
		
		

	}
	// 강사
	public static boolean encryption(String path, int key) {
		File file = new File(path);
		
		String fileName = file.getName();
		String realFileName = fileName.substring(0, fileName.indexOf("."));
		
		File dst = new File("files/" + realFileName + "_encrypted.txt");
		
		try {
			
			FileReader fin = new FileReader(file);
			BufferedReader in = new BufferedReader(fin);
			
			FileWriter fout = new FileWriter(dst);
			BufferedWriter out = new BufferedWriter(fout);
			
			String line;
			while ((line = in.readLine()) != null) {
				
				for (char ch : line.toCharArray()) {
					if (Character.isUpperCase(ch)) {
						ch = (char)((ch - 'A' + key) % 26 + 'A'); // 생각해봐야 할 부분
					} else if (Character.isLowerCase(ch)) {
						ch = (char)((ch - 'a' + key) % 26 + 'a'); 
					}
					out.append(ch);
				}
				out.append("\n");
			}
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.printf("암호화 성공! [키: %d]\n", key);
		
		return true;
	}
}



















