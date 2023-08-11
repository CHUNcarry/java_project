package co.yedam.classes.student;

public class StudentApp {
	public static void main(String[]args) {
		Student[] students = new Student[10];
		
		Student s1 = new Student();
		s1.setstdNo(100);
		s1.setstdName("홍길동");
		s1.setstdsc(70);
		
		students[0] = s1;
		
		students[1] = new Student(101, "김길동", 80);
		students[2] = new Student(102, "이길동", 60);
		students[3] = new Student(103, "박길동", 70);
		
		String searchName = "김길동";
		
		
		for (int i = 0; students.length < 10; i++) {
			if(students[i] != null
					&& students[i].getStdName().equals(searchName)) {
				System.out.println(students[i].getStdNo() + 
							students[i].getStdName() + 
							students[i].getScore());
			}
					
		}
	}
}
