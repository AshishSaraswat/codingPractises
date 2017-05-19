package arrays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Calen {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();
		String[] str = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
		int y = Integer.parseInt(year);
		int m = Integer.parseInt(month);
		System.out.print(m + " ");
		int d = Integer.parseInt(day);
		String date =day+"/"+month+"/"+year;
		Calendar weekday = Calendar.getInstance();
		SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date MyDate;
		try {
			MyDate = newDateFormat.parse(date);
		
		newDateFormat.applyPattern("EEEE");
		String MyDate1 = newDateFormat.format(MyDate);
		System.out.println(MyDate1);
		//weekday.set(y, m, d);
		weekday.setWeekDate(y, m, d);
		// weekday.DAY_OF_WEEK_IN_MONTH
		// weekday.se
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int dayofweek = weekday.DAY_OF_WEEK-1;
		System.out.print(dayofweek + " ");
		System.out.println(str[dayofweek]);
	}
}
