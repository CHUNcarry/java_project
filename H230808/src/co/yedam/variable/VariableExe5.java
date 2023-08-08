package co.yedam.variable;

import java.util.Scanner;

public class VariableExe5 {
	
	/*scanner 클래스 활용*/
	
	
	public static void main(String[] args) {
		String numStr = "123";
		int num = Integer.parseInt(numStr);
		System.out.println(num);
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		 
		while(true) {
		System.out.println("정수값을 입력 : 종료하려면 quit");
		String result = scan.nextLine();
		System.out.printf("입력값은 %s입니다. \n", result);
		
		if (result.equals("quit")) {
			break;
		}
		
		//입력값이 100보다 크거나 0보다 작으면 합계 안하고
		 
		int val = Integer.parseInt(result);
		if(val > 100 || val<0) {
			continue;// 조건 만족못하면 다시처리
		}
		sum = val +sum;
	}
	System.out.println("입력값의 합계는 " + sum);
		
	System.out.println("end if program.");
	}
}
