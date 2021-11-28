package de.uni.koeln.sse.se;

public class Information implements Visitor {
	
	public void visitElectronic(Electronic electronic) {
		System.out.println("should be covered with Polyethylene foam film and packed in a box with dimensions: " + electronic.height + "*" + electronic.lenght + "*"+ electronic.width);
	}
	public void visitGlass(Glass glass) {
		System.out.println("should be covered with Bubble wraps packed in a box with dimension : " + glass.height + "*" + glass.lenght + "*" + glass.width);
		
	}
	public void visitFurniture(Furniture furniture) {
		System.out.println(" should be covered with waterproof covers with an area of : " + furniture.lenght +"*"+ furniture.height);
	}

}
