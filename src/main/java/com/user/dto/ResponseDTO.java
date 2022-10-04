package com.user.dto;

public class ResponseDTO {
    private String message;
    private Object data;

    public ResponseDTO() {

    }
    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}