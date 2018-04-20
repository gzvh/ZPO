package com.prog1;

public class Func{

    private int liczba;

    public Func(int licz){
        this.setLiczba(licz);
    }

    private void setLiczba(int licz){
        this.liczba = licz;
    }

    public String getDec(){
        return Integer.toString(liczba, 10);
    }

    public String getHex(){
        return Integer.toHexString(liczba);
    }

    public String getTern(){
        return Integer.toString(liczba, 3);
    }
}

