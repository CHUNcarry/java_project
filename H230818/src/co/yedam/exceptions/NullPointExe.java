package co.yedam.exceptions;

public class NullPointExe {
	public static void main(String[] args) {
		String msg =null;
		msg = "hello";
		try {
			System.out.println(msg.toString());
		}catch (NullPointerException e) {
			
			System.out.println("msg값을 숫자로 변환할 수 없습니다");
			System.out.println("예외가 발생");
		}catch(NumberFormatException e1) {
			System.out.println("msg값을 숫자로 변환할 수 없습니다");
			System.out.println("예외가 발생");
		}
		
		
		System.out.println("END");
	}

}
