package HackerRank.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class CalendarDateTime {

	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
        
        
        Date d=sdf.parse(month+"/"+day+"/"+year);
       
        Calendar cal=Calendar.getInstance(Locale.US);
        cal.setTime(d);
        int dayOfWeek=cal.get(cal.DAY_OF_WEEK);
        switch (dayOfWeek) {
		case 1:
			day="SUNDAY";
			break;
		case 2:
			day="MONDAY";
			break;
		case 3:
			day="TUESDAY";
			break;
		case 4:
			day="WEDNESDAY";
			break;
		case 5:
			day="THURSDAY";
			break;
		case 6:
			day="FRIDAY";
			break;
		case 7:
			day="SATURDAY";
			break;

		default:
			break;
		}
        
        System.out.println(day);

	}

}
