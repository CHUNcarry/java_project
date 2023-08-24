package co.yedam;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Friend[] friends = new Friend[10];
		boolean run = true;

		while (run) {
			System.out.println("1.등록 | 2.조회 | 3.수정 |4.삭제 |5.종료");
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				Friend friend = null;
				System.out.println("이름");
				String name = sc.nextLine();
				System.out.println("번호");
				String phone = sc.nextLine();
				System.out.println("생일");
				int birh = sc.nextInt();
				System.out.println("키");
				double height = sc.nextDouble();

				for (int i = 0; i < 10; i++)
					if (friends[i] == null) {
						friends[i] = new Friend(name, phone, birh, height);
						break;
					}
				break;
			case 2:
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						System.out.println(friends[i].show());
					} else {
						System.out.println("");
					}
				}
				break;
			case 3:
				System.out.println("이름 입릭");
				name = sc.nextLine();
				phone = sc.nextLine();

				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && name.equals(name)) {
						System.out.println(friends[i].show());
						friends[i].setPhone(phone);
					} else if (friends[i] != null && friends[i].getName().equals(name)) {
						friends[i].setPhone(phone);
					}

				}
				break;
			case 4:
				System.out.println("이름 입릭");
				name = sc.nextLine();
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && name.equals(name)) {
						friends[i] = null;
					} else {
						System.out.println("");
					}
				}
				break;
			case 5:
				run = false;
				break;
			default:
				break;
			}

		}

	}

}
