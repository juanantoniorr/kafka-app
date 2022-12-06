package com.unosquare.patterns.facade;

public class HomeTheaterFacade {

    public void watchMovie(String movie){
        System.out.println("Setting movie " + movie);
        SoundBar.turnOn();
        Lights.turnOff();
        TV.turnOn();
    }

    public void finishMovie(){
        System.out.println("Movie finished");
        SoundBar.turnOff();
        Lights.turnOn();
        TV.turnOff();
    }
}
