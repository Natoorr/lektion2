package lektion2;

import java.util.Scanner;

public class hangman {

	public static void main(String[] args) {
		boolean done = false;
		int randomNumber = 0;

		String[] wordArray = { "Banana", "Skateboard", "Orange", "Fruit", "Baseball", "Computer", "Order", "Underwear",
				"Sanitizer", "Plant", "Water", "Seagull", "Hamburger", "Store Manager", "Spin-off"};

		System.out.println("Welcome to hangman!\n");

		while (!done) {

			randomNumber = randomNumber(wordArray.length); // Generates a random number

			String theWord = wordArray[randomNumber]; // Gets the word at [randomNumber]

			theWord = selectGameType(theWord); // asks if the player wants to change the word or not

			guessWord(theWord, selectGameLevel()); // The entire game

			done = playAgain(); // can set {done} to true or false
		}
	}

	/**
	 * Brings in the word and asks the user if they want to replace it with their
	 * own word
	 * 
	 * @param word
	 * @return
	 */
	public static String selectGameType(String word) {
		Scanner input = new Scanner(System.in);

		boolean done = false;
		int choice;

		while (!done) {

			try {
				System.out.println("Do you want us to generate a word for you or do you want to create one yourself?"
						+ "\n1 - We make it for your\n2 - Create one yourself (2 player)\n");
				System.out.print(">");

				choice = input.nextInt();
				input.nextLine();
				System.out.println();

				switch (choice) { // if the user answers 1 it keeps the word
									// and if they answer 2, makes them type one in
				case 1:
					System.out.println("Understood, we will generate a word for you");
					done = true;
					break;
				case 2:
					System.out.println(
							"Write any word you would like! (Can contain special characters and blank spaces)");
					System.out.print(">");
					word = input.nextLine();
					done = true;
					break;

				default:
					System.out.println("Write a number between one and two");
					break;
				}
			} catch (Exception e) {
				System.out.println("Write a number between one and two");
				input.nextLine();
			}
		}
		return word; // returns the word, will be the same if the user doesn't change it
	}

	/**
	 * Gets the amount of guesses that the user will have in the game
	 * 
	 * @return
	 */
	public static int selectGameLevel() {
		Scanner input = new Scanner(System.in);
		int gameLevel = 0;
		int choice;

		System.out.println("How many guesses would you like to have?\n1 - 15 guesses\n2 - 10 guesses\n3 - 5 guesses\n");
		System.out.print(">");
		try {
			choice = input.nextInt();

			switch (choice) {

			case 1:
				gameLevel = 15;
				break;

			case 2:
				gameLevel = 10;
				break;

			case 3:
				gameLevel = 5;
				break;

			default:
				System.out.println("Write a number between one and three");
				break;
			}
		} catch (Exception e) {
			System.out.println("Write a number between one and three");
			input.nextLine();
		}

		return gameLevel;
	}

