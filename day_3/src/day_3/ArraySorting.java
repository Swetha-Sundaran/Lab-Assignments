package day_3;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		int size, temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		size = sc.nextInt();
		int[] array = new int[10];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println();

		// Displaying elements of array after sorting
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
