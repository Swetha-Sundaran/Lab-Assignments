package day_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14 {
	public static void main(String[] args) throws Exception {
		UserMainCode14 obj = new UserMainCode14();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String date;
		System.out.println("Enter string date...");
		date = br.readLine();
		System.out.println(obj.covertDateFormat(date));

	}
}
