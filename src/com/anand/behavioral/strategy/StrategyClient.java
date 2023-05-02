package com.anand.behavioral.strategy;

public class StrategyClient {
	
	public static void main(String args[]) {
		
		ShoppingCart shoppingCart = new ShoppingCart();
		
		Product product1 = new Product("Snacks","S123",23.45);
		Product product2 = new Product("Drinks","S342",47.45);
		Product product3 = new Product("smoothy","S456",53.45);
		
		shoppingCart.addProduct(product1);
		shoppingCart.addProduct(product2);
		shoppingCart.addProduct(product3);
		
		//shoppingCart.payment(new CreditCard("Anand", "527355273", "213", "0329"));
		shoppingCart.payment(new PayPal("anandcart@gmail.com", "anan3232"));
	}

}
