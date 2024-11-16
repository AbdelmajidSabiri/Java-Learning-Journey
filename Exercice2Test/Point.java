package Exercice2Test;

public class Point { 
	public Point (int abs, int ord) { 
		x = abs ; 
		y = ord ; 
	} 
	
	public void deplace (int dx, int dy) { 
		x += dx ; 
		y += dy ; 
	} 
	
	void abscisse() {
		System.out.println("L'abscisse de ce point est : "+x);
	}
	
	void ordonnee() {
		System.out.println("L'ordonnee de ce point est : "+y);
	}
	
	private double x ; 
	private double y ; 
	
	
} 


