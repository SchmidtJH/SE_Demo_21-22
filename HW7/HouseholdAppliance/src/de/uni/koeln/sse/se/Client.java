package de.uni.koeln.sse.se;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client{
	
public static void main(String[] args) {
		

		//Initialise some household
		List<HouseholdItem> householdItmes= new ArrayList<>();
		
		Price price = new Price();
		Information information = new Information();

		
		Electronic microwaveOven= new Electronic("Microwave Oven",37, 48, 27, 13, false, price, information);
		Electronic tv= new Electronic("TV",122, 73, 15, 18, true, price, information);
		
		Glass wineGlass= new Glass("Wine glasses",33,28,23,1,price, information);
		Glass coffeeTable= new Glass("Glass Coffee Table ",80,80,45,3, price, information);

		
		Furniture bed= new Furniture("Bed", "Metal", 205, 91, 94, 26,price, information);
		Furniture cupboard= new Furniture("Bookshelf", "Wood", 60, 31, 190, 25,price, information);
		
		
        List<HouseholdItem> namesList = Arrays.asList(microwaveOven,tv,wineGlass,coffeeTable,bed,cupboard );
        householdItmes.addAll(namesList);
        
        
		
  
}

}
