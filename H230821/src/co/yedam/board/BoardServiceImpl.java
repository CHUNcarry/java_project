package co.yedam.board;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardServiceImpl implements BoardService {

	List<Board> boardList = new ArrayList<>();

	public BoardServiceImpl() {
		init();
	}

	private void init() {
		try {
			FileInputStream fis = new FileInputStream("c:/temp/board.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			boardList = (List<Board>) ois.readObject();
			System.out.println(boardList.size());
			ois.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private int getMaxNo() {
		int brdNo = -1;
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).getBrdNo() > brdNo) {
				brdNo = boardList.get(i).getBrdNo();
			}
		}
		return brdNo + 1;
	}

	@Override
	public boolean add(Board board) {
		board.setBrdNo(getMaxNo());
		board.setWriteDate(new Date());
		board.setUpdateDate(new Date());

		return boardList.add(board);

	}

	@Override
	public List<Board> list(int page) {
		int start = (page - 1) * 5;
		int end = boardList.size() < (page * 5) ? boardList.size() : (page * 5);
		List<Board> pageList = new ArrayList<>();
		for (int i = start; i < end; i++) {
			if (i >= start && i < end) {
				pageList.add(boardList.get(i));
			}
			pageList.add(boardList.get(i));
		}
		return pageList;
	}

	@Override
	public boolean modify(Board board) {
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).getBrdNo() == board.getBrdNo()) {
				boardList.get(i).setBrdContend(board.getBrdContend());
			}
		}
		return false;
	}

	@Override
	public boolean remove(int boardNo) {
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).getBrdNo() == boardNo) {
				boardList.remove(i);
				return true;
			}
		}
		return false;
	}

	public Board search(int boardNo) {
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).getBrdNo() == boardNo) {
				return boardList.get(i);
				//System.out.println(Board.showInfo(i));
				
			}
		}
		return null;
	}

	@Override
	public void save() {
		try {
			FileOutputStream fos = new FileOutputStream("c:/temp/board.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			System.out.println(boardList.size());
			oos.writeObject(boardList);
			oos.flush();
			oos.close();
			fos.flush();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean checkLogin(UserService user) {
		// TODO Auto-generated method stub
		return false;
	}

}
