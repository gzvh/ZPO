package com.prog4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args){

        int length = 0;
        int depth= 0;
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter length: ");
            length = input.nextInt();
            System.out.println("Enter depth: ");
            depth = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Error: "+e);
        }

        input.close();
        Ruler ruler = new Ruler();
        ruler.drawRuler(length, depth);
    }
}
