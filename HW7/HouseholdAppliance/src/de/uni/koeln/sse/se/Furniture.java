package de.uni.koeln.sse.se;

public class Furniture implements HouseholdItem{
	
	String name;
	String type;


	int lenght;
	int width;
	int height;
	
	int weight;
	Price price;
	Information information;

	
	public Furniture(String name, String type, int lenght, int width, int height, int weight, Price price, Information information) {
		this.name = name;
		this.type = type;
		this.lenght = lenght;
		this.width = width;
		this.height = height;
		this.weight = weight;
		
		this.price = price; 
		this.information = information;
		accept(price);
		accept(information);
	
	}


	

//Getters and Setters



	public int getHeight() {
		return height;}

	public void setHeight(Integer height) {
		this.height = height;}

	public int getLenght() {
		return lenght;}

	public void setLenght(Integer lenght) {
		this.lenght = lenght;}

	public int getWidth() {
		return width;	}

	public void setWidth(Integer width) {
		this.width = width;}

	public int getWeight() {
		return weight;}

	public void setWeight(Integer weight) {
		this.weight = weight;}

	public String getType() {
		return type;}

	public void setType(String type) {
		this.type = type;}

	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}
	
	public double getCost(){
        return weight*0.25;
    }

	
	public void accept(Visitor visitor) {
		visitor.visitFurniture(this);
	}
	
}
