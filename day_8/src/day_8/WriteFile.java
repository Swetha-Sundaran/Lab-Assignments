package day_8;

import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class WriteFile {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("C:\\Users\\Admin-Pc\\Desktop\\filename.txt");
			myWriter.write("Files in Java might be tricky, but it is fun enough!\n");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
