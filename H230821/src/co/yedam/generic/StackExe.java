package co.yedam.generic;

import java.util.Stack;

public class StackExe {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("One");
		stack.push("Two");
		stack.push("Three");
		stack.push("Four");
		stack.push("Five");
		
		
		
		while(!stack.isEmpty()) {
			String val = stack.pop();
			System.out.println(val);	
		}
		
		
	}
}
