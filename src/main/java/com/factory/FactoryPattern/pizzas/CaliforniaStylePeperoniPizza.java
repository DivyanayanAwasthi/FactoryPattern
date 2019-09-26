package com.factory.FactoryPattern.pizzas;

import com.factory.FactoryPattern.pizzaFactory.PizzaIndegredientFactory;

public class CaliforniaStylePeperoniPizza extends Pizza {
	
	PizzaIndegredientFactory pizzaIndegredientFactory=null;
	public CaliforniaStylePeperoniPizza(PizzaIndegredientFactory pizzaIndegredientFactory) {
		this.pizzaIndegredientFactory=pizzaIndegredientFactory;
		name = "California style Pepporoni Pizza";
		dough = pizzaIndegredientFactory.createDough();
		sauce = pizzaIndegredientFactory.createSauce();
		toppins.add("Grated Regganio Cheese");
	}
	
	public void cut() {
		System.out.println("cutting the pizza into square slices");
	}
}
