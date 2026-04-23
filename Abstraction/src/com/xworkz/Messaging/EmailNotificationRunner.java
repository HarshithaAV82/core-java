package com.xworkz.Messaging;

public class EmailNotificationRunner{

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        emailNotification.send();
        emailNotification.setRecipient();
        emailNotification.loginNotification();
    }
}
