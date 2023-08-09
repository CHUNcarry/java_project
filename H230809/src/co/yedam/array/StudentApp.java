package co.yedam.array;

import java.util.Scanner;
public class StudentApp {
	public static void main(String[]args) {
		
		Student[] students = new Student[10];
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int idx = 0;
	
		
		//1.등록	2. 조회	3. 목록
		while(run) {
			System.out.println("1.등록  2.조회 3.목록 4.종료");
			System.out.println("선택>>");
			
			int menu = Integer.parseInt(sc.nextLine());
			
			
			switch(menu) {
			case 1 : System.out.println("이름과 성적 입력");
									 
			Student std = new Student();
				std.name = sc.nextLine();
				std.score = Integer.parseInt(sc.nextLine()); 
			case 2 : //이름, 점수
				
			case 3 : //이름, 점수
				System.out.println("이름을 입력");
				System.out.println(sc.nextLine());
				
			case 4 : //종료
			}
			 
			
		}
		
		
	}
}
