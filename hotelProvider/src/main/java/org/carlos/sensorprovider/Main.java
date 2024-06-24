package org.carlos.sensorprovider;

import org.carlos.sensorprovider.application.HotelPeriodicTask;
import org.carlos.sensorprovider.application.HotelSupplier;
import org.carlos.sensorprovider.domain.Hotel;
import org.carlos.sensorprovider.infrastructure.XoteloProvider;
import java.util.ArrayList;
import java.util.Timer;

public class Main {

    public static void main(String[] args){
        ArrayList<Hotel> hotels = HotelSupplier.canaryIslandsHotels();
        XoteloProvider xoteloProvider = new XoteloProvider();
        Timer timer = new Timer();
        HotelPeriodicTask updaterTask = new HotelPeriodicTask(xoteloProvider, hotels);
        timer.scheduleAtFixedRate(updaterTask, 0, 6 * 60 * 60 * 1000);
    }
}
