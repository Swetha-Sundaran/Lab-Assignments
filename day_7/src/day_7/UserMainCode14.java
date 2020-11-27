package day_7;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMainCode14 {
	static String covertDateFormat(String s) throws Exception {
		String replaceString = s.replace("/", "-");
		StringBuilder sb = new StringBuilder(replaceString);
		// System.out.println(replaceString);
		sb.delete(6, 8);
		String finalString = sb.toString();
		return finalString;
	}
}
