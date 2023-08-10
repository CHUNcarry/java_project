package co.yedam.array;

public class Friend {
	String name = null;
	String phone = null;
	Gender gender = null;
	
	void showinfo() {
		
		System.out.printf("이름 : %s | 연락처 : %s | 성별 : %s\n", 
					name, phone, gender == Gender.MEN ? "남" : "여" );
	}
	void briefInfo() {System.out.printf("이름 : %s | 연락처 : %s | 성별 : %s\n", 
			name, phone, gender == Gender.MEN ? "남" : "여" );
	}
}
