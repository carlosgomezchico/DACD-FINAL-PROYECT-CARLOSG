package org.carlos.predictionprovider.application;

import org.carlos.predictionprovider.domain.Location;
import org.carlos.predictionprovider.domain.Weather;

import java.util.List;

public interface WeatherProvider {
    List<Weather> getWeatherData(Location location);
}
