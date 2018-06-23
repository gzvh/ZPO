package com.program12;

import java.util.List;
import java.util.ListIterator;

class UpperCaseFunctions {

    static List<String> IterReplace(List<String> listOfStrings){

        ListIterator<String> iterator = listOfStrings.listIterator();
        while(iterator.hasNext()){
            iterator.set(iterator.next().toUpperCase());
        }
        return listOfStrings;
    }

    static List<String> ReplaceAllMethod(List<String> listOfStrings){

        listOfStrings.replaceAll(p -> p.toUpperCase());

        return listOfStrings;
    }

    static List<String> IndexReplace(List<String> listOfStrings){

        for(int i=0; i < listOfStrings.size();i++){
            listOfStrings.set(i, listOfStrings.get(i).toUpperCase());
        }
        return listOfStrings;
    }

    static List<String> ReplaceAllToLower(List<String> listOfStrings){

        listOfStrings.replaceAll(p -> p.toLowerCase());

        return listOfStrings;
    }

}
