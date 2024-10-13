// Code for calculation of harmonic serie

package Package;

import java.util.Scanner;

public class SerieHarmonique {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrer un Entier n : ");
		int n = scanner.nextInt();
		float fact = 0;
		
		
		for(int i = n; i>0 ; i--) {
			fact = fact + 1.0f/i;
		}
		
		System.out.println("Le resultat de serie harmonique de 1 a "+n+" est : "+fact);
	}

}
