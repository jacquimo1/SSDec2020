package com.ss.assignment.day5.dateTime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DatetimeProblem5 {
	public static void lengthOfMonth(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(Calendar.YEAR, year);
		for (int i = 1; i <= 12; i++) {
			gc.set(Calendar.MONTH, i);
			System.out.println("Month: " + i + " has " + gc.getActualMaximum(Calendar.DAY_OF_MONTH) + " days.");
		}
	}
}
