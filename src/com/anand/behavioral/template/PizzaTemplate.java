package com.anand.behavioral.template;

public abstract class PizzaTemplate {
	
	public abstract void selectBread();
	public abstract void addIngredients();
	
	public void cooking() {
		System.out.println("#### Cooking Pizza.....");
	}
	
	public void addToppings() {
		System.out.println("#### Add toppings in pizza....");
	}
	
	public final void addCheese() {
		System.out.println("#### Adding Cheese....");
	}
	
	public final void preparePizza() {
		selectBread();
		addIngredients();
		cooking();
		addToppings();
		addCheese();
	}

}
