package com.example.dto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class VerificationData {
    private String email;
    private String chatId;
    private boolean present;
    private LocalDateTime createdAt;
}
