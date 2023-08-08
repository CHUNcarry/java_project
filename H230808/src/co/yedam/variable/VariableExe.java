package co.yedam.variable;

public class VariableExe {
	public static void main(String[] args) {
		//변수선언 
		
		//정수형 변수 byte short long 		//byte : 128-127
		//short
		
		
		int num1 = 2147483647;
		int num2 = 2147483647;
		
		int result = num1 + num2;
		
		System.out.println(result);
		
		byte b1 = 10;
		byte b2 = 110;
		
		int b3 = b1 + b2;
		//Type mismatch: cannot convert from int to byte
		System.out.println(b3);
		
		int i1 = 100;
		byte b4 = 4;
		
		b3 = i1 + b4;// 자동형변환해서 연산
		
		System.out.println(b3);
		
		//실수타입
		//float double
		//double = 소수
		
		double db1 = 10.232333;
		double db2 = 20;
		double db3 = db1 + db2;
		
		System.out.println(db3);
		
		
		float f1 = 10.1F;
		float f2 = 10.2f; 
		float f3 = f1 + f2;
		System.out.println(f3);

	}

}
