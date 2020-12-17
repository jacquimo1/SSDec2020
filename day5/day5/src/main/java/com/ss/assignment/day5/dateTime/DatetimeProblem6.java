package com.ss.assignment.day5.dateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;


public class DatetimeProblem6 {
	public static void allMondays(int month) {
		YearMonth yearMonth = YearMonth.of(2020,month);
		LocalDate firstMonday = yearMonth.atDay(1).with(DayOfWeek.MONDAY);
		LocalDate day = firstMonday;
		while (!day.isAfter(yearMonth.atEndOfMonth())) {
			day = day.plusWeeks(1);
			System.out.println(day);
		}

	}
}
