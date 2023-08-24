package co.yedam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Friend {

	private String name;
	private String phone;
	private Date birth;
	
	SimpleDateFormat sdf = new SimpleDateFormat();

	
	public Friend(String name, String phone, int birh, double height) {
		this.name = name;
		this.phone = phone;
		this.birth = birth;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	
//	public String show() {
//		return "이름 " + name + "연락처 " + phone + "생일 " + birh + "키 " + height;
//	}

}
