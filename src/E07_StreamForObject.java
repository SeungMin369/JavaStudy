import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class E07_StreamForObject {
	
	/*
	  	# ObjectOutputStream, ObjectInputStream 
	  	
	  	 - 참조형 데이터(클래스)들이 편리하게 스트림을 통과할 수 있게 해주는 클래스
	  	 - ObjectOutputStream은 인스턴스를 byte로 변환하는 클래스고
	  	   ObjectInputStream은 읽어들인 byte를 인스턴스 형태로 다시 합치는 클래스다
	 */
	
	public static void main(String[] args) {
		
		class Apple implements Serializable {  //직렬화 될 수 있다는 뜻의 인터페이스 추가
			
			private static final long serialVersionUID = -3360428176163454336L; //Apple 아래줄 클릭해서 만든것
			public int size;
			public int grade;
			
			public Apple(int size, int grade) {
				this.size = size;
				this.grade = grade;
			}
		}
		
		File f = new File("files/oout.txt");
		
		try ( // 괄호에 넣으면 오토 클로즈
			FileOutputStream fout = new FileOutputStream(f);
			ObjectOutputStream out = new ObjectOutputStream(fout);
		) {
			out.writeObject(new Apple(10, 11));
			out.writeObject(new Apple(1, 2));
			out.writeObject(new Apple(5, 6));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("오브젝트 쓰기가 끝났습니다.");
		
		try (
			FileInputStream fin = new FileInputStream(f);
			ObjectInputStream in = new ObjectInputStream(fin);
				
		) {
			Apple a1 = (Apple)in.readObject();
			Apple a2 = (Apple)in.readObject();
			Apple a3 = (Apple)in.readObject();
			
			System.out.println(a1.size);
			System.out.println(a2.size);
			System.out.println(a3.size);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}






















