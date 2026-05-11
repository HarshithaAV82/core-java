package com.xworkz.runner;

import com.xworkz.inner.ChatService;
import com.xworkz.outer.Telegram;

public class ChatRunner {

    public static void main(String[] args) {

        ChatService chatService = new Telegram();

        chatService.sendMessage();
        chatService.deleteMessage();
        chatService.voiceCall();
        chatService.videoCall();

        ChatService.serviceInfo();
    }
}