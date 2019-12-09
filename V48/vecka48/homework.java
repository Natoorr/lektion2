package vecka48;

public class homework {

	public static void main(String[] args) {
		// 100 tal i intervallet [0-9]
		int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4, 3,
				2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
				5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };
		// 100 namn
		String[] names = { "Crystal", "Tam", "Ed", "Beulah", "Daina", "Benjamin", "Kia", "Clelia", "Cassy", "Gita",
				"Celsa", "Karoline", "Talitha", "Lewis", "Betsy", "Colin", "Glendora", "Carola", "Rosalba", "Jeanie",
				"Yevette", "Armand", "Neal", "Lilla", "Dorethea", "Delta", "Maye", "Nikita", "Shoshana", "Carola",
				"Margie", "Haywood", "Venessa", "Natacha", "Gilbert", "Kandi", "Tyisha", "Tammie", "Blossom", "Penney",
				"Diana", "Audrey", "Willard", "Zoraida", "Drusilla", "Jacquline", "Cyndy", "Janiece", "Tressie", "Kami",
				"Lashanda", "Leann", "Tom", "Santana", "Junita", "Gisela", "Tom", "Marquerite", "Bryant", "Lauralee",
				"Yael", "Kelle", "Samantha", "Tom", "Meta", "Lanette", "Wanetta", "Carola", "Jana", "Neal", "Brady",
				"Rigoberto", "Felicia", "Hellen", "Georgeann", "Carola", "Isaias", "Ellis", "Roseanne", "Lenard", "Ela",
				"Ophelia", "Alesha", "Mafalda", "Flor", "Kelsi", "Autumn", "Sondra", "Pasty", "Jacquelyne", "Benjamin",
				"Emmie", "Mickie", "Lang", "Jamee", "Felice", "Daniella", "Carola", "Nathalie", "Genevive" };

		System.out.println("Antal Sjuor: " + seven(numbers));
		System.out.println("\nDet finns " + Tom(names) + " Tom's");
		System.out.println("\nDet nummer det finns flest av är " + most(numbers));
		System.out.println("\nDet nummer det finns minst av är " + least(numbers));
		System.out.println("\nDrusilla är på plats " + Drusilla(names));
		System.out.println("\nSumman av alla jämna tal är " + jamnMedel(numbers));
		System.out.println("\n" + antalTal(numbers));
		System.out.println("\nAntal namn som börjar på L är " + bokstavL(names));
		System.out.println("\nAntal namn på fem bokstäver är " + femBokstaver(names));
		System.out.println("\nAntal unika namn är " + unik(names));
	}

	public static int seven(int[] numbers) {
		int seven = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 7) {
				seven++;
			}
		}
		return seven;
	}

	public static int Tom(String[] names) {
		int tom = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].contains("Tom")) {
				tom++;
			}
		}
		return tom;
	}

	public static int most(int[] numbers) {
		int most = 0;
		int amount;
		int max = 0;
		for (int i = 0; i < 10; i++) {
			amount = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) {
					amount++;
				}
			}
			if (amount > max) {
				most = i;
				max = amount;
			}

		}
		return most;

	}

	public static int least(int[] numbers) {
		int least = 0;
		int amount;
		int min = 99999;
		for (int i = 0; i < 10; i++) {
			amount = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == i) {
					amount++;
				}
			}
			if (amount < min) {
				least = i;
				min = amount;
			}

		}
		return least;

	}

	public static int Drusilla(String[] names) {
		int drusilla = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].contains("Drusilla")) {
				drusilla = i;
				break;
			}
		}
		return drusilla;
	}

	public static int jamnMedel(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}
		return sum;
	}

	public static String antalTal(int[] numbers) {
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				zero++;
			} else if (numbers[i] == 1) {
				one++;
			} else if (numbers[i] == 2) {
				two++;
			} else if (numbers[i] == 3) {
				three++;
			} else if (numbers[i] == 4) {
				four++;
			} else if (numbers[i] == 5) {
				five++;
			} else if (numbers[i] == 6) {
				six++;
			} else if (numbers[i] == 7) {
				seven++;
			} else if (numbers[i] == 8) {
				eight++;
			} else {
				nine++;
			}
		}
		String antal = "Antal nollor: " + zero + "\nAntal ettor: " + one + "\nAntal tvåor: " + two + "\nAntal treor: "
				+ three + "\nAntal fyror: " + four + "\nAntal femmor: " + five + "\nAntal sexor: " + six
				+ "\nAntal sjuor: " + seven + "\nAntal åttor: " + eight + "\nAntal nior: " + nine;
		return antal;
	}

	public static int bokstavL(String[] names) {
		int antalL = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].contains("L")) {
				antalL++;
			}
		}

		return antalL;
	}

	public static int femBokstaver(String[] names) {
		int fem = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() == 5) {
				fem++;
			}
		}
		return fem;
	}

	static int unik(String[] names) {
		int unik = 1;

		for (int i = 1; i < names.length; i++) {
			int j = 0;
			for (j = 0; j < i; j++)

				if (names[i] == names[j]) {
					break;
				}

			if (i == j)
				unik++;
		}
		return unik;
	}
}
