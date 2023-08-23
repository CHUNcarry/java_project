package co.yedam.board;

import java.util.List;

public interface BoardService {

	// 등록
	public boolean add(Board board);

	// 목록
	public List<Board> list(int page);

	// 수정
	public boolean modify(Board board);

	// 삭제
	public boolean remove(int boardNo);

	// 상세조회
	public Board search(int boardNo);

	

	public void save();
	
	public int getTotal();

	
	//글번호 작성자 반환
		
	public String getResponseUser(int brdNo);
	
	
	
	
	
}
