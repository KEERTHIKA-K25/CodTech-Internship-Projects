package com.codtech.chatapp.controller;

import com.codtech.chatapp.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/message")  // /app/message
    @SendTo("/topic/messages")   // clients will subscribe to this
    public ChatMessage send(ChatMessage message) throws Exception {
        // you can add time or modify message here
        return message;
    }
}
