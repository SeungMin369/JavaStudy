package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class A02_executeUpdate {
	public static void main(String[] args) {
		String ur1 = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String user = "hr";
		String password = "1234";
		// INSERT, UPDATE, DELETE�� ���� ����� ��ȭ�� ���� ������ ���´�.
		// �׷��� executeUpdate() �޼���� ���ϰ��� int��.
		String sql = "UPDATE coffee SET price=price+100 WHERE id < 5";
		String sql2 = "DELETE FROM coffee WHERE price > 3500";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			Connection conn = DriverManager.getConnection(ur1, user, password);
			
			PreparedStatement pstmt
				= conn.prepareStatement(sql);
			
			int rows = pstmt.executeUpdate();
			
			System.out.println(rows + "row(s) changed.");
			
			pstmt.close();
			
			// �ѹ��� ���ῡ �������� ������ ���� �� ���� �ִ�.
			PreparedStatement pstmt2 = 
					conn.prepareStatement(sql2);
			
			int deleted_rows = pstmt2.executeUpdate();
			
			System.out.println(deleted_rows + "row(s) deleted");
			pstmt2.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}