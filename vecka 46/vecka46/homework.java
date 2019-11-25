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
		System.out.println("Skriv in Massa och H�jd -> Potentiell Energi");
		mass = input.nextDouble();
		height = input.nextDouble();
		System.out.printf("%.2f" , potentialEnergy(mass, height));
		System.out.println();
		
		double first;
		double second;
		double last;
		System.out.println("Skriv 3 tal du vill ha medelv�rdet av");
		first = input.nextDouble();
		second = input.nextDouble();
		last = input.nextDouble();
		System.out.printf("%.2f" , delta(first, second, last));
		System.out.println();
		
		System.out.println(smallLetters());
		
		System.out.println(pr0grammering());
		
		double distance;
		System.out.println("Skriv in Str�cka och Hastighet -> Tid (Skriv str�cka f�rst)");
		distance = input.nextDouble();
		velocity = input.nextDouble();
		System.out.printf("%.2f" , svtTime(distance, velocity));
		System.out.println();
		
		double force;
		System.out.println("Skriv in Kraft och Str�cka -> Arbete");
		force = input.nextDouble();
		distance = input.nextDouble();
		System.out.printf("%.2f" , work(force, distance));
		System.out.println();
		
		System.out.println("Skriv in Hastighet -> Maximal h�jd");
		velocity = input.nextDouble();
		System.out.printf("%.2f" , velocityToHeight(velocity));
		System.out.println();
		
		double volume;
		System.out.println("Skriv in Volym -> Radie");
		volume = input.nextDouble();
		System.out.printf("%.3f" , sphereVolumeToRadius(volume));
		System.out.println();

		int anime;
		System.out.println("Hur m�nga anime har du kollat p�?");
		anime = input.nextInt();
		animeCount(anime);
		
		
	}

	/**
	 * Tar in en text och g�r den mer uwu
	 * @param uwu
	 * @return uwu
	 */
	
	public static String uwuInator(String uwu){
		uwu = uwu.replace("o" , "owo").replace("r", "w");
		return uwu;
	}
	
	/**
	 * Tar in Fahrenheit och r�knar ut Kelvin genom formel
	 * @param fahrenheit
	 * @return kelvin
	 */
	
	public static double fahrenheitToKelvin(double fahrenheit) {
		double celcius = (fahrenheit - 32) / 1.8;
		double kelvin = celcius + 273.15;
		return kelvin;
	}
	
	/**
	 * Tar in Kelvin och r�knar ut Celcius enligt formel
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
	 * Tar in massa och hastighet och r�knar ut kinetisk energi enligt formel
	 * @param mass
	 * @param velocity
	 * @return kinetic
	 */
	
	public static double kineticEnergy(double mass, double velocity) {
		double kinetic = mass * velocity;
		return kinetic;
	}
	
	/**
	 * Tar in massa och h�jd och r�knar ut potential energi
	 * @param mass
	 * @param height
	 * @return potentialEnergy
	 */
	
	public static double potentialEnergy(double mass, double height) {
		double potentialEnergy = mass * height * 9.82;
		return potentialEnergy;
	}
	
	/**
	 * Tar in tre nummer och r�knar ut medelv�rdet
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
	 * G�r om en str�ng till sm� bokst�ver
	 * @return word
	 */
	
	public static String smallLetters() {
		String word = "PaParaZZi";
		word = word.toLowerCase();
		return word;
	}
	
	/**
	 * G�r om en str�ng till stora bokst�ver och byter ut alla O mot 0
	 * @return word
	 */
	
	public static String pr0grammering() {
		String word = "Jag vill bli godk�nd i programmering! <3";
		word = word.toUpperCase().replace("O" , "0");
		return word;
	}
	
	/**
	 * Tar in str�cka och hastighet och r�knar ut tid
	 * @param distance
	 * @param velocity
	 * @return time
	 */
	
	public static double svtTime(double distance, double velocity) {
		double time = distance / velocity;
		return time;
	}
	
	/**
	 * Tar in kraft och str�cka och r�knar ut arbete
	 * @param force
	 * @param distance
	 * @return work
	 */
	
	public static double work(double force, double distance) {
		double work = force * distance;
		return work;
	} 
	
	/**
	 * Tar in hastighet och r�knar ut h�jd
	 * @param velocity
	 * @return height
	 */
	
	public static double velocityToHeight(double velocity) {
		double height = Math.pow(velocity, 2) / 19.64;
		return height;
	}
	/**
	 * Tar in volym och r�knar ut radien p� ett klot
	 * @param Volume
	 * @return radius
	 */
	
	public static double sphereVolumeToRadius(double Volume) {
		double radius = Math.cbrt((3 * Volume / (4 * Math.PI)));
		return radius;
	}
	
	/**
	 * Tar in hur m�nga anime du kollat p� och ger dig tips eller s�ger fakta om dig
	 * @param anime
	 */
	
	public static void animeCount(int anime) {
		if(anime <= 0) {
			System.out.println("Kolla nu >:(");
		}
		else if (anime <= 5) {
			System.out.println("Kolla p� JoJo.");
		}

		else if (anime <= 12) {
			System.out.println("Sluta tycka om SAO");
		}

		else if (anime <= 40) {
			System.out.println("Du kollar p� ecchi");
		}

		else if (anime <= 90) {
			System.out.println("Du kollar bara p� seasonal anime");
		}

		else if (anime <= 140) {
			System.out.println("Isekai pogchamp");
		}

		else if (anime <= 200) {
			System.out.println("Du m�r inte bra");
		}

		else {
			System.out.println("weeb");
		}
	}
}
