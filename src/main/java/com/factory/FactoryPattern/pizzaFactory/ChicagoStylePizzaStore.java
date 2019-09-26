package com.factory.FactoryPattern.pizzaFactory;

import com.factory.FactoryPattern.pizzas.ChicagoStyeVeggiePizza;
import com.factory.FactoryPattern.pizzas.ChicagoStyleCheesePizza;
import com.factory.FactoryPattern.pizzas.ChicagoStyleClamPizza;
import com.factory.FactoryPattern.pizzas.ChicagoStylePeperoniPizza;
import com.factory.FactoryPattern.pizzas.Pizza;
import com.factory.FactoryPattern.pizzas.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {

	public Pizza createPizza(String type) {

		Pizza pizza = null;
		if (type.equalsIgnoreCase("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (type.equalsIgnoreCase("pepperoni")) {
			pizza = new ChicagoStylePeperoniPizza();
		} else if (type.equalsIgnoreCase("clam")) {
			pizza = new ChicagoStyleClamPizza();
		} else if (type.equalsIgnoreCase("veggie")) {
			pizza = new ChicagoStyeVeggiePizza();
		}
		return pizza;
	}
}
