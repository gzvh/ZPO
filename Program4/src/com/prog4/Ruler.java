package com.prog4;

public class Ruler {

    public static void drawRuler(int centimeter, int length){
        drawLine(length, 0);
        for(int i = 1; i <= centimeter; i++){
            drawInterval(length - 1);
            drawLine(length, i);
        }
    }

    private static void drawInterval(int centralLength){
        if(centralLength >= 1){
            drawInterval(centralLength -1);
            drawLine(centralLength);
            drawInterval(centralLength - 1);
        }
    }

    private static void drawLine(int tickLength, int tickLabel){
        for(int i = 0; i < tickLength; i++){
            System.out.println("-");
            }
            if(tickLabel >= 0){
                System.out.println(" " +tickLabel);
                System.out.println("\n");
            }
    }

    private static void drawLine(int tickLength){
        drawLine(tickLength, - 1);
    }
}
