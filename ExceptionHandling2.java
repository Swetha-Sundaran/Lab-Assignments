package day_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		int numerator;
		int denominator;
		Scanner scan = new Scanner(System.in);
		try {
			numerator = scan.nextInt();
			denominator = scan.nextInt();
			System.out.println(numerator/denominator);
		}catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}catch(ArithmeticException ae) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
	}

}
