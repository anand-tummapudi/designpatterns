package com.anand.behavioral.visitor;

public class Book implements Item {
	
	private String name;
	private String isbnNumber;
	private double price;
	
	
	public Book(String name, String isbnNumber, double price) {
		super();
		this.name = name;
		this.isbnNumber = isbnNumber;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getIsbnNumber() {
		return isbnNumber;
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
		return "Book [name=" + name + ", isbnNumber=" + isbnNumber + ", price=" + price + "]";
	}
	

}
