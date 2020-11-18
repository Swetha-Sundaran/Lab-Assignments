//Code to find the Sum of square of even digits
package day_1;

import java.util.Scanner;

public class UserMainCode1 {

	public static void main(String[] args) {

		int integer;
		Scanner scan = new Scanner(System.in);
		SumOfSquares obj = new SumOfSquares();
		System.out.println("Enter positive integer...");
		integer = scan.nextInt();
		System.out.println("sum of squares...: " + obj.sumOfSquares(integer));

	}

}

class SumOfSquares {
	public static int sumOfSquares(int num) {
		int remainder;
		int sum = 0;
		while (num != 0) {
			remainder = num % 10;
			if (remainder % 2 == 0) {
				remainder = remainder * remainder;
				sum = sum + remainder;
			}
			num = num / 10;
		}
		return sum;
	}
}
