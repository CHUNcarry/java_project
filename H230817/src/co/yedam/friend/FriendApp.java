package co.yedam.friend;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FriendApp {

	Friend[] friends = new Friend[10];
	Scanner sc = new Scanner(System.in);

	public void start() {
		boolean run = true;
		while (run) {
			int menu = -1;
			System.out.println("1.추가 | 2.조회 | 3.수정 | 4.삭제 | 5.종료");
			try {
				menu = sc.nextInt();
			} catch (InputMismatchException e) {
				// System.out.println("메뉴 재선택");
				// sc.nextLine();
			} finally {
				sc.nextLine();
			}

			switch (menu) {
			case 1:
				addFriend();
				break;
			case 2:
				search();
				break;
			case 3:
				modify();
				break;
			case 4:
				remove();
				break;
			case 5:
				System.out.println("Exit");
				run = false;
				break;
			default:
				System.out.println("잘못된 값입니다.");
				break;
			}

		}

	}

	private String printString(String msg) {
		System.out.println(msg + ">>");
		return sc.nextLine();
	}

	private void addFriend() {
		System.out.println("1.학교 | 2.회사 | 3.기타");
		int submenu;

		submenu = sc.nextInt();

		sc.nextLine();
		Friend friend = null;
		String name = printString("이름 입력");
		String phone = printString("연락처 입력");
		if (submenu == 1) {
			String univ = printString("학교입력");
			String major = printString("전공입력");
			friend = new UnivFriend(name, phone, univ, major);
		} else if (submenu == 2) {
			String com = printString("회사입력");
			String dep = printString("부서입력");
			friend = new ComFriend(name, phone, com, dep);
		} else {
			friend = new Friend(name, phone);
		}

		for (int i = 0; i < 10; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}

	private void search() {
		String name = printString("이름 입릭");

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				System.out.println(friends[i].showInfo());
			}
		}
	}

	private void modify() {
		String name = printString("이름 입릭");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				System.out.println(friends[i].showInfo());
				
					
				}
				
			}
			
			
		}

	

	private void remove() {

	}
//추가 수정 삭제 조회
}
