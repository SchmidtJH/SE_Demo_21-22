package de.uni.koeln.sse.se;

public class Electronic implements HouseholdItem{
	
	String name;
	
	int lenght;
	int width;
	int height;

	int weight;
	
	Boolean fragile;
	Price price;
	Information information;


	public Electronic(String name, int lenght, int width, int height, int weight, Boolean fragile, Price price, Information information) {
		this.name = name;
		this.lenght = lenght;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.fragile = fragile;
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
		return width;}

	public void setWidth(Integer width) {
		this.width = width;}

	public Integer getWeight() {
		return weight;}

	public void setWeight(Integer weight) {
		this.weight = weight;}

	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}
	
	public Boolean getFragile() {
		return fragile;}

	public void setFragile(Boolean fragile) {
		this.fragile = fragile;}
	
	public double getCost() {
		return fragile? weight*0.5 : weight/3;
	}
	public void packingInformation() {
		System.out.println("should be covered with Polyethylene foam and packed in a box with dimension" + + this.lenght + this.width + this.height);
	}
	
	public void accept(Visitor visitor) {
		visitor.visitElectronic(this);
	}

}
