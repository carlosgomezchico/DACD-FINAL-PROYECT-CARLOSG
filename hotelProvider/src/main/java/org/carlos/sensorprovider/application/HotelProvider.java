package org.carlos.sensorprovider.application;

import org.carlos.sensorprovider.domain.Rate;

import java.time.LocalDate;
import java.util.List;

public interface HotelProvider {
    List<Rate> getHotelRates(String hotelKey, LocalDate currentDate );
}
