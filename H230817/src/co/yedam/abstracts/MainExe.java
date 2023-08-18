package co.yedam.abstracts;

public class MainExe {
	public static void main(String[] args) {
		
		//Animal animal = new Animal("");
		Animal animal = new Dog("개");
		
		animal.sound();
		
		animal = new Cat("고양이");
		animal.sound();
	}
}
