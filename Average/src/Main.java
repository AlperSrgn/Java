
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();

		/*
		 * Develop a program to average all the elements in a 10-element integer array
		 * of random numbers. When writing the program, write it in accordance with the
		 * following features.
		 * 
		 * Let the randomly generated set of 10-element numbers change every time the
		 * program runs again. Do not give an array with fixed elements! Design the code
		 * for averaging as a function. Let it take the array as input. Let the
		 * averaging function return the mean as a decimal number. (return)
		 */

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(50);
			System.out.println(numbers[i]);
		}
		double av = average(numbers);
		System.out.println("Average: " + av);
	}

	public static double average(int[] numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum / 10;
	}

}
