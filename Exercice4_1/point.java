package Exercice4_1;

public class point {

	public point(int abs, int ord) { 
		x = abs ; 
		y = ord ; 
	} 
	
	public void affiche (){  
	System.out.println ("Coordonnees " + x + " " + y) ; 
	} 
	private double x ;
	private double y ;
	
	public point maxNorm(point point1, point point2) {
		
		if ( Math.sqrt(Math.pow(point1.x,2)+Math.pow(point1.y, 2)) > Math.sqrt(Math.pow(point2.x,2)+Math.pow(point2.y, 2))) {
			return point1;
		}
		else return point2;
	}
	
	public static void main(String[] args){
		point point1 = new point(6,1);
		point point2 = new point(3,2);
		
		point1.maxNorm(point1, point2).affiche();
		
	}
	
	
}
