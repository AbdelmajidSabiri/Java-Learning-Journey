package Exercice1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name of point : ");
		String name = sc.nextLine();
		
		System.out.print("Enter abscisse of point : ");
		double abscisse = sc.nextDouble();
		
		point point1 = new point(name,abscisse);
		
		point1.affiche();
		point1.translate(30);
		point1.affiche();

	}

}
