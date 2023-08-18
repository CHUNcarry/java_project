package co.yedam.lombok;

//import lombok.ToString;

public class MainExe {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setStdName("qwe");
		s1.setStdNo(1);
		s1.setScore(150);
		
		System.out.println(s1.toString());
		}
}
