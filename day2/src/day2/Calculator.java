package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
	private int[] integers;
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	boolean validInput(String[] strings) {
		integers = new int[strings.length];
	    for (int i = 0; i < strings.length; i++) {
	    	try {
	    		integers[i] = Integer.parseInt(strings[i]);
	    	}
	    	catch (NumberFormatException e) {
	    		return false;
	    	}
	    }
		return true;
	    	
	}
	
	int getSum() throws IOException {
		System.out.println("Enter integers to sum:");
	    String line = br.readLine();
	    String[] strings = line.trim().split("\\s+");
	    boolean input = validInput(strings);
	    while (!validInput(strings)) {
	    	System.out.println("Enter only integers:\n");
	    	line = br.readLine();
	    	strings = line.trim().split("\\s+");
	    	input = validInput(strings);
	    }
	    int sum = 0;
	    for (Integer i: integers) {
	    	sum += i;
	    }
	    return sum;

	}
	

	public void run() {
		try {
			System.out.println("Sum is: " + getSum());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
