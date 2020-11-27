package day_7;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		UserMainCode6 obj = new UserMainCode6();
		Scanner scan = new Scanner(System.in);
		int yy;
		int mm;
		System.out.println("Enter year...");
		yy = scan.nextInt();
		System.out.println("Enter month...");
		mm = scan.nextInt();
		System.out.println("No of days ...: " + obj.getNumberOfDays(yy, mm));
	}
}
