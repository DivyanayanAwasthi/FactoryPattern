package com.factory.FactoryPattern.pizzaFactory;

import com.factory.FactoryPattern.pizzas.Pizza;
import com.factory.FactoryPattern.pizzas.PizzaStore;

public class PizzaTestDrive {

	Pizza pizza = null;

	public void orderPizza() {
		PizzaStore nyStore = new NYStylePizzaStore();
		pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a  - "+pizza.getName()+" pizza");
		PizzaStore californiaStore = new CaliforniaStylePizzaStore();
		californiaStore.orderPizza("pepperoni");
		System.out.println("Lokesh  ordered a  - "+pizza.getName()+" pizza");

	}
}
