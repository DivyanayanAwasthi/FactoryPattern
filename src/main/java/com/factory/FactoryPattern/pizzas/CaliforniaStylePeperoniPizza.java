package com.factory.FactoryPattern.pizzas;

public class CaliforniaStylePeperoniPizza extends Pizza {

	public CaliforniaStylePeperoniPizza() {
		name = "California style Pepporoni Pizza";
		dough = "Thick Curst Dough";
		sauce = "Mariana sauce";
		toppins.add("Grated Regganio Cheese");
	}
	
	public void cut() {
		System.out.println("cutting the pizza into square slices");
	}
}
