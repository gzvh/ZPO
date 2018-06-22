package com.prog5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LevenshteinTest {

    Levenshtein levenshtein = new Levenshtein();

    @Test
    public void levQWERTY() {
        assertEquals(levenshtein.LevQWERTY("kot","kita"),1.5);
        assertEquals(levenshtein.LevQWERTY("drab","dal"),(double)2);
    }
}