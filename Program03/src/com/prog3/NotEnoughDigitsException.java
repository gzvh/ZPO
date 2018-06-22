package com.prog3;

public class NotEnoughDigitsException extends  Exception{

    public NotEnoughDigitsException(){
        System.out.println("Entered value has not enough digits!");
    }
}
