package Package;

import java.util.Scanner;

public class Tableau {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		float[] nombers = new float[5];
		float somme = 0;
		float min, max;

		for (int i = 0; i < 5; i++) {
			System.out.print("Entrez nomber "+ i +" : ");
			nombers[i] = scanner.nextFloat();
			somme += nombers[i];
		}
		
        min = nombers[0];
        max = nombers[0];

        for (int i = 1; i < 5; i++) {
            if (nombers[i] < min) {
                min = nombers[i];
            }
            if (nombers[i] > max) {
                max = nombers[i];
            }
        }
        

        System.out.println("Moyenne : " + (somme / 5));
        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
        
	}

}
