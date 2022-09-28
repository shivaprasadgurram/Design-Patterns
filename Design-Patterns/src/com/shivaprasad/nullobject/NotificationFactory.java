package com.shivaprasad.nullobject;

public class NotificationFactory {

    public static Notification createNotificationMode(String mediaType) {
        Notification type = null;
        if ("Whatsapp".equalsIgnoreCase(mediaType)) {
            type =  new Whatsapp();
        } else if ("Messenger".equalsIgnoreCase(mediaType)) {
            type =  new Messenger();
        } else if ("Instagram".equalsIgnoreCase(mediaType)) {
            type =  new Instagram();
        } else {
            type = new NullObject();
        }
        return type;
    }
}
