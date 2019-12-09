package vecka48;

public class lek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ooga = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // skapar array och fyller den med 10 tal

		System.out.println(ooga);

		int[] booga = new int[10]; // skapar array med 10 tomma låda

		booga[2] = 10;

		System.out.println(booga);

		String[] name = { "vill", "du", "äta", "e"};
			for(int i = 0; i < 20; ) {
				for( int j = 0; j < 4; j++) {
					System.out.println(i+1 + ". " + name[j]);
					i++;
				}
			}

	}

}
