package com.unosquare.patterns.adapter;

public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        //Turkey cant fly long distance like  duck so we call fly 5 times
        for (int i=0;i<5;i++){
            turkey.fly();
        }

    }
}
