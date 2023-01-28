
import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {

		/*
		 * Write the java code that prints even numbers between two numbers entered in
		 * the console.
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.print("First Number: ");
		int first = scan.nextInt();
		System.out.print("Second Number: ");
		int second = scan.nextInt();
		
		for (int i = first+1; i < second; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
	}

}
