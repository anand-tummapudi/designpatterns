package com.anand.behavioral.command;

public class CommandClient {

	public static void main(String[] args) {
		
		Stock stock = new Stock();
		
		BuyOrder buyOrder = new BuyOrder(stock); 
		SellOrder sellOrder = new SellOrder(stock);
		
		StockBroaker stockBroaker = new StockBroaker();
		stockBroaker.placeOrder(buyOrder);
		stockBroaker.placeOrder(sellOrder);
		
		stockBroaker.executeOrder();
	}

}
