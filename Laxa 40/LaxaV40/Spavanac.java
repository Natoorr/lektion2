package LaxaV40;

import java.util.Scanner;

public class Spavanac {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hour = 0;
		int minute = 0;
		
		hour = input.nextInt();
		minute = input.nextInt();
		
		minute = minute - 45;
		
		if (minute < 0) {
		minute = minute+60;
		hour=hour-1;}
		
		if (hour < 0) {
			hour=hour+24;
		}
		System.out.println(hour + " " + minute);
	}

}
