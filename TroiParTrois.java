package Package;

import java.util.Scanner;

public class TroiParTrois {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter max number : ");
		int number  = sc.nextInt();
		int columnNumber = 0;
		
		for (int i = 0 ; i<number ; i++) {

			for (int j = i ; j<=i+3 ; j++) {
			System.out.print(j+"  ");
			}
			i+=3;
			System.out.println();
		}
	}

}
