package day_5;

import java.util.Scanner;

public class ExceptionHandling3 {
	public static void main(String[] args) {
		int number;
		int power;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number ...");
		number = scan.nextInt();
		System.out.println("Enter power...");
		power = scan.nextInt();
		if(number < 0 || power < 0) {
			System.out.println(new MyException_3("n or p should not be negative..."));
		}
		else if(number==0 && power==0) {
			System.out.println(new MyException_3("n and p shold not be zero..."));
		}
		else {
			MyCalculator_3 calculator = new MyCalculator_3();
			System.out.println(calculator.getPower(number, power));
		}
	}

}
