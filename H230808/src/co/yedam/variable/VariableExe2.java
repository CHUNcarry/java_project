package co.yedam.variable;

public class VariableExe2 {
	public static void main(String[] args) {
		
		String str ="홍길동";
		str = "김길동";
		
		
		Person hong = new Person();
		hong.name = "홍길동";
		hong.age = 20;
		hong.weight = 67.8;
		
		System.out.println(hong.name);
		System.out.println(hong.age);
		System.out.println(hong.weight);
		
		
		VariableExe3 exe3 = new VariableExe3();
		exe3.showInfo();
		exe3.helloMsg();
	}

}
