package co.yedam.array;

import java.util.Arrays;










public class ArrayExe3 {
	public static void main(String[]args) {
		
		
		
		
		//Student std = new Student();
		
		/*std.name = "홍길동";
		std.score = 0;*/
		 
		
		
		//stdent<std<[i]
		
		
		//String: name;
		Student[] students = new Student[4];
		
		String[] 	names 	= {"홍길동","김길동","박길동","최길동"};
		int[] 		scores 	= {85, 88, 92, 75};
		
		for(int i=0; i<4; i++) {
			Student std = new Student();
			std.name = names[i];
			std.score = scores[i];
			students[i] = std;
			System.out.printf("이름은 %s 점수는 %d점\n",names[i],scores[i]);
			
		}
		
		//System.out.println(Arrays.deepToString(students));
		
		
	}

}
