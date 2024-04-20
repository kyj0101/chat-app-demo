package com.chatappdemo.version1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/version1")
public class ChatController {
    // 채팅 보내주기 sessionId
    // 채팅 조회 sessiondId

    // 랜덤 3532532#fdgd님이 들어오셧습니다
    // 


    // h2 member
    // chat mongodb

    @GetMapping("/page")
    public String chatPage() {
        return "/version1/chat";
    }


}
