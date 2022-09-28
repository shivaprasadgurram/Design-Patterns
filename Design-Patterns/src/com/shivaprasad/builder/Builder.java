package com.shivaprasad.builder;

import com.shivaprasad.builder.car_components.Engine;
import com.shivaprasad.builder.car_components.GPSNavigator;
import com.shivaprasad.builder.car_components.Transmission;
import com.shivaprasad.builder.car_components.TripComputer;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
