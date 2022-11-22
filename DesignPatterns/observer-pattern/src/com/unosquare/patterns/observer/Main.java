package com.unosquare.patterns.observer;


import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Observable
        WeatherData weatherData = new WeatherData();
        //Observer 1
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        //Observer 2
        CurrentConditionDisplayWeb currentConditionDisplayWeb = new CurrentConditionDisplayWeb(weatherData);
        //Every time we set the values observable(weatherData) notify observers(1,2)
        weatherData.setMeasurement(5,20,35);
        weatherData.setMeasurement(40,35,22);



    }
}
