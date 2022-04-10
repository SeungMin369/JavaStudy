import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class E08_PrintStream {
	/*
	  	# PrintWriter, PrintStream
	  	
	  	 - ��� �����͵��� �� ���ϰ� ��Ʈ������ ������ �� �ִ� Ŭ����
	  	 - printf(), println()���� �޼������ �����Ǿ� �ִ�
	 */
	public static void main(String[] args) {
		
		File f = new File("files/myfile.txt");
		
		
		try (
//			MyFile f = new MyFile("files/myfile.txt"); Ŭ������ ���� �ص��ǰ� �̷��� �ص��ȴ�.
			FileOutputStream fout = new FileOutputStream(f, true);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			PrintStream out = new PrintStream(bout);
				
		) {
			out.println("Hello, world!");
			out.println(" /)/)");
			out.println("(  '')");
			out.println("(  >��");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("���� ��");
	}
}

class MyFile extends File implements AutoCloseable {
	
	// OutputStream���� ���ڸ� �������� ���� 
	FileOutputStream fout;
	BufferedOutputStream bout;
	PrintStream out;

	public MyFile(String pathname) throws FileNotFoundException {
		super(pathname);
		
		fout = new FileOutputStream(this);
		bout = new BufferedOutputStream(fout);
		out = new PrintStream(bout, true, Charset.forName("UTF-8"));
		// TODO Auto-generated constructor stub
	}

	@Override
	public void close() throws Exception {
		out.close();
		bout.close();
		fout.close();
		
	}
	
	
}