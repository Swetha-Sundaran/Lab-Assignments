package day_1;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		int num;
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the value of num");
		// num=sc.nextInt();
		for (int i = 1; i <= 100; i++) {
			num = i;
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println(num + " fizz buzz");
			}

			else if (num % 3 == 0) {
				System.out.println(num + " Fizz");
			} else if (num % 5 == 0) {
				System.out.println(num + " Buzz");
			}
		}

	}

}
