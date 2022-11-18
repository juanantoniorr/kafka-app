package com.unosquare.patterns.strategy.entity;

import com.unosquare.patterns.strategy.behavior.FlyBehavior;
import com.unosquare.patterns.strategy.behavior.QuackBehavior;

public abstract class Duck {
     FlyBehavior flyBehavior;
     QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("All ducks swim");
    }
    public void display(){
        System.out.println("I'm a duck");
    }

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior = qb;
    }

}
