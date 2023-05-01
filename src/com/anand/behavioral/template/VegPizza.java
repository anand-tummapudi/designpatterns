package com.anand.behavioral.template;

public class VegPizza extends PizzaTemplate {

	@Override
	public void selectBread() {
		System.out.println("#### Selecting Bread....");
	}

	@Override
	public void addIngredients() {
		System.out.println("#### Adding Ingredients to pizza...");
	}
	
}
