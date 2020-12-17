package com.ss.assignment.day5.assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Assignment1 {
	private Scanner scanner = new Scanner(System.in);
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private int cases;
	private int[] integers;
	private StringBuilder sb = new StringBuilder();

	// Lambdas
	
	PerformOperation isOdd = (i) -> { 
		if ((i % 2) == 1) return "ODD"; else return "EVEN";
	};
	
	PerformOperation isPrime = (i) -> {
		if (i < 3) return "PRIME"; if ((i % 2)==0) return "COMPOSITE"; 
		for (int n = 3; n < Math.sqrt(i); n += 2) {
			if ((n % n) == 0) return "COMPOSITE";
		}
		return "PRIME";
	};
	
	PerformOperation isPalindrome = (i) -> {
		String reverse =  new StringBuilder(Integer.toString(i)).reverse().toString();
		if (Integer.toString(i).equals(reverse)) return "PALINDROME" ; 
		else return "NOT PALINDROME";
	};
	
	// Methods for processing input.
	
	int processInput() {
		while (!scanner.hasNextInt()) {
			scanner.next();
		}
		return scanner.nextInt();
	}
	
	boolean validLineInput(String[] strings) {
		if (strings.length > 2) {
			return false;
		}
		integers = new int[2];
	    for (int i = 0; i < 2; i++) {
	    	try {
	    		integers[i] = Integer.parseInt(strings[i]);
	    		
	    	}
	    	catch (NumberFormatException e) {
	    		return false;
	    	}
	    }
		return true;
	   
	}
	
	void processLineInput() throws IOException {
	    String line = br.readLine();
	    String[] strings = line.trim().split("\\s+");
	    boolean input = validLineInput(strings);
	    while (!validLineInput(strings)) {
	    	System.out.println("Enter only integers:\n");
	    	line = br.readLine();
	    	strings = line.trim().split("\\s+");
	    	input = validLineInput(strings);
	    }
	    performOperation();
	}

	void performOperation() {
		
	    switch (integers[0]) {
	    case 1:	
	    	sb.append(isOdd.getResult(integers[1]) + "\n");
	    	break;
	    case 2:
	    	sb.append(isPrime.getResult(integers[1]) + "\n");
	    	break;
	    case 3:
	    	sb.append(isPalindrome.getResult(integers[1]) + "\n");
	    	break;
	    }
	}
	
	public void processCommands() {
		cases = processInput();
		for (int i = 1; i <= cases; i++) {
			try {
				processLineInput();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(sb.toString());
	}
	
}
