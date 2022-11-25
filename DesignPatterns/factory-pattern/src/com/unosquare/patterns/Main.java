package com.unosquare.patterns;

import com.unosquare.patterns.clients.ChicagoPizzaStore;
import com.unosquare.patterns.clients.NYPizzaStore;
import com.unosquare.patterns.clients.PizzaStore;

public class Main {

    public static void main(String[] args) {
        PizzaStore pizzaStoreNY = new NYPizzaStore();
        pizzaStoreNY.orderPizza(PizzaType.CHEESE);
        PizzaStore pizzaStoreChicago = new ChicagoPizzaStore();
        pizzaStoreChicago.orderPizza(PizzaType.CHEESE);
    }
}
