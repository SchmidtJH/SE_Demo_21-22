package de.uni.koeln.sse.se;


public interface Visitor {

	public void visitElectronic(Electronic electronic);
	public void visitFurniture(Furniture furniture);
	public void visitGlass(Glass glass);
	
	
}