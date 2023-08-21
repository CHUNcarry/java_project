package co.yedam.generic;

public class MainExe {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("Hello");
		String result = (String) box.get();

		//box.set(10); // 10(Integer)
		result = (String) box.get();
		
Box<Integer> ibox = new Box<Integer>();


		
	}

}
