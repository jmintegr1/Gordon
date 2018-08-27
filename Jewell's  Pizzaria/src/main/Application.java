package main;

public class Application {

	public static void main(String[] args) {
		
		Pizza myPizza = new Pizza();
		Pizza jewellsPizza = new Pizza();
		Pizza moesPizza = new Pizza("mushrooms", 16.0, "large", true);
		
		System.out.println("Jewell's pizza is " + myPizza.getTopping() + " and its " 
				+ myPizza.getSize());
		
		System.out.println("Joe's pizza is " + myPizza.getTopping() + " and its for " 
				+ myPizza.isTakeOut());
		System.out.println("Moe's pizza is " + myPizza.getTopping() + " and it cost"
				+ " " 
				+ myPizza.getPrice());
	}

}
