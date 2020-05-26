package lektion2;

import java.util.Scanner;

public class hangman {

	static String[] hangedMan = { "  +---+\r\n  |   |\r\n  O   |\r\n /|\\  |\r\n / \\  |\r\n      |\r\n========= ",
			"  +---+\r\n  |   |\r\n  O   |\r\n /|\\  |\r\n /    |\r\n      |\r\n========= ",
			"  +---+\r\n  |   |\r\n  O   |\r\n /|\\  |\r\n      |\r\n      |\r\n========= ",
			"  +---+\r\n  |   |\r\n  O   |\r\n /|   |\r\n      |\r\n      |\r\n========= ",
			"  +---+\r\n  |   |\r\n  O   |\r\n  |   |\r\n      |\r\n      |\r\n========= ",
			"  +---+\r\n  |   |\r\n  O   |\r\n      |\r\n      |\r\n      |\r\n========= ",
			"  +---+\r\n  |   |\r\n      |\r\n      |\r\n      |\r\n      |\r\n========= ",
			"  +---+\r\n      |\r\n      |\r\n      |\r\n      |\r\n      |\r\n========= ",
			"   ---+\r\n      |\r\n      |\r\n      |\r\n      |\r\n      |\r\n========= ",
			"    --+\r\n      |\r\n      |\r\n      |\r\n      |\r\n      |\r\n========= ",
			"     -+\r\n      |\r\n      |\r\n      |\r\n      |\r\n      |\r\n========= ",
			"      +\r\n      |\r\n      |\r\n      |\r\n      |\r\n      |\r\n========= ",
			"       \r\n      |\r\n      |\r\n      |\r\n      |\r\n      |\r\n========= ",
			"     \r\n      \r\n      |\r\n      |\r\n      |\r\n      |\r\n========= ",
			"     \r\n      \r\n      \r\n      |\r\n      |\r\n      |\r\n=========" };

	public static void main(String[] args) {
		boolean done = false;
		int randomNumber = 0;

		String[] wordList = { "Banana", "Skateboard", "Orange", "Fruit", "Baseball", "Computer", "Order", "Underwear",
				"Sanitizer", "Plant", "Water", "Seagull", "Hamburger", "Store Manager", "Spin-off" };

		System.out.println("Welcome to hangman!\n");

		while (!done) {

			String hiddenWord = wordList[randomNumber(wordList.length)]; // Gets a random number and uses it to pick a
																			// word from wordList

			hiddenWord = selectGameType(hiddenWord); // Asks if the player wants to change the word or not

			guessTheWord(hiddenWord, selectGameLevel()); // The entire game

			done = playAgain(); // Can set {done} to true or false
		}
	}

	/**
	 * Takes the word and asks the user if they want to replace it with their own
	 * word
	 * 
	 * @param hiddenWord
	 * @return
	 */
	public static String selectGameType(String hiddenWord) {
		Scanner input = new Scanner(System.in);

		boolean done = false;
		int choice;

		while (!done) {

			try {
				System.out.println("Do you want us to generate a word for you or do you want to create one yourself?"
						+ "\n1 - We make it for your\n2 - Create one yourself (2 player)\n");
				System.out.print(">"); // All of these are for easily being able to see where to type

				choice = input.nextInt();
				input.nextLine();
				System.out.println();

				switch (choice) { // If the user answers 1 it keeps the word
									// and if they answer 2, makes them type one in
				case 1:
					System.out.println("Understood, we will generate a word for you");
					done = true;
					break;
				case 2:
					System.out.println(
							"Write any word you would like! (Can contain special characters and blank spaces)");
					System.out.print(">");
					hiddenWord = input.nextLine();
					done = true;
					break;

				default:
					System.out.println("Type either 1 or 2");
					break;
				}
			} catch (Exception e) {
				System.out.println("Type either 1 or 2");
				input.nextLine();
			}
		}

		return hiddenWord; // Returns the word, will be the same if the user doesn't change it
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
		boolean done = false;

		System.out.println("How many guesses would you like to have?\n1 - 15 guesses\n2 - 10 guesses\n3 - 5 guesses\n");
		System.out.print(">");

		while (!done) {

			try {

				choice = input.nextInt();

				switch (choice) {

				case 1:
					gameLevel = 15; // gameLevel becomes the amount of guesses
					done = true;
					break;

				case 2:
					gameLevel = 10;
					done = true;
					break;

				case 3:
					gameLevel = 5;
					done = true;
					break;

				default:
					System.out.println("Write a number between one and three");
					break;
				}

			} catch (Exception e) {
				System.out.println("Write a number between one and three");
				input.nextLine();
			}
		}

		return gameLevel;
	}

