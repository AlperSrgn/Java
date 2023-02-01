import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		/*
		 * Java program to show you how to check if a String is palindrome or not. A
		 * String is said to be palindrome if it is equal to itself after reversing. if
		 * a string is a palindrome in java using recursion and for loop both.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Word: ");
		String input = scanner.nextLine();
		System.out.println("Reverse: " + Reverse(input));
		System.out.println("----------------");
		
		if (input.equals(Reverse(input))) {
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT PALINDROME");
		}
		
	}
	
	public static String Reverse(String word) {
		String result = "";
		for (int i = word.length()-1; i >=0; i--) {
			result+= word.charAt(i);
		}
		return result;
	}
}
