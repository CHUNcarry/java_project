package co.yedam.friend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FriendApp {
//1.추가 수정삭제목록
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	List<Friend> friends = new ArrayList<Friend>();
	Map<String, String> userList = new HashMap<>();
	boolean run = false;

	public FriendApp() {
		userList.put("user1", "1234");
		userList.put("user2", "1134");
		userList.put("user3", "1235");
		userList.put("user4", "1464");
		userList.put("user5", "8634");
	}

	boolean userCheck() {
		while (run = false) {
			System.out.println("id>>");
			String id = sc.nextLine();
			System.out.println("pw>>");
			String pw = sc.nextLine();
			if (id.equals(userList.get(0)) && pw.equals(userList.get(1))) {
				run = true;
				break;
			} else {
				run = false;
				System.out.println("재입력");
				break;
			}
		}
		return run;
	}

	public void start() {

		while (run) {
			System.out.println("1.추가 | 2.수정 | 3.삭제 | 4.목록 | 5.종료");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				add();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				run = false;
				System.out.println("END");
				break;
			default:
				System.out.println("재입력");
				break;

			}
		}
	}

	private void add() {
		String name;
		String phone;
		String birth;
		System.out.println("이름");
		name = sc.nextLine();
		System.out.println("연락처");
		phone = sc.nextLine();
		System.out.println("생일 '연도/월/일'");
		birth = sc.nextLine();

		for (int i = 0; i < friends.size(); i++) {
			if (friends != null) {
				try {
					Friend friend = new Friend(name, birth, sdf.parse(birth));
				} catch (ParseException e) {
					e.printStackTrace();
				}

			}
		}

	}

	private void edit() {
	}

	private void delete() {
	}

	private void list() {
	}

	private void exit() {
	}

}
