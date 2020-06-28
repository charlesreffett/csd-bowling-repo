package com.example.demo;

public class PinError {

    String message = "";

    public boolean isEmpty(){
        return message.isEmpty();
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
