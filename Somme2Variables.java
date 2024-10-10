import java.util.Scanner;


public class Somme2Variables {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		Float number1 = scanner.nextFloat();
		
		
		System.out.print("Enter second number : ");
		Float number2 = scanner.nextFloat();

		System.out.println("La somme de ces deux nombres est : "+(number1+number2));
		
		scanner.close();
	}

}

