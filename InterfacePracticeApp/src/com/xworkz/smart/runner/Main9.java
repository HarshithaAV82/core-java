package com.xworkz.smart.runner;

import com.xworkz.smart.impl.ChatServiceImpl;
import com.xworkz.smart.inner.ChatService;

public class Main9 {

    public static void main(String[] args) {

        ChatService chatService = new ChatServiceImpl();
        chatService.deleteMessage();
        chatService.receiveMessage();
        chatService.sendMessage();
        System.out.println(ChatService.APP_NAME);
        System.out.println(ChatService.MAX_USERS);
    }
}
