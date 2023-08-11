package co.yedam.classes.friend;

import java.util.Calendar;

public class Calender {

	
	
	
	public static void main(String[]args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(2012, 0, 1);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DATE));
		
	}
}
