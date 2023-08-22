package co.yedam.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ThrowExe {
	public static void main(String[] args) throws Exception {
		try {
			dbSearch();
		} catch(ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
	}
	
	// main 메서드에서 dbSearch 를 호출햇음
	public static void dbSearch() throws Exception {
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employees");
		while(rs.next()) {
			System.out.println("사원번호: " + rs.getInt("employee_id")//
			+ " 이름: " + rs.getString("first_name"));
		}
	}
}
