import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		
//		double x = 3.14;
//		double y = -10;
//		System.out.println("max is "+Math.max(x,y));
//		System.out.println("min is "+Math.min(x,y));
//		System.out.println("valeur absolu de y est "+Math.abs(y));
//		System.out.println("racine carre de x est "+Math.sqrt(x));
//		System.out.println("round x is "+Math.round(x));
//		System.out.println("ceil x is "+Math.ceil(x));
//		System.out.println("floor x is "+Math.floor(x));
		
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter x :");
		x = scanner.nextDouble();
		
		System.out.println("Enter y :");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		  
		System.out.println("The hypotenuse is : "+z);
		  
		scanner.close();

	}

}
