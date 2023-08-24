package co.yedam;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 ;
		int num2 ;
		
		int sum2 = 0;
		int sum3 = 0;
		
		System.out.println("숫자 1");
		num1 = sc.nextInt();
		System.out.println(num1);
		
		System.out.println("숫자 2");
		num2 = sc.nextInt();
		
		
		if(num1>num2) {  
			for (int i = num2; i<=num1; i++) {
				 if(i%2 == 0) {
					 sum2 += i;
					 System.out.println("2배수합" + sum2);
				 }else if (i%3 == 0) {
					 sum3 += i;
					 System.out.println("3배수합" + sum3);
				 }}
			}else if(num2>num1) {
				for (int i = num1; i <= num2; i++) {
					 if(i%2 == 0) {
						 sum2 += i;
						 System.out.println("2배수합" + sum2);
					 }else if (i%3 == 0) {
						 sum3 += i;
						 System.out.println("3배수합" + sum3);
					 }
					 
				}
				
			}
		
		System.out.printf("2배수합 : %d | 3배수합 : %d", sum2, sum3);
		
	}
	
}		