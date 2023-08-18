package co.yedam.inheritance;

public class Cellphone extends Object{
	private String model;
	private String color;
	
	Cellphone(){

}
	public void turnOn() {
		System.out.println("열기");
	}
	
	public void turnOff() {
		System.out.println("닫기");
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return color + ", " + model; 
	}

}
