package co.yedam.classes.student;

public class Student {
	
	
		private int stdNo ;
		private String stdName;
		private int score;
		
		//생성자
		
		// 생성자 : 필드의 값 초기화
		
		public Student(){
			
		}
		Student(int stdNo, String stdName, int score){
			this.stdNo = stdNo;
			this.stdName = stdName;
			this.score = score;
		}
		
		
		void setstdNo(int stdNo) {
			this.stdNo = stdNo;
		}
		
		void setstdName(String stdName) {
			this.stdName = stdName;
		}
		void setstdsc(int stdsc) {
			if(score < 0) {
				this.score = 0;
				}else {
			this.score = stdsc;
			}
		}
		//get
		
		
		
		
		
		
		
		public void stdInfo(){
			
		System.out.println("학번" + stdNo + 
					"이름" + stdName + 
					"점수" + score) ;}
		
		public int getStdNo() {
			return stdNo;
		}
		public String getStdName() {
			return stdName;
		}
		public int getScore() {
			return score;
		}
		}
