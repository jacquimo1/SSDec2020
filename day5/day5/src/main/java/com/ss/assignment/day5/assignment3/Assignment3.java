package com.ss.assignment.day5.assignment3;

import java.util.ArrayList;
import java.util.List;

public class Assignment3 {
	public static List<Integer> doubling(List<Integer> integers) {
		List<Integer> doubles = new ArrayList<Integer>();
		
		integers.forEach( i -> {
			doubles.add(i * 2);
		});
		
		return doubles;
	}
}
