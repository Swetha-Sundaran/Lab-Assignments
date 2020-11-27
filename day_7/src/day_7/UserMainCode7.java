package day_7;

public class UserMainCode7 {
	static int checkCharacters(String s) {
		if (s.charAt(0) == s.charAt(s.length() - 1))
			return 1;
		return -1;
	}
}
