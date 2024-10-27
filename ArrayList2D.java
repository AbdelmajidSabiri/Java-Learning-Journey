package Package;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2D {

	public static void main(String[] args) {
		
		ArrayList<String> bakeryList = new ArrayList<>();
		
		bakeryList.add("les pattes");
		bakeryList.add("bisara");
		bakeryList.add("serdiiiin");
		
		ArrayList<String> produceList = new ArrayList<>(Arrays.asList("maticha", "tfa7","l33333ds"));
		ArrayList<String> drinkList = new ArrayList<>(Arrays.asList("jotis hh","lbostan hh","palpy"));
		
		System.out.println(produceList);
		System.out.println(drinkList);
		System.out.println(bakeryList);

		ArrayList<ArrayList<String>> T9dyaAjmi = new ArrayList<>(Arrays.asList(bakeryList,produceList,drinkList));
		T9dyaAjmi.add(produceList);
		System.out.println(T9dyaAjmi);
		
		// A7san okla (hh la kdab makanaklhach)
		System.out.println(T9dyaAjmi.get(0).get(1));
		
		
	}

}
