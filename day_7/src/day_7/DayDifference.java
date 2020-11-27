package day_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.*;
import java.util.*;

public class DayDifference {
	public static void main(String[] args) throws ParseException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Day 1");
		String s1 = br.readLine();
		System.out.println("Enter Day 2");
		String s2 = br.readLine();
		System.out.println(dateDifference(s1, s2) + " days");
	}

	public static int dateDifference(String s1, String s2) throws ParseException {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sd.parse(s1);
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		long d1 = c.getTimeInMillis();
		d = sd.parse(s2);
		c.setTime(d);
		long d2 = c.getTimeInMillis();
		int n = Math.abs((int) ((d1 - d2) / (1000 * 3600 * 24)));
		return n;
	}
}
