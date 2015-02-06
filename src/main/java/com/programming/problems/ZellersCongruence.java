package com.programming.problems;

public class ZellersCongruence {

	
	/* Zeller's congruence computation
	 * 
	 * @param y: int Year
	 * @param m: int Month
	 * @param d: int Day
	 */
	public static String getDayOfWeek(int y, int m, int d) {
		if (m <= 2) {
			m += 12;
			y--;
		}
		int c = y / 100;
		y %= 100;
		int dow = (26*(m+1)/10 + d + y + y/4 + c/4 - 2*c) % 7;
		if (dow < 0)
			dow += 7;
		return DAYS_OF_WEEK[dow];
	}
	
	
	// Returns the month number corresponding to the string, starting with January = 1.
	private static int getMonth(String s) {
		for (int i = 1; i <= MONTHS.length; i++) {
			if (s.equals(MONTHS[i]))
				return i;
		}
		throw new IllegalArgumentException("Invalid month");
	}
	
	
	private static final String[] MONTHS = {
		"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE",
		"JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"
	};
	
	private static final String[] DAYS_OF_WEEK = {
		"SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"
	};
}
