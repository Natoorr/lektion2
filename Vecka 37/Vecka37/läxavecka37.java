package Vecka37;

import java.util.Scanner; //Behövs för input



public class läxavecka37 {

	public static void main(String[] args) {
		
		
		Scanner input =  new Scanner(System.in); //Behövs för input

		
		System.out.println("Vad heter du?");
		
		String namn = input.nextLine();
		
		
		System.out.println("Hur gammal är du?");
		
		String age = input.nextLine();
		
		
		System.out.println("Vad är din adress?");
		
		String adress = input.nextLine();
		
		
		System.out.println("Vad är ditt postnummer?");
		
		String postnummer = input.nextLine();
		
		
		System.out.println("Vilken stad bor du i?");
		
		String stad = input.nextLine();
		
		
		System.out.println("Vad är ditt telefonnummer?");
		
		String telefon = input.nextLine();
		
		
		System.out.println("Information\nNamn:\t" + namn + "\nÅlder:\t" + age + "\nAdress:\t" + adress + "\n" + postnummer + "  "
		+ stad + "\nTelefonnummer:" + telefon);
		

	}

}
