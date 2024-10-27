package Package;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Double> number = new ArrayList<>();
		
		for(int i = 0 ; i<10 ; i++) {
			System.out.print("Enter number "+i+" : ");
			number.add(sc.nextDouble());
		}
		
		Double max = number.get(0);
		Double min = number.get(0);
		
		for (int i = 0 ; i<10 ; i++) {
			if (number.get(i) > max) {
				max = number.get(i);
			}
			
			else if (number.get(i) < min) {
				min  = number.get(i);
			}
		}
		
		
		System.out.println("MAX : "+max);
		System.out.println("MIN : "+min);
		
	}

}
