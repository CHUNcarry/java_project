package co.yedam.Operator;

import java.util.Scanner;

public class OperatorExe2 {
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		int balance = 0; //10만원 이상 불가, -금액 불가
		boolean run = true;
		
		while(run) {
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("선택하세요");
			
			int menu = Integer.parseInt(scn.nextLine());
			if(menu == 1) {
				System.out.println("입금액 입력");
				int plus = Integer.parseInt(scn.nextLine());
				balance = balance + plus;
				if(balance > 100000) {
					System.out.println("10만원 초과");
					balance = balance - plus;
				}else {
					System.out.println("잔액은" + balance + "원 입니다");
				}
				
				
			}else if(menu == 2) {
				System.out.println("출금액 입력");
				int minus = Integer.parseInt(scn.nextLine());
				balance = balance - minus;
				if(balance < 0) {
					System.out.println("잔액이 부족합니다");
					balance = balance + minus;
				}else {
					System.out.println("잔액은" + balance + "원 입니다");
				}
			}else if(menu == 3) {
				System.out.println("잔액은" + balance + "원 입니다");
			}else if(menu == 4) {
				System.out.println("종료합니다");
				break;				
			}
			
		}
		
		
		
		
	}
}
