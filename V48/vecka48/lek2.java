package vecka48;

public class lek2 {

	public static void main(String[] args) {

		double[] numbers = new double[20];
        double[] numbers2 = { 12.2, 34, -45.11231234 };

        String[] namn = {"Leffe","Zachris","DAdiv","Jacob","Gabbe","Davidd","Pföre","Obama"};
    	
		for (int i = 0; i < namn.length; i++) {
			int antalA = 0;
			
			for (int j = 0; j < namn[i].length(); j++) {
				if (namn[j].contains("a")) {
					antalA++;
				}
			}
			System.out.println(antalA);
		}


	
	
	
	
	
	
	}
}