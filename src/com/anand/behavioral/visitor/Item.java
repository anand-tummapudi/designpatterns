package com.anand.behavioral.visitor;

public interface Item {
	
	public double accept(ShoppingCartVisitor visitor);

}
