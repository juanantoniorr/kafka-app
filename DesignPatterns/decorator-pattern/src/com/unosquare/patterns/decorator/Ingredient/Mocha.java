package com.unosquare.patterns.decorator.Ingredient;

import com.unosquare.patterns.decorator.entity.Beverage;

public class Mocha extends IngredientDecorator {
    Beverage beverage;
    //Wrapping Beverage(Object) into Mocha(Behaviour)
    public Mocha(Beverage beverage){
        this.beverage = beverage;
        ingredient = "Mocha";
        ingredientCost = 0.50;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + ingredientCost + size.getSizeCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + ingredient;
    }
}
