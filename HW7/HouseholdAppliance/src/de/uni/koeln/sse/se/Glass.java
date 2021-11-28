package de.uni.koeln.sse.se;

public class Glass implements HouseholdItem{
	
	String name;
	int lenght;
	int width;
	int height;

	int tickness;
	Price price;
	Information information;

	
	public Glass(String name, int lenght, int width, int height, int tickness, Price price,Information information) {
		this.name = name;
		this.lenght = lenght;
		this.width = width;
		this.height = height;
		this.tickness = tickness;
		this.price = price; 
		this.information = information;
		accept(price);
		accept(information);
	
	}



//Getters and Setters =

	public int getHeight() {
		return height;}

	public void setHeight(int height) {
		this.height = height;}

	public int getLenght() {
		return lenght;}

	public void setLenght(int lenght) {
		this.lenght = lenght;}

	public int getWidth() {
		return width;}

	public void setWidth(int width) {
		this.width = width;}

	public Integer getTickness() {
		return tickness;}

	public void setTickness(int tickness) {
		this.tickness = tickness;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
 
    public double getCost() {
        if(tickness == 1) {
            return lenght*2;
        }else if(tickness == 2) {
            return lenght*1.2;
        }else if(tickness == 3) {
            return lenght*0.7;
        }
        return 0;
    }

    
	public void accept(Visitor visitor) {
		visitor.visitGlass(this);
		
	}


}
