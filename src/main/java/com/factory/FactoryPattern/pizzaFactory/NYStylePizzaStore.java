package com.factory.FactoryPattern.pizzaFactory;

import com.factory.FactoryPattern.pizzas.NYStyleCheesePizza;
import com.factory.FactoryPattern.pizzas.NYStyleClamPizza;
import com.factory.FactoryPattern.pizzas.NYStylePeperoniPizza;
import com.factory.FactoryPattern.pizzas.NYStyleVeggiePizza;
import com.factory.FactoryPattern.pizzas.Pizza;
import com.factory.FactoryPattern.pizzas.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {

	public Pizza createPizza(String type) {

		Pizza pizza = null;
		PizzaIndegredientFactory pizzaIngridientFactory=new NYPizzaIndgredientFactory();
		if (type.equalsIgnoreCase("cheese")) {
			pizza = new NYStyleCheesePizza(pizzaIngridientFactory);
		} else if (type.equalsIgnoreCase("pepperoni")) {
			pizza = new NYStylePeperoniPizza();
		} else if (type.equalsIgnoreCase("clam")) {
			pizza = new NYStyleClamPizza();
		} else if (type.equalsIgnoreCase("veggie")) {
			pizza = new NYStyleVeggiePizza();
		}
		return pizza;
	}
}
