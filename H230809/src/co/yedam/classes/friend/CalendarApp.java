 package co.yedam.classes.friend;

import java.util.Calendar;

public class CalendarApp {
	
	 static Calendar cal = Calendar.getInstance();
	public static void showCalendar(int year, int month){
		
		

		int space = cal.get(Calendar.DAY_OF_MONTH);
		for(int i = 1; i <= space; i++) {
			System.out.printf("%4s", " ");
		}
		
		
		
		for(int i = 1; i <=getLastDate(7); i++) {
			System.out.printf("%4d",i);
			
				if((i + space)%7 == 0) {
					System.out.println();
			}
			
		}
		
		for(int i = 1; i <= getLastDate(7); i++) {
			System.out.printf("%4s", " ");
		}
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		
		}
	
	public static void main(String[]args) {
		
		
	}
}
