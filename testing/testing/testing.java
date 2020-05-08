package testing;

import java.util.Scanner;

public class testing {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner input = new Scanner(System.in);
		String word = "hello";
		String guess;

		

		System.out.println("Skriv in ord");
		guess = input.nextLine();

		System.out.println();
		System.out.println(guess);
		System.out.println(word);
		System.out.println();

		if (guess.length() != 1) {
			if (guess.equals(word)) {
				System.out.println("Du vinner");
			} else {
				System.out.println("Ditt ord var längre än 1 bokstav men du förlorade");
			}
		} else {
			System.out.println("Ditt ord var en bokstav");
		}

	}

	
}
