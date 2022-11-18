package com.unosquare.patterns.strategy.behavior.impl;

import com.unosquare.patterns.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Regular quack");
    }
}
