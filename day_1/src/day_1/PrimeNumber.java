package day_1;
//Code to check if a number is Prime or not
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num, i;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		num = sc.nextInt();
		if (num <= 0) {
			System.out.println("Enter a Positive Number");
		} else if (num == 1) {
			System.out.println("1 is neither Prime nor Composite");
		} else {

			for (i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = 1;
					break;
				}
			}

			if (flag == 1) {
				System.out.println(num + " is not a Prime Number");
			} else {
				System.out.println(num + " is a Prime Number");
			}
		}

	}

}
