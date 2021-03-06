package day_7;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class MonthDifference {
	public static int getMonthDifference(String date1, String date2) throws ParseException {

		Period diff = Period.between(LocalDate.parse(date1).withDayOfMonth(1),
				LocalDate.parse(date2).withDayOfMonth(1));
		return diff.getMonths() + (diff.getYears() * 12);
	}
}
