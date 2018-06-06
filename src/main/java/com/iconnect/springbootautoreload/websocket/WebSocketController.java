package com.iconnect.springbootautoreload.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageType;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.awt.*;
import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class WebSocketController {


    private final SimpMessagingTemplate simpMessagingTemplate;


    @Autowired
    WebSocketController(SimpMessagingTemplate template)
    {
        this.simpMessagingTemplate=template;
    }

    @MessageMapping("/send/message/{username}")
    public void onRecieved(String message,@DestinationVariable("username") String username)
    {
//        System.out.println("----------- "+username);
        simpMessagingTemplate.convertAndSend("/chat/"+username,
                message+" -- username ==  "+username+"<br/>"+new SimpleDateFormat("HH:mm:ss").format(new Date()));
//        this.simpMessagingTemplate.convertAndSendToUser("rks","/chat",new SimpleDateFormat("HH:mm:ss").format(new Date())+" -- "+message);
    }

    @MessageMapping("/typing/{sendTo}/{username}")
    public void onTyping(@DestinationVariable("username") String username,
                         @DestinationVariable("sendTo") String sendTo)
    {
//        System.out.println("----------- "+username);
        simpMessagingTemplate.convertAndSend("/chat/typing/"+sendTo+"/"+username,
                username+" is Typing");
//        this.simpMessagingTemplate.convertAndSendToUser("rks","/chat",new SimpleDateFormat("HH:mm:ss").format(new Date())+" -- "+message);
    }




}
