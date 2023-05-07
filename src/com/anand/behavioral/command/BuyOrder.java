package com.anand.behavioral.command;

public class BuyOrder implements Order {
	
	private Stock stock;
	
	public BuyOrder(Stock stock) {
		super();
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buyStock();
	}

}
