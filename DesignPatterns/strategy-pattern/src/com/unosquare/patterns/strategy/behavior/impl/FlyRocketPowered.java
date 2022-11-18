package com.unosquare.patterns.strategy.behavior.impl;

import com.unosquare.patterns.strategy.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly like rocket");
    }
}
