package com.unosquare.patterns.decorator.Ingredient;

import com.unosquare.patterns.decorator.entity.Beverage;

public class Milk extends IngredientDecorator {
    Beverage beverage;
    //Wrapping Beverage(Object) into Milk(Behaviour)
    public Milk (Beverage beverage){
        this.beverage = beverage;
        ingredient = "Milk";
        ingredientCost = 0.20;

    }


    @Override
    public double getCost() {

        return beverage.getCost() + ingredientCost + size.getSizeCost() ;
    }

    @Override
    public String getDescription() {

        return beverage.getDescription() + ", " + ingredient;
    }

}
