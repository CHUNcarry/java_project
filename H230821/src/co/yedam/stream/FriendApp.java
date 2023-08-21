package co.yedam.stream;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {
	
	public void FriendApp() {
		loadFile();
	}
	List<Friend> friends = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	public void start() {

		boolean run = true;
		while (run) {
			System.out.println("1.등록 | 2.목록 | 3.종료");
			System.out.println(">>");
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				add();
				break;
			case 2:
				list();
				break;
			case 3:
				run = false;
				break;
			default:
				break;
			}
		}
	}

	SimpleDateFormat sdf = new SimpleDateFormat();

	private void add() {
		String name = printString("이름입력");
		String phone = printString ("연락처입력");
		String birth = printString("연락처 입력");
		
		String friend;
		
	friends.add(name,phone,birth);	

		}
	

	private void saveFile() {
		// friends 컬렉션 값 >텍스트 저장
		try {
			FileWriter fw = new FileWriter("c:/temp/friendlist.txt");
			for (Friend fnd : friends) {
				String line = fnd.getName() + " " + fnd.getPhone() + " " + sdf.format(fnd.getBirth());
				fw.write(line + "\n");
			}
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void loadFile() {
		
	}private void list() {

	}

	private String printString(String msg) {
		System.out.println(msg + ">>");
		return sc.nextLine();
	}

}
