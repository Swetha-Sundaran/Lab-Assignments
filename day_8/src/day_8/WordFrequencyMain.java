package day_8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WordFrequencyMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of words");
		int count = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter strings to be searched");

		WordFrequency wordfrequency = new WordFrequency();
		String[] patterns = new String[count];
		for (int i = 0; i < count; i++) {
			patterns[i] = scanner.nextLine();
		}
		for (int i = 0; i < count; i++) {
			try {
				System.out.println("Word " + patterns[i] + " " + wordfrequency.wordFrequency(patterns[i]));
			} catch (FileNotFoundException e) {
				System.err.println(e);
			} catch (IOException e) {
				System.err.println(e);
			}
		}
		scanner.close();
	}

}
