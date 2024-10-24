package Package;

import java.util.Scanner;

public class String2sur2 {

	public static void main(String[] args) {
		
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String Chaine = sc.nextLine();
		
		for(int i = 0; i<Chaine.length(); i += 2) {
			System.out.println(Chaine.charAt(i));
		}
		
	}

}
