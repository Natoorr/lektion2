package V45;

import java.util.Scanner;

public class mathString {
	
	
	public static void main(String[] args) {

		
		
		
		System.out.println(Math.max(3, 5));
		
		String mening = "tomas är cool men het";
		System.out.println(mening);
		
		
		Scanner input = new Scanner(System.in);
		
		String mening2 = input.nextLine();
		
		if(mening.contentEquals(mening2)) {
			System.out.println("samma sak homofil");
		}
		else {
			System.out.println("stava mongo");
		}
		
		System.out.println(mening.length());
		System.out.println(mening.toUpperCase());
		System.out.println("tomas sexiggg".contains("sexiggg")); //case sensitive
		System.out.println("            VI GO G O  OG    ".trim());
		System.out.println("               stor gay mannnnnnnn   ".toUpperCase().contains("GAY"));
		System.out.println("Tomas bra man hahahaha".replace("a", "B B B B B B B"));
		
		
		int a = 7;
		int b = 3;
	
		double svar = (double)a / (double)b;
		System.out.println(svar);	
		System.out.println(a);
		
		String c = "7";
		String d = "3";
		
	}

}
