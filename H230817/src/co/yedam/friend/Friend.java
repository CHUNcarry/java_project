package co.yedam.friend;

public class Friend {
	//이름 연락처
	//ㄴUnivFriend
	//ㄴComFriend
	
	private String name;
	private String phone;
	
	
	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
		
	
	
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}


	//getter &setter	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String showInfo() {
		return "이름 : " + getName() + " | 연락처 : " + getPhone();
	}
}



//친구 연락처 정보.

//이름 전화번호 학교명 전공
//이름 전화번호 회사명 부서
//이름 연락처
