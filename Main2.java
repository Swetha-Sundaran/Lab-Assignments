package day_4;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("I implemented AdvancedArithmetic");
		num = scan.nextInt();
		MyCalculator_2 calculator = new MyCalculator_2();
		System.out.println(calculator.divisorSum(num));
	}
}
