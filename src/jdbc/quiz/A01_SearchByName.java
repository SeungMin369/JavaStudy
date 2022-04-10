package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class A01_SearchByName {
	
	/*
	  	# ����ڷκ��� ���ڿ��� �Է¹����� �ش� ���ڿ��� ���Ե�
	  	  ��� ����� ��ȸ�غ�����
	  	  
	  	  ��ҹ��� ������� �˻��Ǿ���� 
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� >");
		String str = sc.nextLine();
		
		check_name(str);
		
	}
	static void check_name(String str) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �̸� Ʋ��");
		}
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1",
					"hr",
					"1234");
			
			String sql = "SELECT employee_id, last_name, salary, department_name"
					+ " FROM employees INNER JOIN departments USING(department_id)"
					+ " ORDER BY employee_id ASC";
			
			PreparedStatement pstmt 
				= conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			String upperStr = str.toUpperCase();
			
			while (rs.next()) {
				String upperName = rs.getString("last_name").toUpperCase();
				if (upperName.contains(upperStr)) {
					System.out.println(rs.getString("last_name"));
				} 
				
				
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("getConnection �ϴٰ� ���� ����");
		}
		System.out.println("main ��");
	}
}
