package Package;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("tajin");
		food.add("bisara");
		
		food.set(0, "sushi");
//		food.remove(2);
//		food.clear();
		
		

		for (int i = 0; i<food.size();i++) {
			System.out.println(food.get(i));
		}
	}

}
