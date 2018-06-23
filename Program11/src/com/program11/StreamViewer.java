package com.program11;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Stream;

class StreamViewer {

    static void listSalary(){
        try {

            InputStream input = new URL("http://szgrabowski.kis.p.lodz.pl/zpo17/dane.txt").openConnection().getInputStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(input, "ISO-8859-2"));

            Stream<String> stream = reader.lines();
            int sum = stream.filter(line -> line.contains("PL"))
                    .map(line -> line.split(" "))
                    .map(line -> line[line.length - 1])
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .reduce(0, (x, y) -> x + y);

            System.out.println(sum);
        }
        catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }


}
