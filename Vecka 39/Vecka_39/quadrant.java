package Vecka_39;

import java.util.Scanner;

public class quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if (num1 > 0 && num2 > 0) {
			System.out.println("1");
		}
		
		else if (num1 < 0 && num2 > 0) {
			System.out.println("2");
			
		}
		
		else if (num1 < 0 && num2 < 0) {
			System.out.println("3");
			
		}
		
		else if (num1 > 0 && num2 < 0) {
			System.out.println("4");
			
		}
		 
		
		
	}

}
