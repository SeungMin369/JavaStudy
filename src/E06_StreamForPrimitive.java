import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E06_StreamForPrimitive {
	/*
	  	# DataOutputStream, DataInputStream
	  	
	  	 - 기본형 타입을 손쉽게 스트림으로 전송하기 위한 클래스
	  	 - 기본혁 타입이기 때문에 Java 이외의 언어에서는 받을 수 없다
	  	 - 데이터를 넣었던 순서대로 꺼내야 한다
	 */
	
	public static void main(String[] args) {
		File f = new File("files/dout.txt");
		
		try ( // 괄호안에 넣으면 Auto close
			FileOutputStream fout = new FileOutputStream(f);
			DataOutputStream out = new DataOutputStream(fout);
		) {
			
			out.writeDouble(1234.1234);
			out.writeLong(1234567L);
			out.writeShort((short)1234);
			out.writeUTF("天");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일이 잘 써졋습니다.");
		
		try (
			FileInputStream fin = new FileInputStream(f);
			DataInputStream in = new DataInputStream(fin);
		) {
			System.out.println(in.readDouble());
			System.out.println(in.readLong());
			System.out.println(in.readShort());
			System.out.println(in.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
