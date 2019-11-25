package vecka46;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String uwu;
		System.out.println("Skriv in text och bli besviken");
		uwu = input.nextLine();
		System.out.println(uwuInator(uwu));
		
		double fahrenheit;
		System.out.println("Skriv Fahrenheit -> Kelvin");
		fahrenheit = input.nextDouble();
		System.out.printf("%.2f" , fahrenheitToKelvin(fahrenheit));
		System.out.println();
		
		double kelvin;
		System.out.println("Skriv Kelvin -> Celcius");
		kelvin = input.nextDouble();
		System.out.printf("%.2f" , kelvinToCelcius(kelvin));
		System.out.println();
		
		double velocityKmH;
		System.out.println("Skriv km/h -> m/s");
		velocityKmH = input.nextDouble();
		System.out.printf("%.2f" , velocityConversion(velocityKmH));
		System.out.println();
		
		double mass;
		double velocity;
		System.out.println("Skriv in massa och hastighet -> kinetisk energi");
		mass = input.nextDouble();
		velocity = input.nextDouble();
		System.out.printf("%.2f" , kineticEnergy(mass, velocity));
		System.out.println();
		
		double height;
		System.out.println("Skriv in Massa och Höjd -> Potentiell Energi");
		mass = input.nextDouble();
		height = input.nextDouble();
		System.out.printf("%.2f" , potentialEnergy(mass, height));
		System.out.println();
		
		double first;
		double second;
		double last;
		System.out.println("Skriv 3 tal du vill ha medelvärdet av");
		first = input.nextDouble();
		second = input.nextDouble();
		last = input.nextDouble();
		System.out.printf("%.2f" , delta(first, second, last));
		System.out.println();
		
		System.out.println(smallLetters());
		
		System.out.println(pr0grammering());
		
		double distance;
		System.out.println("Skriv in Sträcka och Hastighet -> Tid (Skriv sträcka först)");
		distance = input.nextDouble();
		velocity = input.nextDouble();
		System.out.printf("%.2f" , svtTime(distance, velocity));
		System.out.println();
		
		double force;
		System.out.println("Skriv in Kraft och Sträcka -> Arbete");
		force = input.nextDouble();
		distance = input.nextDouble();
		System.out.printf("%.2f" , work(force, distance));
		System.out.println();
		
		System.out.println("Skriv in Hastighet -> Maximal höjd");
		velocity = input.nextDouble();
		System.out.printf("%.2f" , velocityToHeight(velocity));
		System.out.println();
		
		double volume;
		System.out.println("Skriv in Volym -> Radie");
		volume = input.nextDouble();
		System.out.printf("%.3f" , sphereVolumeToRadius(volume));
		System.out.println();

		int anime;
		System.out.println("Hur många anime har du kollat på?");
		anime = input.nextInt();
		animeCount(anime);
		
		
	}

	/**
	 * Tar in en text och gör den mer uwu
	 * @param uwu
	 * @return uwu
	 */
	
	public static String uwuInator(String uwu){
		uwu = uwu.replace("o" , "owo").replace("r", "w");
		return uwu;
	}
	
	/**
	 * Tar in Fahrenheit och räknar ut Kelvin genom formel
	 * @param fahrenheit
	 * @return kelvin
	 */
	
	public static double fahrenheitToKelvin(double fahrenheit) {
		double celcius = (fahrenheit - 32) / 1.8;
		double kelvin = celcius + 273.15;
		return kelvin;
	}
	
	/**
	 * Tar in Kelvin och räknar ut Celcius enligt formel
	 * @param kelvin
	 * @return celcius
	 */
	
	public static double kelvinToCelcius(double kelvin) {
		double celcius = kelvin - 273.15;
		return celcius;
	}
	
	/**
	 * Tar in hastighet i km/h och omvandlar till m/s enligt formel
	 * @param velocityKmH
	 * @return velocityMS
	 */
	
	public static double velocityConversion(double velocityKmH) {
		double velocityMS = velocityKmH / 3.6;
		return velocityMS;
	}
	
	/**
	 * Tar in massa och hastighet och räknar ut kinetisk energi enligt formel
	 * @param mass
	 * @param velocity
	 * @return kinetic
	 */
	
	public static double kineticEnergy(double mass, double velocity) {
		double kinetic = mass * velocity;
		return kinetic;
	}
	
	/**
	 * Tar in massa och höjd och räknar ut potential energi
	 * @param mass
	 * @param height
	 * @return potentialEnergy
	 */
	
	public static double potentialEnergy(double mass, double height) {
		double potentialEnergy = mass * height * 9.82;
		return potentialEnergy;
	}
	
	/**
	 * Tar in tre nummer och räknar ut medelvärdet
	 * @param first
	 * @param second
	 * @param last
	 * @return average
	 */
	
	public static double delta(double first, double second, double last) {
		double average = (first + second + last) / 3;
		return average;
	}
	
	/**
	 * Gör om en sträng till små bokstäver
	 * @return word
	 */
	
	public static String smallLetters() {
		String word = "PaParaZZi";
		word = word.toLowerCase();
		return word;
	}
	
	/**
	 * Gör om en sträng till stora bokstäver och byter ut alla O mot 0
	 * @return word
	 */
	
	public static String pr0grammering() {
		String word = "Jag vill bli godkänd i programmering! <3";
		word = word.toUpperCase().replace("O" , "0");
		return word;
	}
	
	/**
	 * Tar in sträcka och hastighet och räknar ut tid
	 * @param distance
	 * @param velocity
	 * @return time
	 */
	
	public static double svtTime(double distance, double velocity) {
		double time = distance / velocity;
		return time;
	}
	
	/**
	 * Tar in kraft och sträcka och räknar ut arbete
	 * @param force
	 * @param distance
	 * @return work
	 */
	
	public static double work(double force, double distance) {
		double work = force * distance;
		return work;
	} 
	
	/**
	 * Tar in hastighet och räknar ut höjd
	 * @param velocity
	 * @return height
	 */
	
	public static double velocityToHeight(double velocity) {
		double height = Math.pow(velocity, 2) / 19.64;
		return height;
	}
	/**
	 * Tar in volym och räknar ut radien på ett klot
	 * @param Volume
	 * @return radius
	 */
	
	public static double sphereVolumeToRadius(double Volume) {
		double radius = Math.cbrt((3 * Volume / (4 * Math.PI)));
		return radius;
	}
	
	/**
	 * Tar in hur många anime du kollat på och ger dig tips eller säger fakta om dig
	 * @param anime
	 */
	
	public static void animeCount(int anime) {
		if(anime <= 0) {
			System.out.println("Kolla nu >:(");
		}
		else if (anime <= 5) {
			System.out.println("Kolla på JoJo.");
		}

		else if (anime <= 12) {
			System.out.println("Sluta tycka om SAO");
		}

		else if (anime <= 40) {
			System.out.println("Du kollar på ecchi");
		}

		else if (anime <= 90) {
			System.out.println("Du kollar bara på seasonal anime");
		}

		else if (anime <= 140) {
			System.out.println("Isekai pogchamp");
		}

		else if (anime <= 200) {
			System.out.println("Du mår inte bra");
		}

		else {
			System.out.println("weeb");
		}
	}
}
