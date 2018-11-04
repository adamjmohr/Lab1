/*
 * Name: Adam Mohr
 * Student ID: 040669681
 * Course & Section: CST8132 301
 * Assignment: Lab 1
 * Date: Sept 18, 2018
 */

public class PrintingPatterns {

	private static final int WIDTH_PATTERN = 5; // This constant is the maximum width of the patterns. Change this to modify the patterns width.
												
	public static void main(String[] args) {

		// Prints first pattern.
		for (int line = 0; line < WIDTH_PATTERN; line++) { // Prints lines.

			for (int spaces = WIDTH_PATTERN - line; spaces > 1; spaces--) { // Prints spaces.
				System.out.print(" ");
			}

			for (int dollarSign = 0; dollarSign < line + 1; dollarSign++) { // Prints pattern of dollar signs.
				System.out.print("$");
			}

			System.out.println();
		}

		System.out.println();

		// Prints second pattern.
		for (int line = 0; line < WIDTH_PATTERN; line++) { // Prints lines.

			for (int dollarSign = 0; dollarSign < line + 1; dollarSign++) { // Prints pattern of dollar signs.
				System.out.print("$");
			}

			System.out.println();
		}

		System.out.println();

		// Prints third pattern.
		for (int line = 0; line < WIDTH_PATTERN; line++) { // Prints lines.

			for (int spaces = 0; spaces < line; spaces++) { // Prints spaces.
				System.out.print(" ");
			}

			for (int dollarSign = line; dollarSign < WIDTH_PATTERN; dollarSign++) { // Prints pattern of dollar signs.
				System.out.print("$");
			}

			System.out.println();
		}

		System.out.println();

		// Prints fourth pattern.
		for (int line = 0; line < WIDTH_PATTERN; line++) { // Prints lines.

			for (int dollarSign = line; dollarSign < WIDTH_PATTERN; dollarSign++) { // Prints pattern of dollar signs.
				System.out.print("$");
			}

			System.out.println();
		}
	}
}