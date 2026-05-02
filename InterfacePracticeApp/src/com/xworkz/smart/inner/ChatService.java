package com.xworkz.smart.inner;

public interface ChatService {
    String APP_NAME = "chatApp";
    int MAX_USERS = 1000;

    void sendMessage();
    void receiveMessage();
    void deleteMessage();
}
