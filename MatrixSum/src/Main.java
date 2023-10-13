import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Matrix sum
		 */
		
		Random random = new Random();
		
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];
		int[][] s = new int[3][3];
		
		System.out.println("First Matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				m1[i][j] = random.nextInt(5);
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nSecond Matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				m2[i][j] = random.nextInt(5);
				System.out.print(m2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nSum");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				s[i][j] = m1[i][j] + m2[i][j];
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
