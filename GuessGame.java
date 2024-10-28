package Package;

import java.util.Scanner;
import java.util.Random;

public class GuessGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Guess a number between 1 and 100 : ");
		int userGuess = sc.nextInt();
	
		int randomNumber = rand.nextInt(100) + 1; 
		
		while(userGuess != randomNumber) {
			
			if(userGuess<randomNumber) {
				System.out.println("Too low !!!");
			}
			
			else if (userGuess>randomNumber) {
				System.out.println("Too hight !!!");
			}
			
			System.out.print("Give it an other try : ");
			userGuess = sc.nextInt();
			
		}
		
		System.out.println("YOU ARE RIIIIIIIIGHT WIIIIIIIIIIIIIII CONGRAAATE");
	}

}
