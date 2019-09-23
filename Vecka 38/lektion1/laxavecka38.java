package lektion1;

import java.util.Scanner;

public class laxavecka38 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Boolean svar = true;
	
	double heltal1 = 0;
	double heltal2 = 0;
	double heltal3 = 0;      //initierar variabler med tillfälligt värde 0
	double heltal4 = 0;
	double heltal5 = 0;
	double stor = 0;
	double liten = 0;
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Skriv in 5 heltal");
		
	heltal1 = input.nextDouble();
	heltal2 = input.nextDouble();
	heltal3 = input.nextDouble();     //får dig att skriva 5 tal
	heltal4 = input.nextDouble();
	heltal5 = input.nextDouble();
	
	if (heltal1 >= heltal2 && heltal1 >= heltal3 && heltal1 >= heltal4 && heltal1 >= heltal5) {
		
		stor = heltal1;
		
	}
	
	else if (heltal2 >= heltal1 && heltal2 >= heltal3 && heltal2 >= heltal4 && heltal2 >= heltal5) {
		
		stor = heltal2;
		
	}
	
	else if (heltal3 >= heltal1 && heltal3 >= heltal2 && heltal3 >= heltal4 && heltal3 >= heltal5) {
		
		stor = heltal3;
		
	}
	
	else if (heltal4 >= heltal1 && heltal4 >= heltal3 && heltal4 >= heltal2 && heltal4 >= heltal5) {
	
	stor = heltal4;
	
}
	
	else {

		stor = heltal5;
	
}	
	
if (heltal1 <= heltal2 && heltal1 <= heltal3 && heltal1 <= heltal4 && heltal1 <= heltal5) {
		
		liten = heltal1;
		
	}
	
	else if (heltal2 <= heltal1 && heltal2 <= heltal3 && heltal2 <= heltal4 && heltal2 <= heltal5) {
		
		liten = heltal2;
		
	}
	
	else if (heltal3 <= heltal1 && heltal3 <= heltal2 && heltal3 <= heltal4 && heltal3 <= heltal5) {
		
		liten = heltal3;
		
	}
	
	else if (heltal4 <= heltal1 && heltal4 <= heltal3 && heltal4 <= heltal2 && heltal4 <= heltal5) {
	
		liten = heltal4;
	
}
	
	else {

		liten = heltal5;
	
}	
	
double medel = (heltal1 + heltal2 + heltal3 + heltal4 + heltal5)/5;


	System.out.println("Det största talet är: " + stor);
	System.out.println("Det minsta talet är: " + liten);
	System.out.println("Medelvärdet av dina tal är: " + medel);
	
	}
}