	/**
	 * Gets a word and an amount of guesses and makes the user guess what the word
	 * is.
	 * 
	 * @param hiddenWord
	 * @param guesses
	 * @return
	 */
	public static void guessTheWord(String hiddenWord, int guesses) {
		Scanner input = new Scanner(System.in);

		char[] secretWord = hiddenWord.toUpperCase().toCharArray(); // Creates a charArray out of hiddenWord and makes
																	// it all upper case

		char[] wordProgress = createWordProgress(secretWord); // Makes wordProgress an exact copy of secretWord, but
																// replacing all the letters with stars

		System.out.println("\nGuess the word, you have " + guesses
				+ " lives. If multiple characters are entered, if will be counted as trying to guess the entire word.");

		String guessString;
		char guessChar;
		int lettersLeft;
		boolean guessingDone = false;
		boolean correctCheck;

		while (!guessingDone) {

			System.out.println("Word progress: " + new String(wordProgress));
			// New string makes whatever is in the () into a String

			System.out.print(">");

			guessString = input.nextLine().toUpperCase();

			correctCheck = false; // Resets variables that can finish the game
			lettersLeft = 0;

			if (guessString.length() != 1) { // If the guess if longer than one character the code will see if it
												// matches the word and choose to deduct lives based on that
				if (guessString.length() == hiddenWord.length()) {
					if (guessString.equals(hiddenWord.toUpperCase())) {
						System.out.println("\nCongratulations! You found the word and was left with " + guesses
								+ " lives! The word was " + hiddenWord.toUpperCase() + "!");
						correctCheck = true;
						guessingDone = true;

					} else {
						guesses--;
						System.out.println(
								"That was not the word, you loose one life. You now have " + guesses + " lives left!");
					}
				} else {
					System.out.println("\nYour guess " + guessString + " is " + guessString.length()
							+ " letters long, while the hidden word is " + hiddenWord.length() + " letters long.");
					correctCheck = true;
				}

			} else {

				guessChar = guessString.charAt(0); // Converts the string to a char

				for (int i = 0; i < wordProgress.length; i++) {
					if (secretWord[i] == guessChar) {
						wordProgress[i] = guessChar;
						correctCheck = true;
					}
				} // If any part secretWord is equal to the users guess, makes wordProgress at
					// that spot become equal to guess
					// correctCheck is used later to determine whether or not to remove a life

				for (int i = 0; i < wordProgress.length; i++) {
					if (wordProgress[i] == '*') {
						lettersLeft++;
						break;
					}
				} // Checks if there are any letters left to be guessed

				if (lettersLeft == 0) { // ends the game if the user finds the word
					System.out.println("\nCongratulations! You found the word and was left with " + guesses
							+ " lives! The word was " + hiddenWord.toUpperCase() + "!");
					guessingDone = true;

				} else {

					if (!correctCheck) { // used correctCheck to determine whether or not to remove a life
						guesses--;
						System.out.println(
								"That letter was not a part of the word, you have " + guesses + " lives left!");
					} else {
						System.out.println("You found a part of the word!");
					}
				}

			}

			if (!correctCheck) { // If you are incorrect, makes a hanged man
				displayHangedMan(guesses);
			}

			if (guesses == 0) { // Checks whether or not to end the game based on guesses left, types out a
								// finished hanged man
				System.out.println("You loose! The word was " + hiddenWord.toUpperCase() + "!");
				displayHangedMan(guesses);
				guessingDone = true;
			}

		}
	}

	/**
	 * Makes a char array copy of secretWord and replaces all the letters with stars
	 * 
	 * 
	 * @param secretWord
	 * @return
	 */
	public static char[] createWordProgress(char[] secretWord) {

		char[] wordProgress = new char[secretWord.length]; // Creates a charArray with the same length as secretWord

		for (int i = 0; i < secretWord.length; i++) {
			if (secretWord[i] == ' ') {
				wordProgress[i] = ' ';
			} else {
				wordProgress[i] = '*';
			}
		} // Makes progress an exact copy of secretWord, but replacing all the letters
			// with stars

		return wordProgress;
	}

	/**
	 * Prints a visual hanged man when you loose lives
	 * 
	 * @param lives
	 */
	public static void displayHangedMan(int lives) {

		System.out.println(hangedMan[lives]);

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

				switch (choice) { // If choice is 1 or 2 makes the program run again or not
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
						// again or not
	}

	/**
	 * Generates a random whole number between 0 and the one sent in
	 * 
	 * @param max
	 * @return
	 */
	public static int randomNumber(int max) {
		int number = (int) (Math.random() * max); // Generates a random number between 0 and max
		return number;
	}
}