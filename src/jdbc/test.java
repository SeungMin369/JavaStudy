package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {
	public static void main(String[] args) {
		
		// 1. Class.forName���� jdbc ����̹��� �ε��Ѵ�.
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("����̹� �̸� Ʋ��");
            System.out.println("�ش� ���̺귯���� ã�� �� ����");
        }

        // ============================================================================================================
        // ============================================================================================================

        // 2. DriverManager Ŭ������ ���� DB�� �����Ѵ�.
        try {
            Connection conn = DriverManager.getConnection(
            		"jdbc:oracle:thin:@database-1.cxc98ia1oha4.us-east-2.rds.amazonaws.com:1521/ORCL",
            		"cafe",
            		"!!22Qorthdud");

            String sql = "select * from coffee";

            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            System.out.println("ID\tNAME\t\tPRICE");
            System.out.println("=====================");
            while (rs.next()) {
                System.out.print(rs.getInt("ID") + "\t");
                System.out.print(rs.getString("NAME") + "\t\t");
                System.out.print(rs.getInt("PRICE"));
                System.out.println();
            }

            // 6. �� ����� ������ ���߿� �� ������� �ݾ��ش�
            rs.close();
            pstmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("getConnection �ϴٰ� ���� ����");
        }

//        System.out.println("main ��");


    }



	
}
