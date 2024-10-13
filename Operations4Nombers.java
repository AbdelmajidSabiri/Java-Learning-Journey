package Package;
import java.util.Scanner;
public class Operations4Nombers {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number : ");
		float Number1 = scanner.nextFloat();
		
		System.out.print("Enter second number : ");
		float Number2= scanner.nextFloat();
		
		System.out.print("Enter third number : ");
		float Number3 = scanner.nextFloat();
		
		System.out.print("Enter fourth number : ");
		float Number4 = scanner.nextFloat();
		
		
		System.out.println("Le max de ces nombres est : "+Math.max(Math.max(Math.max(Number1, Number2), Number3), Number4));
		System.out.println("Le min de ces nombres est : "+Math.min(Math.min(Math.min(Number1, Number2), Number3), Number4));
		System.out.println("le moyenne de ces nombres : "+(Number1 + Number2 + Number3 + Number4)/4);
		
		
		scanner.close();
	}

}
