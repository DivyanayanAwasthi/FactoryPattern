package com.factory.FactoryPattern.pizzas;

import com.factory.FactoryPattern.pizzaFactory.PizzaIndegredientFactory;

public class NYStyleCheesePizza extends Pizza {

	PizzaIndegredientFactory pizzaIngridientFactory = null;

	public NYStyleCheesePizza(PizzaIndegredientFactory pizzaIngridientFactory) {
		this.pizzaIngridientFactory = pizzaIngridientFactory;
		System.out.println("Preparing Pizza");
		name = "NY style Cause and Cheese Pizza";
		dough = pizzaIngridientFactory.createDough();
		sauce = pizzaIngridientFactory.createSauce();
		cheese = pizzaIngridientFactory.createCheese();
		toppins.add("Grated Regganio Cheese");
	}

}
