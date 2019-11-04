package v43;

import java.util.Scanner;

public class lektion1 {

	public static void main(String[] args) {
		
		twoNumbers();
		
	}

	
	public static void twoNumbers(){
	

	int tal1;
	int tal2;
	Scanner input = new Scanner(System.in);
	System.out.println("skriv in två halal tal mongo");
	tal1 = input.nextInt();
	tal2 = input.nextInt();

	System.out.println(oogabooga(tal1, tal2));

}
	
	
	static String oogabooga(int tal3, int tal4) {
		if (tal3 <= tal4) {
			System.out.println("minsta tal är: " + tal3);

		} else {
			System.out.println("minsta tal är: " + tal4);
		}
		String hej = "prigrammet is gone dun und und udndu ndu nud nund un dund undu ndun dundun";
		return hej;

	}
	
}