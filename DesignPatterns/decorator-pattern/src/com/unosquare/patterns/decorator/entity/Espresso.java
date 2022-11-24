package com.unosquare.patterns.decorator.entity;

import com.unosquare.patterns.decorator.Size;

public class Espresso extends Beverage{

    public Espresso(){
        description = "Espresso";
        //Default cost for small cofee
        cost = 1.80;
    }
}
