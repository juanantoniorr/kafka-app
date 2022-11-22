package com.unosquare.patterns.observer;



import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){

    }

    public void setMeasurement(float temperature, float humidity, float pressure){
        this.setTemperature(temperature);
        this.setHumidity(humidity);
        this.setPressure(pressure);
        //We notify that values changed
        setChanged();
        //We notify to all observers calling their update method
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
