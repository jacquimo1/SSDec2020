package com.ss.assignment.day5.dateTime;

import java.time.LocalDate;


public class DatetimeProblem7 {
	public static boolean isFriday13th(int year, int month, int day) {;
		LocalDate date = LocalDate.of(year, month, day);
		if (day == 13 && date.getDayOfWeek().toString().equals("FRIDAY")) {
			return true;
		}
		return false;
	}
}
