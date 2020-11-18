package day_2;

import java.util.Scanner;

public class VowelCount {
	public static void main(String[] args) {
		int vCount = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Input a string: ");
		String str = in.nextLine();
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount++;
			}
		}
		System.out.println("Number of vowels: " + vCount);

	}
}
