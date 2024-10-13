package Package;

import java.util.Scanner;

public class ChaineCharacters {

	public static void main(String[] args) {
		
		System.out.print("Entrer une chaine de characteres : ");
		Scanner scanner = new Scanner(System.in);
		
		String stringg = scanner.nextLine();
		
		String stringgParDeux = "";
		for (int i = 0 ; i<stringg.length() ; i+=2) {
			stringgParDeux += stringg.charAt(i);
		}
		
		char LastChar = stringg.charAt(stringg.length()-1);
		char FirstChar = stringg.charAt(0);
		
		String Char1And2 = FirstChar +""+ LastChar;
		
		System.out.println("First and last characters are : "+Char1And2);
		
	}

}
