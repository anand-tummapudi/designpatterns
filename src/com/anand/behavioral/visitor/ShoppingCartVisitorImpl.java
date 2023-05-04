package com.anand.behavioral.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{

	@Override
	public double visit(Book book) {
		double cost = 0.0;
		if(book.getPrice()>500) {
			cost = book.getPrice()-100;
		}else {
			cost = book.getPrice();
		}
		System.out.println(book);
		return cost;
	}

	@Override
	public double visit(Fruit fruit) {
		double cost = 0.0;
		cost = fruit.getPrice()*fruit.getWeight();
				System.out.println(fruit);
		return cost;
	}

}
