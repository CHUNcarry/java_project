package co.yedam.classes.friend;


import java.util.Scanner;

public class FriendApp {

	static Scanner sc = new Scanner(System.in);
	Friend[] friends = new Friend[10];

	FriendApp() {

	}

	private void addFriend() {
		System.out.println("1.이름 | 2.연락처 | 3.생년월일");
		String[] data = sc.nextLine().split(" ");
		// SimpleDateFormat ooo = new SimpleDateFormat("yyyyMMdd");
		// String birth = ooo.parse(data[2]);
		Friend friend = new Friend(data[0], data[1], data[2]);

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}

	private void list() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println(friends[i].toString());
				break;
			}
		}

	}
	
	private void view() {
		String vwname;
		System.out.println("조회할 이름");
		vwname = sc.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].getName().equals(vwname)) {
				System.out.println(friends[i].toString()); 
						
			}/*else {
				System.out.println("(null)");
			}*/
		}
	}

	
	private void edit() {
		String editf;
		System.out.println("수정할 이름");
		editf = sc.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].getName().equals(editf)) {
				
				System.out.println("| 1.연락처 | 2.생년월일");
				String[] data = sc.nextLine().split(" ");
				// SimpleDateFormat ooo = new SimpleDateFormat("yyyyMMdd");
				// String birth = ooo.parse(data[2]);
				Friend friend = new Friend(friends[i].getName(),data[1], data[2]);
						friends[i] = friend;
					}}
			}
		
	
	
	private void del() {
		String delf;
		System.out.println("삭제할 이름");
		delf = sc.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].getName().equals(delf)) {
			friends[i].setName(null);
			friends[i].setPhone(null);
			friends[i].setBirth(null);
			}
		}
	}
	static void start() {

		FriendApp app = new FriendApp();

		boolean run = true;
		while (run) {
			System.out.println("1.등록 | 2.목록 | 3.조회 | 4.수정 | 5.삭제 || 9.종료");
			System.out.println("선택");

			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case Menu.add:
				app.addFriend();
				break;
			case Menu.list:
				app.list();
				break;
			case Menu.search :
				app.view();
				break;
			case Menu.edit : 
				app.edit();
				break;
			case Menu.del : 
				app.del();
				break;
			case Menu.exit:
				run = false;
				
				
				break;

			}//end of switch
		}//end of while 

	}//end of start 
}
