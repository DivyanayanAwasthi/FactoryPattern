package com.factory.FactoryPattern.pizzaFactory;

import com.factory.FactoryPattern.ingridients.Cheese;
import com.factory.FactoryPattern.ingridients.Clams;
import com.factory.FactoryPattern.ingridients.Dough;
import com.factory.FactoryPattern.ingridients.Pepporoni;
import com.factory.FactoryPattern.ingridients.Sauce;
import com.factory.FactoryPattern.ingridients.Veggies;

public interface PizzaIndegredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
//	public Veggies[] createVegies();
	public Pepporoni createPeporoni();
	public Clams createClams();
}
