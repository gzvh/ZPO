package com.prog4;

import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);


        int nInches     =  3;
        int majorLength =  5;
        Ruler ruler = new Ruler();
        ruler.drawRuler( nInches, majorLength );
    }
}
