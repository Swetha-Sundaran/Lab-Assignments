//Code to find if the Sum of Odd digits of a given integer is odd/even
package day_1;

import java.util.Scanner;

public class UserMainCode {

	public static void main(String[] args) {
		int num;
		CheckSum obj = new CheckSum();
		System.out.println("Enter positive integer...");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		if (obj.checkSum(num) == 1) {
			System.out.println("the sum odd digits is odd");
		} else {
			System.out.println("the sum of odd digits is even");
		}
	}
}

class CheckSum {

	public static int checkSum(int num) {
		int remainder;
		int sum = 0;
		while (num != 0) {
			remainder = num % 10;
			if (remainder % 2 == 1) {
				sum = sum + remainder;
			}
			num = num / 10;
		}
		if (sum % 2 == 1)
			return 1;
		else
			return -1;
	}
}
