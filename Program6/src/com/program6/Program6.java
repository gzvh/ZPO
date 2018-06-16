package com.program6;

import static com.program6.RandomNameGenerator.lookForNames;

public class Program6 {

    public static void main(String[] args) {

        Logger log = new Logger("log.txt");

        lookForNames();

        Race race = new Race();
        race.startRace();
    }
}
