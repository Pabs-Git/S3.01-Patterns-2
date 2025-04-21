package org.example.classes;

import org.example.interfaces.PizzaBuilder;

import java.util.*;

public class HawaiianPizzaBuilder implements PizzaBuilder {
	private String size;
	private String dough;
	private List<String> toppings;

	@Override
	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public void setDough(String dough) {
		this.dough = dough;
	}

	@Override
	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}

	@Override
	public Pizza build() {
		return new Pizza(size, dough, toppings);
	}
}
