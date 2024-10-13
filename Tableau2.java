package Package;

import java.util.Scanner;

public class Tableau2 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		float[] nombers = new float[7];

		for (int i = 0; i < 7; i++) {
			System.out.print("Entrez nomber "+ i +" : ");
			nombers[i] = scanner.nextFloat();
			
			if (nombers[i] == 1) {
				nombers[i] = 0;
			}
		}
		
        System.out.println("Tableau apres remplacement des 1 par des 0 :");
        for (int i = 0; i < 7; i++) {
            System.out.print(nombers[i] + " ");
        }
		

		
	}

}
