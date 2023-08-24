package board;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardServiceImpl implements BoardService {
	List<Board> BoardList = new ArrayList<>();

	public BoardServiceImpl() {
		init();
	}

	void init() {
		try {
			FileInputStream fis = new FileInputStream("C:/temp/boardList.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			BoardList = (List<Board>)ois.readObject();
			fis.close();
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// loadFile;
	private int num() {
		int brdNum = 0;
		for (int i = 0; i < BoardList.size(); i++) {
			brdNum = BoardList.get(i).getConNo();
		}

		return brdNum + 1;
	}

	@Override
	public List<Board> list() {
		List<Board> Alist = new ArrayList<>();
		for(int i = 0; i< BoardList.size(); i++) {
			Alist.add(BoardList.get(i));
		}
		return Alist;
	}

	@Override
	public boolean add(Board board) {
		board.setConNo(num());
		board.setWriteDate(new Date());

		return BoardList.add(board);
	}

	@Override
	public Board search(int conNo) {
		for (int i = 0; i < BoardList.size(); i++) {
			if (BoardList.get(i).getConNo() == conNo) {
				return BoardList.get(i);
			} else {
				System.out.println("찾을수 없습니다.");
			}
		}
		return null;
	}

	@Override
	public boolean modify(Board board) {
		for (int i = 0; i < BoardList.size(); i++) {
			if (BoardList.get(i).getConNo() == board.getConNo()) {
				BoardList.get(i).setContent(board.getContent());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean remove(int conNo) {
		for(int i = 0; i < BoardList.size(); i++) {
			if(BoardList.get(i).getConNo() == conNo) {
				BoardList.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public void save() {	
		try {
			FileOutputStream fos = new FileOutputStream("C:/temp/boardList.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(BoardList);
			
			oos.flush();
			oos.close();
			fos.flush();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
