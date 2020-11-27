package day_7;

import java.time.LocalDateTime;

public class DateTime {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("The date is ..: " + dateTime.getDayOfMonth() + "-" + dateTime.getMonthValue() + "-"
				+ dateTime.getYear());
		System.out.println(
				"Time is ......: " + dateTime.getHour() + ":" + dateTime.getMinute() + ":" + dateTime.getSecond());
	}
}
