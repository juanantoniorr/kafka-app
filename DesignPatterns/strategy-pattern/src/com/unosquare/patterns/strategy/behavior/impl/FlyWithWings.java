package com.unosquare.patterns.strategy.behavior.impl;

import com.unosquare.patterns.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}
