package co.yedam.abstracts;
//상속
public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	//구현부분 없는 추상메소드 {}x
	public abstract void sound();//{};
}
