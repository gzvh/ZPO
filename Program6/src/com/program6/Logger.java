package com.program6;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.SimpleFormatter;

class Logger {
    static java.util.logging.Logger logger;
    private FileHandler fileHandler;

    Logger(String fileName) {

        File file = new File(fileName);

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            fileHandler = new FileHandler(fileName,true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger = java.util.logging.Logger.getLogger("");
        Handler[] handlers = logger.getHandlers();
        for(Handler handler : handlers) {
            logger.removeHandler(handler);
        }

        logger.addHandler(fileHandler);
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
    }
}
