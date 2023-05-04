package com.anand.behavioral.visitor;

public interface ShoppingCartVisitor {
	public double visit(Book book);
	public double visit(Fruit book);
}
	