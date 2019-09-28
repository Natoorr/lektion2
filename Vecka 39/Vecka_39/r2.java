package Vecka_39;

import java.util.Scanner;

public class r2 {

	public static void main(String[] args) {
		
		int s = 0;
		int r1 = 0;
		int r2 = 0;
		
		Scanner input = new Scanner(System.in);
		
		r1 = input.nextInt();
		s = input.nextInt();
		
		
		r2 = (s*2)-r1;
		
		System.out.println(r2);
		
	}
}
