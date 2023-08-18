package co.yedam.Self;

public class List {

	public List(String name, String year, String month, String day, String gender, String ucode) {
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
		this.gender = gender;
		this.Ucode = ucode;

		// TODO Auto-generated constructor stub
	}

	private String name;
	private String year;
	private String month;
	private String day;
	private String gender;
	private String Ucode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUcode() {
		return Ucode;
	}

	public void setUcode(String ucode) {
		Ucode = ucode;
	}

	public String show() {
		return "이름 : " + name + "|" + getYear() + getMonth() + getDay() + " - " + getGender() + getUcode();
	}

}
