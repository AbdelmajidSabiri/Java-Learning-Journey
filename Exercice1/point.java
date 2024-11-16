package Exercice1;

public class point {
	
	String name;
	double abscisse;
	
	public point(String name, double abscisse) {
		this.name = name;
		this.abscisse = abscisse;
	}
	
	public void affiche() {
		System.out.println("Nom du point : "+this.name);
		System.out.println("Abscisse du point est : "+this.abscisse);
	}
	
	public void translate(double value) {
		this.abscisse += value;
	}
}
