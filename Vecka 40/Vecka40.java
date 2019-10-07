
public class Vecka40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

						// % == modulus
		
		int tal1 = -345;
		int tal2 = 4455674;
		int tal3 = -4259;
		int tal4 = 42360;
		int sum = 0;
		int turn = 0;
	System.out.println(tal1%3);  //om tal(1,2,3,4) är delbara med tre 
								//printar den 0 annar printar den resten
	System.out.println(tal2%3);
	
	System.out.println(tal3%3);
	
	System.out.println(tal4%3);
	
	System.out.println("---------------------------");
	
	for(int i = 0; i < 101; i++) {
		
		if(i % 3 == 0) {
			System.out.println("Talet " + i + " är delbart med 3");
			sum += i;
		}
		
	}
	System.out.println("Summan av alla tal under 100 som är delbara med tre är: " + sum);
	
	while (true) {
		
		turn ++;
		
	if (turn % 3 == 0) {
		System.out.println("det är pers 1 tur, det är tur: " + turn);
	}
	
	else if (turn % 3 == 1) {
		System.out.println("det är pers 2 tur, det är tur: " + turn);}
	
	
	else if (turn % 3 == 2) {
		System.out.println("det är pers 3 tur, det är tur: " + turn);
	}
	
	
	if (turn == 100) {
	break;
	}
	
	
	}
}
}
