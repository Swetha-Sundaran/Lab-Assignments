package day_2;

import java.util.Scanner;

public class Smallest_int {

	public static void main(String[] args) {
		int num1, num2, num3, smallest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		num1 = sc.nextInt();
		System.out.println("Enter num2");
		num2 = sc.nextInt();
		System.out.println("Enter num3");
		num3 = sc.nextInt();
		if (num1 < num2 && num1 < num3) {
			smallest = num1;
		} else if (num2 < num3) {
			smallest = num2;
		} else {
			smallest = num3;
		}
		System.out.println(smallest + " is the smallest number");

	}

}
