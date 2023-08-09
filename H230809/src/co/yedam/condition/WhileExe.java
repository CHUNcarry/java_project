package co.yedam.condition;

public class WhileExe {
	public static void main(String[]args) {
		boolean run = true;
		
		int i = 0;
		
		int sum = 0;
		int avg = 0;
		while(run) {
			int tmp = (int)(Math.random()*100);
			i = i++;
						
			if(tmp> 90) {
				run = false;
			}
			System.out.println(tmp);
		}
		System.out.println("END");
	}

}
