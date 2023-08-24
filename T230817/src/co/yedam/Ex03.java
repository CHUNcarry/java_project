package co.yedam;

public class Ex03 {
	public static void main(String[] args) {
		
		
		
		int[] num =new int[5];
		int max = 0;
		int min = 0;
		for(int x = 0; x < 5; x++) {
			num[x] = (int) (Math.random()*9+1);
			System.out.println(num[x]);		
		}
		System.out.println("-----------");
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			if(min>num[i]) {
				min = num[i];
			}	
		}
		
		System.out.println("-----------");
		for (int i =0; i<num.length; i++) {
			System.out.println(num[i]);
			if (max<num[i]) {
				
				max = num[i];
				}
			}
		
		System.out.printf("최대값  : %d | 최소값 : %d", max, min);
	
}
}