package co.yedam.array;

import java.util.Arrays;

public class ArrayExe2 {
	public static void main(String[]args) {
		
		
		int[] ary = new int[5];
		int sum = 0;
		int rd = 0;
		//1~100 임의의 값
		for(int i = 0; i <= 4; i++) {
		
			rd = (int)(Math.random()*99+1);
			ary[i] = rd;
			sum += ary[i];
			System.out.println(ary[i]);
		}
		
		
		System.out.println(Arrays.toString(ary));
		
		
		System.out.println("무작위 수 합 : " + sum);
		int avg = 0;
		avg = sum/5;
		
		System.out.println("무작위 수 평균 : " + avg);
		
		
	}

}
