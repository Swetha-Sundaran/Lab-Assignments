package day_3;

import java.util.Scanner;

public class Problem9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		com.hcl.Calculator calculator = new com.hcl.Calculator();
		System.out.println("Enter two numbers");
		System.out.println("Adding two numbers sum is " + calculator.add(scanner.nextInt(), scanner.nextInt()));

}
}
