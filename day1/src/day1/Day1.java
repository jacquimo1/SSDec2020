package day1;

import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
	private int randomNumber, guess, guessQuantity;
	private Random random = new Random();
	private Scanner scanner = new Scanner(System.in);
	private String gameState = "playing";
	
	void setNumber() {
		randomNumber = random.nextInt(100) + 1;
	}
	
	int getNumber() {
		return randomNumber;
	}
	
	int processInput() {
		while (!scanner.hasNextInt()) {
			System.out.println("Please enter an integer:\n");
			scanner.next();
		}
		return scanner.nextInt();
	}
	
	void processGuess() {
		int input = processInput();
		while (input < 1 || input > 100) {
			System.out.println("It needs to be between one and one hundred.");
			input = processInput();
		}
		guess = input;
	}
	
	
	public void play() {
		System.out.println("Guess a number from 1-100:\n");
		
		setNumber();
		guessQuantity = 5;

		processGuess();
		guessQuantity -= 1;
		while ((guess > getNumber() + 10 || guess < getNumber() - 10) && guessQuantity >= 1) {
			System.out.println("Guesses remaining: " + guessQuantity + "\n");
			System.out.println("Try again:\n");
			processGuess();
			guessQuantity -= 1;
		}

		if (guessQuantity == 0) {
			gameState = "Sorry, you've exceeded five guesses.";
		}
		else {
			gameState = "You correctly guessed within ten integers.";
		}
		
		System.out.println(gameState);
		System.out.println("The answer was: " + getNumber() + "\n");

	}
}

public class Day1 {

	static String getNotes() {
		return "1)\n" + 
				"*\n" + 
				"**\n" + 
				"***\n" + 
				"****\n" + 
				"……\n" + 
				"\n" + 
				"\n" + 
				"2)\n" + 
				"   *\n" + 
				"  **\n" + 
				" ***\n" + 
				"****\n" + 
				"…..\n" + 
				"\n" + 
				"3)\n" + 
				"…..\n" + 
				"****\n" + 
				"***\n" + 
				"**\n" + 
				"*";
	}
	public static void main(String[] args) {
		System.out.println(getNotes());
		NumberGuessingGame ngg = new NumberGuessingGame();
		ngg.play();
	}
}

