package com.program12;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class UpperCaseFunctionsTest {

    private List<String> listOfString = new ArrayList<String>()
    {{
        add("Rafal");
        add("Marek");
        add("Przemek");
        add("Lukasz");
    }};

    private List<String> listOfStringFinal = new ArrayList<String>()
    {{
        add("RAFAL");
        add("MAREK");
        add("PRZEMEK");
        add("LUKASZ");
    }};

    @Test
    public void iterReplace() {

    }

    @Test
    public void replaceAllMethod() {
    }

    @Test
    public void indexReplace() {
    }
}