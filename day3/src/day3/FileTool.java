package day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FileTool {
	private String filepath;
	private Scanner scanner = new Scanner(System.in);
	private StringBuilder text;
	private char searchChar;
	
	public void setFilename(String stringInput) {
		filepath = stringInput;
	}
	
	public void processPathInput() {
		System.out.println("Enter a filepath: ");
		setFilename(scanner.nextLine());
	}
	
	public void processSearchInput() {
		System.out.println("Enter a character to search: ");
		String input = scanner.nextLine();
		while (input.length() > 1) {
			System.out.println("SEarch term must be a single character. \n");
			System.out.println("Enter a character to search: ");
			input = scanner.nextLine();
		}
		searchChar = input.charAt(0);
		
	}
	
	
	public void setStringBuilder() {
		text = new StringBuilder();
	}
	
	
	public void getDirectory() {
		setStringBuilder();
		try { 
			File file = new File(filepath);
			File[] fileArray = file.listFiles();
			for (File f: fileArray) {
				if (f.isDirectory()) {
					text.append("Directory: " + f.getName() + "\n");
				}
				if (f.isFile()) {
					text.append("File: " + f.getName() + "\n");
				}
			}			
		}
		catch (NullPointerException npe) {
			System.out.println("File not found: " + filepath);
		}
	}
	
	public void printString() {
		System.out.println(text.toString());
	}
	
	public void writeToFile() {
		try {
			Files.write(Paths.get(filepath), text.toString().getBytes(), StandardOpenOption.APPEND);
			System.out.println("Data logged to: " + filepath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void searchFile() {
		int quantity = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(filepath)))  {
			String line;
			while ((line = br.readLine()) != null) {
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == searchChar) {
						quantity++;
					}
				}
			}
			System.out.println("Occurrences: "+ quantity);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void search() {
		processPathInput();
		getDirectory();
	}
	
	public void log() {
		System.out.println("Where do you want to search?");
		processPathInput();
		getDirectory();
		System.out.println("Where do you want to write the log?");
		processPathInput();
		writeToFile();
	}
	
	public void count() {
		processSearchInput();
		processPathInput();
		searchFile();
	}
}
