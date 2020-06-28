package com.example.demo;

public class PinManager {

    public PinError pe = new PinError();
    int pins = 0;

    public void setPins(int a) {
        if(a > 10){
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

