package com.unosquare.patterns.strategy.entity;

import com.unosquare.patterns.strategy.behavior.impl.FlyWithWings;
import com.unosquare.patterns.strategy.behavior.impl.Squeak;

public class MallardDuck extends Duck{
    public MallardDuck(){
flyBehavior = new FlyWithWings();
quackBehavior = new Squeak();
    }
    @Override
    public void display(){
        System.out.println("I'm a Mallard duck");
    }

}
