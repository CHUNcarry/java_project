package co.yedam.variable;

import java.io.IOException;

public class VariableExe4 {
	public static void main(String[]args) {
		String name ="홍길동";
		int age = 20;
		double weight = 67.8;
		
		System.out.println("이름른 " + name + ", 나이는 " + age + "살 입니다.");
		System.out.printf("이름은 %s, 나이는 %d살, 몸무게는 %.1f 입니다.",name, age, weight);
		System.out.printf("이름은 %s, \t나이는 %d살, \t몸무게는 %.1f 입니다.",name, age, weight);
		
		
		
		try {
			System.out.println("값을 입력");
			while(true) { 
			int result = System.in.read();
			if(result == 113) {
				break;
			}else if (result == 10 ||result == 13) {
				
			}else {
				System.out.println("키코드 : "+result);
				System.out.println("값을 입력");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		System.out.println("end of program.");
	}
}
	

