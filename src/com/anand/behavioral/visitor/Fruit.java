package com.anand.behavioral.visitor;

public class Fruit implements Item {

	private String name;
	private int weight;
	private double price;
	
	public Fruit(String name, int weight, double price) {
		super();
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public double accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}
	
}
