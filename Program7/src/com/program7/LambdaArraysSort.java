package com.program7;

import java.text.CollationKey;
import java.text.Collator;
import java.util.Arrays;
import java.util.Vector;

class LambdaArraysSort {

    static void fastSortStrings2(Collator plCollator, Vector<String> words){

        CollationKey[] keys = new CollationKey[words.size()];

        for (int k = 0; k < words.size(); k++) {
            keys[k] = plCollator.getCollationKey(words.elementAt(k));
        }

        Arrays.sort(keys, (a, b) -> a.compareTo(b));


        System.out.println("Results of lambda arrays sort:");
        for (CollationKey key : keys) {
            System.out.println(key.getSourceString());
        }
        System.out.println("----------");
    }
}
