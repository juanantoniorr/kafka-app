package com.unosquare.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplayWeb implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private Observable observable;

    public CurrentConditionDisplayWeb(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }

    }
    public void display (){
        System.out.println("Web condition:: values updated");
    }
}
