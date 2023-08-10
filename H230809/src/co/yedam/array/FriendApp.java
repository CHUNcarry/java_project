package co.yedam.array;

import java.util.Scanner;

public 	class FriendApp {
	   	static Friend[] friends = new Friend[10];
		static Scanner sc = new Scanner(System.in);
		static String name;
		static String phone;
		static Gender gender;
	public static boolean checkFriend(String name) {
		for (int i = 0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].name.equals(null)) {
				
			}
		}
		return false;
	}
	public static void add() {
				System.out.println("이름 | 연락처 | 성별");
				System.out.println("이름");
				name = sc.nextLine();
				System.out.println("연락처");
				phone = sc.nextLine();
				System.out.println("성별\n 1:남 2:여");
				
				int choice = Integer.parseInt(sc.nextLine());
				if(choice == 1) {
					gender = Gender.MEN;
				}else {
					gender = Gender.WOMEN;
				}
				Friend frd = new Friend();
				frd.name = name;
				frd.phone = phone;
				frd.gender = gender;
				
				boolean nullExist = true;
								
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = frd;
						nullExist = true;
						break;
					}
					
					}
				System.out.println("END");
	}
	public static void edit() {
					System.out.println("이름");
					name = sc.nextLine();
					System.out.println("연락처");
					phone = sc.nextLine();
					
					for (int i = 0; i < friends.length; i++) {
						if (friends[i] != null)
								if(friends[i].name.equals(name)) {
							friends[i].phone = phone;
						}
					}
				}
	
	public static void del() {
					System.out.println("이름");
					name = sc.nextLine();
					for (int i = 0; i < friends.length; i++) {
						if (friends[i] != null &&
								friends[i].name.equals(name)) {
							friends[i] = null;
							break;
							}
						}
	}
	
	public static void view() {
					System.out.println("이름");
					name = sc.nextLine();
					for (int i = 0; i < friends.length; i++) {
						if (friends[i] != null &&
								friends[i].name.equals(name)) {
							friends[i].showinfo();
						} 
							
							break;
							
						}
	}
	public static void printMenu(){
		
	}
	public static void main(String[]args) {
		//추가, 조회, 수정, 삭제
				
		boolean run = true;
		
			while(run) {
			System.out.println("1.등록 2.수정 3.삭제 4.조회 5목록 6.종료");
			System.out.println("선택>>");
			
			int menu = Integer.parseInt(sc.nextLine());
									
			switch(menu) {
			case 1 ://추가
				add();
				break;
			case 2 : //수정
				edit();
				break;				
			case 3 :// 삭제
				del();
				break;
			case 4 : //조회
				view();			
				break;
			case 5 : //목록
				
				for(int i = 0; i < 10; i++) {
					if (friends[i] != null) {
					friends[i].briefInfo();
					}
				}
			break;
			default : 
				System.out.println("메뉴룰 다시 선택");
				break;
			case 6 ://종료
				run = false;
				System.out.println("종료");
				}
			
			boolean mrun = false;
			if(run) {
				mrun = false;
			}else {
				mrun = true;
			}
			while(mrun) {
				System.out.println("1. 매크로 | 2. friendApp 으로");
				int manage = Integer.parseInt(sc.nextLine());
				switch(manage) {
					case 1 :
						for(int i = 0; i < 5; i++) {
							Friend frd = new Friend();
							frd.name = "test" + i;
							frd.phone = "010-1234-456"+ i;
							frd.gender = i%2 == 0 ? Gender.MEN : Gender.WOMEN;
							
							if (friends[i] == null) {
								friends[i] = frd;
								System.out.println("CREATE");
								}
							}
						break;
					case 2 : 
						run = true;
						mrun = false;}
				
				}
			}
	}
	
}