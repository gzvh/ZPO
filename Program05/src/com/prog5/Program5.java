package com.prog5;


import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {

        String s1, s2;
        Scanner input = new Scanner(System.in);
        Levenshtein levenshtein = new Levenshtein();

        System.out.println("Podaj pierwszy string: ");
        s1 = input.next();
        System.out.println("Podaj drugi string: ");
        s2 = input.next();
        input.close();

        System.out.println("Odleglosc miedzy: "+s1+ " i "+s2+" to "+ levenshtein.LevQWERTY(s1, s2));


    }
}
