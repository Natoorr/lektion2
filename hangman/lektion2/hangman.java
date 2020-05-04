package lektion2;

import java.util.Scanner;

public class hangman {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int difficulty;
		boolean done = true;
		String[] words = { "Banana", "Skateboard", "Orange", "Fruit", "Baseball", "Computer",
				"Three hundred and seventy five million eight hundred and ninety four thousand six hundred and fourty two",
				"Order", "Underwear", "Sanitizer", "Plant", "Water", "Seagull", "Hamburger" };
		int max = words.length;
		int wordInt = 0;
		while (done) {
			System.out.println(
					"Welcome to hangman!\nWrite a number based on what difficulty you would like!\n1 - Easy (15 tries)\n2 - Medium (10 tries)\n3 - Hard (5 tries)");
			wordInt = randomNumber(max);
			try {
				difficulty = input.nextInt();
				switch (difficulty) {
				case 1:
					System.out.println("You have selected easy.");
					if (hangingman(words[wordInt], 15) == 2) {
						System.exit(0);
					} else {
						break;
					}

				case 2:
					System.out.println("You have selected medium.");
					if (hangingman(words[wordInt], 10) == 2) {
						System.exit(0);
					} else {
						break;
					}

				case 3:
					System.out.println("You have selected hard.");
					if (hangingman(words[wordInt], 5) == 2) {
						System.exit(0);
					} else {
						break;
					}
				default:
					System.out.println("Write a number from 1 to 3");
					break;
				}
			} catch (Exception e) {
				System.out.println("Write a number from 1 to 3");
				input.nextLine();

			}

		}
	}

	public static int hangingman(String word, int lives) {
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Vill du välja ett förbestämt ord eller skriva in ett ord själv?\n1 - Förutbestämt ord\n2 - Skriva Själv");
		int choose = input.nextInt();
		if (choose == 1) {
			System.out.println("Uppfattat! Vi genererar ett ord åt dig.");
		} else if (choose == 2) {
			System.out.println("Skriv in ordet du vill välja. Det får innehålla mellanslag och specialtecken.");
			word = input.nextLine();
		}

		String word1 = word.toUpperCase();
		char[] word2 = word1.toCharArray();
		

		char[] guessingWord = new char[word1.length()];
		for (int i = 0; i < word1.length(); i++) {
			if (word2[i] == ' ') {
				guessingWord[i] = word2[i];
			} else {
				guessingWord[i] = '*';
			}
		}
		System.out.println("Guess the word, you have " + lives
				+ " lives. If multiple characters are inputted, only the first one will be accounted for. (For now)");

		char guess;
		boolean loop = true;
		int correct;
		int end;
		while (loop) {
			System.out.println(guessingWord);
			guess = input.next().toUpperCase().charAt(0);
			correct = 0;
			end = 0;

			for (int i = 0; i < guessingWord.length; i++) {
				if (word2[i] == guess) {
					guessingWord[i] = guess;
					correct++;
				}
			}
			for (int i = 0; i < guessingWord.length; i++) {
				if (guessingWord[i] == '*') {
					end++;
					break;
				}
			}
			if (end == 0) {
				System.out.println("Congratulations! You found the word and was left with " + lives
						+ " lives! The word was " + word + "!");
				loop = false;
			}
			
			if (end != 0) {

				if (correct <= 0) {
					lives--;
					System.out.println("That letter was not a part of the word, you have " + lives + " lives left!");
				} else {
					System.out.println("You found a part of the word!");
				}
				if (lives == 0) {
					System.out.println("You lose! The word was " + word + "!");
					loop = false;
				}

			}
		}

		System.out.println("Would you like to play again?\n1 - Yes\n2 - No");
		int playAgain = 0;
		playAgain = input.nextInt();
		return playAgain;
	}

	public static int randomNumber(int max) {
		int number = (int) (Math.random() * max);
		return number;
	}
}
