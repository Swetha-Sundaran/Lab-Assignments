package day_7;

import java.util.ArrayList;
import java.util.Scanner;

public class SortMergeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		System.out.println("Enter the elements os array 1");
		for (int i = 0; i < 5; i++) {
			array1.add(scanner.nextInt());
			scanner.nextLine();
		}
		System.out.println("Enter the elements os array 2");
		for (int i = 0; i < 5; i++) {
			array2.add(scanner.nextInt());
			scanner.nextLine();
		}
		ArrayList<Integer> result = SortMerge.sortMergedArrayList(array1, array2);
		System.out.println("Output");
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
		scanner.close();
		array1 = null;
		array2 = null;
		result = null;
	}

}
