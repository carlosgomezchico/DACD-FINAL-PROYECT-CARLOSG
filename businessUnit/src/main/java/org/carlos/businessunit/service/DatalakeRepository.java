package org.carlos.businessunit.service;

import org.carlos.businessunit.entity.Hotel;

import java.io.IOException;
import java.util.List;

public interface DatalakeRepository {
    List<Hotel> getHotelHistoricalData() throws IOException;
}
