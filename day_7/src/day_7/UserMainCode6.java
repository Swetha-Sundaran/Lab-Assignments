package day_7;

public class UserMainCode6 {
	public static int getNumberOfDays(int yy, int mm) {
		int daysOfMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int days;
		if (mm == 1 && isLeap(yy)) {
			days = daysOfMonth[mm]+1;
		} else {
			days = daysOfMonth[mm];
		}
		return days;
	}

	static boolean isLeap(int yy) {
		if ((yy % 4 == 0))
			return true;
		else if (yy % 100 == 0 && yy % 400 == 0)
			return true;
		return false;
	}
}
