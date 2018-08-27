package main;

public class Pizza {

	private Pizza() {         //Since it's default constructor, it does not need this. (dot) like the below 
		topping = "cheese";  //constructor with parameters does need this. (dot)
		price = 16.0;
		size = "large";
		takeOut = true;	
	}
		//This constructor takes all parameters therefore it starts with this. (dot)
	public Pizza(String topping, double price, String size, boolean takeOut) {
		this.topping = topping;
		this.price = price;
		this.size = size;
		this.takeOut = takeOut;
	}
	
	String topping; 
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
		
	}
	public boolean isTakeOut() {
		return takeOut;
	}
	public void setTakeOut(boolean takeOut) {
		this.takeOut = takeOut;
	}
	double price; 
	String size; 
	boolean takeOut = true; 
}
