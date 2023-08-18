package co.yedam.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ThrowExe {
	public static void main(String[] args) throws Exception {
		try {
			dbSearch();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void dbSearch() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employees");
		while (rs.next()) {
			System.out.println(rs.getInt("employee_id") + " | 이름 : " + rs.getString("first_name") + " | 부서번호 : "
					+ rs.getInt("department_id"));
		}

	}
}