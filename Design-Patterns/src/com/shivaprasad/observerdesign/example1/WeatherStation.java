package com.shivaprasad.observerdesign.example1;

// Subject (WeatherStation) interface
interface WeatherStation {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
