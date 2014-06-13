package com.headfirst.ex2;

/**
 * Created by nori on 2014. 6. 13..
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherDate = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherDate);

        weatherDate.setMeasurements(80, 65, 30.4f);
        weatherDate.setMeasurements(85, 70, 29.2f);
        weatherDate.setMeasurements(72, 68, 31.5f);
    }
}
