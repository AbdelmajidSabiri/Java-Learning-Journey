package Package;

import java.util.Scanner;

public class Equation2Degree {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter value of a : ");
		Float a = scanner.nextFloat();
		
		System.out.print("Enter value of b : ");
		Float b = scanner.nextFloat();
		
		System.out.print("Enter value of c : ");
		Float c = scanner.nextFloat();
		
		
		if (a == 0) {
			System.out.println("solution de l'equation (ax^2 + bx + c) est : "+((-1)*c)/b);
		}
		else {
			Float delta = (float)Math.pow(b, 2) - 4*a*c;
			if (delta<0) {
				System.out.println("L'equation n'admet pas de solution !!");
			}
			else if (delta == 0) {
				Float x = ((-1)*b)/(2*a);
				System.out.println("L'equation admet un seul solution : "+x);
			}
			else {
				Float x1 = ((-1)*b - (float)Math.sqrt(delta))/(2*a);
				Float x2 = ((-1)*b + (float)Math.sqrt(delta))/(2*a);
				System.out.print("L'equation admet deux solution : \nX1 : "+x1);
				System.out.println("\nX2 : "+x2);
			}
		}
		
		scanner.close();
	}

}