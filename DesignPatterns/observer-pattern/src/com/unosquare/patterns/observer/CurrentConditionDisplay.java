package com.unosquare.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;
    private Observable observable;

   public  CurrentConditionDisplay(Observable observable){
this.observable = observable;
observable.addObserver(this);
   }

    //Method triggered by Observable notifyObservers
    @Override
    public void update(Observable o, Object arg) {
    if (o instanceof WeatherData){
        //We get the new values
        WeatherData weatherData = (WeatherData) o;
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        //Show new values
        display();


    }
    }
    public void display() {
        System.out.println("Conditions: temperature: " + temperature + " humidity " + humidity + " pressure " + pressure);
    }
}
