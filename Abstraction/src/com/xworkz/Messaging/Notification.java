package com.xworkz.Messaging;

public interface Notification{

    void send();

    void setRecipient();

    default void loginNotification(){
        System.out.println("login Notification in Notification ...");
    }

}
