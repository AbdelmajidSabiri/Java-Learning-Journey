package Exercice4;

import java.util.Scanner;

public class Ackermann {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n : ");
		int n = sc.nextInt();
		
		System.out.print("Enter m : ");
		int m = sc.nextInt();

		int result = ackermanMethod(n,m);
		System.out.println("result is : "+result);
		
	}
	
	public static int ackermanMethod(int m, int n) {
		if(m==0) {
			return n+1;
		}
		
		else if (n == 0){
			return ackermanMethod(m-1,1);
		}

		else{
			return ackermanMethod(m-1 , ackermanMethod(m, n-1));
		}
		
	}

}
