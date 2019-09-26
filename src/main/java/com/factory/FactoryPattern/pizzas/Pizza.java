package com.factory.FactoryPattern.pizzas;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	String name;
	String dough;
	String sauce;
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

	public String getDough() {
		return dough;
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
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
}
