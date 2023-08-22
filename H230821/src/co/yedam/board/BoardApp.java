package co.yedam.board;

import java.util.List;
import java.util.Scanner;

public class BoardApp {
	Scanner sc = new Scanner(System.in);
//	UserService uservice = new UserService();
	static boolean run = true;
	BoardService service = new BoardServiceJdbc();
	String title;
	String content;
	String writer;
	String brdNo;

	void register() {
		title = printString("제목입력");
		content = printString("내용입력");
		writer = printString("작성자");
		Board board = new Board(title, content, writer);
		int num;
		for (int i = 0; i >= 0; i++) {
			if (i != 0) {
				num = i;
			}

		}
		if (service.add(board)) {
			System.out.println("SUCCES");
		}
	}

	void list() {
		List<Board> list = service.list(0);
		for (Board b : list) {
			System.out.println(b.listInfo());
		}
	}

	void modify() {
		brdNo = printString("번호 입력");
		content = printString("");
		Board brd = new Board();
		brd.setBrdNo(Integer.parseInt(brdNo));
		brd.setBrdContend(content);
		if (service.modify(brd)) {
			System.out.println("SUCCES");
		}
	}

	void delete() {
		brdNo = printString("번호입력");
		service.remove(Integer.parseInt(brdNo));
	}

	void search() {
		brdNo = printString("번호입력");
		Board result = service.search(Integer.parseInt(brdNo));
		
		System.out.println(result);
	}

	public void start() {
		while (run) {
			System.out.println("1.글등록 | 2.목록 | 3.수정 | 4.삭제 | 5.상세 | 9.종료");
			System.out.println();
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				register();
				break;
			case 2:
				list();
				break;
			case 3:
				modify();
				break;
			case 4:
				delete();
				break;
			case 5:
				search();
				break;
			case 9:
				System.out.println("END");
				service.save();
				run = false;

			default:

				break;
			}
		}

	}
// id pw 
	private String printString(String msg) {
		System.out.println(msg + ">>");
		return sc.nextLine();
	}
}
