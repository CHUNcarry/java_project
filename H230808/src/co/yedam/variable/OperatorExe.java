package co.yedam.variable;

public class OperatorExe {
	public static void main(String[]args) {
		
		int x, y;
		y = x = 2;
		
		int result = x++ + 10; // 10+2(x) 후 x값 ++ 12 x=3
			//2 + 10 
		System.out.println("x:"+ x);
		System.out.println(result);
		
		
		result = ++y + 10; // y에 1을 더한 후 연산 10 + 3(++y)
			//++1 +2 +10
		System.out.println("y:" + y);
		System.out.println(result);
		
		String str;
		
		/*if (x >= 10) {
			 str = "x는 10 이상";
			result = x * 2;
		}else {
			str = "x는 10 이하";
			result = x / 2;
		}*/
		str = (x>=10) ? "x는 10 이상" : "x는 10 미만";
		
		System.out.println(str);
	}
	
	
	

}
