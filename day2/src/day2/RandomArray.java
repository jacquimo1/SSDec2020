package day2;

import java.util.Random;

public class RandomArray {
	private Random random = new Random();
	private static int[][] numbers;
	
	
	public RandomArray() {
		numbers = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				numbers[i][j] = random.nextInt(100);
			}
		}
	}

	public void showMax() {
		int max = 0;
		int[] location = new int[2];
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] > max) {
					max = numbers[i][j];
					location[0] = i;
					location[1] = j;
				}
			}
		}
		System.out.println("Maximum: " + max + "\n");
		System.out.println("Location: [" + location[0] +"][" + location[1] + "]");
	}
	
}
