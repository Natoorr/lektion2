package Vecka41;

import java.util.Scanner;

public class uppg3 {
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		double antal = 0;
		double i = 23887687;
		
		while(i > 0) {
			
			
			System.out.println("skriv nummer, skriv 0 för avsluta");
			
			i = sc.nextInt();
			total = total + i;
			antal++;
			}
		antal--;
		double medel = total/antal;
		System.out.println("total: " + total + "\n medel: " + medel);
		
		
	}

}
