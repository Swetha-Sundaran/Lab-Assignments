package day_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string....");
		String s = br.readLine();
		UserMainCode7 obj = new UserMainCode7();
		int isValid = obj.checkCharacters(s);
		if (isValid == 1) {
			System.out.println("valid");
		} else {
			System.out.println("not valid");
		}
	}
}
