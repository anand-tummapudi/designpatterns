package com.anand.behavioral.template;

public class NonVegPizza extends PizzaTemplate {

	@Override
	public void selectBread() {
		System.out.println("#### Selecting Bread for Non Veg Pizza....");
	}

	@Override
	public void addIngredients() {
		System.out.println("#### Adding Ingredients to Non Veg pizza...");
	}
	
}
