package day_1;

import java.util.Scanner;

public class SwapingVariables {

	public static void main(String[] args) {
		int num1, num2, tempVar;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1");
		num1 = sc.nextInt();
		System.out.println("Enter the value of num2");
		num2 = sc.nextInt();
		System.out.println("Before Swapping num1=" + num1 + " and num2=" + num2);
		tempVar = num1;
		num1 = num2;
		num2 = tempVar;
		System.out.println("After Swapping num1=" + num1 + " and num2=" + num2);

	}

}
