package com.anand.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class StockBroaker {
	
	private List<Order> orderList = new ArrayList<>();
	
	public void placeOrder(Order order) {
		orderList.add(order);
	}
	
	public void executeOrder() {
		for(Order order:orderList) {
			order.execute();
		}
		
		orderList.clear();
	}

}
