package com.program7;

import java.text.CollationKey;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

class AnonArraysSort{

    static void fastSortStrings(Collator plCollator, Vector<String> words){

        CollationKey[] keys = new CollationKey[words.size()];

        for (int k = 0; k < words.size(); k++) {
            keys[k] = plCollator.getCollationKey(words.elementAt(k));
        }

        Arrays.sort(keys, new Comparator<CollationKey>() {
            @Override
            public int compare(CollationKey o1, CollationKey o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println("Results of anonymous arrays sort:");
        for (CollationKey key : keys) {
            System.out.println(key.getSourceString());
        }
        System.out.println("----------");
    }
}
