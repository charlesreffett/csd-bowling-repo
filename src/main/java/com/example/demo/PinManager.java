package com.example.demo;

import java.security.InvalidParameterException;

public class PinManager {

    int pins = 0;

    public void setPins(int a) {
        if(a > 10){
            throw new InvalidParameterException("Illegal count: Cannot have more than 10 pins");
        }
        this.pins = a;
    }

    public int getPins(){
        return this.pins;
    }
}

