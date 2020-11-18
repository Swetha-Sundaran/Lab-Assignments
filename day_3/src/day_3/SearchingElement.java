package day_3;

import java.util.Scanner;

public class SearchingElement {

	public static void main(String[] args) {
		int size, toFind, i, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		size = sc.nextInt();
		int[] array = new int[10];
		System.out.println("Enter the elements of the array: ");
		for (i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the Number to be found");
		toFind = sc.nextInt();
		for (i = 0; i < size; i++) {
			if (array[i] == toFind) {
				flag = 1;

				break;
			}
		}
		if (flag == 1) {
			System.out.println(toFind + " is found");
		} else {
			System.out.println(toFind + " is not found");
		}

	}

}
