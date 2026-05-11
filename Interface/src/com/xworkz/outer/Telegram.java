package com.xworkz.outer;

import com.xworkz.inner.ChatService;

public class Telegram implements ChatService {

    public void sendMessage() {
        System.out.println("implemented sendMessage in Telegram");
    }

    public void deleteMessage() {
        System.out.println("implemented deleteMessage in Telegram");
    }
}