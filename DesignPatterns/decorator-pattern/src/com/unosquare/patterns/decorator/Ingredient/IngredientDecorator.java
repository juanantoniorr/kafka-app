package com.unosquare.patterns.decorator.Ingredient;

import com.unosquare.patterns.decorator.entity.Beverage;

public abstract class IngredientDecorator extends Beverage {
    protected String ingredient;
    protected double ingredientCost;
    public abstract String getDescription();
}
