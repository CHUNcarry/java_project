package co.yedam.generic;

import java.util.ArrayList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add(new String("World"));
		list.add("Good");
		
		String result = list.get(0);
		
//		System.out.println(result);
		for (int i = 0; i< list.size(); i++) {
			
			System.out.println(list.get(i));
			
		}
		list.set(1,  "result");
		list.remove(1);
		list.clear();
		
		System.out.println("삭제후");
		
		for(String str : list){
			System.out.println(str);
		}
	}

}
