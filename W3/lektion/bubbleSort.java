package lektion;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("skriv in antal tal du vill ha");
		int numbersLength = input.nextInt();
		int[] numbers = new int[numbersLength];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("skriv in tal på plats " + (i+1));
			numbers[i] = input.nextInt();
		}
		
		
		boolean swapped = false;
		int temp;
		
		do {
			System.out.println(Arrays.toString(numbers));
			swapped = false;
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					temp = numbers[i]; // lagrar shitten grej
					numbers[i] = numbers[i + 1]; // byter plats
					numbers[i + 1] = temp; // byter plats
					swapped = true;
					
				}
			}
			
		} while (swapped);

		
	}

}
