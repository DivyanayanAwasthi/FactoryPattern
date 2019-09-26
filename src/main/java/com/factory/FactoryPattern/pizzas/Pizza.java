package com.factory.FactoryPattern.pizzas;

import java.util.ArrayList;
import java.util.List;

import com.factory.FactoryPattern.ingridients.Cheese;
import com.factory.FactoryPattern.ingridients.Clams;
import com.factory.FactoryPattern.ingridients.Dough;
import com.factory.FactoryPattern.ingridients.Pepporoni;
import com.factory.FactoryPattern.ingridients.Sauce;
import com.factory.FactoryPattern.ingridients.Veggies;

public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepporoni pepporoni;
	Clams clams;
	List<String> toppins = new ArrayList<>();

	public void box() {
		System.out.println("Place pizza in PizzaStore box");
	}

	public void cut() {
		System.out.println("cuttin the pizza into diagnol slices");
	}

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public List<String> getToppins() {
		return toppins;
	}

	public void setToppins(List<String> toppins) {
		this.toppins = toppins;
	}

	public void prepare() {
		System.out.println("Preparing : " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce ...");
		System.out.println("Adding toppings ..");
		for (int i = 0; i < toppins.size(); i++) {
			System.out.println("  " + toppins.get(i));
		}
	}

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public Veggies[] getVeggies() {
		return veggies;
	}

	public void setVeggies(Veggies[] veggies) {
		this.veggies = veggies;
	}

	public Cheese getCheese() {
		return cheese;
	}

	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	public Pepporoni getPepporoni() {
		return pepporoni;
	}

	public void setPepporoni(Pepporoni pepporoni) {
		this.pepporoni = pepporoni;
	}

	public Clams getClams() {
		return clams;
	}

	public void setClams(Clams clams) {
		this.clams = clams;
	}
}
