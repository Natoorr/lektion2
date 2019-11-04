package Vecka41;

import java.util.Scanner;

public class uppg1 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		x = input.nextInt();
		y = input.nextInt();
		
		if (x < y) {
			System.out.println(x);
		}
		else if (y < x) {
			System.out.println(y);
		}
		
	
	}

}
