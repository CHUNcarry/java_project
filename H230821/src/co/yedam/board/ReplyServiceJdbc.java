package co.yedam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReplyServiceJdbc implements ReplyService {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	String query;

	@Override
	public boolean addReply(Reply rp) {
		query = "insert into  reply(re_no, brd_no, re_content, writer)\r\n"//
				+ "values((select nvl(max(re_no),0) + 1 from reply),?,?,?); ";

		conn = Dao.conn();

		try {
			psmt = conn.prepareStatement(query);
			psmt.setInt(1, rp.getReplyNo());
			psmt.setInt(2, rp.getBrdNo());
			psmt.setString(3, rp.getReplyContent());
			psmt.setString(4, rp.getReplyWriter());

			int r = psmt.executeUpdate();
			if (r == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Reply> ReplyList() {
		List<Reply> list = new ArrayList<Reply>();
		conn = Dao.conn();
		query = "select re_no, re_content, writer, brd_no\r\n"
				+ "                    from reply\r\n"
				+ "                    ";
		try {
			psmt = conn.prepareStatement(query);
			System.out.println(psmt);
			rs = psmt.executeQuery();
			
			
			while (rs.next()) {
//					rs>list
				Reply reply = new Reply();
				reply.setReplyNo(rs.getInt("re_no"));
				reply.setReplyContent(rs.getString("re_content"));
				reply.setReplyWriter(rs.getString("writer"));
				list.add(reply);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}

	@Override
	public boolean deleteReply(int del) {

		query = "delete from reply where re_no =" + del;
		conn = Dao.conn();
		try {
			psmt = conn.prepareStatement(query);
			int r = psmt.executeUpdate();// insert|update|delete
			if (r == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return false;
	}

	void disconn() {

		try {
			if (rs != null) {
				rs.close();
			}
			if (conn != null) {
				conn.close();

			}
			if (psmt != null) {
				psmt.close();
			}
			if (query != null) {

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
