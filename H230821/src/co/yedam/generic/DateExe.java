package co.yedam.generic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExe {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:SS");
		System.out.println(today.toString());
		System.out.println(sdf.format(today));
		
		
		String strTime = "2023-09-01 13:22:22";
		
		try {
			Date newdate = sdf.parse(strTime);
			System.out.println(newdate.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
