package org.carlos.predictionprovider.application;

import org.carlos.predictionprovider.domain.Weather;

public interface Publisher {
    void start();
    void publish (Weather event);
    void close();
}
