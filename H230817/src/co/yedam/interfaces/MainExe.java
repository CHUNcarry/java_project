package co.yedam.interfaces;

import java.util.Scanner;

public class MainExe {

	public static void main(String[] args) {
		Dao dao = new OracleDao();
		
		String str;
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int menu = -1;
		while(run) {
			System.out.println("1.추가 | 2.수정 | 3.조회 | 4.삭제 |5.종료 ");
			System.out.println(">>");
			menu = sc.nextInt();
			switch (menu) {
		case 1 :
			dao.insert();
			break;
		case 2 :
			dao.update();
			break;
		case 3 :
			dao.select();
			break;
		case 4 :
			dao.delete();
			break;
		case 5 :
			System.out.println("EXIT");
			run = false;
			break;
		default:
			break;
		
			}
		}
		
		
	}
}
