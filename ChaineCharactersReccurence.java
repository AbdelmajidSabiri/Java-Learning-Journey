package Package;

import java.util.Scanner;

public class ChaineCharactersReccurence {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrer une string : ");
		String stringg = scanner.nextLine();
		
		int Acounter = 0,Ecounter = 0,Icounter = 0,Ocounter = 0,Ucounter = 0,Ycounter = 0;
		
		for (int i = 0; i<stringg.length() ; i++) {
			if(Character.toLowerCase(stringg.charAt(i)) == 'a') {
				Acounter++;
			}
			
			else if(Character.toLowerCase(stringg.charAt(i)) == 'e') {
				Ecounter++;
			}
			
			else if(Character.toLowerCase(stringg.charAt(i)) == 'i') {
				Icounter++;
			}
			
			else if(Character.toLowerCase(stringg.charAt(i)) == 'o') {
				Ocounter++;
			}
			
			else if(Character.toLowerCase(stringg.charAt(i)) == 'u') {
				Acounter++;
			}
			
			else if(Character.toLowerCase(stringg.charAt(i)) == 'y') {
				Ycounter++;
			}
		}
		
		System.out.println("La letter a : "+Acounter+" fois");
		System.out.println("La letter e : "+Ecounter+" fois");
		System.out.println("La letter i : "+Icounter+" fois");
		System.out.println("La letter o : "+Ocounter+" fois");
		System.out.println("La letter u : "+Ucounter+" fois");
		System.out.println("La letter y : "+Ycounter+" fois");

	}

}
