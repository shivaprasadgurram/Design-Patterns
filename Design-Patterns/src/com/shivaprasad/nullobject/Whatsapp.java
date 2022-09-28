package com.shivaprasad.nullobject;

public class Whatsapp implements Notification {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending " + message +" message via Whatsapp");
    }
}
