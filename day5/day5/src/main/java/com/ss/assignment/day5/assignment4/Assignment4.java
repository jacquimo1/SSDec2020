package com.ss.assignment.day5.assignment4;

import java.util.ArrayList;
import java.util.List;

public class Assignment4 {
	public static List<String> noX(List<String> strings) {
		List<String> results = new ArrayList<String>();
		
		strings.forEach( s -> {
			results.add(s.replace("x", ""));
		});
		
		return results;
	}
}
