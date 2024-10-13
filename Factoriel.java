package Package;

import java.util.Scanner;

public class Factoriel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrer un  Entier : ");
		int n = scanner.nextInt();
		int fact = 1;
		
		for (int i = n ; i>0 ; i--) {
			fact = fact * i;
		}
		
		
		System.out.println("Factoriel de "+ n +" Est : "+fact);
		
	}

}
