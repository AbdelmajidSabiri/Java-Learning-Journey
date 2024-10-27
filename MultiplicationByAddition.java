package Package;

import java.util.Scanner;

public class MultiplicationByAddition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Frist number : ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter Second number : ");
		int number2 = sc.nextInt();
		
		int result = 0;
		
		for (int i = 0 ; i<number1 ; i++) {
			result += number2;
		}
		
		
		System.out.print(number1+" * "+number2+"= "+result);
		
	}

}
