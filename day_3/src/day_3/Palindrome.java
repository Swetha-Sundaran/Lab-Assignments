package day_3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		String str1, str2 = "";
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the string you want to check:");
		str1 = str.nextLine();
		int length = str1.length();
		for (int i = length - 1; i >= 0; i--) {
			str2 = str2 + str1.charAt(i);
		}
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
