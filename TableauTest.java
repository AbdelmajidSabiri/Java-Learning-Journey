package Package;

import java.util.Scanner;

public class TableauTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter le nomber des lignes : ");
		int lignes = sc.nextInt();
		
		System.out.print("Enter le nomber des colones : ");
		int colones = sc.nextInt();
		
		int [][] TableMulti = new int[lignes][colones];
		
		
		for (int i = 0; i<lignes ; i++) {
			
			for(int j = 0; j<colones ; j++) {
				
				System.out.print("Entrer valeur de element ["+(i+1)+"]"+"["+(j+1)+"] : ");
				TableMulti[i][j] = sc.nextInt();

			}
			
		}
		
        System.out.println("la Table avant :");
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colones; j++) {
                System.out.print(TableMulti[i][j] + " ");
            }
            System.out.println();
        }
		
		
		for (int i = 1; i<lignes ; i++) {
			
			for(int j = 1 ; j<colones ; j++) {
								
				TableMulti[i][j] = TableMulti[0][j] * TableMulti[i][0];
			}
		}
		
		
        System.out.println("la Table apres est :");
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colones; j++) {
                System.out.print(TableMulti[i][j] + " ");
            }
            System.out.println();
        }
		
	}

}
