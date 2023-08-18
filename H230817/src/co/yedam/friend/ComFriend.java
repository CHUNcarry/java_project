package co.yedam.friend;

public class ComFriend extends Friend{
	private String com;
	private String dep;
	
	
	public ComFriend(String name, String phone, String com, String dep) {
		super(name, phone);
		this.com = com;
		this.dep = dep;
	}


	public String getCom() {
		return com;
	}


	public void setCom(String com) {
		this.com = com;
	}


	public String getDep() {
		return dep;
	}


	public void setDep(String dep) {
		this.dep = dep;
	}

	public String showInfo() {
		return super.showInfo() + " | 회사 : " + getCom() + " | 부서 : " + getDep();
	}
}
