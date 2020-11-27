package day_8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class AppendText {
	public static void main(String a[]) {
		StringBuilder sb = new StringBuilder();
		String strLine = "";
		try {
			String filename = "C:\\Users\\Admin-Pc\\Desktop\\filename.txt";
			FileWriter fw = new FileWriter(filename, true);
			// appends the string to the file
			//fw.write("\nJava Exercises\n");
			fw.write("\nFile Handling");
			fw.close();
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Admin-Pc\\Desktop\\filename.txt"));
			// read the file content
			while (strLine != null) {
				sb.append(strLine);
				sb.append(System.lineSeparator());
				strLine = br.readLine();
				System.out.println(strLine);
			}
			br.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}
}
