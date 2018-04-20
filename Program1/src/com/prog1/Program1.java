package com.prog1;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        String system;
        int liczba = 0b1101_1011;

        Func func = new Func(liczba);

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj system: ");
        system = input.nextLine();

        switch (system) {
            case "dziesiec":
                System.out.println(func.getDec());
                break;
            case "szesnascie":
                System.out.println(func.getHex());
                break;
            case "trzy":
                System.out.println(func.getTern());
                break;
            default:
                System.out.println("Error. Wrong system");
                break;
        }
    }
}
