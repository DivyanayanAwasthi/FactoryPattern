package com.factory.FactoryPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.factory.FactoryPattern.pizzaFactory.PizzaTestDrive;

@SpringBootApplication
public class FactoryPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryPatternApplication.class, args);
		run();
	}
	
	public static void run() {
	
		PizzaTestDrive shop=new PizzaTestDrive();
		shop.orderPizza();
	}
}
