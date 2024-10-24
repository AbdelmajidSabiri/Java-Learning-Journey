package Package;

public class Strings {

	public static void main(String[] args) {
		
		String name = "Ahmed 25 ostora";
		System.out.println("my name is : "+name.toUpperCase());
		
		int taille = name.length();
		System.out.println("le nombre des characters est : "+taille);
		
		String first_name = name.substring(0,5);
		System.out.println("first name is : "+first_name);
		
		String number = name.substring(6,8);
		System.out.println("number is : "+number);

		int result = Integer.parseInt(number);
		
		System.out.println(result);
	}

}
