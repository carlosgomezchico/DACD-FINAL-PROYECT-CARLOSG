package org.carlos.predictionprovider.application;

import org.carlos.predictionprovider.domain.Location;
import org.carlos.predictionprovider.infrastructure.OpenWeatherProvider;
import org.carlos.predictionprovider.infrastructure.PublisherActiveMQ;
import java.util.ArrayList;
import java.util.TimerTask;

public class WeatherPeriodicTask extends TimerTask {
    private final OpenWeatherProvider weatherProvider;
    private final ArrayList<Location> locations;

    public WeatherPeriodicTask(OpenWeatherProvider weatherProvider, ArrayList<Location> locations) {
        this.weatherProvider = weatherProvider;
        this.locations = locations;
    }

    @Override
    public void run() {
        PublisherActiveMQ publisherActiveMQ = new PublisherActiveMQ();
        publisherActiveMQ.start();
        WeatherApplication weatherApplication = new WeatherApplication(weatherProvider, locations, publisherActiveMQ);
        weatherApplication.execute();
        publisherActiveMQ.close();
    }
}
