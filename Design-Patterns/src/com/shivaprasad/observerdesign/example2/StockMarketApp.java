package com.shivaprasad.observerdesign.example2;

public class StockMarketApp {
    public static void main(String[] args) {
        // Create a stock data feed for Apple Inc.
        StockMarketDataFeed appleStock = new StockMarketDataFeed("Apple Inc.");

        // Create user observers and attach notification mechanisms
        Observer user1 = new EmailNotification();
        Observer user2 = new PushNotification();

        appleStock.addObserver(user1);
        appleStock.addObserver(user2);

        // Simulate stock price changes
        appleStock.setStockPrice(150.00);
        appleStock.setStockPrice(155.50);

        StockMarketDataFeed googleStock = new StockMarketDataFeed("Apple Inc.");
        googleStock.addObserver(user1);
        googleStock.setStockPrice(175);
    }
}