package Exercice3;


public class Exercice1_1 {
	
	private static int lasIdentifier = 0;
	private final int identifier;
	
	
	public Exercice1_1() {
		lasIdentifier++;
		this.identifier= lasIdentifier;
	}
	
	public void getIden() {
		System.out.println("Identifier of this object is : "+identifier);
	}
	
	public void getIdentMax() {
		System.out.println("lastIdentifier in this class is : "+lasIdentifier);
	}
	
	
	public static void main(String[] args) {
		Exercice1_1 test = new Exercice1_1();
		test.getIden();
		Exercice1_1 test2 = new Exercice1_1();
		test2.getIden();
		Exercice1_1 test3 = new Exercice1_1();
		test3.getIden();
		test.getIden();
		test.getIdentMax();



	}
}
