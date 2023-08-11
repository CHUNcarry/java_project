package co.yedam.array;

import java.util.Scanner;

public class ToDoApp {
	static Scanner scanner = new Scanner(System.in);
	static int no; 
	static String todo;
	static String dueDate;
	static Todo[] tds = new Todo[10];
	static boolean done;
	public static void main(String[]args) {
	//등록/완료/조회/미완료
	//등록 : 1 할일 0810
	//완료 : 등록>>완료 클래스이동
	//조회 : 날짜 입력 > 등록 완료 출력
	//if 날짜
	
	//미완료 : 완료 클래스에 없는 요소 boolean false
	
	//보여주는 기준 순번
			
			boolean run = true;
			boolean mrun = false;
			
			 
			
			while(run) {
				System.out.println("--------------------------------------------");
				System.out.println("1.등록 | 2.완료 | 3.조회 | 4.종료");
				System.out.println("--------------------------------------------");
				
				System.out.println("선택");
				
				int selectNo = Integer.parseInt(scanner.nextLine());
				
				switch(selectNo) {
				case 1 : 
				
				System.out.println("번호");
					no = Integer.parseInt(scanner.nextLine());
					System.out.println("할일");
					todo = scanner.nextLine();
					System.out.println("날짜");
					todo = scanner.nextLine();
					
					
					Todo td = new Todo();
					
					td.no = no;
					td.todo = todo;
					td.dueDate = dueDate;//add()
					
					break;
				case 2 :
					System.out.println("번호");
					no = Integer.parseInt(scanner.nextLine());
					for(int i = 0; i < tds.length; i++) {
						if(tds[i].no == no) {
							tds[i].done = true;
						}
						System.out.printf("%d | %s | %s %s\n", tds[i].no, tds[i].todo, tds[i].dueDate, tds[i].done);
					}
					break;
					
				case 3 : // 리스트 list()
					
					int lnth = 0;
					
					for(int i = 0; i < tds.length -1; i++) {
						Todo tmp = new Todo();
						if (tds[i] != null) {
							lnth++;
						}
						
					}
					
					for(int i = 0; i < lnth -1; i++) {
						Todo tmp = new Todo();
						if (tds[i].no < tds[i+1].no) {
							 tmp = tds[i];
							 tds[i] = tds[i+1];
							 tds[i+1] = tmp;
							 break;
						}
					}
				case 4 : //  
				
					run = false;
					mrun = true;
					System.out.println("END");
					break;
					
				}
			}
			
				
				
		while(mrun) {
			System.out.println("1. 매크로 | 2. TodoApp 으로");
			int manage = Integer.parseInt(scanner.nextLine());
			
			switch(manage) {
				case 1 :
					for(int i = 0; i < 5; i++) {
						Todo td = new Todo();
						td.no = i;
						td.todo = "010-1234-456"+ i;
						td.dueDate = "081"+ i;
						}
					break;
					
				case 2 : 
					run = true;
					mrun = false;
				}
			}
		
		}

	}





