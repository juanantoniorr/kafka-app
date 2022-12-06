package com.unosquare.patterns.facade;

public class SoundBar {
    private SoundBar(){};
    public static void turnOn(){
        System.out.println("Turning soundBar on");
    }
    public static void turnOff(){
        System.out.println("turning  soundBar off");
    }
}
