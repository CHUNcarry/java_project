package co.yedam.variable;

public class VariableExe3 {
	int num = 100;
	public void showInfo() {
		num = 100 + this.num;
		
		System.out.println("num = " + num);
		
		int num1 = 200;
		//로컬변수는 실행한 함수 내에서만 유효
	}
	
	public void helloMsg() {
		int num = 200;
		System.out.println("num = " + num);
	}

}
