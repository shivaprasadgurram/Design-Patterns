package com.shivaprasad.observerdesign.example1;

public class WeatherStationExample {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Display display1 = new Display();
        Display display2 = new Display();

        weatherData.registerObserver(display1);
        weatherData.registerObserver(display2);

        weatherData.setMeasurements(25, 60, 1013);
        weatherData.setMeasurements(27, 55, 1012);
    }

    /**
     * This Java code implements the Observer Design Pattern with the weather monitoring example.
     * It defines interfaces and classes for the subject (WeatherStation),
     * concrete subject (WeatherData), observer, and concrete observer (Display). When the weather data changes,
     * the WeatherData object notifies all registered Display objects, and they update themselves accordingly.
     */
}
