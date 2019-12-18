package v50;

import java.util.Scanner;

public class lektion1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean test = true;
		int choice; // g�r booleans och ints och saker
		int ans = 0;

		System.out.println(" - Du ser en tjej som du vill g� p� dejt med, vad s�ger du? - ");

		while (test) { // g�r en while loop f�r att det �r enkelt att g�ra

			System.out.println();
			System.out.println("(1) - Hej, hur m�r du?");
			System.out.println("(2) - Hej, gillar du pepsi eller cola?");
			System.out.println("(3) - Vilken dag �r det idag?");
			System.out.println();

			try { // en try-catch ifall att man �r efterbliven och svarar B
				choice = input.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Ja jag m�r bra, hur m�r du?");
					ans = 1;
					test = false;
					break;

				case 2:
					System.out.println("Pepsi, men varf�r fr�gar du?"); // switch f�r att se vad man svarade
					ans = 2;
					test = false;
					break;

				case 3:
					System.out.println("Kan du sluta g�ra inbrott i mitt hus f�r att fr�ga vilken dag det �r?");
					ans = 3;
					test = false;
					break;

				default:
					System.out.println(" - Skriv in ett nummer fr�n 1 till 3 - ");
					break;
				}
			} catch (Exception e) {
				System.out.println(" - Skriv in ett nummer fr�n 1 till 3 - ");
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
				if (!choiceTwo(ans)) { // if-sats f�r att kalla p� metoder, skulle lika g�rna kunna anv�nda switch
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
	 * tar in en input och kollar var den passar, skickar sedan tillbaka en boolean som antingen f�r det att g�ras om om den �r false
	 * 
	 * @param ans
	 * @return
	 */
	public static boolean choiceOne(int ans) {
		Scanner input = new Scanner(System.in);
		int choice = 0;
		boolean test = true;

		System.out.println("(1) - Wow detta �r f�rsta g�ngen en tjej pratar med mig!");
		System.out.println("(2) - Jag m�r toppen, vill du g� p� bio med mig?");
		System.out.println("(3) - Jag m�r bra nu n�r du �r h�r. ;)");
		System.out.println();

		try {
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("...");
				System.out.println(" - Hon blev till slut arg att du br�t dig in in hennes hus och jagade ut dig. - ");
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
				System.out.println(" - Tjejen l�mnade dig och nu �r du ensam - ");
				test = false;
				break;

			default:
				System.out.println(" - Skriv in ett nummer fr�n 1 till 3 - ");
				break;
			}
		} catch (Exception e) {
			System.out.println(" - Skriv in ett nummer fr�n 1 till 3 - ");
			input.next();
		}
		return test;
	}
/**
 * tar in en input och kollar var den passar, skickar sedan tillbaka en boolean som antingen f�r det att g�ras om om den �r false
 * @param ans
 * @return
 */
	public static boolean choiceTwo(int ans) {
		Scanner input = new Scanner(System.in);
		int choice = 0;
		boolean test = true;

		System.out.println("(1) - Jag vill aldrig n�gonsin se dig igen.");
		System.out.println("(2) - Jag vill aldrig n�gonsin se dig igen.");
		System.out.println("(3) - Jag vill aldrig n�gonsin se dig igen.");
		System.out.println();
		try {
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println(" - Du l�rde dig iallafall att en relation mellan er aldrig skulle funka - ");
				ans = 1;
				test = false;
				break;

			case 2:
				System.out.println(" - Du l�rde dig iallafall att en relation mellan er aldrig skulle funka - ");
				ans = 2;
				test = false;
				break;

			case 3:
				System.out.println(" - Du l�rde dig iallafall att en relation mellan er aldrig skulle funka - ");
				ans = 3;
				test = false;
				break;

			default:
				System.out.println("Skriv in ett nummer fr�n 1 till 3");
				break;
			}
		} catch (Exception e) {
			System.out.println("Skriv in ett nummer fr�n 1 till 3");
			input.next();
		}
		return test;
	}
/**
 * tar in en input och kollar var den passar, skickar sedan tillbaka en boolean som antingen f�r det att g�ras om om den �r false
 * @param ans
 * @return
 */
	public static boolean choiceThree(int ans) {
		Scanner input = new Scanner(System.in);
		boolean test = true;
		int choice = 0;

		System.out.println("(1) - Jag vill bara se dig mer.");
		System.out.println("(2) - Kan du sluta bo i husen jag g�r inbrott i?");
		System.out.println("(3) - Ok.");
		System.out.println();

		try {
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Vill du g� p� dejt?");
				System.out.println(" - Du fick good ending - ");
				ans = 1;
				test = false;
				break;

			case 2:
				System.out.println("Sant.");
				System.out.println(" - Ni gick inte p� dejt men du vann iallafall argumentet. - ");
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
				System.out.println(" - Skriv in ett nummer fr�n 1 till 3 - ");
				break;
			}
		} catch (Exception e) {
			System.out.println(" - Skriv in ett nummer fr�n 1 till 3 - ");
			input.next();
		}
		return test;
	}

}