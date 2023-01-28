
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Write the java algorithm code that makes an asterisk triangle as much as the
		 * integer value entered by the user from the console.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number: ");
		int num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("");
			for (int j = 1; j < i; j++) {
				System.out.print("");
				System.out.print("*");
			}
			System.out.print("*");
		}
	}

}
