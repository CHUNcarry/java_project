package co.yedam;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		
		num1 = sc.nextInt();
		
		num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int mul = num1*num2;
		
		
		System.out.printf("합 : %d | 곱 : %d",sum , mul);
	}

}
