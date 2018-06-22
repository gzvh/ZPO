package com.program6;

import java.util.PriorityQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Race{

    private static int kolarzCounter = 0;
    private PriorityQueue<Kolarz> leaderboard = new PriorityQueue<>();
    private Logger logger = com.program6.Logger.logger;

    void startRace(){

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
        logger.info("Wyścig rozpoczęty");

        Runnable task = () -> {

            Kolarz kol = new Kolarz();
            leaderboard.add(kol);
            System.out.println(kol.name + " ukonczyl wyscig z czasem: " +kol.time + "s");
            logger.info(kol.name + " ukonczyl wyscig z czasem: " +kol.time + "s");
            int t = leaderboard.size() > 3 ? 3 : leaderboard.size();

            System.out.println("Top 3:");
            for (int i = 0; i < t; i++) {
                Kolarz kolarz = (Kolarz)leaderboard.toArray()[i];
                System.out.println(kolarz.name + " " + kolarz.time + "s");
            }
            System.out.println("---------");

            kolarzCounter++;

            if(kolarzCounter == 15)
                scheduledExecutorService.shutdown();
                logger.info("Wyścig zakończony");
        };

        ScheduledFuture f = scheduledExecutorService.scheduleWithFixedDelay(task, 0, 2, TimeUnit.SECONDS);
    }

}
