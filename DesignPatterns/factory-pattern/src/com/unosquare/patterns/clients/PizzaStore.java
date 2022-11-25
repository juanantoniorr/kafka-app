package com.unosquare.patterns.clients;

import com.unosquare.patterns.PizzaType;
import com.unosquare.patterns.product.Pizza;

public abstract class PizzaStore {
    Pizza pizza;
    public Pizza orderPizza(PizzaType pizzaType){
        pizza = createPizza(pizzaType);
        return pizza;
    }
    abstract Pizza createPizza(PizzaType pizzaType);
}
