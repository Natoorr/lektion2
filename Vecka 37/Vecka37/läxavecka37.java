package Vecka37;

import java.util.Scanner; //Beh�vs f�r input



public class l�xavecka37 {

	public static void main(String[] args) {
		
		
		Scanner input =  new Scanner(System.in); //Beh�vs f�r input

		
		System.out.println("Vad heter du?");
		
		String namn = input.nextLine();
		
		
		System.out.println("Hur gammal �r du?");
		
		String age = input.nextLine();
		
		
		System.out.println("Vad �r din adress?");
		
		String adress = input.nextLine();
		
		
		System.out.println("Vad �r ditt postnummer?");
		
		String postnummer = input.nextLine();
		
		
		System.out.println("Vilken stad bor du i?");
		
		String stad = input.nextLine();
		
		
		System.out.println("Vad �r ditt telefonnummer?");
		
		String telefon = input.nextLine();
		
		
		System.out.println("Information\nNamn:\t" + namn + "\n�lder:\t" + age + "\nAdress:\t" + adress + "\n" + postnummer + "  "
		+ stad + "\nTelefonnummer:" + telefon);
		

	}

}
