package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.DBConnector;
import jdbc.model.Department����;
import jdbc.model.Employee����;

public class A07_DataJoinModel {
	/*
	  	employees�� departments�� ��� �����Ͽ� ��ȸ�� ����� �˸��� �𵨿� ��� ��� �غ�����.
	 */
	public static void main(String[] args) {
		String sql = "SELECT"
				+ " e.*,"
				+ " d.*,"
				+ " e.manager_id AS mid1,"
				+ " d.manager_id AS mid2"
				+ " FROM employees e, departments d"
				+ " WHERE e.department_id = d.department_id";
				
		ArrayList<Employee����> employee_list = new ArrayList<>();		
		try (
			Connection conn = DBConnector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		) {
			
			while(rs.next()) {
				employee_list.add(new Employee����(
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("email"),
						rs.getString("phone_number"),
						rs.getDate("hire_date"),
						rs.getString("job_id"),
						rs.getDouble("salary"),
						rs.getDouble("commission_pct"),
						rs.getInt("mid1"),
						rs.getInt("department_id"),
						new Department����(
								rs.getInt("department_id"),
								rs.getString("department_name"),
								rs.getInt("mid2"),
								rs.getInt("location_id")
						)
						));
			}
			System.out.println(employee_list);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String sql = "SELECT * FROM employees e"
//				+ " INNER JOIN departments d"
//				+ " ON e.department_id = d.department_id";
//	
//
//		
//		ArrayList<Employee> list = new ArrayList<>();
//		
//		try (
//			Connection conn = A06_HikariCP.getConnection();
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			ResultSet rs = pstmt.executeQuery();
//				
//		) {
//			ResultSetMetaData meta = rs.getMetaData();
//			
//			while (rs.next()) {
//				list.add(new Employee(
//						rs.getInt("employee_id"),
//						rs.getString("first_name"),
//						rs.getString("last_name"),
//						rs.getString("email"),
//						rs.getString("phone_number"),
//						rs.getString("hire_date"),
//						rs.getString("job_id"),
//						rs.getInt("salary"),
//						rs.getDouble("commission_pct"),
//						rs.getInt("manager_id"),
//						rs.getInt("department_id"),
//						rs.getString("department_name"),
//						rs.getInt("location_id")
//						
//				));
//			}
//			
//			System.out.println(list);
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
