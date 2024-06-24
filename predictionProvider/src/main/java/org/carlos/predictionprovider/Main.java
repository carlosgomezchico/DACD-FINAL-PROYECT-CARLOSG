package org.carlos.predictionprovider;

import org.carlos.predictionprovider.application.LocationSupplier;
import org.carlos.predictionprovider.application.WeatherPeriodicTask;
import org.carlos.predictionprovider.domain.Location;
import org.carlos.predictionprovider.infrastructure.OpenWeatherProvider;
import org.carlos.predictionprovider.application.*;

import java.util.ArrayList;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        String apiKey = args[0];
        ArrayList<Location> locations = LocationSupplier.initializeIslands();
        OpenWeatherProvider weatherOpenWeatherApiQuery = new OpenWeatherProvider(apiKey);
        Timer timer = new Timer();
        WeatherPeriodicTask updaterTask = new WeatherPeriodicTask(weatherOpenWeatherApiQuery, locations);
        timer.scheduleAtFixedRate(updaterTask, 0, 6 * 60 * 60 * 1000);
    }
}
