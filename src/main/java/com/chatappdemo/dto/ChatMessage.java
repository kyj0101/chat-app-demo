package com.chatappdemo.dto;

import com.chatappdemo.dto.type.MessageType;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {
    private MessageType messageType;
    private Long chatRoomId;
    private Long senderId;
    private String message;
}
