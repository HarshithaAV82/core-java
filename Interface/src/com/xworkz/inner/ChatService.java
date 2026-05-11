package com.xworkz.inner;

public interface ChatService {

    String APP_NAME = "WhatsApp";
    int MAX_USERS = 1000;
    double DATA_LIMIT = 2.5;

    void sendMessage();
    void deleteMessage();

    default void voiceCall() {
        System.out.println("running voiceCall in ChatService");
    }

    default void videoCall() {
        System.out.println("running videoCall in ChatService");
    }

    static void serviceInfo() {
        System.out.println("running serviceInfo in ChatService");
    }
}