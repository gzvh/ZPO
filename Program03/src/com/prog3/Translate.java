package com.prog3;

import java.util.HashMap;
import java.util.Map;

public class Translate {

    private int number;
    private int units;
    private int tens;
    private int hundreds;

    public Translate(int num){
        this.setNumber(num);
    }

    private void setNumber(int num){
        this.number = num;
    }

    Map<Integer, String> transMap = new HashMap<>();
    {
        transMap.put(0, "zero");
        transMap.put(1, "jeden");
        transMap.put(2, "dwa");
        transMap.put(3, "trzy");
        transMap.put(4, "cztery");
        transMap.put(5, "piec");
        transMap.put(6, "szesc");
        transMap.put(7, "siedem");
        transMap.put(8, "osiem");
        transMap.put(9, "dziewiec");
        transMap.put(10, "dziesiec");
        transMap.put(11, "jedenascie");
        transMap.put(12, "dwanascie");
        transMap.put(13, "trzynascie");
        transMap.put(14, "czternascie");
        transMap.put(15, "pietnascie");
        transMap.put(16, "szesnascie");
        transMap.put(17, "siedemnascie");
        transMap.put(18, "osiemnascie");
        transMap.put(19, "dziewietnascie");
        transMap.put(20, "dwadziescia");
        transMap.put(30, "trzydziesci");
        transMap.put(40, "czterdziesci");
        transMap.put(50, "piecdziesiat");
        transMap.put(60, "szescdziesiat");
        transMap.put(70, "siedemdziesiat");
        transMap.put(80, "osiemdzesiat");
        transMap.put(90, "dziewiecdziesiat");
        transMap.put(100, "sto");
        transMap.put(200, "dwiescie");
        transMap.put(300, "trzysta");
        transMap.put(400, "czterysta");
        transMap.put(500, "piecset");
        transMap.put(600, "szescset");
        transMap.put(700, "siedemset");
        transMap.put(800, "osiemset");
        transMap.put(900, "dziewiecset");
    }

    private void separateNumber(){
        units = number % 10;
        tens = number % 100 - units;
        hundreds = number % 1000 - tens - units;
    }

    public void translateNumber(){
        separateNumber();
        if(hundreds != 0){
            if(units > 0 && tens > 0 && tens < 20) {
                System.out.println(transMap.get(hundreds) + ' ' + transMap.get(tens + units));
            }else if (tens == 0){
                System.out.println(transMap.get(hundreds)+ ' ' +transMap.get(units));
            }else
                System.out.println(transMap.get(hundreds)+ ' ' +transMap.get(tens)+ ' ' +transMap.get(units));
        }
        else if(tens != 0){
            if(units > 0 && tens > 0 && tens < 20){
                System.out.println(transMap.get(tens + units));
            }else
                System.out.println(transMap.get(tens)+ ' ' +transMap.get(units));
        }
        else{
            System.out.println(transMap.get(units));
        }
    }

}
