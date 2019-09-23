package lektion1;

import java.util.Scanner;

public class Lektion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//villkor
		
		boolean svar = true;
		int age = 0; //initierat variabel med tillfälligt värde 0
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hur gammal du vara?");
		
		age = input.nextInt();
		
		if (age >= 18) {
			
			System.out.println("Du är gay och kan köra");
		}
		
		else if (age > 14 && age < 18) {
			
			System.out.println("köra en mopp");
			
		}
		
		
		else {
			
			System.out.println("kan du typ inte fucking köra ditt mongobarn");
		}
		
		System.out.println("vill du fråga igen säg 1 för ja elle 2 för nej");
	}

}
