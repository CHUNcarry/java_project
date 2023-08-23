package co.yedam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserServiceJdbc implements UserService {

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	String query;

	@Override
	public boolean checkLogin(User user) {
		conn = Dao.conn();
		query = "select * \r\n"//
				+ "from users \r\n"//
				+ "where user_id = ?";
		// "insert into users(user_id, user_pw, user_nm)\r\n" + "values (?, nvl(?,
		// 'ID'), nvl(?,'PW'));";
		try {
			psmt = conn.prepareStatement(query);
			psmt.setString(1, user.getUserId());
			rs = psmt.executeQuery();
			// System.out.println(rs.getString("user_id"));
			if (rs.next()) {
				if (rs.getString("user_pw").equals(user.getUserPw())) {

					System.out.println("성공");
					return true;
				} else {
					System.out.println("재입력");
					return false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
