import java.io.File;
import java.util.Arrays;

public class E03_File {
	
	public static void main(String[] args) {
		/*
		  	# java.io.File
		  	
		  	 - 파일 시스템에 저장되어 있는 파일의 정보를 담을 수 있는 클래스
		  	 - File 인스턴스에 담겨있는 정보를 바탕으로 해당 파일을 수정하거나
		  	   새로운 파일 또는 디렉토리를 생성할 수 있다
		  	 
		 */
		File f1 = new File("note/Git 사용 설명서.txt");
		File f2 = new File("note/Git 사용 설명서");
		File f3 = new File("files");
		File f4 = new File(f3, "game.sav");// parent, child
		File f5 = new File("image/flower");
		
		System.out.println("f1이 존재합니까?" + f1.exists());
		System.out.println("f2이 존재합니까?" + f2.exists()); // 확장자가 없으면 완전히 다른 파일이다.
		
		System.out.println("읽기 권한이 있는 파일인가요?" + f1.canRead());
		System.out.println("쓰기 권한이 있는 파일인가요?" + f1.canWrite());
		System.out.println("실행 권한이 있는 파일인가요?" + f1.canExecute());
		
		System.out.println("f1에 담겨있는 경로가 절대 경로인가요? " + f1.isAbsolute());
		System.out.println("f1의 절대 경로 " + f1.getAbsolutePath());
		System.out.println("f1은 디렉토리인가요?" + f1.isDirectory());
		System.out.println(f1);
		System.out.println("f3는 디렉토리인가요?" + f3.isDirectory());
		System.out.println(f4.getAbsolutePath());
		
		// list(): 해당 디렉토리 내부의 파일 이름들을 String[]로 가져온다
		// listFiles(): 해당 디렉토리 내부의 모든 파일 정보들을 File[]로 가져온다
		System.out.println("f3 내부의 파일 이름들: " + Arrays.toString(f3.list()));
		System.out.println("f3 내부의 파일 정보들: " + Arrays.toString(f3.listFiles()));
		
		
		if (!f5.exists()) {
			System.out.println("새로 생성함.");
//			f5.mkdir();// mkdir: 해당 경로로 새로운 디렉토리 (폴더) 생성
			f5.mkdirs();// mkdirs: 부모 디렉토리 경로가 없는 경우에도 디렉토리를 생성		
		} else {		
			System.out.println("이미 존재해서 생성하지 않음.");
		}
		
		
	}
}





















