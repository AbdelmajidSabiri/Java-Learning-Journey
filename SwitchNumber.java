package Package;

import java.util.Scanner;

public class SwitchNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		String Number = sc.nextLine();
		String NewNumber = "";
		
		for (int i = Number.length(); i>0; i--) {
			NewNumber += Number.substring(i-1, i);
		}
		
		System.out.println("Le nomber apres switch : "+NewNumber);
		
	}

}
