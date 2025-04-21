package org.example.interfaces;

import org.example.classes.Pizza;

import java.util.List;

public interface PizzaBuilder {
	void setSize(String size);
	void setDough(String dough);
	void setToppings(List<String> toppings);
	Pizza build();
}
