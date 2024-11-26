package Exercice5;

public class point { 
	
	public point (int x, int y) { 
		this.x = x ;
		this.y = y ; 
	} 
	
	public void affCoord() { 
		System.out.println ("Coordonnees : " + x + " " + y) ; 
	} 
	
	public int x, y ; 
	
	
	public static void main(String[] args) {
		point point1 = new point(3,4);
		System.out.println(point1.x);
	}
	
	
    protected int getX() {
        return x;
    }

    protected int getY() {
        return y;
    }
} 