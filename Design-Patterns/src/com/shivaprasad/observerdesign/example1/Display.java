package com.shivaprasad.observerdesign.example1;

// Concrete Observer (Display)
class Display implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Temperature: " + temperature + "°C, Humidity: " + humidity + "%, Pressure: " + pressure + " hPa");
    }
}
