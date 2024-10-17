package Package;

import java.util.Scanner;

public class Matrice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter le nomber des lignes : ");
		int lignes = sc.nextInt();
		
		System.out.print("Enter le nomber des colones : ");
		int colones = sc.nextInt();
		
		int[][] matrice = new int[lignes][colones];
		
		for (int i = 0; i<lignes ; i++) {
			
			for(int j = 0; j<colones ; j++) {
				
				System.out.print("Entrer valeur de element ["+(i+1)+"]"+"["+(j+1)+"] : ");
				matrice[i][j] = sc.nextInt();

			}
			
		}
		
        System.out.println("la matrice est :");
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colones; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
		
		
		
		
		int[] position = new int[2];
		position[0]=0;
		position[1]=0;
		
		int somme = 0;
		
		int[] PP1 = new int[2];
		int[] PP2 = new int[2];
		int[] PP3 = new int[2];

		
		for (int i = 0; i<lignes ; i++) {
			
			for(int j = 0; j<colones ; j++) {
				
				if (i+1 <= (lignes -1)) {
					PP1[0] = i+1;
					PP1[1] = j;
				}
				
				if (j+1 <= (colones -1)) {
					PP2[0] = i;
					PP2[1] = j+1;
				}

				PP3[0] = i+1;
				PP3[1] = j+1;
				
				
				int[] PPchoisi = new int[2];
				
				int Max = matrice[PP1[0]][PP1[1]];
				PPchoisi[0]=PP1[0];
				PPchoisi[1] = PP1[1];
				
				if (Max <= matrice[PP2[0]][PP2[1]]){
					Max = matrice[PP2[0]][PP2[1]];
					PPchoisi[0]=PP2[0];
					PPchoisi[1] = PP2[1];
				}
				
				if (Max <= matrice[PP3[0]][PP3[1]]){
					Max = matrice[PP3[0]][PP3[1]];
					PPchoisi[0]=PP2[0];
					PPchoisi[1] = PP2[1];
				}
			
				
				System.out.println(Max);
				
				i = PPchoisi[0];
				j = PPchoisi[1];
				
				
			{
					
		}
		
		
			}
		}
	}

}