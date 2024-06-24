package org.carlos.sensorprovider.application;

import org.carlos.sensorprovider.domain.Hotel;

public interface HotelPublisher {
    void start();
    void publish (Hotel event);
    void close();
}
