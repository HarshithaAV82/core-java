package com.xworkz.smart.runner;

import com.xworkz.smart.impl.WeatherServiceImpl;
import com.xworkz.smart.inner.WeatherService;

public class Main8 {

    public static void main(String[] args) {
        WeatherService weatherService = new WeatherServiceImpl();
        weatherService.getTemperature();
        weatherService.getForecast();
        weatherService.getHumidity();

        System.out.println(WeatherService.LOCATION);
        System.out.println(WeatherService.DEFAULT);
    }
}
