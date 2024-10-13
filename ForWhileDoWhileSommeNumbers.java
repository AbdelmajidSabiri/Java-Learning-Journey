package Package;

import java.util.Scanner;

public class ForWhileDoWhileSommeNumbers {

	public static void main(String[] args) {
		
		int ForSomme = 0, WhileSomme = 0, DoWhileSomme = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		// Somme avec la boucle for
		System.out.println("-----------" + "FOR LOOP" + "------------");
		for (int i = 1; i<=4 ; i++) {
			System.out.print("Enter number "+ i +" : ");
			ForSomme = ForSomme + scanner.nextInt();
		}
		System.out.println("For boucle result : "+ForSomme);

		
		
		// Somme avec la boucle While
		System.out.println("-----------" + "WHILE LOOP" + "------------");
		int index=1;
		while (index<=4) {
			System.out.print("Enter number "+ index +" : ");
			WhileSomme = WhileSomme + scanner.nextInt();
			index++;
		}
		System.out.println("While boucle result : "+WhileSomme);

		
		
		// Somme avec la boucle Do While
		System.out.println("-----------" + "DO WHILE LOOP" + "------------");
		index = 1;
		do {
			System.out.print("Enter number "+ index +" : ");
			DoWhileSomme = DoWhileSomme + scanner.nextInt();
			index++;
		} while (index <= 4);
		System.out.println("Do While boucle result : "+DoWhileSomme);

		
	}

}