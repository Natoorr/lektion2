package numberGuesser;

import java.util.Scanner;
import java.util.Random;

public class guessNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // tar in scanner för att få inputs från usern
		int difficulty;
		boolean done = true; // gör en boolean som ska repeata spelet
		while (done) { // repeatarå länge nån vill spela spelet
			System.out.println(
					"Skriv in numret för den svårigheten du vill har\n1 - Easy (20 tries)\n2 - Medium (10 tries)\n3 - Hard (5 tries)");

			try { // en try-catch ifall att man är efterbliven och svarar B
				difficulty = input.nextInt(); // tar in en int som bestämmer svårighetsgrad
				switch (difficulty) { // en switch som väljer svårighetsgrad
				case 1:
					System.out.println("You have selected easy.");// switch för att se vad man svarade
					if (hiddenNumber(20) == 2) { // skickar med antal gissningar som man får baserat på difficulty
						System.exit(0);// stänger ner programmet ifall man inte vill spela mer
					} else {
						break;// går ut ur switchcasen ifall man vill spela igen
					}

				case 2:
					System.out.println("You have selected medium."); // switch för att se vad man svarade
					if (hiddenNumber(10) == 2) { // skickar med antal gissningar som man får baserat på difficulty
						System.exit(0); // stänger ner programmet ifall man inte vill spela mer
					} else {
						break;// går ut ur switchcasen ifall man vill spela igen
					}

				case 3:
					System.out.println("You have selected hard.");// switch för att se vad man svarade
					if (hiddenNumber(5) == 2) { // skickar med antal gissningar som man får baserat på difficulty
						System.exit(0);// stänger ner programmet ifall man inte vill spela mer
					} else {
						break; // går ut ur switchcasen ifall man vill spela igen
					}
				default:
					System.out.println("Skriv in en siffra från 1-3"); // default ifall man svarar fel nummer
					break;
				}
			} catch (Exception e) {
				System.out.println("Skriv in en siffra från 1-3"); // trycatch ifall man inte är smart och svarar en
																	// dålig bokstav
				input.nextLine(); // äter upp inputen så man kan skriva in den igen

			}

		}

	}

	/**
	 * tar in antal gissningar, tar en input för hur många nummer man vill gissa
	 * mellan tar en input för vad gissningen är, om den är fel gissar man igen, om
	 * det är rätt slutar spelet tar in en input för om man vill köra igen, 1 för ja
	 * 2 för nej
	 *
	 * @param guesses
	 * @return
	 */
	public static int hiddenNumber(int guesses) {
		Scanner input = new Scanner(System.in); // importar scanner för att ta inputs från usern
		long max = 1; 
		long guess = 0; 
		System.out.println("Hur många nummer vill du ha?");
		for (int i = 0; i < 1; i++) { // repeatar om man inte skrivit rätt

			try {
				max = input.nextLong();// välja högsta numret

				if (max <= 1) { // om numret inte är större än ett kör den om loopen
					System.out.println("Skriv in ett nummer över 1");
					i--;
				}
			} catch (Exception e) { // om man skrev bokstav så kör den om loopen
				System.out.println("Skriv in ett nummer över 1");
				input.nextLine(); // äter input så man kan skriva in igen
				i--;
			}
		}

		long number = (long) (Math.random() * max); // randomisar ett tal mellan noll och max
		if (number == 0) {// ifall talet är noll gör den det till 1 så att man kan köra
			number++;
		}

		System.out.println("Skriv in ett nummer mellan 1 och " + max);
		for (int i = 1; i < guesses + 2; i++) { // for loop som kör om ifall man inte fick rätt

			try { // en trycatch för personer som inte vill skriva siffror

				guess = input.nextLong(); // tar in gissning

				if (guess < 1) { // om man skrev för lågt nummer körs:
					guesses += 1; // fixar antal gissningar
					System.out.println(
							"Skriv in ett nummer från 1-" + max + "\n" + (guesses - i) + " gissning(ar) kvar.");
				} else if (guess > max) { // kollar om siffran är större än maxantalet
					guesses += 1; // fixar antal gissningar
					System.out.println(
							"Skriv in ett nummer från 1-" + max + "\n" + (guesses - i) + " gissning(ar) kvar.");
				} else { // om siffran inte är fel gör den:

					if (guess == number) { // kollar om det är rätt
						System.out.println("Grattis, du vann med " + (guesses - i) + " gissning(ar) kvar");
						break;

					} else { // om den inte är rätt körs detta
						if (guesses - i == 0) { // om du får slut på gissningar
							System.out.println("You lost, the answer was " + number);
							break;
						} else if (guess > number) { // om gissningen var större än numret
							System.out.println("Lägre, " + (guesses - i) + " gissning(ar) kvar");
						} else if (guess < number) { // om gissningen var mindre än numret
							System.out.println("Högre, " + (guesses - i) + " gissning(ar) kvar");
						}

					}
				}
			} catch (Exception e) { // om någon svarade ett inte nummer
				guesses += 1; // fixar antalet gissningar
				System.out.println("Skriv in ett nummer från 1-" + max + "\n" + (guesses - i) + " gissning(ar) kvar.");
				input.nextLine(); // äter inputen så man kan köra igen
			}

		}

		int playAgain = 0; 
		boolean again = true; 
		while (again) { // körs tills ett riktigt svar fås
			System.out.println("Vill du spela igen? \n1.Ja\n2.Nej");
			try {
				playAgain = input.nextInt(); // frågar om input
				switch (playAgain) {
				case 1:
					return playAgain;
				case 2:
					return playAgain;
				default:
					System.out.println("Skriv in ett nummer mellan 1 och 2");
					input.nextLine();
					break;
				}
				
			} catch (Exception e) { // om man inte svarade siffra
				System.out.println("Skriv in ett nummer mellan 1 och 2");
				input.nextLine(); // äter input så du kan skriva igen
			}
		}
		return playAgain; // den säger nej om jag inte har den här raden
	}
}