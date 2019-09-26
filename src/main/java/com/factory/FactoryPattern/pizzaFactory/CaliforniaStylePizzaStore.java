package com.factory.FactoryPattern.pizzaFactory;

import com.factory.FactoryPattern.pizzas.CaliforniaStyeVeggiePizza;
import com.factory.FactoryPattern.pizzas.CaliforniaStyleCheesePizza;
import com.factory.FactoryPattern.pizzas.CaliforniaStyleClamPizza;
import com.factory.FactoryPattern.pizzas.CaliforniaStylePeperoniPizza;
import com.factory.FactoryPattern.pizzas.Pizza;
import com.factory.FactoryPattern.pizzas.PizzaStore;

public class CaliforniaStylePizzaStore extends PizzaStore {

	public Pizza createPizza(String type) {

		Pizza pizza = null;
		if (type.equalsIgnoreCase("cheese")) {
			pizza = new CaliforniaStyleCheesePizza();
		} else if (type.equalsIgnoreCase("pepperoni")) {
			pizza = new CaliforniaStylePeperoniPizza();
		} else if (type.equalsIgnoreCase("clam")) {
			pizza = new CaliforniaStyleClamPizza();
		} else if (type.equalsIgnoreCase("veggie")) {
			pizza = new CaliforniaStyeVeggiePizza();
		}
		return pizza;
	}
}
