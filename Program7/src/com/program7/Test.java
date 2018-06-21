package com.program7;

import java.text.Collator;
import java.util.Locale;
import java.util.Vector;

import static com.program7.AnonArraysSort.fastSortStrings;
import static com.program7.BubbleSort.sortStrings;
import static com.program7.LambdaArraysSort.fastSortStrings2;

public class Test {

    private static Vector<String> setVector() {
        Vector<String> words = new Vector<>();
        words.add("Łukasz");
        words.add("Ścibor");
        words.add("Stefania");
        words.add("Bolek");
        words.add("Agnieszka");
        words.add("Zyta");
        words.add("Órszula");
        return words;
    }

    private static Collator setCollator(){
        Collator plCollator = Collator.getInstance(new Locale("pl", "PL"));
        plCollator.setStrength(Collator.PRIMARY);
        return  plCollator;
    }

        @org.junit.Test
        public void testBubble() {
            long start = System.nanoTime();
            Collator plCollator = setCollator();
            for (int i = 0; i < 100000; i++) {
                Vector<String> words = setVector();
                sortStrings(plCollator, words);
            }
            long end = System.nanoTime();
            System.out.println("Bubble sort took " + (end - start) + " nanoseconds");
        }

        @org.junit.Test
        public void testAnonymous() {
            long start = System.nanoTime();
            Collator plCollator = setCollator();
            for (int i = 0; i < 100000; i++) {
                Vector<String> words = setVector();
                fastSortStrings(plCollator, words);
            }
            long end = System.nanoTime();
            System.out.println("Anonymous arrays sort took " + (end - start) + " nanoseconds");
        }

        @org.junit.Test
        public void testLambda() {
            long start = System.nanoTime();
            Collator plCollator = setCollator();
            for (int i = 0; i < 100000; i++) {
                Vector<String> words = setVector();
                fastSortStrings2(plCollator, words);
            }
            long end = System.nanoTime();
            System.out.println("Lambda arrays sort took " + (end - start) + " nanoseconds");
        }
}
