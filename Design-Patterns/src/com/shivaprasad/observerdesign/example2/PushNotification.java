package com.shivaprasad.observerdesign.example2;

class PushNotification implements Observer {
    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Push Notification: The price of " + stockName + " has changed to $" + stockPrice);
    }
}
