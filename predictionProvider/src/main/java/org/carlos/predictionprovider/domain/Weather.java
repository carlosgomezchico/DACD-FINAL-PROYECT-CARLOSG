package org.carlos.predictionprovider.domain;

import java.time.Instant;

public class Weather {
    private Instant ts;
    private String ss;
    private double humidity;
    private double temperature;
    private double precipitation;
    private double clouds;
    private double windSpeed;
    private Location location;
    private Instant predictionTime;

    public Weather(Instant ts, String ss, double humidity, double temperature, double precipitation, double clouds, double windSpeed, Location location, Instant predictionTime) {
        this.ts = ts;
        this.ss = ss;
        this.humidity = humidity;
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.clouds = clouds;
        this.windSpeed = windSpeed;
        this.location = location;
        this.predictionTime = predictionTime;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public double getClouds() {
        return clouds;
    }

    public void setClouds(double clouds) {
        this.clouds = clouds;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Instant getPredictionTime() {
        return predictionTime;
    }

    public void setPredictionTime(Instant predictionTime) {
        this.predictionTime = predictionTime;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Instant getTs() {
        return ts;
    }

    public void setTs(Instant ts) {
        this.ts = ts;
    }

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }
}
