package co.yedam.stream;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Friend {
	private String name;
	private String phone;
	private Date birth; //sdf/parse 
	
	
	
	public Friend(String name, String phone, Date birth) {
		// TODO Auto-generated constructor stub
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
	
	
	public String toString() {
		
		return "NAME : " +getName() + " | PHONE : " + getPhone() + " | BIRTH : " + getBirth();
	}
	

}
