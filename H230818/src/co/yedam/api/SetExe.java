package co.yedam.api;

import java.util.HashSet;
import java.util.Set;



public class SetExe {
	public static void main(String[] args) {
		//ArrayList, HashSet : 중복된 값 저장 불가
		Set<String> set = new HashSet<>();
		
		
//		set.add("hong");
//		set.add("hwang");
//		set.add("kim");
		
		for (String str : set) {
			System.out.println(str);
		}
		
		Set<Member> memberSet = new HashSet<>();
		
		memberSet.add(new Member(101, "hong"));
		memberSet.add(new Member(102, "hwang"));
		memberSet.add(new Member(103, "kim"));
		
		
		for (Member str : memberSet) {
			System.out.println(str);
		}
	}
}
