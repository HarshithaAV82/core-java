package com.xworkz.smart.inner;

public interface WeatherService {

    String LOCATION = "City";
    int DEFAULT = 30;

    void getTemperature();
    void getHumidity();
    void getForecast();
}
