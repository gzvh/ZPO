package com.program7;

import java.text.CollationKey;
import java.text.Collator;
import java.util.Vector;

class BubbleSort {

    static void sortStrings(Collator plCollator, Vector<String> words){

        CollationKey[] keys = new CollationKey[words.size()];

        for (int k = 0; k < words.size(); k++) {
            keys[k] = plCollator.getCollationKey(words.elementAt(k));
        }

        CollationKey temp;
        for (int i = 0; i < keys.length; i++) {
            for (int j = i + 1; j < keys.length; j++) {
                if (keys[i].compareTo(keys[j]) > 0) {
                    temp = keys[i];
                    keys[i] = keys[j];
                    keys[j] = temp;
                }
            }
        }
        System.out.println("Results of bubble sort:");
        for (CollationKey key : keys) {
            System.out.println(key.getSourceString());
        }
        System.out.println("----------");
    }
}
