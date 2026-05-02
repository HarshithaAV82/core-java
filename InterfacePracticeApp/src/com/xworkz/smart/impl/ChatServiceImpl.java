package com.xworkz.smart.impl;

import com.xworkz.smart.inner.ChatService;

public class ChatServiceImpl implements ChatService {
    @Override
    public void sendMessage() {
        System.out.println("Message sent successfully");
    }

    @Override
    public void receiveMessage() {
        System.out.println("Message receive");
    }

    @Override
    public void deleteMessage() {
        System.out.println("Message Delete ");
    }
}
