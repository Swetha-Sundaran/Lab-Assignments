package day_7;

import java.text.ParseException;
import java.util.Scanner;

public class MonthDifferenceMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Date");
		String date1 = scanner.nextLine();
		System.out.println("Enter Second Date");
		String date2 = scanner.nextLine();
		try {
			System.out.println(
					"Difference between the dates in month = " + MonthDifference.getMonthDifference(date1, date2));
		} catch (ParseException e) {
			System.err.println(e);
		}
		scanner.close();
	}
}
