package com.unosquare.patterns.decorator.entity;

import com.unosquare.patterns.decorator.Size;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "DarkRoast";
        //Default cost for small cofee
        cost = 1.50;
    }
}
