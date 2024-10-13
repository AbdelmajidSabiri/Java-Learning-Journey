package Package;

import java.util.Scanner;

public class MathFunctions {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter un Nomber : ");
		float number = scanner.nextFloat();
		scanner.nextLine();
		
		String UserChoise = "";
		
		System.out.println("Quelle opération voulez-vous faire ?\n"
			    + "P : pour puissance\n"
			    + "SQRT : pour la racine carree\n"
			    + "sin : pour la fonction sinus\n"
			    + "cos : pour la fonction cosinus\n"
			    + "tan : pour la fonction tangante\n"
			    + "Round : pour arrondir un nombre\n"
			    + "Abs : pour la valeur absolue\n"
			    + "Exp : pour la fonction exponentiele (e^x)\n"
			    + "Log : pour le logarithme \n"
			    + "Max : pour trouver le maximum de deux nombres\n"
			    + "Min : pour trouver le minimum de deux nombres\n"
			    + "Random : pour generer un nombre aleatoire\n"
			    + "Q : Quitter le programm");
		
		
		do {
			System.out.println("-----------------------------------------");
			System.out.print("Enter operation : ");
			UserChoise = scanner.nextLine();
			
			if (UserChoise.equals("pow")) {
				System.out.print("Enter la valeur de puissance : ");
				int puissance = scanner.nextInt();
				System.out.println("Resultat de " +number+ "^"+puissance+" Est : "+Math.pow(number, puissance));
				scanner.nextLine();
			}
			
			else if(UserChoise.equals("sqrt")) {
				System.out.println("Resultat de racine carree de " +number+" Est : "+Math.sqrt(number));
			}
			
			else if(UserChoise.equals("sin")) {
				System.out.println("Resultat de sin de " +number+" Est : "+Math.sin(number));
			}
			
			else if(UserChoise.equals("cos")) {
				System.out.println("Resultat de cos de " +number+" Est : "+Math.cos(number));
			}
			
			else if(UserChoise.equals("tan")) {
				System.out.println("Resultat de tan de " +number+" Est : "+Math.tan(number));
			}
			
			else if(UserChoise.equals("round")) {
				System.out.println("Resultat d'arrondissement de " +number+" Est : "+Math.round(number));
			}
			
			else if(UserChoise.equals("abs")) {
				System.out.println("Resultat de valeur absolue de " +number+" Est : "+Math.abs(number));
			}
			
			else if(UserChoise.equals("exp")) {
				System.out.println("Resultat de l'exponentielle de " +number+" Est : "+Math.exp(number));
			}
			
			else if(UserChoise.equals("log")) {
				System.out.println("Resultat de logarithm de " +number+" Est : "+Math.log(number));
			}
			
			else if(UserChoise.equals("max")) {
				System.out.print("Enter seconde number : ");
				float number2 = scanner.nextFloat();
				System.out.println("Resultat de max enter " +number+" et "+number2+" Est : "+Math.max(number,number2));
				scanner.nextLine(); 
			}
			
			else if(UserChoise.equals("min")) {
				System.out.print("Enter seconde number : ");
				float number2 = scanner.nextFloat();
				System.out.println("Resultat de max enter " +number+" et "+number2+" Est : "+Math.min(number,number2));
				scanner.nextLine(); 
			}
			
			else if(UserChoise.equals("random")) {
			    System.out.println("Entrez les bornes de l'intervalle dans lequel vous voulez generer un nombre aleatoire");
			    System.out.print("1ere Borne : ");
			    float borne1 = scanner.nextFloat();
			    
			    System.out.print("2eme Borne : ");
			    float borne2 = scanner.nextFloat();
			    
			
			    float randomNumber = borne1 + (float)Math.random() * (borne2 - borne1);
			    System.out.println("Nombre aleatoire genere : " + randomNumber);
			}

			
			
		} while (!UserChoise.equals("Q"));

		
	}

}
