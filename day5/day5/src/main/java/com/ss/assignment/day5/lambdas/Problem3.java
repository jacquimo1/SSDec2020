package com.ss.assignment.day5.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
	
	public static List<String> wordList(List<String> words) {
		List<String> results = new ArrayList<String>();
		words.forEach( w -> {
			if (w.charAt(0) == 'a' && w.length() == 3) {
				results.add(w); 
			}
		});
		
		return results;
	}
}
