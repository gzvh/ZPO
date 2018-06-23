package com.program8;

import static com.program8.CreateQA.createQuestions;

public class Program8 {

    public static void main(String[] args) {

        createQuestions();
        EngTest test = new EngTest();
        test.startTest();

    }
}
