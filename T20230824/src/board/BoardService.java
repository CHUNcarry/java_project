package board;

import java.util.List;

public interface BoardService {

	
	public boolean add(Board board);
	
	public List<Board> list();
	
	public boolean modify(Board board);
	
	public boolean remove(int conNo);
	
	public Board search(int conNo);
	
	public void save();
	
	
}
