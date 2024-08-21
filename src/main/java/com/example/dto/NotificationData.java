package com.example.dto;

import lombok.Data;

@Data
public class NotificationData {
    private String email;
    private Long chatId;
    private String messageSubject;
    private String messageText;
}
