package org.carlos.businessunit.service;

import org.carlos.businessunit.entity.Weather;
import java.sql.Date;
import java.util.List;

public interface WeatherRepository {

    void saveWeather(Weather weather);
    List<Weather> getAllWeather();
    List<Weather> getWeatherByDate(Date date,String location);
    List<Weather> getWeatherByLocation(String location);
    List<Weather> getWeatherByTemperature(String temperature);
}
