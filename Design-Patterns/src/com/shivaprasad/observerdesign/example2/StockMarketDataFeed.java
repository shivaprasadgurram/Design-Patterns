package com.shivaprasad.observerdesign.example2;

import java.util.ArrayList;
import java.util.List;

// Subject (Observable): Stock Market Data Feed
class StockMarketDataFeed {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double stockPrice;

    public StockMarketDataFeed(String stockName) {
        this.stockName = stockName;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, stockPrice);
        }
    }
}
