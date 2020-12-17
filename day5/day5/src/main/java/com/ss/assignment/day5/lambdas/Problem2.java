package com.ss.assignment.day5.lambdas;

import java.util.ArrayList;
import java.util.List;

import com.ss.assignment.day5.assignment1.PerformOperation;

public class Problem2 {
	// This is the second question under Introduction Part5
	
	public static String solution(List<Integer> integers) {
		PerformOperation isOdd = (i) -> { 
			if ((i % 2) == 1) return "o"+i; else return "e"+i;
		};
		List<String> strings = new ArrayList<String>();
		integers.forEach( i -> {
			strings.add(isOdd.getResult(i));
		});
		return String.join(",", strings);
	}

	
	
}