	/**
	 * Gets a word and an amount of guesses and makes the user guess what the word
	 * is.
	 * 
	 * @param theWord
	 * @param guesses
	 * @return
	 */
	public static void guessWord(String theWord, int guesses) {
		Scanner input = new Scanner(System.in);

		char[] secretWord = theWord.toUpperCase().toCharArray();
		// ^ creates a chararray out of a word in wordArray and makes it all upper case
		char[] guessingWord = new char[secretWord.length];
		// ^ creates a chararray with the same length as secretWord

		String guessString;
		char guessChar;
		boolean guessingDone = false;
		boolean correctCheck;
		int lettersLeft;

		for (int i = 0; i < secretWord.length; i++) {
			if (secretWord[i] == ' ') {
				guessingWord[i] = ' ';
			} else {
				guessingWord[i] = '*';
			}
		} // makes guessingWord an exact copy of secretWord, but replacing all the letters
			// with stars

		System.out.println("\nGuess the word, you have " + guesses
				+ " lives. If multiple characters are entered, if will be counted as trying to guess the entire word.");

		while (!guessingDone) {

			System.out.println("Word progress: " + new String(guessingWord));
			// New string makes whatever is in the () into a String

			System.out.print(">"); // All of these are for easily being able to see where to type

			guessString = input.nextLine().toUpperCase();

			correctCheck = false; // resets variables that can finish the game
			lettersLeft = 0;

			if (guessString.length() != 1) { // If the guess if longer than one character the code will see if it
												// matches the word and choose to deduct lives based on that
				if (guessString.equals(theWord.toUpperCase())) {
					System.out.println("\nCongratulations! You found the word and was left with " + guesses
							+ " lives! The word was " + theWord.toUpperCase() + "!");
					correctCheck = true;
					guessingDone = true;

				} else {
					guesses--;
					System.out.println(
							"That was not the word, you lose one life. You now have " + guesses + " lives left!");
				}

			} else {

				guessChar = guessString.charAt(0); // converts the string to a char

				for (int i = 0; i < guessingWord.length; i++) {
					if (secretWord[i] == guessChar) {
						guessingWord[i] = guessChar;
						correctCheck = true;
					}
				} // if any part secretWord is equal to the users guess, makes guessingWord at
					// that spot become equal to guess
					// correctCheck is used later to determine wether or not to remove a life

				for (int i = 0; i < guessingWord.length; i++) {
					if (guessingWord[i] == '*') {
						lettersLeft++;
						break;
					}
				} // checks if there are any letters left to be guessed

				if (lettersLeft == 0) { // ends the game if the user finds the word
					System.out.println("\nCongratulations! You found the word and was left with " + guesses
							+ " lives! The word was " + theWord.toUpperCase() + "!");
					guessingDone = true;

				} else {

					if (!correctCheck) { // used correctCheck to determine wether or not to remove a life
						guesses--;
						System.out.println(
								"That letter was not a part of the word, you have " + guesses + " lives left!");
					} else {
						System.out.println("You found a part of the word!");
					}
				}

			}

			if (!correctCheck) { // if you are incorrect, makes a hanged man
				switch (guesses) {
				case 1:
					System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /    |\r\n"
							+ "      |\r\n" + "========= ");
					break;
				case 2:
					System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + "      |\r\n"
							+ "      |\r\n" + "========= ");
					break;
				case 3:
					System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|   |\r\n" + "      |\r\n"
							+ "      |\r\n" + "========= ");
					break;
				case 4:
					System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "  |   |\r\n" + "      |\r\n"
							+ "      |\r\n" + "========= ");
					break;
				case 5:
					System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "      |\r\n" + "      |\r\n"
							+ "      |\r\n" + "========= ");
					break;
				case 6:
					System.out.println("  +---+\r\n" + "  |   |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
							+ "      |\r\n" + "========= ");
					break;
				case 7:
					System.out.println("  +---+\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
							+ "      |\r\n" + "========= ");
					break;
				case 8:
					System.out.println("   ---+\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
							+ "      |\r\n" + "========= ");
					break;
				case 9:
					System.out.println("    --+\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
							+ "      |\r\n" + "========= ");
					break;
				case 10:
					System.out.println("     -+\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
							+ "      |\r\n" + "========= ");
					break;
				case 11:
					System.out.println("      +\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
							+ "      |\r\n" + "========= ");
					break;
				case 12:
					System.out.println("       \r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
							+ "      |\r\n" + "========= ");
					break;
				case 13:
					System.out.println("     \r\n" + "      \r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
							+ "      |\r\n" + "========= ");
					break;
				case 14:
					System.out.println("     \r\n" + "      \r\n" + "      \r\n" + "      |\r\n" + "      |\r\n"
							+ "      |\r\n" + "=========");
					break;
				default:

					break;
				}
			}
			if (guesses == 0) { // checks wether or not to end the game based on guesses left, types out a
								// finished hanged man
				System.out.println("You lose! The word was " + theWord.toUpperCase() + "!");
				guessingDone = true;
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " / \\  |\r\n"
						+ "      |\r\n" + "========= ");
			}

		}
	}

	/**
	 * Asks the user if they would like to go again
	 * 
	 * @return
	 */
	public static boolean playAgain() {
		Scanner input = new Scanner(System.in);
		int choice;
		boolean again = true;
		boolean done = false;

		while (!done) {
			try {
				System.out.println("Would you like to play again?\n1 - Yes\n2 - No\n");
				System.out.print(">");
				choice = input.nextInt();
				System.out.println();

				switch (choice) { // if choice is 1 or 2 makes the program run again or not
				case 1:
					again = false;
					done = true;
					break;
				case 2:
					again = true;
					done = true;
					break;
				default:
					System.out.println("Please write a number between one and two");
					break;
				}
			} catch (Exception e) {
				System.out.println("Please write a number between one and two");
				input.nextLine();
			}
		}

		return again; // {again} becomes {done} in the main method which makes the whole program run
						// again/not
	}

	/**
	 * generates a random whole number between 0 and the one sent in
	 * 
	 * @param max
	 * @return
	 */
	public static int randomNumber(int max) {
		int number = (int) (Math.random() * max); // generates a random number between 0 and max (aka
													// wordArray.length())
		return number;
	}
}