package com.example.demo;

public class PinManager {

    public final static int MAX_PINS = 10;
    public PinError pe = new PinError();
    int pins = 0;

    public void setPins(int a) {
        if(a > MAX_PINS){
            this.pe.setMessage("Illegal Pin Count: Pins cannot be more than 10");
            return;
            //throw new InvalidParameterException("Illegal Pin Count: Pins cannot be more than 10");
        }
        this.pins = a;
    }

    public int getPins(){
        return this.pins;
    }
}

