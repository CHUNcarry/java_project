package co.yedam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardServiceJdbc implements BoardService {

	// Connection
	// preparedStatement
	// ResultSet
	// String 쿼리

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	String query;

	private void disconn() {

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

	@Override
	public boolean add(Board board) {
		query = "insert into board (brd_no, brd_title,brd_writer, brd_content)"
				+ "values((select nvl(max(brd_no),0) + 1 from board),?,?,?)";
		conn = Dao.conn();
		try {
			psmt = conn.prepareStatement(query);
			psmt.setString(1, board.getBrdTitle());
			psmt.setString(2, board.getBrdContend());
			psmt.setString(3, board.getBrdWriter());
			int r = psmt.executeUpdate();
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

	@Override
	public List<Board> list(int page) {
		List<Board> list = new ArrayList<Board>();
		conn = Dao.conn();
		query = "select *\r\n"//
				+ "from (\r\n"//
				+ "    select rownum rn, a.*\r\n"//
				+ "    from (  select *\r\n"//
				+ "            from board\r\n"//
				+ "            order by brd_no) a\r\n"//
				+ "            where rownum < ( ? * 10) ) b\r\n"//
				+ "where   b.rn >= ( ? - 1) *10";//
		try {
			psmt = conn.prepareStatement(query);
			psmt.setInt(1, page);
			psmt.setInt(2, page);
			rs = psmt.executeQuery();
			while (rs.next()) {
//				rs>list
				Board board = new Board();
				board.setBrdNo(rs.getInt("brd_no"));
				board.setBrdTitle(rs.getString("brd_title"));
				board.setBrdContend(rs.getString("brd_content"));
				board.setBrdWriter(rs.getString("brd_writer"));
				board.setWriteDate(rs.getDate("writer_date"));
				board.setUpdateDate(rs.getDate("update_date"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}

	@Override
	public int getTotal() {
		conn = Dao.conn();
		query = "select count(*) as cnt\r\n"//
				+ "from board;";//
		try {
			psmt = conn.prepareStatement(query);
			rs = psmt.executeQuery();
			if (rs.next()) {
				return rs.getInt("cnt");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;

	}

	@Override
	public boolean modify(Board board) {
		query = "update board set brd_content = ? where brd_no?";
		conn = Dao.conn();
		try {
			psmt = conn.prepareStatement(query);
			psmt.setString(1, board.getBrdContend());
			psmt.setInt(2, board.getBrdNo());
			int r = psmt.executeUpdate();
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

	@Override
	public boolean remove(int boardNo) {
		query = "delete from board where brd_no =" + boardNo;
		conn = Dao.conn();
		try {
			psmt = conn.prepareStatement(query);
			int r = psmt.executeUpdate();// insert|update|delete
			if (r == 1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconn();
		}
		return false;
	}

	@Override
	public Board search(int boardNo) {
		query = "select * from board where brd_no = " + boardNo;
		conn = Dao.conn();
		try {
			psmt = conn.prepareStatement(query);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Board board = new Board();
				board.setBrdNo(rs.getInt("brd_no"));
				board.setBrdTitle(rs.getString("brd_title"));
				board.setBrdContend(rs.getString("brd_content"));
				board.setBrdWriter(rs.getString("brd_writer"));
				board.setWriteDate(rs.getDate("writer_date"));
				board.setUpdateDate(rs.getDate("update_date"));

				return board;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconn();
		}

		return null;
	}

	
	
	

	@Override
	public void save() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getResponseUser(int brdNo) {
		//글 번호 >> 유저이름 출력  ()int>string
		query = "select brd_writer from board_no = ?";
		conn = Dao.conn();

		try {
			psmt = conn.prepareStatement(query);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Board board = new Board();
				board.setBrdWriter(rs.getString("brd_writer"));
				return board.getBrdWriter();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconn();
		}

		// TODO Auto-generated method stub
		return null;
	}

	

	

}
