package com.anand.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> productList;
	
	public ShoppingCart() {
		productList = new ArrayList<>();	
	}
	
	public void addProduct(Product product) {
		productList.add(product);
		
	}
	
	public void removeProduct(Product product) {
		productList.remove(product);
		
	}
	
	private double calculateTotalPrice() {
		double total = 0.0;
		total = productList.stream().map(p->p.getPrice()).reduce(0.0,Double::sum);
		return total;
	}
	
	public void payment(PaymentMethod paymentMethod) {
		paymentMethod.pay(calculateTotalPrice());
	}
}
