package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardServiceJdbc implements BoardService {
	
	// Connection 객체.
	// PreparedStatement 객체.
	// ResultSet 객체. 
	// String 쿼리.
	Connection conn; //필드
	PreparedStatement psmt;
	ResultSet rs;
	String query;
	
	
	
	@Override
	public boolean add(Board board) {
		return false;
	}

	@Override
	public List<Board> list(int page) {
		List<Board> list = new ArrayList<Board>();
		conn = Dao.conn(); //db연결
		query = "select * from board"; // sql
		try {
			psmt = conn.prepareStatement(query);
			rs = psmt.executeQuery();
			while(rs.next()) {
				// rs -> list 변환.
				Board board = new Board();
				board.setBrdNo(rs.getInt("brd_no"));
				board.setBrdTitle(rs.getString("brd_title"));
				board.setBrdWriter(rs.getString("brd_writer"));
				list.add(board);
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int getTatal() {
		return 0;
	}

	@Override
	public boolean modify(Board board) {
		return false;
	}

	@Override
	public boolean remove(int brdNo) {
		query = "delete from board where brd_no =" + brdNo;
		conn = Dao.conn();
		try {
			psmt = conn.prepareStatement(query);
			int r = psmt.executeUpdate(); //insert, update, delete
			if(r==1) {
				return true;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Board search(int brdNo) {
		return null;
	}

	@Override
	public void save() {
		
	}

}
