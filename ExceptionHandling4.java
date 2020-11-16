package day_5;

import java.util.Scanner;

public class ExceptionHandling4 {
	public static void main(String[] args) {
		int age;
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the player name...");
		name = scan.next();
		System.out.println("enter the player age...");
		age = scan.nextInt();
		if(age < 19) {
			System.out.println(new CustomException_4("InvalidAgeRangeException"));
		}
		else {
			System.out.println("Player name...: "+name);
			System.out.println("Player age...: "+age);
		}
	}

}
