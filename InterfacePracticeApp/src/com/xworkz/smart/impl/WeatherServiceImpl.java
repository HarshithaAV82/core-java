package com.xworkz.smart.impl;

import com.xworkz.smart.inner.WeatherService;

public class WeatherServiceImpl implements WeatherService {


    @Override
    public void getTemperature() {
        System.out.println("Current temperature is 30 degree ");
    }

    @Override
    public void getHumidity() {
        System.out.println("Current humidity is 60 percentage");
    }

    @Override
    public void getForecast() {
        System.out.println("Weather forecast: Sunny");
    }
}
