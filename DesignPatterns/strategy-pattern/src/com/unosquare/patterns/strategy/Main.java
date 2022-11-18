package com.unosquare.patterns.strategy;

import com.unosquare.patterns.strategy.behavior.impl.FlyRocketPowered;
import com.unosquare.patterns.strategy.entity.Duck;
import com.unosquare.patterns.strategy.entity.MallardDuck;
import com.unosquare.patterns.strategy.entity.ModelDuck;

public class Main {


    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        Duck model = new ModelDuck();
        model.performFly();
        //Change duck model fly behavior at runtime
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}