package com.program7;

import java.text.Collator;
import java.util.Locale;
import java.util.Vector;

import static com.program7.AnonArraysSort.fastSortStrings;
import static com.program7.BubbleSort.sortStrings;
import static com.program7.LambdaArraysSort.fastSortStrings2;

public class Program7 {
    public static void main(String args[]){

        Vector<String> words = new Vector<>();
        words.add("Łukasz");
        words.add("Ścibor");
        words.add("Stefania");
        words.add("Bolek");
        words.add("Agnieszka");
        words.add("Zyta");
        words.add("Órszula");

        Collator plCollator = Collator.getInstance(new Locale("pl", "PL"));
        plCollator.setStrength(Collator.PRIMARY);

        sortStrings(plCollator, words);
        fastSortStrings(plCollator, words);
        fastSortStrings2(plCollator, words);
    }
}
