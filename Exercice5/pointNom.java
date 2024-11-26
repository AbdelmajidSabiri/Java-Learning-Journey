package Exercice5;

public class pointNom extends point{
	
    private char nom;
    
    public pointNom(int x, int y, char nom) {
        super(x, y);
        this.nom = nom;
    }
    
    public void affCoordNom() {
        System.out.println("Nom : " + nom + ", Coordonnees : " + getX() + " " + getY());
    }
}
