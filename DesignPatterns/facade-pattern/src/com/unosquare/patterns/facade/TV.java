package com.unosquare.patterns.facade;

public class TV {
    private TV(){};
    public static void turnOn(){
        System.out.println("Turning tv on");
    }
    public static void turnOff(){
        System.out.println("turning  tv off");
    }
}
