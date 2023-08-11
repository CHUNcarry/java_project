package co.yedam.array;

import java.util.Scanner;




public class ScoreApp {
	public class Member {
		int studentNum ;
		int score ;

	}
	public static void main(String[]args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int score =0;
		Scanner scanner = new Scanner(System.in);
		Member[] members = new Member[10]; 
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 |4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			
			System.out.println("선택");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			switch(selectNo) {
			case 1 ://total()
				System.out.println();
				
			case 2 :// 학생번호 , 점수
					//add(
				System.out.println("학생번호 입력");
				studentNum = Integer.parseInt(scanner.nextLine());
				System.out.println("점수 입력");
				score = Integer.parseInt(scanner.nextLine());
				
				Member mb = new Member();
				
				mb.studentNum = studentNum;
				mb.score = score;
				
				break;
			

			case 3 : // 리스트 list()
				for(int i = 0; i <10; i++) {
					if (members[i] != null) {
						System.out.printf("%d | %d", members[i].studentNum, members[i].score);
					}
				}
			case 4 : // 최고 최저 평균 anl()
				int sum = 0;
				int count = 0;
				for(int i = 0; i<10; i++) {
					if(members[i].score >= 1) {
					
						sum = members[i].score + sum;
						count++ ;
					}
				}
				
				
			case 5 : //exit
				default :
			}
		}
		/*System.out.println("1. 매크로 | 2. friendApp 으로");
		int manage = Integer.parseInt(sc.nextLine());
		switch(manage) {
			case 1 :
				for(int i = 0; i < 5; i++) {
					Friend frd = new Friend();
					frd.name = "test" + i;
					frd.phone = "010-1234-456"+ i;
					frd.gender = i%2 == 0 ? Gender.MEN : Gender.WOMEN;
					
					if (friends[i] == null) {
						friends[i] = frd;
						System.out.println("CREATE");
						}
					}
				break;
			case 2 : 
				run = true;
				mrun = false;}*/
	
	}

}
