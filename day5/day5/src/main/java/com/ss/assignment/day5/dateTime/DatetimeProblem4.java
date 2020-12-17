package com.ss.assignment.day5.dateTime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DatetimeProblem4 {
	public static void answer() {
		Instant instant1 = Instant.now();
		ZonedDateTime zdt = instant1.atZone(ZoneId.of("America/Jamaica"));
		Instant instant2 = zdt.toInstant();
		System.out.println("instant = "+ instant1);
		System.out.println("zdt = " + zdt);
		System.out.println("back to instant = " + instant2);

		
	}
	
}
