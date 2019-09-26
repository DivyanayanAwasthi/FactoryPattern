package com.factory.FactoryPattern.pizzaFactory;

import com.factory.FactoryPattern.ingridients.Cheese;
import com.factory.FactoryPattern.ingridients.Clams;
import com.factory.FactoryPattern.ingridients.Dough;
import com.factory.FactoryPattern.ingridients.FreshClams;
import com.factory.FactoryPattern.ingridients.FrozenClams;
import com.factory.FactoryPattern.ingridients.MarinaraSauce;
import com.factory.FactoryPattern.ingridients.Pepporoni;
import com.factory.FactoryPattern.ingridients.RegganioCheese;
import com.factory.FactoryPattern.ingridients.Sauce;
import com.factory.FactoryPattern.ingridients.SlicePepporoni;
import com.factory.FactoryPattern.ingridients.ThinCurstDough;

public class CaliforniaPizzaIndgredientFactory implements PizzaIndegredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCurstDough();
	}

	@Override
	public Sauce createSauce() {

		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {

		return new RegganioCheese();
	}

	@Override
	public Pepporoni createPeporoni() {

		return new SlicePepporoni();
	}

	@Override
	public Clams createClams() {
		return new FrozenClams();
	}

}
