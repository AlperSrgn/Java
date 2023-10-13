
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Write the program code that finds the largest of 3 numbers received from the user.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		
		for (int i = 1; i < 4; i++) {
			System.out.print(i + ". number: ");
			int num = scan.nextInt();
			if (num > max) {
				max = num;
			}
			
		}
		System.out.println("Largest: " + max);

	}

}
