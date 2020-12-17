package com.ss.assignment.day5.dateTime;

import java.time.Clock;
import java.time.Instant;

public class DatetimeProblem1 {
	public static void answer() {
		System.out.println("To get one's birthdate down to the nanosecond");
		System.out.println("they would probably need to call clock.instant()");
		System.out.println("the instant they were born.");
		Clock clock = Clock.systemDefaultZone();
		Instant instant = clock.instant(); 
		System.out.println(instant);
	}
}
