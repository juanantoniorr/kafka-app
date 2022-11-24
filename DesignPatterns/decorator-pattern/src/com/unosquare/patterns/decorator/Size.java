package com.unosquare.patterns.decorator;

public enum Size {
    MEDIUM(0.40), SMALL(0), LARGE(0.60);
    private double sizeCost;
    private Size(double sizeCost){
        this.sizeCost = sizeCost;
    }

    public double getSizeCost() {
        return sizeCost;
    }
}
