package Package;

import java.util.Scanner;

public class functions {
	
    public static float surfaceRectangle(float longueur, float largeur) {
        return longueur * largeur;
    }
    
    public static void minMax(float a, float b, float c, float d) {
        float min = Math.min(Math.min(a, b), Math.min(c, d));
        float max = Math.max(Math.max(a, b), Math.max(c, d));
        
        System.out.println("Minimum: " + min + ", Maximum: " + max);
    }
    
    
    public static void Descending() {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[7];
        
        System.out.println("Entrez sept entiers : ");
        
        for (int i = 1; i < 8; i++) {
        	System.out.print("Number "+i+" : ");
            numbers[i] = scanner.nextInt();
        }
        
        
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
            	
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        };
        
        System.out.print("Nombres triés de plus grand au plus petit : ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        
    }
	
    
	
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		String userChoise = "";
		
		System.out.println("Entrer ce que vous voullez a faire : ");
		System.out.println("S : Surface de Rectange\n"
				+ "SORT : Sort number  de plus grand au plus petit\n"
				+ "MM : Max et Min de quatre nombres");
		do {
			
			System.out.print(">>>>> ");
			userChoise = scanner.nextLine();
			
			if (userChoise.equals("S")) {
				
				System.out.println("Entrer la longueur de rectangle : ");
				float longueur = scanner.nextFloat();
				scanner.nextLine();
				
				System.out.println("Entrer la largeur de rectangle : ");
				float largeur = scanner.nextFloat();
				
				float surface = surfaceRectangle(longueur,largeur);
				
				System.out.println("La surface de ce rectangle est : "+surface);
				
				scanner.nextLine();
			}
			
			if (userChoise.equals("SORT")) {
				Descending();
			}
			
			if (userChoise.equals("MM")) {
				
				System.out.print("Enter first number : ");
				float number1 = scanner.nextFloat();
				
				System.out.print("Enter second number : ");
				float number2 = scanner.nextFloat();
				
				System.out.print("Enter Third number : ");
				float number3 = scanner.nextFloat();
				
				System.out.print("Enter fourth number : ");
				float number4 = scanner.nextFloat();
				
				scanner.nextLine();
				
				minMax(number1,number2,number3,number4);
			}
			
			
			
			
			
		} while (!(userChoise.equals("Q")));

	}

}
