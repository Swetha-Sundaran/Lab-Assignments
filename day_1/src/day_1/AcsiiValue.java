package day_1;
//Code to print the ASCII value of a character
import java.util.Scanner; 

public class AcsiiValue {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		ch = sc.next().charAt(0);
		int ascii = ch;
		System.out.println("The ASCII value of " + ch + " is " + ascii);

	}

}
