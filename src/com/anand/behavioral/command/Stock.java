package com.anand.behavioral.command;

public class Stock {
	
	private String stockName = "Apple share";
	private int quantity = 20;
	
	public void buyStock() {
		System.out.println("Stock - "+stockName+" and Quantity "+quantity+" bought");
	}
	
	public void sellStock() {
		System.out.println("Stock - "+stockName+" and Quantity "+quantity+" sold");
	}
	

}
