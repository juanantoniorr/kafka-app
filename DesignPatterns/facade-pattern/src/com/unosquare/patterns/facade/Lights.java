package com.unosquare.patterns.facade;

public class Lights {
   private Lights(){};
    public static void turnOn(){
        System.out.println("Turning lights on");
    }
    public static void turnOff(){
        System.out.println("turning  lights off");
    }
}
