package co.yedam.array;

public class FuncExe {
	public static void main(String[]args) {
		printStar();
		
		
		//printStar(10);
		printString(5, "★");
		
		int n3 = sum(10,100);
		System.out.println(n3);
		
		
		Friend f = getFriend("홍길동", "010-4567-7890", Gender.MEN);
		f.showinfo();
	}
	
	public static void printStar() {
		System.out.println("*");
	}
	
	public static void printString(int times, String str) {
		
		for(int i = 0; i <times; i ++) {
			System.out.println("*");
			System.out.println(str);
		}
		
	}
	
	public static int sum(int n1, int n2) {
		int result = n1 + n2;
	
		return result;
	}
	
	/*public static int sum(int[] arry) {
		for (int i = 0; i < arry.length; i++) {
			int sum = 0;
			sum += arry[i];
		
		}
		return sum;
	
	
	
		
	
		
	}*/
	
	public static Friend getFriend(String name, String phone, Gender gender) {
		Friend f = new Friend();
		return f;
		
				}
}
