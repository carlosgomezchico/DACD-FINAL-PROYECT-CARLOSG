package org.carlos.sensorprovider.application;

import org.carlos.sensorprovider.domain.Hotel;
import org.carlos.sensorprovider.infrastructure.XoteloProvider;
import org.carlos.sensorprovider.infrastructure.XoteloPublisher;
import java.util.ArrayList;
import java.util.TimerTask;

public class HotelPeriodicTask extends TimerTask {
    private final XoteloProvider xoteloProvider;
    private final ArrayList<Hotel> hotels;

    public HotelPeriodicTask(XoteloProvider xoteloProvider, ArrayList<Hotel> hotels)  {
        this.xoteloProvider = xoteloProvider;
        this.hotels = hotels;
    }

    @Override
    public void run() {
        XoteloPublisher xoteloPublisher = new XoteloPublisher();
        xoteloPublisher.start();
        HotelApplication hotelApplication = new HotelApplication(xoteloProvider, hotels, xoteloPublisher);
        hotelApplication.execute();
        xoteloPublisher.close();
    }
}
