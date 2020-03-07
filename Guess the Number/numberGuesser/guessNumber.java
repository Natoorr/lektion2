package numberGuesser;

import java.util.Scanner;
import java.util.Random;

public class guessNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // tar in scanner f�r att f� inputs fr�n usern
		int difficulty;
		boolean done = true; // g�r en boolean som ska repeata spelet
		while (done) { // repeatar� l�nge n�n vill spela spelet
			System.out.println(
					"Skriv in numret f�r den sv�righeten du vill har\n1 - Easy (20 tries)\n2 - Medium (10 tries)\n3 - Hard (5 tries)");

			try { // en try-catch ifall att man �r efterbliven och svarar B
				difficulty = input.nextInt(); // tar in en int som best�mmer sv�righetsgrad
				switch (difficulty) { // en switch som v�ljer sv�righetsgrad
				case 1:
					System.out.println("You have selected easy.");// switch f�r att se vad man svarade
					if (hiddenNumber(20) == 2) { // skickar med antal gissningar som man f�r baserat p� difficulty
						System.exit(0);// st�nger ner programmet ifall man inte vill spela mer
					} else {
						break;// g�r ut ur switchcasen ifall man vill spela igen
					}

				case 2:
					System.out.println("You have selected medium."); // switch f�r att se vad man svarade
					if (hiddenNumber(10) == 2) { // skickar med antal gissningar som man f�r baserat p� difficulty
						System.exit(0); // st�nger ner programmet ifall man inte vill spela mer
					} else {
						break;// g�r ut ur switchcasen ifall man vill spela igen
					}

				case 3:
					System.out.println("You have selected hard.");// switch f�r att se vad man svarade
					if (hiddenNumber(5) == 2) { // skickar med antal gissningar som man f�r baserat p� difficulty
						System.exit(0);// st�nger ner programmet ifall man inte vill spela mer
					} else {
						break; // g�r ut ur switchcasen ifall man vill spela igen
					}
				default:
					System.out.println("Skriv in en siffra fr�n 1-3"); // default ifall man svarar fel nummer
					break;
				}
			} catch (Exception e) {
				System.out.println("Skriv in en siffra fr�n 1-3"); // trycatch ifall man inte �r smart och svarar en
																	// d�lig bokstav
				input.nextLine(); // �ter upp inputen s� man kan skriva in den igen

			}

		}

	}

	/**
	 * tar in antal gissningar, tar en input f�r hur m�nga nummer man vill gissa
	 * mellan tar en input f�r vad gissningen �r, om den �r fel gissar man igen, om
	 * det �r r�tt slutar spelet tar in en input f�r om man vill k�ra igen, 1 f�r ja
	 * 2 f�r nej
	 *
	 * @param guesses
	 * @return
	 */
	public static int hiddenNumber(int guesses) {
		Scanner input = new Scanner(System.in); // importar scanner f�r att ta inputs fr�n usern
		long max = 1; 
		long guess = 0; 
		System.out.println("Hur m�nga nummer vill du ha?");
		for (int i = 0; i < 1; i++) { // repeatar om man inte skrivit r�tt

			try {
				max = input.nextLong();// v�lja h�gsta numret

				if (max <= 1) { // om numret inte �r st�rre �n ett k�r den om loopen
					System.out.println("Skriv in ett nummer �ver 1");
					i--;
				}
			} catch (Exception e) { // om man skrev bokstav s� k�r den om loopen
				System.out.println("Skriv in ett nummer �ver 1");
				input.nextLine(); // �ter input s� man kan skriva in igen
				i--;
			}
		}

		long number = (long) (Math.random() * max); // randomisar ett tal mellan noll och max
		if (number == 0) {// ifall talet �r noll g�r den det till 1 s� att man kan k�ra
			number++;
		}

		System.out.println("Skriv in ett nummer mellan 1 och " + max);
		for (int i = 1; i < guesses + 2; i++) { // for loop som k�r om ifall man inte fick r�tt

			try { // en trycatch f�r personer som inte vill skriva siffror

				guess = input.nextLong(); // tar in gissning

				if (guess < 1) { // om man skrev f�r l�gt nummer k�rs:
					guesses += 1; // fixar antal gissningar
					System.out.println(
							"Skriv in ett nummer fr�n 1-" + max + "\n" + (guesses - i) + " gissning(ar) kvar.");
				} else if (guess > max) { // kollar om siffran �r st�rre �n maxantalet
					guesses += 1; // fixar antal gissningar
					System.out.println(
							"Skriv in ett nummer fr�n 1-" + max + "\n" + (guesses - i) + " gissning(ar) kvar.");
				} else { // om siffran inte �r fel g�r den:

					if (guess == number) { // kollar om det �r r�tt
						System.out.println("Grattis, du vann med " + (guesses - i) + " gissning(ar) kvar");
						break;

					} else { // om den inte �r r�tt k�rs detta
						if (guesses - i == 0) { // om du f�r slut p� gissningar
							System.out.println("You lost, the answer was " + number);
							break;
						} else if (guess > number) { // om gissningen var st�rre �n numret
							System.out.println("L�gre, " + (guesses - i) + " gissning(ar) kvar");
						} else if (guess < number) { // om gissningen var mindre �n numret
							System.out.println("H�gre, " + (guesses - i) + " gissning(ar) kvar");
						}

					}
				}
			} catch (Exception e) { // om n�gon svarade ett inte nummer
				guesses += 1; // fixar antalet gissningar
				System.out.println("Skriv in ett nummer fr�n 1-" + max + "\n" + (guesses - i) + " gissning(ar) kvar.");
				input.nextLine(); // �ter inputen s� man kan k�ra igen
			}

		}

		int playAgain = 0; 
		boolean again = true; 
		while (again) { // k�rs tills ett riktigt svar f�s
			System.out.println("Vill du spela igen? \n1.Ja\n2.Nej");
			try {
				playAgain = input.nextInt(); // fr�gar om input
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
				input.nextLine(); // �ter input s� du kan skriva igen
			}
		}
		return playAgain; // den s�ger nej om jag inte har den h�r raden
	}
}