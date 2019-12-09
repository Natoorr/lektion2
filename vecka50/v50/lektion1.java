package v50;

import java.util.Scanner;

public class lektion1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		int index;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
			System.out.println(numbers[i]);
		}

		try {
			index = input.nextInt();
			System.out.println(numbers[index]);
		} catch (Exception e) {
			System.out.println("array thing out of bounds thing");
		}
	}
}
