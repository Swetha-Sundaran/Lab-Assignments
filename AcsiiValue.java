package day_1;

import java.util.Scanner;

public class AcsiiValue {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		ch = sc.next().charAt(0);
		int ascii = ch;
		System.out.println("The ASCII value of " + ch + " is " + ascii);

	}

}
