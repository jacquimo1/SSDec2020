package com.ss.assignment.day5.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Basic Lambdas

interface StringSorter {
	String[] get(String[] strings);
}

public class Problem1 {
	// These are the lambda problems under "Introduction Part5"
	private static String[] capitals = new String[] {
			"Montgomery\n",
			"Juneau\n",
			"Phoenix\n", 
			"Little Rock\n", 
			"Sacramento \n", 
			"Denver\n",
			"Hartford\n", 
			"Dover\n",
			"Tallahassee\n", 
			"Atlanta\n",
			"Honolulu\n", 
			"Boise\n",
			"Springfield\n", 
			"Indianapolis\n", 
			"Des Moines\n", 
			"Topeka \n",
			"Frankfort\n",
			"Baton Rouge\n", 
			"Augusta\n",
			"Annapolis\n", 
			"Boston\n",
			"Lansing\n",
			"Saint Paul\n",
			"Jackson\n",
			"Jefferson City\n", 
			"Helena\n",
			"Lincoln\n", 
			"Carson City\n", 
			"Concord\n",
			"Trenton\n", 
			"Santa Fe\n",
			"Albany\n",
			"Raleigh\n",
			"Bismarck\n",
			"Columbus\n",
			"Oklahoma City\n",
			"Salem\n",
			"Harrisburg\n", 
			"Providence\n", 
			"Columbia\n",
			"Pierre\n",
			"Nashville\n",
			"Austin\n",
			"Salt Lake City\n",
			"Montpelier\n",
			"Richmond \n",
			"Olympia\n",
			"Charleston\n", 
			"Madison\n",
			"Cheyenne"
	};
	public static void problem1() {
		Arrays.sort(capitals, (a, b) -> a.length() - b.length() );
		for (String s: capitals) {
			System.out.println(s);
		}
	}
	public static void problem2() {
		Arrays.sort(capitals, Comparator.comparingInt(String::length).reversed());
		for (String s: capitals) {
			System.out.println(s);
		}
	}
	public static void problem3() {
		Arrays.sort(capitals, (a, b) -> a.charAt(0) - b.charAt(0) );
		for (String s: capitals) {
			System.out.println(s);
		}
	}
	
//	The problem says to "see the first two lambda examples in the notes"?
	public static void problem4() {
		Arrays.sort(capitals, new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				if (arg0.contains("e")) {
					return -1;
				}
				if (arg1.contains("e")) {
					return 1;
				}
				else return 0;			
			}
			
		});
		
		for (String s: capitals) {
			System.out.println(s);
		}
	}
	public static void problem5() {
		
	}
	
}
