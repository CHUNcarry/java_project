package co.yedam.array;

import java.util.Scanner;
public class StudentApp {
	public static void main(String[]args) {
		
		Student[] students = new Student[10];
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int idx = 0;
	
		
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.name = "홍";
		s1.score = 80;
		s1.height = 180.2;
		s1.gender = Gender.MEN;
		
		s2.name = "박";
		s2.score = 60;
		s2.height = 162.2;
		s2.gender = Gender.MEN;
		
		s3.name = "홍";
		s3.score = 81;
		s3.height = 174.5;
		s3.gender = Gender.MEN;
		//1.등록	2. 조회	3. 목록
		while(run) {
			System.out.println("1.등록  2.조회 3.목록 4.키큰학생 5.종료");
			System.out.println("선택>>");
			
			int menu = Integer.parseInt(sc.nextLine());
									
			switch(menu) {
			case 1 : System.out.println("이름과 성적 입력");
								 
				Student std = new Student();
				System.out.println("이름");
				std.name = sc.nextLine();
				System.out.println("점수");
				std.score = Integer.parseInt(sc.nextLine());
				System.out.println("키");
				std.height = Double.parseDouble(sc.nextLine());
				students[idx] = std;
				idx++;
				break;
			case 2 : //이름, 점수
				
				System.out.println("이름을 입력");
				String name = sc.nextLine();
				for(int i = 0; i < students.length; i++) {
					if(students[i] != null && students[i].name.equals(name) ){
					System.out.printf("이름 : %s  | 점수 : %d | 키 : %f\n", students[i].name, students[i].score, students[i].height);
					}
				}
				break;
			case 3 : //이름, 점수
				for(int i = 0; i < students.length; i++) {
					if(students[i] != null){
						System.out.printf("이름 : %s  | 점수 : %d | 키 : %f\n", students[i].name, students[i].score, students[i].height);
					}
				}
				break;
			case 4 : //키큰학생
				double height = 0 ;
					for(int i = 0; i < students.length; i++) {
					if(students[i] != null) {
						if(height > students[i].height) {
							System.out.println(height); 
							}else {
							height = students[i].height;
							}
						}
					}
				
				break;
			case 5 : //종료
				run = false;
			}
			 
			
		}
		//System.out.println(Arrays.toString(students));
		
		
	}
}
