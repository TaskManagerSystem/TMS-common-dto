package com.example.dto;

import lombok.Data;

@Data
public class IsVerificationDto {
    private String token;
    private boolean isValid;
}