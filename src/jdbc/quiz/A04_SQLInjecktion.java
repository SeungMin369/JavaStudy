package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A04_SQLInjecktion {
	// coffee ���̺� SQL Injecktion ������ �������Ѻ�����.
	// (�Ϻη� ?�� ������� �ʾƾ� ��)
	// �׳� ��ȸ�� �ߴµ� ���ư��� ��ŷ �����̴�
	// ���α׷��� ���� ������ ����ڰ� ���ϴ� id�� Ŀ�Ǹ� �����ϴ� �����̾���.
	private static String driverName = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	private static String user = "hr";
	private static String password = "1234";
	
	static {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
//		String sql = "SELECT * FROM coffee"
//				+ " WHERE price >= 3000 and price < 4000 and 1=1";
		
		
		String id = "3 or 1=1";
		
		String sql = "DELETE FROM coffee WHERE id=" + id;
		
		
		try (
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			
			Statement statement = conn.createStatement();
			
			int row = statement.executeUpdate(sql);
			
			System.out.println("done.");
			
			
			
			try (
				ResultSet rs = pstmt.executeQuery();
			) {
				while (rs.next()) {
					System.out.printf("%-6d%-14s%-20s\n",
							rs.getInt("id"),
							rs.getString("name"),
							rs.getString("price"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
