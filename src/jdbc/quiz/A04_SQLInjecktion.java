package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A04_SQLInjecktion {
	// coffee 테이블에 SQL Injecktion 공격을 성공시켜보세요.
	// (일부러 ?를 사용하지 않아야 함)
	// 그냥 조회만 했는데 날아가는 해킹 공격이다
	// 프로그램의 원래 동작은 사용자가 원하는 id의 커피를 삭제하는 동작이었다.
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
