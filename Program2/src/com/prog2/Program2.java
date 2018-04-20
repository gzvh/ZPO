package com.prog2;

public class Program2 {

    public static void main(String[] args) {

        Func func = new Func("83101010230000261395100000");

        func.calcNumber();
        System.out.println(func.getNumber());
        System.out.println("Czy numer jest prawidlowy: " +func.isCheckNumber());
    }
}
