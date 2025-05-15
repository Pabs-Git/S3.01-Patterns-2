package org.example.classes;

import org.example.interfaces.PizzaBuilder;

import java.util.List;

public class PizzaMaster {

	public void buildVegetarianPizza(PizzaBuilder builder) {
		builder.setSize("Medium");
		builder.setDough("Thin crust");
		builder.setToppings(List.of("Cheese", "Tomato", "Olives"));
	}

	public void buildHawaiianPizza(PizzaBuilder builder) {
		builder.setSize("Large");
		builder.setDough("Thick crust");
		builder.setToppings(List.of("Ham", "Pineapple"));
	}

	public Pizza getPizza(PizzaBuilder builder) {
		return builder.build();
	}
}

