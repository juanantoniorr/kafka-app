package com.unosquare.patterns.clients;

import com.unosquare.patterns.PizzaType;
import com.unosquare.patterns.product.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(PizzaType pizzaType) {
        if (pizzaType==PizzaType.CHEESE)  pizza = new NYCheesePizza();
        if (pizzaType==PizzaType.PEPPERONI) pizza = new NYPepperoniPizza();
        return pizza;
    }
}
