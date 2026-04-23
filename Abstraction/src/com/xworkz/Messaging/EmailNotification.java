package com.xworkz.Messaging;

public class EmailNotification implements Notification{


    @Override
    public void send() {
        System.out.println("email notification in send method...");
    }

    @Override
    public void setRecipient() {
        System.out.println("set recipient in email notification...");

    }
}
