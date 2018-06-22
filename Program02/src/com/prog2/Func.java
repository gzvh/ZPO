package com.prog2;

import java.math.BigInteger;

public class Func {

    private BigInteger number;
    private boolean checkNumber;

    public Func(String numb){
        this.setNumber(numb);
    }

    private void setNumber(String numb){
        this.number = new BigInteger(numb);
    }

    public void calcNumber() {
        /**
         * wstawienie na koncu liczby 2521
         * wstawienie dwoch pierwszych liczb na koniec
         * sprawdzenie czy modulo == 1
         */
        number = number.multiply(new BigInteger("10000")).add(new BigInteger("2521"));
        number = number.divide(new BigInteger("10000000000000000000000000000")).add(this.number.multiply(new BigInteger("100"))).remainder(new BigInteger("1000000000000000000000000000000"));
        checkNumber = number.mod(new BigInteger("97")).intValue() == 1;
    }

    public BigInteger getNumber(){
        return this.number;
    }

    public boolean isCheckNumber() {
        return this.checkNumber;
    }
}
