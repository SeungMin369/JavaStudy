package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E05_HackToolDic {
	/*
	 * 우리가 사용한 암호 방식은 키 값이 25개 밖에 없는 허접한 암호화 방식입니다.
	 * 
	 * 목표 파일의 맨 앞 부분 10줄을 1~25의 키로 모두 복호화 해보세요.
	 * 
	 * 암호화된 파일에서 10줄을 1~ 25 모든 키값으로 복호화 해보는 문제 
	 * 
	 * 10줄 해석 결과 단어들을 영어사전 파일에서 찾아
	 * 가장 영어사전에 존재하는 단어가 많은 키값을 정답으로 선정하는 프로그램 
	 * 
	 * (텍스트로 된 영어사전 파일을 찾아 읽어서 대조할 것)
	 * 
	 *  ArrayList는 전부 다 세어야해서 오래걸린다 (contains 사용도 가능)
	 *  HashSet은 바로 찾아낼수 있어서 빠르다.
	 */

	public static void main(String[] args) {

		
		
		hackTool("files/frankenstein_encrypted.txt", "files/word.txt");
			
		
	}

	// 강사
	public static void hackTool(String path,String dic) {
		ArrayList<String> lines = new ArrayList<>();
		ArrayList<String> lines2 = new ArrayList<>();
		
		File target = new File(path);
		File target2 = new File(dic);
		
		try (
			FileReader fin = new FileReader(target);
			BufferedReader in = new BufferedReader(fin);
				
			FileReader fin2 = new FileReader(target2);
			BufferedReader in2 = new BufferedReader(fin2);
		) {
			// 10번 또는 파일이 끝날떄까지 반복
			String line;
			String line2;
			for (int i = 0; i < 100 && (line = in.readLine()) != null; ++i) {
				
				// 줄이 비어있거나 문자가 5개도 안되는 줄을 안본걸로 치겠다
				if (line.trim().equals("") || line.length() < 5) {
					--i;
				} else {
				lines.add(line);
				}
			}
			
			while ((line2 = in2.readLine()) != null) {
				
				lines2.add(line2);
			}
			
			System.out.println(">>>>" + lines2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		Scanner sc = new Scanner(System.in);
		for (int key = 1; key < 26; ++key) {
			System.out.printf("---------key: %d ----------------\n", key);
			ArrayList<String> b = new ArrayList<>();
			String franken = "";
			for (String line : lines) {
				for (char ch : line.toCharArray()) {
					if (Character.isUpperCase(ch)) {
						ch = (char)(ch - key < 'A' ? ch - key + 26 : ch - key);
					} else if (Character.isLowerCase(ch)) {
						ch = (char)(ch - key < 'a' ? ch - key + 26 : ch - key);
					}
//					System.out.print(ch);
					franken += ch;
				}
//				System.out.println();
			}
//			System.out.println();
			String[] w = franken.split(" ");
			for (String temp : w) {
				temp.trim();
				b.add(temp);
			}
			
			int count = 0;
			for (int i = 0; i < b.size(); ++i) {
				if (Collections.frequency(lines2, b.get(i)) > 0) {
					count++;
				}
			}
			System.out.println("일치하는 단어 수: " + count);
			
			b.remove(b);
			
			
			
//			System.out.println("press 'Enter' to continue...");
//			String cmd = sc.nextLine();
			
//			if (cmd.toLowerCase().equals("d")) {
//				System.out.println("전체 파일 복호화를 진행합니다...");
//				break;
//			}
			
		}
		
		System.out.println("프로그램 끝");
		
		
		
	}
		
}

