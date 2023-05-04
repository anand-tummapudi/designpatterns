package com.anand.behavioral.visitor;

public class VisitorClient {

	public static void main(String[] args) {
		
		Item items[] = new Item[]{
			new Book("Java Full Stack","42422",445.25),
			new Book("Angular","837382",523.25),
			new Fruit("Apple",2,100),
			new Fruit("Orange",5,200)
		};
		
		double totalCost = calculateTotalCost(items);
		
		System.out.println("Total Cost of the Cart:"+totalCost);
	}

	private static double calculateTotalCost(Item[] items) {
		
		ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitorImpl();
		double totalCost = 0.0;
		
		for(Item item:items) {
			totalCost += item.accept(shoppingCartVisitor); 
		}
		return totalCost;
	}

}
