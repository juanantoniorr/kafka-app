package com.unosquare.patterns.clients;

import com.unosquare.patterns.PizzaType;
import com.unosquare.patterns.product.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(PizzaType pizzaType) {
        if (pizzaType==PizzaType.CHEESE)  pizza = new ChicagoCheesePizza();
        if (pizzaType==PizzaType.PEPPERONI) pizza = new ChicagoPepperoniPizza();
        return pizza;
    }
}
