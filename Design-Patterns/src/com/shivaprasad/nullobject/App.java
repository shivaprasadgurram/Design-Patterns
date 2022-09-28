package com.shivaprasad.nullobject;

public class App {
    public static void main(String[] args) {

        //no null-check required since Notification factory always creates Notification object
        Notification notification = NotificationFactory.createNotificationMode("Instagram");
        notification.sendMessage("Hello, How are you?");

        Notification notification1 = NotificationFactory.createNotificationMode("Twitter");
        notification1.sendMessage("Hey, All okay?");
    }
}
