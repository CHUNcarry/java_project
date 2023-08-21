package co.yedam.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExe {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list.add("" + i);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList : " + (end - start));
		end = 0;
		start = 0;

		start = System.currentTimeMillis();
		List<String> Llist = new LinkedList<>();
		for (int i = 0; i < 10000000; i++) {
			Llist.add("" + i);
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList : " + (end - start));
	}

}
