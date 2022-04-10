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
	 * �츮�� ����� ��ȣ ����� Ű ���� 25�� �ۿ� ���� ������ ��ȣȭ ����Դϴ�.
	 * 
	 * ��ǥ ������ �� �� �κ� 10���� 1~25�� Ű�� ��� ��ȣȭ �غ�����.
	 * 
	 * ��ȣȭ�� ���Ͽ��� 10���� 1~ 25 ��� Ű������ ��ȣȭ �غ��� ���� 
	 * 
	 * 10�� �ؼ� ��� �ܾ���� ������� ���Ͽ��� ã��
	 * ���� ��������� �����ϴ� �ܾ ���� Ű���� �������� �����ϴ� ���α׷� 
	 * 
	 * (�ؽ�Ʈ�� �� ������� ������ ã�� �о ������ ��)
	 * 
	 *  ArrayList�� ���� �� ������ؼ� �����ɸ��� (contains ��뵵 ����)
	 *  HashSet�� �ٷ� ã�Ƴ��� �־ ������.
	 */

	public static void main(String[] args) {

		
		
		hackTool("files/frankenstein_encrypted.txt", "files/word.txt");
			
		
	}

	// ����
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
			// 10�� �Ǵ� ������ ���������� �ݺ�
			String line;
			String line2;
			for (int i = 0; i < 100 && (line = in.readLine()) != null; ++i) {
				
				// ���� ����ְų� ���ڰ� 5���� �ȵǴ� ���� �Ⱥ��ɷ� ġ�ڴ�
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
			System.out.println("��ġ�ϴ� �ܾ� ��: " + count);
			
			b.remove(b);
			
			
			
//			System.out.println("press 'Enter' to continue...");
//			String cmd = sc.nextLine();
			
//			if (cmd.toLowerCase().equals("d")) {
//				System.out.println("��ü ���� ��ȣȭ�� �����մϴ�...");
//				break;
//			}
			
		}
		
		System.out.println("���α׷� ��");
		
		
		
	}
		
}

