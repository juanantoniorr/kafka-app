package com.unosquare.patterns.strategy.entity;


import com.unosquare.patterns.strategy.behavior.impl.FlyNotAllowed;
import com.unosquare.patterns.strategy.behavior.impl.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        this.flyBehavior = new FlyNotAllowed();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display(){
        System.out.println("I´m model Duck");
    }
}
