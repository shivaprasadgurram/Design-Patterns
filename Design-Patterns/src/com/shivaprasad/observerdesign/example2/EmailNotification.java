package com.shivaprasad.observerdesign.example2;

class EmailNotification implements Observer {
    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Email Notification: The price of " + stockName + " has changed to $" + stockPrice);
    }
}
