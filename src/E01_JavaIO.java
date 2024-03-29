import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_JavaIO {
	/*
	  	# Java I/O (Input/Output)
	  	
	  	 - 자바는 스트림이라는 개념을 이용해 프로그램의 입/출력을 다룬다
	  	 - 프로그램으로 들어오는 모든 데이터들을 입력이라고 부른다 (Input)
	  	 - 프로그램에서 계단되어 나가는 데이터들을 출력이라고 부른다 (Output)
	  	 
	  	# Stream 
	  	
	  	 - 데이터들이 오고가는 통로
	  	 - 데이터들이 순차적으로 프로그램으로 들어는 통로를 InputStream이라고 부른다
	  	 - 데이터들이 출력되는 곳으로 보내지는 통로를 OutputStream이라고 부른다
	  	 - 데이터가 Stream을 통해 이동하기 위해서는 데이터를 byte타입으로 변환시켜야 한다
	  	  (2진법으로 변환하기 가장 쉬워서 byte타입으로 전송한다)
	 */
	public static void main(String[] args) {
		try {
			// FileOutputStream: 파일로 내보낼 수 있는 통로를 생성한다.
			FileOutputStream out = new FileOutputStream("a.txt", false);
			
			out.write(65);
			out.write(66);
			out.write(67);
			out.write(68);
			
			out.write("\nHello world!!".getBytes());
			
			// 다 쓴 통로는 반드시 닫아줘야 한다.
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
