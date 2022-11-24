package com.unosquare.patterns.decorator.entity;


import com.unosquare.patterns.decorator.Size;

public abstract class Beverage {
    protected double cost;
    String description = "Unknown description";
    //Default size
    protected Size size = Size.SMALL;

    public double getCost() {
        return cost;
    }
    public String getDescription () {
        return description + " " + size;
    }
    public void setSize (Size size){
        this.size = size;
    }
}
