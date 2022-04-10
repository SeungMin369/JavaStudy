import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class E02_FileInputStream {
	public static void main(String[] args) {
		try {
			// 파일을 읽어들이는 통로
			FileInputStream in = new FileInputStream("a.txt");
			
			/*
			  	InputStream.read() : 한 바이트씩 읽어들인다.
			  	InputStream.read(byte[]) : 파일의 데이터를 byte[]의 크기만큼 읽어들인다.
			  	InputStream.read(byte[], start, end) : ...버퍼의 일부분에만 읽기가 가능하다
			  	
			  	in.read() : 한 바이트씩 읽을 때는 이번에 읽은 바이트값이 리턴
				in.read(배열) : 이번에 읽어들인 문자의 개수가 리턴
				
			  	세 메서드 모두 더 이상 읽을 것이 없다면 -1을 반환한다.
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
//				System.out.printf("-- %d 글자\n", len); // 자리가 10자리라 끝에 쓰레기 값이 생긴다.
			}
			
			int ch = -1;
			while ((ch = in.read()) != -1) {
				System.out.println((char)ch);	
			} // 한 글자씩 읽을 때 가장 기본이 되는 반복문
			
			
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
