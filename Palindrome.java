package Package;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String Word = sc.nextLine();
		String NewWord = "";
		
		
		for(int i = Word.length()-1 ; i>=0 ; i--) {
			NewWord += Word.charAt(i);
		}
		
		if (NewWord.equals(Word)) {
			System.out.println("This word is Palindrome");
		}
		else {
			System.out.println("This word is not Palindrome");
		}
		
		
	}

}
