package com.shivaprasad.nullobject;

public class Instagram implements Notification {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending " + message + " message via Instagram");
    }
}
