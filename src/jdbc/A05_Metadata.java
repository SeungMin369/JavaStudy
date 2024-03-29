package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class A05_Metadata {
	
	public static void main(String[] args) {
			/*
		  	SELECT문으로 가져온 ResultSet에서 ResultSetMetaData를 얻을 수 있고 
		  	가져온 데이터들의 메타데이터를 볼 수 있다.
		*/
		String sql1 = "SELECT * FROM employees";
		String sql2 = "SELECT * FROM coffee";
		try (
				Connection conn = DBConnector.getConnection();
				PreparedStatement pstmt1 = conn.prepareStatement(sql1);
				PreparedStatement pstmt2 = conn.prepareStatement(sql2);
				ResultSet rs1 = pstmt1.executeQuery();
				ResultSet rs2 = pstmt2.executeQuery();
		) {
			ResultSetMetaData meta1 = rs1.getMetaData();
			
			System.out.println("Employee 테이블의 정보");
			System.out.println("컬럼의 개수: " + meta1.getColumnCount() + "개");
			
			int MAX_COLUMN = meta1.getColumnCount();
			for (int col = 1; col <= MAX_COLUMN; ++col) {
				System.out.printf("%-20s%-14s%-25s\n", 
						meta1.getColumnName(col), 
						meta1.getColumnTypeName(col),
						meta1.getColumnClassName(col)
				);
			}
			
			// 연습문제 meta2도 출력해보세요
			System.out.println("---------------------------------------------------------");
			ResultSetMetaData meta2 = rs2.getMetaData();
			
			System.out.print("Employee 테이블의 개수");
			System.out.println(meta2.getColumnCount() + "개");
			
			int MAX_COLUMN2 = meta2.getColumnCount();
			for (int col = 1; col <= MAX_COLUMN2; ++col) {
				System.out.printf("%-20s%-13s%-10s\n", 
						meta1.getColumnName(col), 
						meta1.getColumnTypeName(col),
						meta1.getColumnClassName(col)
				);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}



























