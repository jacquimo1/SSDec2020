package com.ss.assignment.day5.dateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DatetimeProblem2 {
	public static void previousThursday(LocalDate date) {
		TemporalAdjuster ta =TemporalAdjusters.previous(DayOfWeek.THURSDAY);
		System.out.println(date.with(ta));
	}
}
