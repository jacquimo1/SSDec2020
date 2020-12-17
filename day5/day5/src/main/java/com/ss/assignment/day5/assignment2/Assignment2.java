package com.ss.assignment.day5.assignment2;

import java.util.ArrayList;
import java.util.List;

public class Assignment2 {
	public static List<Integer> rightDigit(List<Integer> integers) {
		List<Integer> rightDigits = new ArrayList<Integer>();
		integers.forEach( i -> rightDigits.add(Math.abs(i) % 10));
		return rightDigits;
	}
}
