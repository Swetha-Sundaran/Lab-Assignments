package day_1;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1");
		num1 = sc.nextInt();
		System.out.println("Enter the value of num2");
		num2 = sc.nextInt();
		System.out.println("Addition :" + (num1 + num2));
		System.out.println("Subtraction :" + (num1 - num2));
		System.out.println("Multiplication :" + (num1 * num2));
		System.out.println("Division :" + (num1 / num2));
		System.out.println("Remainder :" + (num1 % num2));

	}

}
