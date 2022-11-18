package com.unosquare.patterns.strategy.behavior.impl;


import com.unosquare.patterns.strategy.behavior.FlyBehavior;

public class FlyNotAllowed implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Can´t fly");
    }
}
