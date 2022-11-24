package com.unosquare.patterns.decorator;

import com.unosquare.patterns.decorator.Ingredient.Milk;
import com.unosquare.patterns.decorator.Ingredient.Mocha;
import com.unosquare.patterns.decorator.entity.Beverage;
import com.unosquare.patterns.decorator.entity.DarkRoast;
import com.unosquare.patterns.decorator.entity.Espresso;

public class Main {

    public static void main(String[] args) {
        //Beverage with no  extra ingredients
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.getCost());

        Beverage beverage2 = new DarkRoast();
        //Mocha wraps beverage
        beverage2 = new Mocha(beverage2);
        //Milk wraps beverage
        beverage2 = new Milk(beverage2);
        beverage2.setSize(Size.MEDIUM);
        System.out.println(beverage2.getDescription() + " $" + beverage2.getCost());



    }
}
