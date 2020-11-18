package day_1;
//Code to find the average of 3 numbers
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		double num1, num2, num3;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1");
		num1 = sc.nextInt();
		System.out.println("Enter the value of num2");
		num2 = sc.nextInt();
		System.out.println("Enter the value of num3");
		num3 = sc.nextInt();
		avg = (num1 + num2 + num3) / 3;
		System.out.println("Average of three numbers is = " + avg);

	}

}
