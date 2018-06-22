package com.program6;

import java.util.Random;

class Kolarz implements Comparable<Kolarz>{

    String name;
    int time;

    Kolarz(){
        this.name = RandomNameGenerator.getRandomName();
        this.time = generateGauss();
    }

    int getTime(){
        return time;
    }

    private static int generateGauss(){

        Random r = new Random();
        int delay;
        int val;

        do {
            val = (int) (r.nextGaussian() * 30 + 300);
            delay = Math.round(val);
        } while (delay <= 0);

        if(val > 370 )
            return val = 370;
        else if (val < 250)
            return val = 250;
        else
            return val;
    }

    @Override
    public int compareTo(Kolarz o) {
        return this.getTime() - o.getTime();
    }
}
