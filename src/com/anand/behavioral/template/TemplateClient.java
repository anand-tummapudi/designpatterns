package com.anand.behavioral.template;

public class TemplateClient {

	public static void main(String[] args) {

		PizzaTemplate pizza1 = new VegPizza();
		PizzaTemplate pizza2 = new NonVegPizza();
		
		System.out.println("-----------------");
		pizza1.preparePizza();
		
		System.out.println("-----------");
		pizza2.preparePizza();
	}

}
