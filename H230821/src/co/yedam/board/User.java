package co.yedam.board;

import java.io.Serializable;

public class User implements Serializable{

	
	private static String userId;
	private static String userPw;
	private static String name;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User() {
		
	}

	
	
	
}
