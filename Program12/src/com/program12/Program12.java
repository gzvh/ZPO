package com.program12;

import java.util.ArrayList;
import java.util.List;

import static com.program12.UpperCaseFunctions.*;

public class Program12 {

    public static void main(String[] args) {

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Rafal");
        listOfStrings.add("Marek");
        listOfStrings.add("Przemek");
        listOfStrings.add("Lukasz");

        System.out.println("Initial list: " +listOfStrings);
        System.out.println("To upper case using iterator " +IterReplace(listOfStrings));
        ReplaceAllToLower(listOfStrings);
        System.out.println("To upper case using replace all: " +ReplaceAllMethod(listOfStrings));
        ReplaceAllToLower(listOfStrings);
        System.out.println("To upper case using list indexes:  " +IndexReplace(listOfStrings));

    }
}
