package v50;

import java.util.Scanner;

public class lektion1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean test = true;
		int choice; // gör booleans och ints och saker
		int ans = 0;

		System.out.println(" - Du ser en tjej som du vill gå på dejt med, vad säger du? - ");

		while (test) { // gör en while loop för att det är enkelt att göra

			System.out.println();
			System.out.println("(1) - Hej, hur mår du?");
			System.out.println("(2) - Hej, gillar du pepsi eller cola?");
			System.out.println("(3) - Vilken dag är det idag?");
			System.out.println();

			try { // en try-catch ifall att man är efterbliven och svarar B
				choice = input.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Ja jag mår bra, hur mår du?");
					ans = 1;
					test = false;
					break;

				case 2:
					System.out.println("Pepsi, men varför frågar du?"); // switch för att se vad man svarade
					ans = 2;
					test = false;
					break;

				case 3:
					System.out.println("Kan du sluta göra inbrott i mitt hus för att fråga vilken dag det är?");
					ans = 3;
					test = false;
					break;

				default:
					System.out.println(" - Skriv in ett nummer från 1 till 3 - ");
					break;
				}
			} catch (Exception e) {
				System.out.println(" - Skriv in ett nummer från 1 till 3 - ");
				input.next();

			}
		}
		test = true;
		while (test) {
			if (ans == 1) {
				if (!choiceOne(ans)) {
					break;
				}
			} else if (ans == 2) {
				if (!choiceTwo(ans)) { // if-sats för att kalla på metoder, skulle lika gärna kunna använda switch
					break;
				}

			} else if (ans == 3) {
				if (!choiceThree(ans)) {
					break;
				}

			}

		}
	}

	/**
	 * tar in en input och kollar var den passar, skickar sedan tillbaka en boolean som antingen får det att göras om om den är false
	 * 
	 * @param ans
	 * @return
	 */
	public static boolean choiceOne(int ans) {
		Scanner input = new Scanner(System.in);
		int choice = 0;
		boolean test = true;

		System.out.println("(1) - Wow detta är första gången en tjej pratar med mig!");
		System.out.println("(2) - Jag mår toppen, vill du gå på bio med mig?");
		System.out.println("(3) - Jag mår bra nu när du är här. ;)");
		System.out.println();

		try {
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("...");
				System.out.println(" - Hon blev till slut arg att du bröt dig in in hennes hus och jagade ut dig. - ");
				ans = 1;
				test = false;
				break;

			case 2:
				System.out.println("Ok");
				System.out.println(" - Du fick tjejen! bra jobbat - ");
				ans = 2;
				test = false;
				break;

			case 3:
				System.out.println("Bror du postar cringe");
				System.out.println(" - Tjejen lämnade dig och nu är du ensam - ");
				test = false;
				break;

			default:
				System.out.println(" - Skriv in ett nummer från 1 till 3 - ");
				break;
			}
		} catch (Exception e) {
			System.out.println(" - Skriv in ett nummer från 1 till 3 - ");
			input.next();
		}
		return test;
	}
/**
 * tar in en input och kollar var den passar, skickar sedan tillbaka en boolean som antingen får det att göras om om den är false
 * @param ans
 * @return
 */
	public static boolean choiceTwo(int ans) {
		Scanner input = new Scanner(System.in);
		int choice = 0;
		boolean test = true;

		System.out.println("(1) - Jag vill aldrig någonsin se dig igen.");
		System.out.println("(2) - Jag vill aldrig någonsin se dig igen.");
		System.out.println("(3) - Jag vill aldrig någonsin se dig igen.");
		System.out.println();
		try {
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println(" - Du lärde dig iallafall att en relation mellan er aldrig skulle funka - ");
				ans = 1;
				test = false;
				break;

			case 2:
				System.out.println(" - Du lärde dig iallafall att en relation mellan er aldrig skulle funka - ");
				ans = 2;
				test = false;
				break;

			case 3:
				System.out.println(" - Du lärde dig iallafall att en relation mellan er aldrig skulle funka - ");
				ans = 3;
				test = false;
				break;

			default:
				System.out.println("Skriv in ett nummer från 1 till 3");
				break;
			}
		} catch (Exception e) {
			System.out.println("Skriv in ett nummer från 1 till 3");
			input.next();
		}
		return test;
	}
/**
 * tar in en input och kollar var den passar, skickar sedan tillbaka en boolean som antingen får det att göras om om den är false
 * @param ans
 * @return
 */
	public static boolean choiceThree(int ans) {
		Scanner input = new Scanner(System.in);
		boolean test = true;
		int choice = 0;

		System.out.println("(1) - Jag vill bara se dig mer.");
		System.out.println("(2) - Kan du sluta bo i husen jag gör inbrott i?");
		System.out.println("(3) - Ok.");
		System.out.println();

		try {
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Vill du gå på dejt?");
				System.out.println(" - Du fick good ending - ");
				ans = 1;
				test = false;
				break;

			case 2:
				System.out.println("Sant.");
				System.out.println(" - Ni gick inte på dejt men du vann iallafall argumentet. - ");
				ans = 2;
				test = false;
				break;

			case 3:
				System.out.println("Ok");
				System.out.println(" - Du blev ledsen och gick hem. - ");
				ans = 3;
				test = false;
				break;

			default:
				System.out.println(" - Skriv in ett nummer från 1 till 3 - ");
				break;
			}
		} catch (Exception e) {
			System.out.println(" - Skriv in ett nummer från 1 till 3 - ");
			input.next();
		}
		return test;
	}

}