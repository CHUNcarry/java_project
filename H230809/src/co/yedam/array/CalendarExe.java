package co.yedam.array;

public class CalendarExe {
	static int days = 0;
	public static void main(String[]args) {
	//달력
		
	
		int space = getFirstDay(7);
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
		
/*				
		for(int i = 1; i < days; i++) {
			String doW = ""; 
			switch(i%7) {
			case 1 : doW = "화"; break;
			case 2 : doW = "수";break;
			case 3 : doW = "목"; break;
			case 4 : doW = "금"; break;
			case 5 : doW = "토"; break;
			case 6 : doW = "일"; break;
			default : doW = "월";break;
			}
		System.out.printf("%3d일 %s\n",i, doW);
		}*/
	}
	public static int getFirstDay(int month) {
		int day =0;
		int totalDays = 0;
		for (int i = 1; i<= month; i++) {
			totalDays += getLastDate(i);
		}
		day = (day + totalDays)%7;
		switch(month) {
		case 7 : 
			day = 6;
			break;
		case 8 :
			day = 2;
			break;
		}
		return day;
	}
	
	
	public static int getLastDate(int month) {
		//1-31, 28, 31, 30
		if(month == 1) {
			days = 30;
		}else if(month == 2) {
			days = 28;
		}else if(month%2 == 1) {
			days = 31;
		}else {
			days = 30;
		}
		return days;
	}
}


