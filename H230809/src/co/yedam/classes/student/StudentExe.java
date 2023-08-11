package co.yedam.classes.student;

public class StudentExe {
	public static void main(String[]args) {
		
	Student s1 = new Student();
	s1.setstdNo(100);
	s1.setstdName("Hong");
	s1.setstdsc(80);
	s1.stdInfo();
	
	Student s2 = new Student(101, "Hwang", 70);
	s2.stdInfo();
	System.out.println(s1.getStdName());
	}
	
}
