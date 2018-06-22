package com.program6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RandomNameGenerator {

    private static List<String> listWithNames = new ArrayList<>();

    static void lookForNames(){
        try {

            URL url = new URL("https://raw.githubusercontent.com/dominictarr/random-name/master/first-names.txt");

            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = in.readLine()) != null) {
                listWithNames.add(line);
            }
            in.close();
        }
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }

    static String getRandomName(){
        int size = listWithNames.size();
        int item = new Random().nextInt(size);
        return listWithNames.get(item);
    }

}
