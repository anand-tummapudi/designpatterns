package com.anand.behavioral.strategy;

public class Product {
	private String name;
	private String upcCode;
	private double price;
	
	public Product(String name, String upcCode, double price) {
		super();
		this.name = name;
		this.upcCode = upcCode;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public double getPrice() {
		return price;
	}
	
}
