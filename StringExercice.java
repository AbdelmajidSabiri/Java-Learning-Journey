package Package;

public class StringExercice {

	public static void main(String[] args) {
		
		String name = "Ahmed";
		
		for (int i = 0;i<name.length(); i++) {
			
			char letter = name.charAt(i);
			String letterUpper = String.valueOf(letter).toUpperCase();
			System.out.println(letterUpper);
		}
	}

}
