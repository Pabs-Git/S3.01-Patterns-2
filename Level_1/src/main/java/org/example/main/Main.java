package org.example.main;

import org.example.classes.HawaiianPizzaBuilder;
import org.example.classes.Pizza;
import org.example.classes.PizzaMaster;
import org.example.classes.VegetarianPizzaBuilder;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        PizzaMaster pizzaMaster = new PizzaMaster(new HawaiianPizzaBuilder());
        Pizza hawaiianPizza = pizzaMaster.createPizza("small", "thin", Arrays.asList("ham", "pineapple"));
        System.out.println(hawaiianPizza);

        Pizza hawaiianPizza2 = pizzaMaster.createPizza("large", "thick", Arrays.asList("pineapple"));
        System.out.println(hawaiianPizza2);

        pizzaMaster = new PizzaMaster(new VegetarianPizzaBuilder());
        Pizza vegetarianPizza = pizzaMaster.createPizza("large", "thick", Arrays.asList("tomato", "pepper"));
        System.out.println(vegetarianPizza);

        Pizza vegetarianPizza2 = pizzaMaster.createPizza("medium", "thick", Arrays.asList("tomato", "onion", "pepper"));
        System.out.println(vegetarianPizza2);
        }
    }
