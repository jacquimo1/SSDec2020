package day3;

public class Day3 {
	
	
	
	public static void main(String[] args) {
		FileTool dt = new FileTool();
		
		// Prints directory contents to standard output.
		dt.search();
		dt.printString();
		
		// Writes directory contents to a specific log file.
		dt.log();
		
		// Prints the number of occurrences of a character in a specified file.
		dt.count();
	}
	
}
