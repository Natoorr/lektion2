package lektion1;

import java.util.Scanner;

public class Lektion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//villkor
		
		boolean svar = true;
		int age = 0; //initierat variabel med tillf�lligt v�rde 0
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hur gammal du vara?");
		
		age = input.nextInt();
		
		if (age >= 18) {
			
			System.out.println("Du �r gay och kan k�ra");
		}
		
		else if (age > 14 && age < 18) {
			
			System.out.println("k�ra en mopp");
			
		}
		
		
		else {
			
			System.out.println("kan du typ inte fucking k�ra ditt mongobarn");
		}
		
		System.out.println("vill du fr�ga igen s�g 1 f�r ja elle 2 f�r nej");
	}

}
