package day_3;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a string: ");
		String str = in.nextLine();
		System.out.println(str.substring(3, 7));

	}

}
