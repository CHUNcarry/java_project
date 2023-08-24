package board;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class BoardApp {
	boolean run = false;
	Scanner sc = new Scanner(System.in);
	BoardService service = new BoardServiceImpl();

	void start() {

		File FCBL = new File("C:/temp/boardList.dat");
		if (!FCBL.exists()) {
			try {
				FCBL.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		while (run) {

			System.out.println("1.추가 2.수정 3.조회 4.삭제 5.목록 6.종료 ");
			System.out.println(">>");
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {

			case 1:
				register();
				break;
			case 2:
				modify();
				break;
			case 3:
				search();
				break;
			case 4:
				remove();
				break;
			case 5:
				list();
				break;
			case 6:
				service.save();
				run = false;
				power();
				break;
			default:
				System.out.println("재입력");
				break;
			}
		}
	}

	void power() {
		while (!run) {
			System.out.println("1. 시작");
			System.out.println(">>");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				run = true;
				start();
				break;
			default:
				System.out.println("재입력");
				break;
			}
		}
	}

	void register() {
		System.out.println("제목");
		String title = sc.nextLine();
		System.out.println("내용");
		String content = sc.nextLine();
		System.out.println("작성자");
		String writer = sc.nextLine();
		Board board = new Board(title, content, writer);

		if (service.add(board)) {
			System.out.println("SUCCES");
		} else {
			System.out.println("FAILED");
		}

	}

	void modify() {
		System.out.println("글 번호 입력");
		String conNo = sc.nextLine();
		System.out.println("수정할 내용 입력");
		String content = sc.nextLine();

		Board bd = new Board();
		bd.setConNo(Integer.parseInt(conNo));
		bd.setContent(content);
		if (service.modify(bd)) {
			System.out.println("Succes");
		} else {
			System.out.println("Failed");
		}

	}

	void search() {
		System.out.println("글 번호 입력");
		String conNo = sc.nextLine();

		Board rs = service.search(Integer.parseInt(conNo));
		if (rs != null) {
			System.out.println(rs.rst());
		} else {
			System.out.println("존재하지 않는 글");
		}

	}

	void remove() {
		System.out.println("글 번호 입력");
		String conNo = sc.nextLine();
		Board rs = service.search(Integer.parseInt(conNo));
		if (rs != null) {
			System.out.println("존재하지 않는 글입니다.");
			return;
		} else if (service.remove(Integer.parseInt(conNo))) {
			System.out.println("삭제 성공");
			return;
		}

	}

	void list() {
		while (true) {
			List<Board> list = service.list();
			for (Board l : list) {
				System.out.println(l.listInfo());
				
			}break;

		}
	}

}
