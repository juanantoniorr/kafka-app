package com.unosquare.patterns.adapter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        //Create a duck adapting a turkey
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        System.out.println("Turkey says");
        wildTurkey.fly();
        wildTurkey.gobble();
        System.out.println("Duck says");
        testDuck(mallardDuck);
        System.out.println("Turkey adapter says");
        //We pass turkey as duck with the adapter
        testDuck(turkeyAdapter);


    }
    static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}
