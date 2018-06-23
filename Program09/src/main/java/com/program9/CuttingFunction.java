package com.program9;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CuttingFunction {

   static List<String> StringCutter(@Nonnull String s, int length) throws IllegalArgumentException {

        if (s == null || length == 0)
            throw new IllegalArgumentException();

       List<String> parts = new ArrayList<>();

       for (int i = 0; i < s.length(); i += length) {
           parts.add(s.substring(i, Math.min(s.length(), i + length)));
       }

       return Arrays.asList(parts.toArray(new String[0]));
    }
}
