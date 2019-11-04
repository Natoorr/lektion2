package Vecka41;

import java.util.Scanner;

public class uppg2 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int tal;
		int digit;
		int sum = 0;
		System.out.println("skriv heltal mongo");
		tal = input.nextInt();

		while (tal != 0) {
			digit = tal % 10;
			sum += digit;
			tal /= 10;
		}

		System.out.println(sum);

	}

}
