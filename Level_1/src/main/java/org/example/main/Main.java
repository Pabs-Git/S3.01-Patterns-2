package org.example.main;

import org.example.classes.HawaiianPizzaBuilder;
import org.example.classes.Pizza;
import org.example.classes.PizzaMaster;
import org.example.classes.VegetarianPizzaBuilder;
import org.example.interfaces.PizzaBuilder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Vegetarian Pizza
        PizzaBuilder vegetarianBuilder = new VegetarianPizzaBuilder();
        PizzaMaster pizzaMaster = new PizzaMaster();
        pizzaMaster.buildVegetarianPizza(vegetarianBuilder);
        Pizza vegetarianPizza = pizzaMaster.getPizza(vegetarianBuilder);

        System.out.println("Vegetarian pizza created:");
        System.out.println(vegetarianPizza);

        // Hawaiian Pizza
        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        pizzaMaster.buildHawaiianPizza(hawaiianBuilder);
        Pizza hawaiianPizza = pizzaMaster.getPizza(hawaiianBuilder);

        System.out.println("\nHawaiian pizza created:");
        System.out.println(hawaiianPizza);
    }
}

