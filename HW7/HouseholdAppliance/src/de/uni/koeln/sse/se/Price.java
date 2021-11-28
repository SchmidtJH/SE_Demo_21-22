package de.uni.koeln.sse.se;

public class Price implements Visitor {
	
	public double price; 
	
	public void visitGlass(Glass glass){
		if (glass.tickness <= 1) {
			price = glass.lenght * 2;
		}
		else if ( glass.tickness <= 2) {
			price = glass.lenght * 1.2;
		}
		else {
			price = glass.lenght * 0.7;
		}
	System.out.println("The price for "+ glass.name + "is "+ price + "€");
	}
	
	public void visitFurniture(Furniture furniture) {
		price = furniture.weight*5/20;
		System.out.println("The price for "+ furniture.name + "is "+ price + "€");
	}
	
	public void visitElectronic(Electronic electronic) {
		if (electronic.fragile = true) {
			price = electronic.weight * 5/10; 
		}
		else { price = electronic.weight * 5/15;
		}
		System.out.println("The price for "+ electronic.name +"is "+ price + "€");
	}
	

}
