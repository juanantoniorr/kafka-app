package com.unosquare.patterns.strategy.behavior.impl;

import com.unosquare.patterns.strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
