package Package;

import java.util.Scanner;

public class arrayExercice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter combien de valeure : ");
		int number = sc.nextInt();
		
		int[] tab = new int[number];
		int j=0;
		
		
		for (int i = 1 ; i<=(number +number -1) ; i += 2) {
			
			tab[j] = (int)Math.pow(i,2);
			j++;
		}
		
		
		j = 0;
		for(int i = 1 ; i<=number+number-1 ; i += 2) {
			System.out.println(i+" a pour carre : "+tab[j]);
			j++;
		}
		
	}

}
